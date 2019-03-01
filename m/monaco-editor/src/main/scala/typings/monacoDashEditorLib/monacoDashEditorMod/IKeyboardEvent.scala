package typings
package monacoDashEditorLib.monacoDashEditorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IKeyboardEvent extends js.Object {
  val altKey: scala.Boolean
  val browserEvent: stdLib.KeyboardEvent
  val code: java.lang.String
  val ctrlKey: scala.Boolean
  val keyCode: KeyCode
  val metaKey: scala.Boolean
  val shiftKey: scala.Boolean
  val target: stdLib.HTMLElement
  def equals(keybinding: scala.Double): scala.Boolean
  def preventDefault(): scala.Unit
  def stopPropagation(): scala.Unit
}

object IKeyboardEvent {
  @scala.inline
  def apply(
    altKey: scala.Boolean,
    browserEvent: stdLib.KeyboardEvent,
    code: java.lang.String,
    ctrlKey: scala.Boolean,
    equals: js.Function1[scala.Double, scala.Boolean],
    keyCode: KeyCode,
    metaKey: scala.Boolean,
    preventDefault: js.Function0[scala.Unit],
    shiftKey: scala.Boolean,
    stopPropagation: js.Function0[scala.Unit],
    target: stdLib.HTMLElement
  ): IKeyboardEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("altKey")(altKey)
    __obj.updateDynamic("browserEvent")(browserEvent)
    __obj.updateDynamic("code")(code)
    __obj.updateDynamic("ctrlKey")(ctrlKey)
    __obj.updateDynamic("equals")(equals)
    __obj.updateDynamic("keyCode")(keyCode)
    __obj.updateDynamic("metaKey")(metaKey)
    __obj.updateDynamic("preventDefault")(preventDefault)
    __obj.updateDynamic("shiftKey")(shiftKey)
    __obj.updateDynamic("stopPropagation")(stopPropagation)
    __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[IKeyboardEvent]
  }
}

