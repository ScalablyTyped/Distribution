package typings.monacoEditor.mod.languages

import typings.monacoEditor.anon.TextEditinsertAsSnippetbo
import typings.monacoEditor.mod.Uri
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IWorkspaceTextEdit extends StObject {
  
  var metadata: js.UndefOr[WorkspaceEditMetadata] = js.undefined
  
  var resource: Uri
  
  var textEdit: TextEditinsertAsSnippetbo
  
  var versionId: js.UndefOr[Double] = js.undefined
}
object IWorkspaceTextEdit {
  
  inline def apply(resource: Uri, textEdit: TextEditinsertAsSnippetbo): IWorkspaceTextEdit = {
    val __obj = js.Dynamic.literal(resource = resource.asInstanceOf[js.Any], textEdit = textEdit.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWorkspaceTextEdit]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IWorkspaceTextEdit] (val x: Self) extends AnyVal {
    
    inline def setMetadata(value: WorkspaceEditMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setResource(value: Uri): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    inline def setTextEdit(value: TextEditinsertAsSnippetbo): Self = StObject.set(x, "textEdit", value.asInstanceOf[js.Any])
    
    inline def setVersionId(value: Double): Self = StObject.set(x, "versionId", value.asInstanceOf[js.Any])
    
    inline def setVersionIdUndefined: Self = StObject.set(x, "versionId", js.undefined)
  }
}
