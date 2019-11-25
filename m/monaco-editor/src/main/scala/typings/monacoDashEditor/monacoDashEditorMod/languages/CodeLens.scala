package typings.monacoDashEditor.monacoDashEditorMod.languages

import typings.monacoDashEditor.monacoDashEditorMod.IRange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CodeLens extends js.Object {
  var command: js.UndefOr[Command] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var range: IRange
}

object CodeLens {
  @scala.inline
  def apply(range: IRange, command: Command = null, id: String = null): CodeLens = {
    val __obj = js.Dynamic.literal(range = range.asInstanceOf[js.Any])
    if (command != null) __obj.updateDynamic("command")(command.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeLens]
  }
}

