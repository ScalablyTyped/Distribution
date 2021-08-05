package typings.officeJs.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents a conditional format DataBar Format for the negative side of the data bar.
  *
  * [Api set: ExcelApi 1.6]
  */
trait ConditionalDataBarNegativeFormatLoadOptions extends StObject {
  
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * HTML color code representing the color of the border line, of the form #RRGGBB (e.g., "FFA500") or as a named HTML color (e.g., "orange").
    "Empty String" if no border is present or set.
    *
    * [Api set: ExcelApi 1.6]
    */
  var borderColor: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * HTML color code representing the fill color, of the form #RRGGBB (e.g., "FFA500") or as a named HTML color (e.g., "orange").
    *
    * [Api set: ExcelApi 1.6]
    */
  var fillColor: js.UndefOr[Boolean] = js.undefined
  
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
object ConditionalDataBarNegativeFormatLoadOptions {
  
  inline def apply(): ConditionalDataBarNegativeFormatLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConditionalDataBarNegativeFormatLoadOptions]
  }
  
  extension [Self <: ConditionalDataBarNegativeFormatLoadOptions](x: Self) {
    
    inline def set$all(value: Boolean): Self = StObject.set(x, "$all", value.asInstanceOf[js.Any])
    
    inline def set$allUndefined: Self = StObject.set(x, "$all", js.undefined)
    
    inline def setBorderColor(value: Boolean): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
    
    inline def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
    
    inline def setFillColor(value: Boolean): Self = StObject.set(x, "fillColor", value.asInstanceOf[js.Any])
    
    inline def setFillColorUndefined: Self = StObject.set(x, "fillColor", js.undefined)
    
    inline def setMatchPositiveBorderColor(value: Boolean): Self = StObject.set(x, "matchPositiveBorderColor", value.asInstanceOf[js.Any])
    
    inline def setMatchPositiveBorderColorUndefined: Self = StObject.set(x, "matchPositiveBorderColor", js.undefined)
    
    inline def setMatchPositiveFillColor(value: Boolean): Self = StObject.set(x, "matchPositiveFillColor", value.asInstanceOf[js.Any])
    
    inline def setMatchPositiveFillColorUndefined: Self = StObject.set(x, "matchPositiveFillColor", js.undefined)
  }
}
