package typings.officeJs.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides options for whether to select the location that is navigated to.
  *
  * @remarks
  * 
  * The behavior caused by the {@link Office.SelectionMode | options.selectionMode} option varies by host:
  *
  * In Excel: `Office.SelectionMode.Selected` selects all content in the binding, or named item. `Office.SelectionMode.None` for text bindings, 
  * selects the cell; for matrix bindings, table bindings, and named items, selects the first data cell (not first cell in header row for tables).
  *
  * In PowerPoint: `Office.SelectionMode.Selected` selects the slide title or first textbox on the slide. 
  * `Office.SelectionMode.None` doesn't select anything.
  *
  * In Word: `Office.SelectionMode.Selected` selects all content in the binding. `Office.SelectionMode.None` for text bindings, moves the cursor to 
  * the beginning of the text; for matrix bindings and table bindings, selects the first data cell (not first cell in header row for tables).
  */
@js.native
trait GoToByIdOptions extends js.Object {
  
  /**
    * A user-defined item of any type that is returned, unchanged, in the asyncContext property of the AsyncResult object that is passed to a callback.
    */
  var asyncContext: js.UndefOr[js.Any] = js.native
  
  /**
    * Specifies whether the location specified by the id parameter is selected (highlighted). 
    * Use {@link Office.SelectionMode} or string equivalent. See the Remarks for more information.
    */
  var selectionMode: js.UndefOr[SelectionMode | String] = js.native
}
object GoToByIdOptions {
  
  @scala.inline
  def apply(): GoToByIdOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoToByIdOptions]
  }
  
  @scala.inline
  implicit class GoToByIdOptionsOps[Self <: GoToByIdOptions] (val x: Self) extends AnyVal {
    
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
    def setAsyncContext(value: js.Any): Self = this.set("asyncContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAsyncContext: Self = this.set("asyncContext", js.undefined)
    
    @scala.inline
    def setSelectionMode(value: SelectionMode | String): Self = this.set("selectionMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectionMode: Self = this.set("selectionMode", js.undefined)
  }
}
