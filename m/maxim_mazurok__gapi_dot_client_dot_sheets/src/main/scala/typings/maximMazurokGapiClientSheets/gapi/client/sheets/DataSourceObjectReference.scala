package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataSourceObjectReference extends js.Object {
  
  /** References to a data source chart. */
  var chartId: js.UndefOr[Double] = js.native
  
  /** References to a cell containing DataSourceFormula. */
  var dataSourceFormulaCell: js.UndefOr[GridCoordinate] = js.native
  
  /** References to a data source PivotTable anchored at the cell. */
  var dataSourcePivotTableAnchorCell: js.UndefOr[GridCoordinate] = js.native
  
  /** References to a DataSourceTable anchored at the cell. */
  var dataSourceTableAnchorCell: js.UndefOr[GridCoordinate] = js.native
  
  /** References to a DATA_SOURCE sheet. */
  var sheetId: js.UndefOr[String] = js.native
}
object DataSourceObjectReference {
  
  @scala.inline
  def apply(): DataSourceObjectReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSourceObjectReference]
  }
  
  @scala.inline
  implicit class DataSourceObjectReferenceOps[Self <: DataSourceObjectReference] (val x: Self) extends AnyVal {
    
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
    def setChartId(value: Double): Self = this.set("chartId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChartId: Self = this.set("chartId", js.undefined)
    
    @scala.inline
    def setDataSourceFormulaCell(value: GridCoordinate): Self = this.set("dataSourceFormulaCell", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataSourceFormulaCell: Self = this.set("dataSourceFormulaCell", js.undefined)
    
    @scala.inline
    def setDataSourcePivotTableAnchorCell(value: GridCoordinate): Self = this.set("dataSourcePivotTableAnchorCell", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataSourcePivotTableAnchorCell: Self = this.set("dataSourcePivotTableAnchorCell", js.undefined)
    
    @scala.inline
    def setDataSourceTableAnchorCell(value: GridCoordinate): Self = this.set("dataSourceTableAnchorCell", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataSourceTableAnchorCell: Self = this.set("dataSourceTableAnchorCell", js.undefined)
    
    @scala.inline
    def setSheetId(value: String): Self = this.set("sheetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSheetId: Self = this.set("sheetId", js.undefined)
  }
}
