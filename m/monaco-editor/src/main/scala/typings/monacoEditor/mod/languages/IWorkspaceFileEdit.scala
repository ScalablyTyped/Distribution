package typings.monacoEditor.mod.languages

import typings.monacoEditor.mod.Uri
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IWorkspaceFileEdit extends StObject {
  
  var metadata: js.UndefOr[WorkspaceEditMetadata] = js.undefined
  
  var newResource: js.UndefOr[Uri] = js.undefined
  
  var oldResource: js.UndefOr[Uri] = js.undefined
  
  var options: js.UndefOr[WorkspaceFileEditOptions] = js.undefined
}
object IWorkspaceFileEdit {
  
  inline def apply(): IWorkspaceFileEdit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IWorkspaceFileEdit]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IWorkspaceFileEdit] (val x: Self) extends AnyVal {
    
    inline def setMetadata(value: WorkspaceEditMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setNewResource(value: Uri): Self = StObject.set(x, "newResource", value.asInstanceOf[js.Any])
    
    inline def setNewResourceUndefined: Self = StObject.set(x, "newResource", js.undefined)
    
    inline def setOldResource(value: Uri): Self = StObject.set(x, "oldResource", value.asInstanceOf[js.Any])
    
    inline def setOldResourceUndefined: Self = StObject.set(x, "oldResource", js.undefined)
    
    inline def setOptions(value: WorkspaceFileEditOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
  }
}
