package typings.officeJs.Excel.Interfaces

import typings.officeJs.Excel.ShapeLineDashStyle
import typings.officeJs.Excel.ShapeLineStyle
import typings.officeJs.officeJsStrings.Dash
import typings.officeJs.officeJsStrings.DashDot
import typings.officeJs.officeJsStrings.DashDotDot
import typings.officeJs.officeJsStrings.LongDash
import typings.officeJs.officeJsStrings.LongDashDot
import typings.officeJs.officeJsStrings.LongDashDotDot
import typings.officeJs.officeJsStrings.RoundDot
import typings.officeJs.officeJsStrings.Single
import typings.officeJs.officeJsStrings.Solid
import typings.officeJs.officeJsStrings.SquareDot
import typings.officeJs.officeJsStrings.SystemDash
import typings.officeJs.officeJsStrings.SystemDashDot
import typings.officeJs.officeJsStrings.SystemDot
import typings.officeJs.officeJsStrings.ThickBetweenThin
import typings.officeJs.officeJsStrings.ThickThin
import typings.officeJs.officeJsStrings.ThinThick
import typings.officeJs.officeJsStrings.ThinThin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the ShapeLineFormat object, for use in `shapeLineFormat.set({ ... })`. */
trait ShapeLineFormatUpdateData extends StObject {
  
  /**
    *
    * Represents the line color in HTML color format, of the form #RRGGBB (e.g., "FFA500") or as a named HTML color (e.g., "orange").
    *
    * [Api set: ExcelApi 1.9]
    */
  var color: js.UndefOr[String] = js.undefined
  
  /**
    *
    * Represents the line style of the shape. Returns null when the line is not visible or there are inconsistent dash styles. See Excel.ShapeLineStyle for details.
    *
    * [Api set: ExcelApi 1.9]
    */
  var dashStyle: js.UndefOr[
    ShapeLineDashStyle | Dash | DashDot | DashDotDot | LongDash | LongDashDot | RoundDot | Solid | SquareDot | LongDashDotDot | SystemDash | SystemDot | SystemDashDot
  ] = js.undefined
  
  /**
    *
    * Represents the line style of the shape. Returns null when the line is not visible or there are inconsistent styles. See Excel.ShapeLineStyle for details.
    *
    * [Api set: ExcelApi 1.9]
    */
  var style: js.UndefOr[ShapeLineStyle | Single | ThickBetweenThin | ThickThin | ThinThick | ThinThin] = js.undefined
  
  /**
    *
    * Represents the degree of transparency of the specified line as a value from 0.0 (opaque) through 1.0 (clear). Returns null when the shape has inconsistent transparencies.
    *
    * [Api set: ExcelApi 1.9]
    */
  var transparency: js.UndefOr[Double] = js.undefined
  
  /**
    *
    * Specifies if the line formatting of a shape element is visible. Returns null when the shape has inconsistent visibilities.
    *
    * [Api set: ExcelApi 1.9]
    */
  var visible: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Represents the weight of the line, in points. Returns null when the line is not visible or there are inconsistent line weights.
    *
    * [Api set: ExcelApi 1.9]
    */
  var weight: js.UndefOr[Double] = js.undefined
}
object ShapeLineFormatUpdateData {
  
  @scala.inline
  def apply(): ShapeLineFormatUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShapeLineFormatUpdateData]
  }
  
  @scala.inline
  implicit class ShapeLineFormatUpdateDataMutableBuilder[Self <: ShapeLineFormatUpdateData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setDashStyle(
      value: ShapeLineDashStyle | Dash | DashDot | DashDotDot | LongDash | LongDashDot | RoundDot | Solid | SquareDot | LongDashDotDot | SystemDash | SystemDot | SystemDashDot
    ): Self = StObject.set(x, "dashStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDashStyleUndefined: Self = StObject.set(x, "dashStyle", js.undefined)
    
    @scala.inline
    def setStyle(value: ShapeLineStyle | Single | ThickBetweenThin | ThickThin | ThinThick | ThinThin): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setTransparency(value: Double): Self = StObject.set(x, "transparency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransparencyUndefined: Self = StObject.set(x, "transparency", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    
    @scala.inline
    def setWeight(value: Double): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
  }
}
