package typings.monacoEditor.mod.languages

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkspaceEdit extends StObject {
  
  var edits: js.Array[WorkspaceTextEdit | WorkspaceFileEdit]
}
object WorkspaceEdit {
  
  @scala.inline
  def apply(edits: js.Array[WorkspaceTextEdit | WorkspaceFileEdit]): WorkspaceEdit = {
    val __obj = js.Dynamic.literal(edits = edits.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkspaceEdit]
  }
  
  @scala.inline
  implicit class WorkspaceEditMutableBuilder[Self <: WorkspaceEdit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEdits(value: js.Array[WorkspaceTextEdit | WorkspaceFileEdit]): Self = StObject.set(x, "edits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEditsVarargs(value: (WorkspaceTextEdit | WorkspaceFileEdit)*): Self = StObject.set(x, "edits", js.Array(value :_*))
  }
}
