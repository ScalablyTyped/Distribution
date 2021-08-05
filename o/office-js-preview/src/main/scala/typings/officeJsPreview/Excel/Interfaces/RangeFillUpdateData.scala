package typings.officeJsPreview.Excel.Interfaces

import typings.officeJsPreview.Excel.FillPattern
import typings.officeJsPreview.officeJsPreviewStrings.Checker
import typings.officeJsPreview.officeJsPreviewStrings.CrissCross
import typings.officeJsPreview.officeJsPreviewStrings.Down
import typings.officeJsPreview.officeJsPreviewStrings.Gray16
import typings.officeJsPreview.officeJsPreviewStrings.Gray25
import typings.officeJsPreview.officeJsPreviewStrings.Gray50
import typings.officeJsPreview.officeJsPreviewStrings.Gray75
import typings.officeJsPreview.officeJsPreviewStrings.Gray8
import typings.officeJsPreview.officeJsPreviewStrings.Grid
import typings.officeJsPreview.officeJsPreviewStrings.Horizontal
import typings.officeJsPreview.officeJsPreviewStrings.LightDown
import typings.officeJsPreview.officeJsPreviewStrings.LightHorizontal
import typings.officeJsPreview.officeJsPreviewStrings.LightUp
import typings.officeJsPreview.officeJsPreviewStrings.LightVertical
import typings.officeJsPreview.officeJsPreviewStrings.LinearGradient
import typings.officeJsPreview.officeJsPreviewStrings.None
import typings.officeJsPreview.officeJsPreviewStrings.RectangularGradient
import typings.officeJsPreview.officeJsPreviewStrings.SemiGray75
import typings.officeJsPreview.officeJsPreviewStrings.Solid
import typings.officeJsPreview.officeJsPreviewStrings.Up
import typings.officeJsPreview.officeJsPreviewStrings.Vertical
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the RangeFill object, for use in `rangeFill.set({ ... })`. */
trait RangeFillUpdateData extends StObject {
  
  /**
    *
    * HTML color code representing the color of the background, of the form #RRGGBB (e.g., "FFA500") or as a named HTML color (e.g., "orange")
    *
    * [Api set: ExcelApi 1.1]
    */
  var color: js.UndefOr[String] = js.undefined
  
  /**
    *
    * The pattern of a range. See Excel.FillPattern for details. LinearGradient and RectangularGradient are not supported.
    A null value indicates that the entire range doesn't have uniform pattern setting.
    *
    * [Api set: ExcelApi 1.9]
    */
  var pattern: js.UndefOr[
    FillPattern | None | Solid | Gray50 | Gray75 | Gray25 | Horizontal | Vertical | Down | Up | Checker | SemiGray75 | LightHorizontal | LightVertical | LightDown | LightUp | Grid | CrissCross | Gray16 | Gray8 | LinearGradient | RectangularGradient
  ] = js.undefined
  
  /**
    *
    * The HTML color code representing the color of the range pattern, of the form #RRGGBB (e.g., "FFA500") or as a named HTML color (e.g., "orange").
    *
    * [Api set: ExcelApi 1.9]
    */
  var patternColor: js.UndefOr[String] = js.undefined
  
  /**
    *
    * Specifies a double that lightens or darkens a pattern color for Range Fill, the value is between -1 (darkest) and 1 (brightest), with 0 for the original color.
    If the pattern tintAndShades are not uniform, null will be returned.
    *
    * [Api set: ExcelApi 1.9]
    */
  var patternTintAndShade: js.UndefOr[Double] = js.undefined
  
  /**
    *
    * Specifies a double that lightens or darkens a color for Range Fill. The value is between -1 (darkest) and 1 (brightest), with 0 for the original color.
    If the tintAndShades are not uniform, null will be returned.
    *
    * [Api set: ExcelApi 1.9]
    */
  var tintAndShade: js.UndefOr[Double] = js.undefined
}
object RangeFillUpdateData {
  
  inline def apply(): RangeFillUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RangeFillUpdateData]
  }
  
  extension [Self <: RangeFillUpdateData](x: Self) {
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setPattern(
      value: FillPattern | None | Solid | Gray50 | Gray75 | Gray25 | Horizontal | Vertical | Down | Up | Checker | SemiGray75 | LightHorizontal | LightVertical | LightDown | LightUp | Grid | CrissCross | Gray16 | Gray8 | LinearGradient | RectangularGradient
    ): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    
    inline def setPatternColor(value: String): Self = StObject.set(x, "patternColor", value.asInstanceOf[js.Any])
    
    inline def setPatternColorUndefined: Self = StObject.set(x, "patternColor", js.undefined)
    
    inline def setPatternTintAndShade(value: Double): Self = StObject.set(x, "patternTintAndShade", value.asInstanceOf[js.Any])
    
    inline def setPatternTintAndShadeUndefined: Self = StObject.set(x, "patternTintAndShade", js.undefined)
    
    inline def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
    
    inline def setTintAndShade(value: Double): Self = StObject.set(x, "tintAndShade", value.asInstanceOf[js.Any])
    
    inline def setTintAndShadeUndefined: Self = StObject.set(x, "tintAndShade", js.undefined)
  }
}
