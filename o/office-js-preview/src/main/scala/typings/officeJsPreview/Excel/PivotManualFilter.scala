package typings.officeJsPreview.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Configurable template for a manual filter to apply to a PivotField.
  The `condition` defines what criteria need to be set in order for the filter to operate.
  *
  * [Api set: ExcelApi 1.12]
  */
@js.native
trait PivotManualFilter extends js.Object {
  
  /**
    *
    * A list of selected items to manually filter. These must be existing and valid items from the chosen field.
    *
    * [Api set: ExcelApi 1.12]
    */
  var selectedItems: js.UndefOr[js.Array[String | PivotItem]] = js.native
}
object PivotManualFilter {
  
  @scala.inline
  def apply(): PivotManualFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PivotManualFilter]
  }
  
  @scala.inline
  implicit class PivotManualFilterOps[Self <: PivotManualFilter] (val x: Self) extends AnyVal {
    
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
    def setSelectedItemsVarargs(value: (String | PivotItem)*): Self = this.set("selectedItems", js.Array(value :_*))
    
    @scala.inline
    def setSelectedItems(value: js.Array[String | PivotItem]): Self = this.set("selectedItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectedItems: Self = this.set("selectedItems", js.undefined)
  }
}
