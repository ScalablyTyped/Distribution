package typings.novaEditorNode.anon

import org.scalablytyped.runtime.StringDictionary
import typings.novaEditorNode.novaEditorNodeStrings.pipe
import typings.novaEditorNode.novaEditorNodeStrings.socket
import typings.novaEditorNode.novaEditorNodeStrings.stdio
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Args extends js.Object {
  var args: js.UndefOr[js.Array[String]] = js.undefined
  var env: js.UndefOr[StringDictionary[String]] = js.undefined
  var path: String
  var `type`: js.UndefOr[stdio | socket | pipe] = js.undefined
}

object Args {
  @scala.inline
  def apply(
    path: String,
    args: js.Array[String] = null,
    env: StringDictionary[String] = null,
    `type`: stdio | socket | pipe = null
  ): Args = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    if (args != null) __obj.updateDynamic("args")(args.asInstanceOf[js.Any])
    if (env != null) __obj.updateDynamic("env")(env.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Args]
  }
}

