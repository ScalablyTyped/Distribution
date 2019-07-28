package typings.mediumDashEditor.MediumEditorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyboardCommandsOptions extends js.Object {
  var commands: js.UndefOr[js.Array[KeyboardCommandOptions]] = js.undefined
}

object KeyboardCommandsOptions {
  @scala.inline
  def apply(commands: js.Array[KeyboardCommandOptions] = null): KeyboardCommandsOptions = {
    val __obj = js.Dynamic.literal()
    if (commands != null) __obj.updateDynamic("commands")(commands)
    __obj.asInstanceOf[KeyboardCommandsOptions]
  }
}

