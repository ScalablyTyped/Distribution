package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataSourceSheetDimensionRange extends js.Object {
  
  /** The columns on the data source sheet. */
  var columnReferences: js.UndefOr[js.Array[DataSourceColumnReference]] = js.native
  
  /** The ID of the data source sheet the range is on. */
  var sheetId: js.UndefOr[Double] = js.native
}
object DataSourceSheetDimensionRange {
  
  @scala.inline
  def apply(): DataSourceSheetDimensionRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSourceSheetDimensionRange]
  }
  
  @scala.inline
  implicit class DataSourceSheetDimensionRangeOps[Self <: DataSourceSheetDimensionRange] (val x: Self) extends AnyVal {
    
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
    def setColumnReferencesVarargs(value: DataSourceColumnReference*): Self = this.set("columnReferences", js.Array(value :_*))
    
    @scala.inline
    def setColumnReferences(value: js.Array[DataSourceColumnReference]): Self = this.set("columnReferences", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumnReferences: Self = this.set("columnReferences", js.undefined)
    
    @scala.inline
    def setSheetId(value: Double): Self = this.set("sheetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSheetId: Self = this.set("sheetId", js.undefined)
  }
}
