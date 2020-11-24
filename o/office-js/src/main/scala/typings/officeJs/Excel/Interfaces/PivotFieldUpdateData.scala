package typings.officeJs.Excel.Interfaces

import typings.officeJs.Excel.Subtotals
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the PivotField object, for use in `pivotField.set({ ... })`. */
@js.native
trait PivotFieldUpdateData extends js.Object {
  
  /**
    *
    * Name of the PivotField.
    *
    * [Api set: ExcelApi 1.8]
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    *
    * Determines whether to show all items of the PivotField.
    *
    * [Api set: ExcelApi 1.8]
    */
  var showAllItems: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Subtotals of the PivotField.
    *
    * [Api set: ExcelApi 1.8]
    */
  var subtotals: js.UndefOr[Subtotals] = js.native
}
object PivotFieldUpdateData {
  
  @scala.inline
  def apply(): PivotFieldUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PivotFieldUpdateData]
  }
  
  @scala.inline
  implicit class PivotFieldUpdateDataOps[Self <: PivotFieldUpdateData] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setShowAllItems(value: Boolean): Self = this.set("showAllItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowAllItems: Self = this.set("showAllItems", js.undefined)
    
    @scala.inline
    def setSubtotals(value: Subtotals): Self = this.set("subtotals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubtotals: Self = this.set("subtotals", js.undefined)
  }
}
