package typings.monacoEditor.mod.editor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IEditorContribution extends StObject {
  
  /**
    * Dispose this contribution.
    */
  def dispose(): Unit
  
  /**
    * Restore view state.
    */
  var restoreViewState: js.UndefOr[js.Function1[/* state */ Any, Unit]] = js.undefined
  
  /**
    * Store view state.
    */
  var saveViewState: js.UndefOr[js.Function0[Any]] = js.undefined
}
object IEditorContribution {
  
  inline def apply(dispose: () => Unit): IEditorContribution = {
    val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose))
    __obj.asInstanceOf[IEditorContribution]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IEditorContribution] (val x: Self) extends AnyVal {
    
    inline def setDispose(value: () => Unit): Self = StObject.set(x, "dispose", js.Any.fromFunction0(value))
    
    inline def setRestoreViewState(value: /* state */ Any => Unit): Self = StObject.set(x, "restoreViewState", js.Any.fromFunction1(value))
    
    inline def setRestoreViewStateUndefined: Self = StObject.set(x, "restoreViewState", js.undefined)
    
    inline def setSaveViewState(value: () => Any): Self = StObject.set(x, "saveViewState", js.Any.fromFunction0(value))
    
    inline def setSaveViewStateUndefined: Self = StObject.set(x, "saveViewState", js.undefined)
  }
}
