package typings.officeJs.Excel

import typings.officeJs.officeJsStrings.Checker
import typings.officeJs.officeJsStrings.CrissCross
import typings.officeJs.officeJsStrings.Down
import typings.officeJs.officeJsStrings.Gray16
import typings.officeJs.officeJsStrings.Gray25
import typings.officeJs.officeJsStrings.Gray50
import typings.officeJs.officeJsStrings.Gray75
import typings.officeJs.officeJsStrings.Gray8
import typings.officeJs.officeJsStrings.Grid
import typings.officeJs.officeJsStrings.Horizontal
import typings.officeJs.officeJsStrings.LightDown
import typings.officeJs.officeJsStrings.LightHorizontal
import typings.officeJs.officeJsStrings.LightUp
import typings.officeJs.officeJsStrings.LightVertical
import typings.officeJs.officeJsStrings.LinearGradient
import typings.officeJs.officeJsStrings.None
import typings.officeJs.officeJsStrings.RectangularGradient
import typings.officeJs.officeJsStrings.SemiGray75
import typings.officeJs.officeJsStrings.Solid
import typings.officeJs.officeJsStrings.Up
import typings.officeJs.officeJsStrings.Vertical
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents the `format.fill` properties of `getCellProperties`, `getRowProperties`, and `getColumnProperties` or the `format.fill` input parameter of `setCellProperties`, `setRowProperties`, and `setColumnProperties`.
  *
  * [Api set: ExcelApi 1.9]
  */
@js.native
trait CellPropertiesFill extends StObject {
  
  /**
    *
    * Represents the `format.fill.color` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var color: js.UndefOr[String] = js.native
  
  /**
    *
    * Represents the `format.fill.pattern` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var pattern: js.UndefOr[
    FillPattern | None | Solid | Gray50 | Gray75 | Gray25 | Horizontal | Vertical | Down | Up | Checker | SemiGray75 | LightHorizontal | LightVertical | LightDown | LightUp | Grid | CrissCross | Gray16 | Gray8 | LinearGradient | RectangularGradient
  ] = js.native
  
  /**
    *
    * Represents the `format.fill.patternColor` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var patternColor: js.UndefOr[String] = js.native
  
  /**
    *
    * Represents the `format.fill.patternTintAndShade` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var patternTintAndShade: js.UndefOr[Double] = js.native
  
  /**
    *
    * Represents the `format.fill.tintAndShade` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var tintAndShade: js.UndefOr[Double] = js.native
}
object CellPropertiesFill {
  
  @scala.inline
  def apply(): CellPropertiesFill = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CellPropertiesFill]
  }
  
  @scala.inline
  implicit class CellPropertiesFillMutableBuilder[Self <: CellPropertiesFill] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setPattern(
      value: FillPattern | None | Solid | Gray50 | Gray75 | Gray25 | Horizontal | Vertical | Down | Up | Checker | SemiGray75 | LightHorizontal | LightVertical | LightDown | LightUp | Grid | CrissCross | Gray16 | Gray8 | LinearGradient | RectangularGradient
    ): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPatternColor(value: String): Self = StObject.set(x, "patternColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPatternColorUndefined: Self = StObject.set(x, "patternColor", js.undefined)
    
    @scala.inline
    def setPatternTintAndShade(value: Double): Self = StObject.set(x, "patternTintAndShade", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPatternTintAndShadeUndefined: Self = StObject.set(x, "patternTintAndShade", js.undefined)
    
    @scala.inline
    def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
    
    @scala.inline
    def setTintAndShade(value: Double): Self = StObject.set(x, "tintAndShade", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTintAndShadeUndefined: Self = StObject.set(x, "tintAndShade", js.undefined)
  }
}
