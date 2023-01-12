package typings.monacoEditor.mod.languages

import typings.monacoEditor.mod.IDisposable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CodeActionList
  extends StObject
     with IDisposable {
  
  val actions: js.Array[CodeAction]
}
object CodeActionList {
  
  inline def apply(actions: js.Array[CodeAction], dispose: () => Unit): CodeActionList = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose))
    __obj.asInstanceOf[CodeActionList]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CodeActionList] (val x: Self) extends AnyVal {
    
    inline def setActions(value: js.Array[CodeAction]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    inline def setActionsVarargs(value: CodeAction*): Self = StObject.set(x, "actions", js.Array(value*))
  }
}
