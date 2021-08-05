package typings.monacoEditor.mod.languages

import typings.monacoEditor.mod.Uri
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkspaceTextEdit extends StObject {
  
  var edit: TextEdit
  
  var metadata: js.UndefOr[WorkspaceEditMetadata] = js.undefined
  
  var modelVersionId: js.UndefOr[Double] = js.undefined
  
  var resource: Uri
}
object WorkspaceTextEdit {
  
  inline def apply(edit: TextEdit, resource: Uri): WorkspaceTextEdit = {
    val __obj = js.Dynamic.literal(edit = edit.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkspaceTextEdit]
  }
  
  extension [Self <: WorkspaceTextEdit](x: Self) {
    
    inline def setEdit(value: TextEdit): Self = StObject.set(x, "edit", value.asInstanceOf[js.Any])
    
    inline def setMetadata(value: WorkspaceEditMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setModelVersionId(value: Double): Self = StObject.set(x, "modelVersionId", value.asInstanceOf[js.Any])
    
    inline def setModelVersionIdUndefined: Self = StObject.set(x, "modelVersionId", js.undefined)
    
    inline def setResource(value: Uri): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
  }
}
