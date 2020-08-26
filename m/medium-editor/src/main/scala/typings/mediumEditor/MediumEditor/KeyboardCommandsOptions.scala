package typings.mediumEditor.MediumEditor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeyboardCommandsOptions extends js.Object {
  var commands: js.UndefOr[js.Array[KeyboardCommandOptions]] = js.native
}

object KeyboardCommandsOptions {
  @scala.inline
  def apply(): KeyboardCommandsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyboardCommandsOptions]
  }
  @scala.inline
  implicit class KeyboardCommandsOptionsOps[Self <: KeyboardCommandsOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCommandsVarargs(value: KeyboardCommandOptions*): Self = this.set("commands", js.Array(value :_*))
    @scala.inline
    def setCommands(value: js.Array[KeyboardCommandOptions]): Self = this.set("commands", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCommands: Self = this.set("commands", js.undefined)
  }
  
}

