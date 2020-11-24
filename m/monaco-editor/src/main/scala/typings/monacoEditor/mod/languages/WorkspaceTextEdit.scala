package typings.monacoEditor.mod.languages

import typings.monacoEditor.mod.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkspaceTextEdit extends js.Object {
  
  var edit: TextEdit = js.native
  
  var metadata: js.UndefOr[WorkspaceEditMetadata] = js.native
  
  var modelVersionId: js.UndefOr[Double] = js.native
  
  var resource: Uri = js.native
}
object WorkspaceTextEdit {
  
  @scala.inline
  def apply(edit: TextEdit, resource: Uri): WorkspaceTextEdit = {
    val __obj = js.Dynamic.literal(edit = edit.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkspaceTextEdit]
  }
  
  @scala.inline
  implicit class WorkspaceTextEditOps[Self <: WorkspaceTextEdit] (val x: Self) extends AnyVal {
    
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
    def setEdit(value: TextEdit): Self = this.set("edit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResource(value: Uri): Self = this.set("resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadata(value: WorkspaceEditMetadata): Self = this.set("metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
    
    @scala.inline
    def setModelVersionId(value: Double): Self = this.set("modelVersionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModelVersionId: Self = this.set("modelVersionId", js.undefined)
  }
}
