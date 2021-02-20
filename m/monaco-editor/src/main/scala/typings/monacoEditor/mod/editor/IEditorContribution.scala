package typings.monacoEditor.mod.editor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IEditorContribution extends StObject {
  
  /**
    * Dispose this contribution.
    */
  def dispose(): Unit = js.native
  
  /**
    * Restore view state.
    */
  var restoreViewState: js.UndefOr[js.Function1[/* state */ js.Any, Unit]] = js.native
  
  /**
    * Store view state.
    */
  var saveViewState: js.UndefOr[js.Function0[_]] = js.native
}
object IEditorContribution {
  
  @scala.inline
  def apply(dispose: () => Unit): IEditorContribution = {
    val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose))
    __obj.asInstanceOf[IEditorContribution]
  }
  
  @scala.inline
  implicit class IEditorContributionMutableBuilder[Self <: IEditorContribution] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDispose(value: () => Unit): Self = StObject.set(x, "dispose", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRestoreViewState(value: /* state */ js.Any => Unit): Self = StObject.set(x, "restoreViewState", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRestoreViewStateUndefined: Self = StObject.set(x, "restoreViewState", js.undefined)
    
    @scala.inline
    def setSaveViewState(value: () => _): Self = StObject.set(x, "saveViewState", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSaveViewStateUndefined: Self = StObject.set(x, "saveViewState", js.undefined)
  }
}
