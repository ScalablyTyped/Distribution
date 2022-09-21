package typings.monacoEditor.mod.editor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IActionDescriptor extends StObject {
  
  /**
    * Control if the action should show up in the context menu and where.
    * The context menu of the editor has these default:
    *   navigation - The navigation group comes first in all cases.
    *   1_modification - This group comes next and contains commands that modify your code.
    *   9_cutcopypaste - The last default group with the basic editing commands.
    * You can also create your own group.
    * Defaults to null (don't show in context menu).
    */
  var contextMenuGroupId: js.UndefOr[String] = js.undefined
  
  /**
    * Control the order in the context menu group.
    */
  var contextMenuOrder: js.UndefOr[Double] = js.undefined
  
  /**
    * An unique identifier of the contributed action.
    */
  var id: String
  
  /**
    * The keybinding rule (condition on top of precondition).
    */
  var keybindingContext: js.UndefOr[String] = js.undefined
  
  /**
    * An array of keybindings for the action.
    */
  var keybindings: js.UndefOr[js.Array[Double]] = js.undefined
  
  /**
    * A label of the action that will be presented to the user.
    */
  var label: String
  
  /**
    * Precondition rule.
    */
  var precondition: js.UndefOr[String] = js.undefined
  
  /**
    * Method that will be executed when the action is triggered.
    * @param editor The editor instance is passed in as a convenience
    */
  def run(editor: ICodeEditor, args: Any*): Unit | js.Promise[Unit]
}
object IActionDescriptor {
  
  inline def apply(id: String, label: String, run: (ICodeEditor, /* repeated */ Any) => Unit | js.Promise[Unit]): IActionDescriptor = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], run = js.Any.fromFunction2(run))
    __obj.asInstanceOf[IActionDescriptor]
  }
  
  extension [Self <: IActionDescriptor](x: Self) {
    
    inline def setContextMenuGroupId(value: String): Self = StObject.set(x, "contextMenuGroupId", value.asInstanceOf[js.Any])
    
    inline def setContextMenuGroupIdUndefined: Self = StObject.set(x, "contextMenuGroupId", js.undefined)
    
    inline def setContextMenuOrder(value: Double): Self = StObject.set(x, "contextMenuOrder", value.asInstanceOf[js.Any])
    
    inline def setContextMenuOrderUndefined: Self = StObject.set(x, "contextMenuOrder", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setKeybindingContext(value: String): Self = StObject.set(x, "keybindingContext", value.asInstanceOf[js.Any])
    
    inline def setKeybindingContextUndefined: Self = StObject.set(x, "keybindingContext", js.undefined)
    
    inline def setKeybindings(value: js.Array[Double]): Self = StObject.set(x, "keybindings", value.asInstanceOf[js.Any])
    
    inline def setKeybindingsUndefined: Self = StObject.set(x, "keybindings", js.undefined)
    
    inline def setKeybindingsVarargs(value: Double*): Self = StObject.set(x, "keybindings", js.Array(value*))
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setPrecondition(value: String): Self = StObject.set(x, "precondition", value.asInstanceOf[js.Any])
    
    inline def setPreconditionUndefined: Self = StObject.set(x, "precondition", js.undefined)
    
    inline def setRun(value: (ICodeEditor, /* repeated */ Any) => Unit | js.Promise[Unit]): Self = StObject.set(x, "run", js.Any.fromFunction2(value))
  }
}
