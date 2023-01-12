package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeveloperMetadataLocation extends StObject {
  
  /**
    * Represents the row or column when metadata is associated with a dimension. The specified DimensionRange must represent a single row or column; it cannot be unbounded or span
    * multiple rows or columns.
    */
  var dimensionRange: js.UndefOr[DimensionRange] = js.undefined
  
  /** The type of location this object represents. This field is read-only. */
  var locationType: js.UndefOr[String] = js.undefined
  
  /** The ID of the sheet when metadata is associated with an entire sheet. */
  var sheetId: js.UndefOr[Double] = js.undefined
  
  /** True when metadata is associated with an entire spreadsheet. */
  var spreadsheet: js.UndefOr[Boolean] = js.undefined
}
object DeveloperMetadataLocation {
  
  inline def apply(): DeveloperMetadataLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeveloperMetadataLocation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeveloperMetadataLocation] (val x: Self) extends AnyVal {
    
    inline def setDimensionRange(value: DimensionRange): Self = StObject.set(x, "dimensionRange", value.asInstanceOf[js.Any])
    
    inline def setDimensionRangeUndefined: Self = StObject.set(x, "dimensionRange", js.undefined)
    
    inline def setLocationType(value: String): Self = StObject.set(x, "locationType", value.asInstanceOf[js.Any])
    
    inline def setLocationTypeUndefined: Self = StObject.set(x, "locationType", js.undefined)
    
    inline def setSheetId(value: Double): Self = StObject.set(x, "sheetId", value.asInstanceOf[js.Any])
    
    inline def setSheetIdUndefined: Self = StObject.set(x, "sheetId", js.undefined)
    
    inline def setSpreadsheet(value: Boolean): Self = StObject.set(x, "spreadsheet", value.asInstanceOf[js.Any])
    
    inline def setSpreadsheetUndefined: Self = StObject.set(x, "spreadsheet", js.undefined)
  }
}
