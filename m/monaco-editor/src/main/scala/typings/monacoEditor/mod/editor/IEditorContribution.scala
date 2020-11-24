package typings.monacoEditor.mod.editor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IEditorContribution extends js.Object {
  
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
  implicit class IEditorContributionOps[Self <: IEditorContribution] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDispose(value: () => Unit): Self = this.set("dispose", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRestoreViewState(value: /* state */ js.Any => Unit): Self = this.set("restoreViewState", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRestoreViewState: Self = this.set("restoreViewState", js.undefined)
    
    @scala.inline
    def setSaveViewState(value: () => _): Self = this.set("saveViewState", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteSaveViewState: Self = this.set("saveViewState", js.undefined)
  }
}
