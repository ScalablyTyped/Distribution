package typings.monacoEditor.mod

import typings.monacoEditor.monacoEditorBooleans.`true`
import typings.std.HTMLElement
import typings.std.KeyboardEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IKeyboardEvent extends js.Object {
  val _standardKeyboardEventBrand: `true`
  val altKey: Boolean
  val browserEvent: KeyboardEvent
  val code: String
  val ctrlKey: Boolean
  val keyCode: KeyCode
  val metaKey: Boolean
  val shiftKey: Boolean
  val target: HTMLElement
  def equals(keybinding: Double): Boolean
  def preventDefault(): Unit
  def stopPropagation(): Unit
}

object IKeyboardEvent {
  @scala.inline
  def apply(
    _standardKeyboardEventBrand: `true`,
    altKey: Boolean,
    browserEvent: KeyboardEvent,
    code: String,
    ctrlKey: Boolean,
    equals: Double => Boolean,
    keyCode: KeyCode,
    metaKey: Boolean,
    preventDefault: () => Unit,
    shiftKey: Boolean,
    stopPropagation: () => Unit,
    target: HTMLElement
  ): IKeyboardEvent = {
    val __obj = js.Dynamic.literal(_standardKeyboardEventBrand = _standardKeyboardEventBrand.asInstanceOf[js.Any], altKey = altKey.asInstanceOf[js.Any], browserEvent = browserEvent.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], ctrlKey = ctrlKey.asInstanceOf[js.Any], equals = js.Any.fromFunction1(equals), keyCode = keyCode.asInstanceOf[js.Any], metaKey = metaKey.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault), shiftKey = shiftKey.asInstanceOf[js.Any], stopPropagation = js.Any.fromFunction0(stopPropagation), target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[IKeyboardEvent]
  }
}

