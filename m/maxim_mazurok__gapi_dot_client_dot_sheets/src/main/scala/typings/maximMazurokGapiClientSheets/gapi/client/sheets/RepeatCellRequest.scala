package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RepeatCellRequest extends StObject {
  
  /** The data to write. */
  var cell: js.UndefOr[CellData] = js.undefined
  
  /**
    * The fields that should be updated. At least one field must be specified. The root `cell` is implied and should not be specified. A single `"*"` can be used as short-hand for listing
    * every field.
    */
  var fields: js.UndefOr[String] = js.undefined
  
  /** The range to repeat the cell in. */
  var range: js.UndefOr[GridRange] = js.undefined
}
object RepeatCellRequest {
  
  inline def apply(): RepeatCellRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RepeatCellRequest]
  }
  
  extension [Self <: RepeatCellRequest](x: Self) {
    
    inline def setCell(value: CellData): Self = StObject.set(x, "cell", value.asInstanceOf[js.Any])
    
    inline def setCellUndefined: Self = StObject.set(x, "cell", js.undefined)
    
    inline def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setRange(value: GridRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
  }
}
