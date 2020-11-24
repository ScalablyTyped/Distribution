package typings.officeJs.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the Workbook object, for use in `workbook.set({ ... })`. */
@js.native
trait WorkbookUpdateData extends js.Object {
  
  /**
    *
    * True if all charts in the workbook are tracking the actual data points to which they are attached.
    False if the charts track the index of the data points.
    *
    * [Api set: ExcelApi 1.9]
    */
  var chartDataPointTrack: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Specifies if changes have been made since the workbook was last saved.
    You can set this property to true if you want to close a modified workbook without either saving it or being prompted to save it.
    *
    * [Api set: ExcelApi 1.9]
    */
  var isDirty: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Gets the workbook properties.
    *
    * [Api set: ExcelApi 1.7]
    */
  var properties: js.UndefOr[DocumentPropertiesUpdateData] = js.native
  
  /**
    *
    * True if calculations in this workbook will be done using only the precision of the numbers as they're displayed.
    Data will permanently lose accuracy when switching this property from false to true.
    *
    * [Api set: ExcelApi 1.9]
    */
  var usePrecisionAsDisplayed: js.UndefOr[Boolean] = js.native
}
object WorkbookUpdateData {
  
  @scala.inline
  def apply(): WorkbookUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkbookUpdateData]
  }
  
  @scala.inline
  implicit class WorkbookUpdateDataOps[Self <: WorkbookUpdateData] (val x: Self) extends AnyVal {
    
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
    def setChartDataPointTrack(value: Boolean): Self = this.set("chartDataPointTrack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChartDataPointTrack: Self = this.set("chartDataPointTrack", js.undefined)
    
    @scala.inline
    def setIsDirty(value: Boolean): Self = this.set("isDirty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsDirty: Self = this.set("isDirty", js.undefined)
    
    @scala.inline
    def setProperties(value: DocumentPropertiesUpdateData): Self = this.set("properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProperties: Self = this.set("properties", js.undefined)
    
    @scala.inline
    def setUsePrecisionAsDisplayed(value: Boolean): Self = this.set("usePrecisionAsDisplayed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsePrecisionAsDisplayed: Self = this.set("usePrecisionAsDisplayed", js.undefined)
  }
}
