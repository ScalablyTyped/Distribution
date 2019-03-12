package typings
package navermapsLib.naverNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DOMEventListener extends js.Object {
  var eventName: java.lang.String
  var target: stdLib.HTMLElement
  def listener(): js.Any
}

object DOMEventListener {
  @scala.inline
  def apply(eventName: java.lang.String, listener: () => js.Any, target: stdLib.HTMLElement): DOMEventListener = {
    val __obj = js.Dynamic.literal(eventName = eventName, listener = js.Any.fromFunction0(listener), target = target)
  
    __obj.asInstanceOf[DOMEventListener]
  }
}

