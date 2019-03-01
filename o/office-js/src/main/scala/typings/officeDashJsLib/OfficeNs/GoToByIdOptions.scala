package typings
package officeDashJsLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides options for whether to select the location that is navigated to.
  *
  * @remarks
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
trait GoToByIdOptions extends js.Object {
  /**
    * A user-defined item of any type that is returned, unchanged, in the asyncContext property of the AsyncResult object that is passed to a callback.
    */
  var asyncContext: js.UndefOr[js.Any] = js.undefined
  /**
    * Specifies whether the location specified by the id parameter is selected (highlighted). 
    * Use {@link Office.SelectionMode} or string equivalent. See the Remarks for more information.
    */
  var selectionMode: js.UndefOr[SelectionMode | java.lang.String] = js.undefined
}

object GoToByIdOptions {
  @scala.inline
  def apply(asyncContext: js.Any = null, selectionMode: SelectionMode | java.lang.String = null): GoToByIdOptions = {
    val __obj = js.Dynamic.literal()
    if (asyncContext != null) __obj.updateDynamic("asyncContext")(asyncContext)
    if (selectionMode != null) __obj.updateDynamic("selectionMode")(selectionMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoToByIdOptions]
  }
}

