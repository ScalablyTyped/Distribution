package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeveloperMetadataLocation extends StObject {
  
  /**
    * Represents the row or column when metadata is associated with a dimension. The specified DimensionRange must represent a single row or column; it cannot be unbounded or span
    * multiple rows or columns.
    */
  var dimensionRange: js.UndefOr[DimensionRange] = js.native
  
  /** The type of location this object represents. This field is read-only. */
  var locationType: js.UndefOr[String] = js.native
  
  /** The ID of the sheet when metadata is associated with an entire sheet. */
  var sheetId: js.UndefOr[Double] = js.native
  
  /** True when metadata is associated with an entire spreadsheet. */
  var spreadsheet: js.UndefOr[Boolean] = js.native
}
object DeveloperMetadataLocation {
  
  @scala.inline
  def apply(): DeveloperMetadataLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeveloperMetadataLocation]
  }
  
  @scala.inline
  implicit class DeveloperMetadataLocationMutableBuilder[Self <: DeveloperMetadataLocation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDimensionRange(value: DimensionRange): Self = StObject.set(x, "dimensionRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDimensionRangeUndefined: Self = StObject.set(x, "dimensionRange", js.undefined)
    
    @scala.inline
    def setLocationType(value: String): Self = StObject.set(x, "locationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationTypeUndefined: Self = StObject.set(x, "locationType", js.undefined)
    
    @scala.inline
    def setSheetId(value: Double): Self = StObject.set(x, "sheetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSheetIdUndefined: Self = StObject.set(x, "sheetId", js.undefined)
    
    @scala.inline
    def setSpreadsheet(value: Boolean): Self = StObject.set(x, "spreadsheet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpreadsheetUndefined: Self = StObject.set(x, "spreadsheet", js.undefined)
  }
}
