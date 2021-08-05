package typings.officeJsPreview.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents the background of a range object.
  *
  * [Api set: ExcelApi 1.1]
  */
trait RangeFillLoadOptions extends StObject {
  
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * HTML color code representing the color of the background, of the form #RRGGBB (e.g., "FFA500") or as a named HTML color (e.g., "orange")
    *
    * [Api set: ExcelApi 1.1]
    */
  var color: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * The pattern of a range. See Excel.FillPattern for details. LinearGradient and RectangularGradient are not supported.
    A null value indicates that the entire range doesn't have uniform pattern setting.
    *
    * [Api set: ExcelApi 1.9]
    */
  var pattern: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * The HTML color code representing the color of the range pattern, of the form #RRGGBB (e.g., "FFA500") or as a named HTML color (e.g., "orange").
    *
    * [Api set: ExcelApi 1.9]
    */
  var patternColor: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Specifies a double that lightens or darkens a pattern color for Range Fill, the value is between -1 (darkest) and 1 (brightest), with 0 for the original color.
    If the pattern tintAndShades are not uniform, null will be returned.
    *
    * [Api set: ExcelApi 1.9]
    */
  var patternTintAndShade: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Specifies a double that lightens or darkens a color for Range Fill. The value is between -1 (darkest) and 1 (brightest), with 0 for the original color.
    If the tintAndShades are not uniform, null will be returned.
    *
    * [Api set: ExcelApi 1.9]
    */
  var tintAndShade: js.UndefOr[Boolean] = js.undefined
}
object RangeFillLoadOptions {
  
  inline def apply(): RangeFillLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RangeFillLoadOptions]
  }
  
  extension [Self <: RangeFillLoadOptions](x: Self) {
    
    inline def set$all(value: Boolean): Self = StObject.set(x, "$all", value.asInstanceOf[js.Any])
    
    inline def set$allUndefined: Self = StObject.set(x, "$all", js.undefined)
    
    inline def setColor(value: Boolean): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setPattern(value: Boolean): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    
    inline def setPatternColor(value: Boolean): Self = StObject.set(x, "patternColor", value.asInstanceOf[js.Any])
    
    inline def setPatternColorUndefined: Self = StObject.set(x, "patternColor", js.undefined)
    
    inline def setPatternTintAndShade(value: Boolean): Self = StObject.set(x, "patternTintAndShade", value.asInstanceOf[js.Any])
    
    inline def setPatternTintAndShadeUndefined: Self = StObject.set(x, "patternTintAndShade", js.undefined)
    
    inline def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
    
    inline def setTintAndShade(value: Boolean): Self = StObject.set(x, "tintAndShade", value.asInstanceOf[js.Any])
    
    inline def setTintAndShadeUndefined: Self = StObject.set(x, "tintAndShade", js.undefined)
  }
}
