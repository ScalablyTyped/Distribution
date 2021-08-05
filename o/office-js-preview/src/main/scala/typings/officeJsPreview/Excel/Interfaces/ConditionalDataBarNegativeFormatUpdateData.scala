package typings.officeJsPreview.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the ConditionalDataBarNegativeFormat object, for use in `conditionalDataBarNegativeFormat.set({ ... })`. */
trait ConditionalDataBarNegativeFormatUpdateData extends StObject {
  
  /**
    *
    * HTML color code representing the color of the border line, of the form #RRGGBB (e.g., "FFA500") or as a named HTML color (e.g., "orange").
    "Empty String" if no border is present or set.
    *
    * [Api set: ExcelApi 1.6]
    */
  var borderColor: js.UndefOr[String] = js.undefined
  
  /**
    *
    * HTML color code representing the fill color, of the form #RRGGBB (e.g., "FFA500") or as a named HTML color (e.g., "orange").
    *
    * [Api set: ExcelApi 1.6]
    */
  var fillColor: js.UndefOr[String] = js.undefined
  
  /**
    *
    * Specifies if the negative DataBar has the same border color as the positive DataBar.
    *
    * [Api set: ExcelApi 1.6]
    */
  var matchPositiveBorderColor: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Specifies if the negative DataBar has the same fill color as the positive DataBar.
    *
    * [Api set: ExcelApi 1.6]
    */
  var matchPositiveFillColor: js.UndefOr[Boolean] = js.undefined
}
object ConditionalDataBarNegativeFormatUpdateData {
  
  inline def apply(): ConditionalDataBarNegativeFormatUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConditionalDataBarNegativeFormatUpdateData]
  }
  
  extension [Self <: ConditionalDataBarNegativeFormatUpdateData](x: Self) {
    
    inline def setBorderColor(value: String): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
    
    inline def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
    
    inline def setFillColor(value: String): Self = StObject.set(x, "fillColor", value.asInstanceOf[js.Any])
    
    inline def setFillColorUndefined: Self = StObject.set(x, "fillColor", js.undefined)
    
    inline def setMatchPositiveBorderColor(value: Boolean): Self = StObject.set(x, "matchPositiveBorderColor", value.asInstanceOf[js.Any])
    
    inline def setMatchPositiveBorderColorUndefined: Self = StObject.set(x, "matchPositiveBorderColor", js.undefined)
    
    inline def setMatchPositiveFillColor(value: Boolean): Self = StObject.set(x, "matchPositiveFillColor", value.asInstanceOf[js.Any])
    
    inline def setMatchPositiveFillColorUndefined: Self = StObject.set(x, "matchPositiveFillColor", js.undefined)
  }
}
