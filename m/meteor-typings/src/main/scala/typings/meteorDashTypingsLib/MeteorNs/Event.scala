package typings
package meteorDashTypingsLib.MeteorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Login **/
/** Event **/
trait Event extends js.Object {
  var currentTarget: stdLib.HTMLElement
  var target: stdLib.HTMLElement
  var `type`: java.lang.String
  var which: scala.Double
  def isDefaultPrevented(): scala.Boolean
  def isImmediatePropagationStopped(): scala.Boolean
  def isPropagationStopped(): scala.Boolean
  def preventDefault(): scala.Unit
  def stopImmediatePropagation(): scala.Unit
  def stopPropagation(): scala.Unit
}

object Event {
  @scala.inline
  def apply(
    currentTarget: stdLib.HTMLElement,
    isDefaultPrevented: js.Function0[scala.Boolean],
    isImmediatePropagationStopped: js.Function0[scala.Boolean],
    isPropagationStopped: js.Function0[scala.Boolean],
    preventDefault: js.Function0[scala.Unit],
    stopImmediatePropagation: js.Function0[scala.Unit],
    stopPropagation: js.Function0[scala.Unit],
    target: stdLib.HTMLElement,
    `type`: java.lang.String,
    which: scala.Double
  ): Event = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("currentTarget")(currentTarget)
    __obj.updateDynamic("isDefaultPrevented")(isDefaultPrevented)
    __obj.updateDynamic("isImmediatePropagationStopped")(isImmediatePropagationStopped)
    __obj.updateDynamic("isPropagationStopped")(isPropagationStopped)
    __obj.updateDynamic("preventDefault")(preventDefault)
    __obj.updateDynamic("stopImmediatePropagation")(stopImmediatePropagation)
    __obj.updateDynamic("stopPropagation")(stopPropagation)
    __obj.updateDynamic("target")(target)
    __obj.updateDynamic("which")(which)
    __obj.asInstanceOf[Event]
  }
}

