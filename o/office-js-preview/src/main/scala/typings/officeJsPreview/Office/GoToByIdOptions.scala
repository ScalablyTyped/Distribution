package typings.officeJsPreview.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
trait GoToByIdOptions extends StObject {
  
  /**
    * A user-defined item of any type that is returned, unchanged, in the asyncContext property of the AsyncResult object that is passed to a callback.
    */
  var asyncContext: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Specifies whether the location specified by the id parameter is selected (highlighted).
    * Use {@link Office.SelectionMode} or string equivalent. See the Remarks for more information.
    */
  var selectionMode: js.UndefOr[SelectionMode | String] = js.undefined
}
object GoToByIdOptions {
  
  @scala.inline
  def apply(): GoToByIdOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoToByIdOptions]
  }
  
  @scala.inline
  implicit class GoToByIdOptionsMutableBuilder[Self <: GoToByIdOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAsyncContext(value: js.Any): Self = StObject.set(x, "asyncContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsyncContextUndefined: Self = StObject.set(x, "asyncContext", js.undefined)
    
    @scala.inline
    def setSelectionMode(value: SelectionMode | String): Self = StObject.set(x, "selectionMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectionModeUndefined: Self = StObject.set(x, "selectionMode", js.undefined)
  }
}
