package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataSourceObjectReference extends StObject {
  
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
  implicit class DataSourceObjectReferenceMutableBuilder[Self <: DataSourceObjectReference] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChartId(value: Double): Self = StObject.set(x, "chartId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChartIdUndefined: Self = StObject.set(x, "chartId", js.undefined)
    
    @scala.inline
    def setDataSourceFormulaCell(value: GridCoordinate): Self = StObject.set(x, "dataSourceFormulaCell", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSourceFormulaCellUndefined: Self = StObject.set(x, "dataSourceFormulaCell", js.undefined)
    
    @scala.inline
    def setDataSourcePivotTableAnchorCell(value: GridCoordinate): Self = StObject.set(x, "dataSourcePivotTableAnchorCell", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSourcePivotTableAnchorCellUndefined: Self = StObject.set(x, "dataSourcePivotTableAnchorCell", js.undefined)
    
    @scala.inline
    def setDataSourceTableAnchorCell(value: GridCoordinate): Self = StObject.set(x, "dataSourceTableAnchorCell", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSourceTableAnchorCellUndefined: Self = StObject.set(x, "dataSourceTableAnchorCell", js.undefined)
    
    @scala.inline
    def setSheetId(value: String): Self = StObject.set(x, "sheetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSheetIdUndefined: Self = StObject.set(x, "sheetId", js.undefined)
  }
}
