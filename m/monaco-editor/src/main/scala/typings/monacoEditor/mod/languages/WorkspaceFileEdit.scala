package typings.monacoEditor.mod.languages

import typings.monacoEditor.mod.Uri
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkspaceFileEdit extends StObject {
  
  var metadata: js.UndefOr[WorkspaceEditMetadata] = js.undefined
  
  var newUri: js.UndefOr[Uri] = js.undefined
  
  var oldUri: js.UndefOr[Uri] = js.undefined
  
  var options: js.UndefOr[WorkspaceFileEditOptions] = js.undefined
}
object WorkspaceFileEdit {
  
  @scala.inline
  def apply(): WorkspaceFileEdit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkspaceFileEdit]
  }
  
  @scala.inline
  implicit class WorkspaceFileEditMutableBuilder[Self <: WorkspaceFileEdit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMetadata(value: WorkspaceEditMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    @scala.inline
    def setNewUri(value: Uri): Self = StObject.set(x, "newUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewUriUndefined: Self = StObject.set(x, "newUri", js.undefined)
    
    @scala.inline
    def setOldUri(value: Uri): Self = StObject.set(x, "oldUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldUriUndefined: Self = StObject.set(x, "oldUri", js.undefined)
    
    @scala.inline
    def setOptions(value: WorkspaceFileEditOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
  }
}
