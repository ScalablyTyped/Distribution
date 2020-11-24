package typings.prettierLinterHelpers.mod

import typings.prettierLinterHelpers.prettierLinterHelpersStrings.delete
import typings.prettierLinterHelpers.prettierLinterHelpersStrings.insert
import typings.prettierLinterHelpers.prettierLinterHelpersStrings.replace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Difference extends js.Object {
  
  var deleteText: js.UndefOr[String] = js.native
  
  var insertText: js.UndefOr[String] = js.native
  
  var offset: Double = js.native
  
  var operation: insert | delete | replace = js.native
}
object Difference {
  
  @scala.inline
  def apply(offset: Double, operation: insert | delete | replace): Difference = {
    val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any])
    __obj.asInstanceOf[Difference]
  }
  
  @scala.inline
  implicit class DifferenceOps[Self <: Difference] (val x: Self) extends AnyVal {
    
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
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperation(value: insert | delete | replace): Self = this.set("operation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteText(value: String): Self = this.set("deleteText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeleteText: Self = this.set("deleteText", js.undefined)
    
    @scala.inline
    def setInsertText(value: String): Self = this.set("insertText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInsertText: Self = this.set("insertText", js.undefined)
  }
}
