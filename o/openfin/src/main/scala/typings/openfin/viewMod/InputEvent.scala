package typings.openfin.viewMod

import typings.openfin.openfinStrings.keyDown
import typings.openfin.openfinStrings.keyUp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputEvent extends js.Object {
  var altKey: Boolean
  var code: String
  var command: js.UndefOr[String] = js.undefined
  var ctrlKey: Boolean
  var inputType: keyUp | keyDown
  var key: String
  var metaKey: Boolean
  var repeat: Boolean
  var shiftKey: Boolean
}

object InputEvent {
  @scala.inline
  def apply(
    altKey: Boolean,
    code: String,
    ctrlKey: Boolean,
    inputType: keyUp | keyDown,
    key: String,
    metaKey: Boolean,
    repeat: Boolean,
    shiftKey: Boolean,
    command: String = null
  ): InputEvent = {
    val __obj = js.Dynamic.literal(altKey = altKey.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], ctrlKey = ctrlKey.asInstanceOf[js.Any], inputType = inputType.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], metaKey = metaKey.asInstanceOf[js.Any], repeat = repeat.asInstanceOf[js.Any], shiftKey = shiftKey.asInstanceOf[js.Any])
    if (command != null) __obj.updateDynamic("command")(command.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputEvent]
  }
}

