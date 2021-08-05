package typings.officeJs.Excel

import typings.officeJs.officeJsStrings.Continuous
import typings.officeJs.officeJsStrings.Dash
import typings.officeJs.officeJsStrings.DashDot
import typings.officeJs.officeJsStrings.DashDotDot
import typings.officeJs.officeJsStrings.Dot
import typings.officeJs.officeJsStrings.Double
import typings.officeJs.officeJsStrings.Hairline
import typings.officeJs.officeJsStrings.Medium
import typings.officeJs.officeJsStrings.None
import typings.officeJs.officeJsStrings.SlantDashDot
import typings.officeJs.officeJsStrings.Thick
import typings.officeJs.officeJsStrings.Thin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents the properties of a single border returned by `getCellProperties`, `getRowProperties`, and `getColumnProperties` or the border property input parameter of `setCellProperties`, `setRowProperties`, and `setColumnProperties`.
  *
  * [Api set: ExcelApi 1.9]
  */
trait CellBorder extends StObject {
  
  /**
    *
    * Represents the `color` property of a single border.
    *
    * [Api set: ExcelApi 1.9]
    */
  var color: js.UndefOr[String] = js.undefined
  
  /**
    *
    * Represents the `style` property of a single border.
    *
    * [Api set: ExcelApi 1.9]
    */
  var style: js.UndefOr[
    BorderLineStyle | None | Continuous | Dash | DashDot | DashDotDot | Dot | Double | SlantDashDot
  ] = js.undefined
  
  /**
    *
    * Represents the `tintAndShade` property of a single border.
    *
    * [Api set: ExcelApi 1.9]
    */
  var tintAndShade: js.UndefOr[scala.Double] = js.undefined
  
  /**
    *
    * Represents the `weight` property of a single border.
    *
    * [Api set: ExcelApi 1.9]
    */
  var weight: js.UndefOr[BorderWeight | Hairline | Thin | Medium | Thick] = js.undefined
}
object CellBorder {
  
  inline def apply(): CellBorder = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CellBorder]
  }
  
  extension [Self <: CellBorder](x: Self) {
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setStyle(
      value: BorderLineStyle | None | Continuous | Dash | DashDot | DashDotDot | Dot | Double | SlantDashDot
    ): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setTintAndShade(value: scala.Double): Self = StObject.set(x, "tintAndShade", value.asInstanceOf[js.Any])
    
    inline def setTintAndShadeUndefined: Self = StObject.set(x, "tintAndShade", js.undefined)
    
    inline def setWeight(value: BorderWeight | Hairline | Thin | Medium | Thick): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
    
    inline def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
  }
}
