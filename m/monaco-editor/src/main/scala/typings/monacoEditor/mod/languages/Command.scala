package typings.monacoEditor.mod.languages

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
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    if (arguments != null) __obj.updateDynamic("arguments")(arguments.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    __obj.asInstanceOf[Command]
  }
}

