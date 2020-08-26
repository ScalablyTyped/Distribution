package typings.openEditor.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EditorRunConfig extends js.Object {
  /**
  		Arguments provided to the editor binary.
  		*/
  var arguments: js.Array[String] = js.native
  /**
  		Editor binary name.
  		*/
  var binary: String = js.native
  /**
  		A flag indicating whether the editor runs in the terminal.
  		*/
  var isTerminalEditor: Boolean = js.native
}

object EditorRunConfig {
  @scala.inline
  def apply(arguments: js.Array[String], binary: String, isTerminalEditor: Boolean): EditorRunConfig = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], binary = binary.asInstanceOf[js.Any], isTerminalEditor = isTerminalEditor.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditorRunConfig]
  }
  @scala.inline
  implicit class EditorRunConfigOps[Self <: EditorRunConfig] (val x: Self) extends AnyVal {
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
    def setArgumentsVarargs(value: String*): Self = this.set("arguments", js.Array(value :_*))
    @scala.inline
    def setArguments(value: js.Array[String]): Self = this.set("arguments", value.asInstanceOf[js.Any])
    @scala.inline
    def setBinary(value: String): Self = this.set("binary", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsTerminalEditor(value: Boolean): Self = this.set("isTerminalEditor", value.asInstanceOf[js.Any])
  }
  
}

