package typings.navermaps.naver.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interfaces
  */
trait MapEventListener extends js.Object {
  var eventName: String
  var listenerId: String
  var target: js.Any
  def listener(event: js.Any): js.Any
}

object MapEventListener {
  @scala.inline
  def apply(eventName: String, listener: js.Any => js.Any, listenerId: String, target: js.Any): MapEventListener = {
    val __obj = js.Dynamic.literal(eventName = eventName.asInstanceOf[js.Any], listener = js.Any.fromFunction1(listener), listenerId = listenerId.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MapEventListener]
  }
}

