package typings.monacoEditor.mod.languages

import typings.monacoEditor.anon.Dark
import typings.monacoEditor.anon.Id
import typings.monacoEditor.mod.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkspaceEditMetadata extends js.Object {
  
  var description: js.UndefOr[String] = js.native
  
  var iconPath: js.UndefOr[Id | Uri | Dark] = js.native
  
  var label: String = js.native
  
  var needsConfirmation: Boolean = js.native
}
object WorkspaceEditMetadata {
  
  @scala.inline
  def apply(label: String, needsConfirmation: Boolean): WorkspaceEditMetadata = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], needsConfirmation = needsConfirmation.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkspaceEditMetadata]
  }
  
  @scala.inline
  implicit class WorkspaceEditMetadataOps[Self <: WorkspaceEditMetadata] (val x: Self) extends AnyVal {
    
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
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNeedsConfirmation(value: Boolean): Self = this.set("needsConfirmation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setIconPath(value: Id | Uri | Dark): Self = this.set("iconPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconPath: Self = this.set("iconPath", js.undefined)
  }
}
