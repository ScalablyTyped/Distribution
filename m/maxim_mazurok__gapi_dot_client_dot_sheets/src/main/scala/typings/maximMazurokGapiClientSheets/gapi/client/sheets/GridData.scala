package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GridData extends StObject {
  
  /** Metadata about the requested columns in the grid, starting with the column in start_column. */
  var columnMetadata: js.UndefOr[js.Array[DimensionProperties]] = js.undefined
  
  /** The data in the grid, one entry per row, starting with the row in startRow. The values in RowData will correspond to columns starting at start_column. */
  var rowData: js.UndefOr[js.Array[RowData]] = js.undefined
  
  /** Metadata about the requested rows in the grid, starting with the row in start_row. */
  var rowMetadata: js.UndefOr[js.Array[DimensionProperties]] = js.undefined
  
  /** The first column this GridData refers to, zero-based. */
  var startColumn: js.UndefOr[Double] = js.undefined
  
  /** The first row this GridData refers to, zero-based. */
  var startRow: js.UndefOr[Double] = js.undefined
}
object GridData {
  
  inline def apply(): GridData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridData]
  }
  
  extension [Self <: GridData](x: Self) {
    
    inline def setColumnMetadata(value: js.Array[DimensionProperties]): Self = StObject.set(x, "columnMetadata", value.asInstanceOf[js.Any])
    
    inline def setColumnMetadataUndefined: Self = StObject.set(x, "columnMetadata", js.undefined)
    
    inline def setColumnMetadataVarargs(value: DimensionProperties*): Self = StObject.set(x, "columnMetadata", js.Array(value*))
    
    inline def setRowData(value: js.Array[RowData]): Self = StObject.set(x, "rowData", value.asInstanceOf[js.Any])
    
    inline def setRowDataUndefined: Self = StObject.set(x, "rowData", js.undefined)
    
    inline def setRowDataVarargs(value: RowData*): Self = StObject.set(x, "rowData", js.Array(value*))
    
    inline def setRowMetadata(value: js.Array[DimensionProperties]): Self = StObject.set(x, "rowMetadata", value.asInstanceOf[js.Any])
    
    inline def setRowMetadataUndefined: Self = StObject.set(x, "rowMetadata", js.undefined)
    
    inline def setRowMetadataVarargs(value: DimensionProperties*): Self = StObject.set(x, "rowMetadata", js.Array(value*))
    
    inline def setStartColumn(value: Double): Self = StObject.set(x, "startColumn", value.asInstanceOf[js.Any])
    
    inline def setStartColumnUndefined: Self = StObject.set(x, "startColumn", js.undefined)
    
    inline def setStartRow(value: Double): Self = StObject.set(x, "startRow", value.asInstanceOf[js.Any])
    
    inline def setStartRowUndefined: Self = StObject.set(x, "startRow", js.undefined)
  }
}
