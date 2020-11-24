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
trait CellPropertiesFill extends js.Object {
  
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
  implicit class CellPropertiesFillOps[Self <: CellPropertiesFill] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setPattern(
      value: FillPattern | None | Solid | Gray50 | Gray75 | Gray25 | Horizontal | Vertical | Down | Up | Checker | SemiGray75 | LightHorizontal | LightVertical | LightDown | LightUp | Grid | CrissCross | Gray16 | Gray8 | LinearGradient | RectangularGradient
    ): Self = this.set("pattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePattern: Self = this.set("pattern", js.undefined)
    
    @scala.inline
    def setPatternColor(value: String): Self = this.set("patternColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePatternColor: Self = this.set("patternColor", js.undefined)
    
    @scala.inline
    def setPatternTintAndShade(value: Double): Self = this.set("patternTintAndShade", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePatternTintAndShade: Self = this.set("patternTintAndShade", js.undefined)
    
    @scala.inline
    def setTintAndShade(value: Double): Self = this.set("tintAndShade", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTintAndShade: Self = this.set("tintAndShade", js.undefined)
  }
}
