package typings.officeJsPreview.Excel.Interfaces

import typings.officeJsPreview.Excel.ChartLineStyle
import typings.officeJsPreview.officeJsPreviewStrings.Automatic
import typings.officeJsPreview.officeJsPreviewStrings.Continuous
import typings.officeJsPreview.officeJsPreviewStrings.Dash
import typings.officeJsPreview.officeJsPreviewStrings.DashDot
import typings.officeJsPreview.officeJsPreviewStrings.DashDotDot
import typings.officeJsPreview.officeJsPreviewStrings.Dot
import typings.officeJsPreview.officeJsPreviewStrings.Grey25
import typings.officeJsPreview.officeJsPreviewStrings.Grey50
import typings.officeJsPreview.officeJsPreviewStrings.Grey75
import typings.officeJsPreview.officeJsPreviewStrings.None
import typings.officeJsPreview.officeJsPreviewStrings.RoundDot
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the ChartBorder object, for use in `chartBorder.set({ ... })`. */
trait ChartBorderUpdateData extends StObject {
  
  /**
    * HTML color code representing the color of borders in the chart.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var color: js.UndefOr[String] = js.undefined
  
  /**
    * Represents the line style of the border. See `Excel.ChartLineStyle` for details.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var lineStyle: js.UndefOr[
    ChartLineStyle | None | Continuous | Dash | DashDot | DashDotDot | Dot | Grey25 | Grey50 | Grey75 | Automatic | RoundDot
  ] = js.undefined
  
  /**
    * Represents weight of the border, in points.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var weight: js.UndefOr[Double] = js.undefined
}
object ChartBorderUpdateData {
  
  inline def apply(): ChartBorderUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartBorderUpdateData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChartBorderUpdateData] (val x: Self) extends AnyVal {
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setLineStyle(
      value: ChartLineStyle | None | Continuous | Dash | DashDot | DashDotDot | Dot | Grey25 | Grey50 | Grey75 | Automatic | RoundDot
    ): Self = StObject.set(x, "lineStyle", value.asInstanceOf[js.Any])
    
    inline def setLineStyleUndefined: Self = StObject.set(x, "lineStyle", js.undefined)
    
    inline def setWeight(value: Double): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
    
    inline def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
  }
}
