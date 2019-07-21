package typings
package openDashEditorLib.openDashEditorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditorRunConfig extends js.Object {
  /**
  		Arguments provided to the editor binary.
  		*/
  var arguments: js.Array[java.lang.String]
  /**
  		Editor binary name.
  		*/
  var binary: java.lang.String
  /**
  		A flag indicating whether the editor runs in the terminal.
  		*/
  var isTerminalEditor: scala.Boolean
}

object EditorRunConfig {
  @scala.inline
  def apply(arguments: js.Array[java.lang.String], binary: java.lang.String, isTerminalEditor: scala.Boolean): EditorRunConfig = {
    val __obj = js.Dynamic.literal(arguments = arguments, binary = binary, isTerminalEditor = isTerminalEditor)
  
    __obj.asInstanceOf[EditorRunConfig]
  }
}

