package typings.officeJs.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the RangeAreas object, for use in `rangeAreas.set({ ... })`. */
trait RangeAreasUpdateData extends StObject {
  
  /**
    *
    * Returns a dataValidation object for all ranges in the RangeAreas.
    *
    * [Api set: ExcelApi 1.9]
    */
  var dataValidation: js.UndefOr[DataValidationUpdateData] = js.undefined
  
  /**
    *
    * Returns a RangeFormat object, encapsulating the the font, fill, borders, alignment, and other properties for all ranges in the RangeAreas object.
    *
    * [Api set: ExcelApi 1.9]
    */
  var format: js.UndefOr[RangeFormatUpdateData] = js.undefined
  
  /**
    *
    * Represents the style for all ranges in this RangeAreas object.
    If the styles of the cells are inconsistent, null will be returned.
    For custom styles, the style name will be returned. For built-in styles, a string representing a value in the BuiltInStyle enum will be returned.
    *
    * [Api set: ExcelApi 1.9]
    */
  var style: js.UndefOr[String] = js.undefined
}
object RangeAreasUpdateData {
  
  inline def apply(): RangeAreasUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RangeAreasUpdateData]
  }
  
  extension [Self <: RangeAreasUpdateData](x: Self) {
    
    inline def setDataValidation(value: DataValidationUpdateData): Self = StObject.set(x, "dataValidation", value.asInstanceOf[js.Any])
    
    inline def setDataValidationUndefined: Self = StObject.set(x, "dataValidation", js.undefined)
    
    inline def setFormat(value: RangeFormatUpdateData): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
