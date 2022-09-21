package typings.monacoEditor.mod.languages

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkspaceEdit extends StObject {
  
  var edits: js.Array[IWorkspaceTextEdit | IWorkspaceFileEdit]
}
object WorkspaceEdit {
  
  inline def apply(edits: js.Array[IWorkspaceTextEdit | IWorkspaceFileEdit]): WorkspaceEdit = {
    val __obj = js.Dynamic.literal(edits = edits.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkspaceEdit]
  }
  
  extension [Self <: WorkspaceEdit](x: Self) {
    
    inline def setEdits(value: js.Array[IWorkspaceTextEdit | IWorkspaceFileEdit]): Self = StObject.set(x, "edits", value.asInstanceOf[js.Any])
    
    inline def setEditsVarargs(value: (IWorkspaceTextEdit | IWorkspaceFileEdit)*): Self = StObject.set(x, "edits", js.Array(value*))
  }
}
