package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BasicSeriesDataPointStyleOverride extends StObject {
  
  /** Color of the series data point. If empty, the series default is used. Deprecated: Use color_style. */
  var color: js.UndefOr[Color] = js.undefined
  
  /** Color of the series data point. If empty, the series default is used. If color is also set, this field takes precedence. */
  var colorStyle: js.UndefOr[ColorStyle] = js.undefined
  
  /** Zero based index of the series data point. */
  var index: js.UndefOr[Double] = js.undefined
  
  /**
    * Point style of the series data point. Valid only if the chartType is AREA, LINE, or SCATTER. COMBO charts are also supported if the series chart type is AREA, LINE, or SCATTER. If
    * empty, the series default is used.
    */
  var pointStyle: js.UndefOr[PointStyle] = js.undefined
}
object BasicSeriesDataPointStyleOverride {
  
  inline def apply(): BasicSeriesDataPointStyleOverride = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BasicSeriesDataPointStyleOverride]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BasicSeriesDataPointStyleOverride] (val x: Self) extends AnyVal {
    
    inline def setColor(value: Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorStyle(value: ColorStyle): Self = StObject.set(x, "colorStyle", value.asInstanceOf[js.Any])
    
    inline def setColorStyleUndefined: Self = StObject.set(x, "colorStyle", js.undefined)
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setPointStyle(value: PointStyle): Self = StObject.set(x, "pointStyle", value.asInstanceOf[js.Any])
    
    inline def setPointStyleUndefined: Self = StObject.set(x, "pointStyle", js.undefined)
  }
}
