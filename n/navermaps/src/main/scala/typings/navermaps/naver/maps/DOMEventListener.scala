package typings.navermaps.naver.maps

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DOMEventListener extends js.Object {
  var eventName: String
  var target: HTMLElement
  def listener(): js.Any
}

object DOMEventListener {
  @scala.inline
  def apply(eventName: String, listener: () => js.Any, target: HTMLElement): DOMEventListener = {
    val __obj = js.Dynamic.literal(eventName = eventName, listener = js.Any.fromFunction0(listener), target = target)
  
    __obj.asInstanceOf[DOMEventListener]
  }
}

