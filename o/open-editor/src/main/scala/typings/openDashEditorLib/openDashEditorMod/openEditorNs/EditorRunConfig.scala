package typings
package openDashEditorLib.openDashEditorMod.openEditorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditorRunConfig extends js.Object {
  var args: js.Array[java.lang.String]
  var bin: java.lang.String
  var isTerminalEditor: scala.Boolean
}

object EditorRunConfig {
  @scala.inline
  def apply(args: js.Array[java.lang.String], bin: java.lang.String, isTerminalEditor: scala.Boolean): EditorRunConfig = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("args")(args)
    __obj.updateDynamic("bin")(bin)
    __obj.updateDynamic("isTerminalEditor")(isTerminalEditor)
    __obj.asInstanceOf[EditorRunConfig]
  }
}

