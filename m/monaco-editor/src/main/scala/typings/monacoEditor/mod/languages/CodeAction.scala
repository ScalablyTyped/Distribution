package typings.monacoEditor.mod.languages

import typings.monacoEditor.mod.editor.IMarkerData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CodeAction extends StObject {
  
  var command: js.UndefOr[Command] = js.native
  
  var diagnostics: js.UndefOr[js.Array[IMarkerData]] = js.native
  
  var disabled: js.UndefOr[String] = js.native
  
  var edit: js.UndefOr[WorkspaceEdit] = js.native
  
  var isPreferred: js.UndefOr[Boolean] = js.native
  
  var kind: js.UndefOr[String] = js.native
  
  var title: String = js.native
}
object CodeAction {
  
  @scala.inline
  def apply(title: String): CodeAction = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeAction]
  }
  
  @scala.inline
  implicit class CodeActionMutableBuilder[Self <: CodeAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCommand(value: Command): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommandUndefined: Self = StObject.set(x, "command", js.undefined)
    
    @scala.inline
    def setDiagnostics(value: js.Array[IMarkerData]): Self = StObject.set(x, "diagnostics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiagnosticsUndefined: Self = StObject.set(x, "diagnostics", js.undefined)
    
    @scala.inline
    def setDiagnosticsVarargs(value: IMarkerData*): Self = StObject.set(x, "diagnostics", js.Array(value :_*))
    
    @scala.inline
    def setDisabled(value: String): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    @scala.inline
    def setEdit(value: WorkspaceEdit): Self = StObject.set(x, "edit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEditUndefined: Self = StObject.set(x, "edit", js.undefined)
    
    @scala.inline
    def setIsPreferred(value: Boolean): Self = StObject.set(x, "isPreferred", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsPreferredUndefined: Self = StObject.set(x, "isPreferred", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
