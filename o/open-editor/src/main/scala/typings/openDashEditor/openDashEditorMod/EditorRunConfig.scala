package typings.openDashEditor.openDashEditorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditorRunConfig extends js.Object {
  /**
  		Arguments provided to the editor binary.
  		*/
  var arguments: js.Array[String]
  /**
  		Editor binary name.
  		*/
  var binary: String
  /**
  		A flag indicating whether the editor runs in the terminal.
  		*/
  var isTerminalEditor: Boolean
}

object EditorRunConfig {
  @scala.inline
  def apply(arguments: js.Array[String], binary: String, isTerminalEditor: Boolean): EditorRunConfig = {
    val __obj = js.Dynamic.literal(arguments = arguments, binary = binary, isTerminalEditor = isTerminalEditor)
  
    __obj.asInstanceOf[EditorRunConfig]
  }
}

