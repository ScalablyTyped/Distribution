package typings
package openDashEditorLib.openDashEditorMod

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
    val __obj = js.Dynamic.literal(args = args, bin = bin, isTerminalEditor = isTerminalEditor)
  
    __obj.asInstanceOf[EditorRunConfig]
  }
}

