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
  def apply(eventName: java.lang.String, listener: js.Function0[js.Any], target: stdLib.HTMLElement): DOMEventListener = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("eventName")(eventName)
    __obj.updateDynamic("listener")(listener)
    __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[DOMEventListener]
  }
}

