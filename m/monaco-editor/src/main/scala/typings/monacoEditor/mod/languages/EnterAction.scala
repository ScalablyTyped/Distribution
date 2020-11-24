package typings.monacoEditor.mod.languages

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnterAction extends js.Object {
  
  /**
    * Describes text to be appended after the new line and after the indentation.
    */
  var appendText: js.UndefOr[String] = js.native
  
  /**
    * Describe what to do with the indentation.
    */
  var indentAction: IndentAction = js.native
  
  /**
    * Describes the number of characters to remove from the new line's indentation.
    */
  var removeText: js.UndefOr[Double] = js.native
}
object EnterAction {
  
  @scala.inline
  def apply(indentAction: IndentAction): EnterAction = {
    val __obj = js.Dynamic.literal(indentAction = indentAction.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnterAction]
  }
  
  @scala.inline
  implicit class EnterActionOps[Self <: EnterAction] (val x: Self) extends AnyVal {
    
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
    def setIndentAction(value: IndentAction): Self = this.set("indentAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppendText(value: String): Self = this.set("appendText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppendText: Self = this.set("appendText", js.undefined)
    
    @scala.inline
    def setRemoveText(value: Double): Self = this.set("removeText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemoveText: Self = this.set("removeText", js.undefined)
  }
}
