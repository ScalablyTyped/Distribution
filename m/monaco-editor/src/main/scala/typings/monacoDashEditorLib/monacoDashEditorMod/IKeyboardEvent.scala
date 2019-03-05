package typings
package monacoDashEditorLib.monacoDashEditorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IKeyboardEvent extends js.Object {
  val _standardKeyboardEventBrand: monacoDashEditorLib.monacoDashEditorLibNumbers.`true`
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
    _standardKeyboardEventBrand: monacoDashEditorLib.monacoDashEditorLibNumbers.`true`,
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
    val __obj = js.Dynamic.literal(_standardKeyboardEventBrand = _standardKeyboardEventBrand, altKey = altKey, browserEvent = browserEvent, code = code, ctrlKey = ctrlKey, equals = equals, keyCode = keyCode, metaKey = metaKey, preventDefault = preventDefault, shiftKey = shiftKey, stopPropagation = stopPropagation, target = target)
  
    __obj.asInstanceOf[IKeyboardEvent]
  }
}

