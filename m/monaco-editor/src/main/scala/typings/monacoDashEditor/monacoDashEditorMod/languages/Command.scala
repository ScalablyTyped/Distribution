package typings.monacoDashEditor.monacoDashEditorMod.languages

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Command extends js.Object {
  var arguments: js.UndefOr[js.Array[_]] = js.undefined
  var id: String
  var title: String
  var tooltip: js.UndefOr[String] = js.undefined
}

object Command {
  @scala.inline
  def apply(id: String, title: String, arguments: js.Array[_] = null, tooltip: String = null): Command = {
    val __obj = js.Dynamic.literal(id = id, title = title)
    if (arguments != null) __obj.updateDynamic("arguments")(arguments)
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip)
    __obj.asInstanceOf[Command]
  }
}

