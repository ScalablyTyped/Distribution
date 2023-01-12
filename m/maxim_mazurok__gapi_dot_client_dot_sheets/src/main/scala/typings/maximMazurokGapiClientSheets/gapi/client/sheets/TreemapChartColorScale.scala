package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TreemapChartColorScale extends StObject {
  
  /** The background color for cells with a color value greater than or equal to maxValue. Defaults to #109618 if not specified. Deprecated: Use max_value_color_style. */
  var maxValueColor: js.UndefOr[Color] = js.undefined
  
  /**
    * The background color for cells with a color value greater than or equal to maxValue. Defaults to #109618 if not specified. If max_value_color is also set, this field takes
    * precedence.
    */
  var maxValueColorStyle: js.UndefOr[ColorStyle] = js.undefined
  
  /** The background color for cells with a color value at the midpoint between minValue and maxValue. Defaults to #efe6dc if not specified. Deprecated: Use mid_value_color_style. */
  var midValueColor: js.UndefOr[Color] = js.undefined
  
  /**
    * The background color for cells with a color value at the midpoint between minValue and maxValue. Defaults to #efe6dc if not specified. If mid_value_color is also set, this field
    * takes precedence.
    */
  var midValueColorStyle: js.UndefOr[ColorStyle] = js.undefined
  
  /** The background color for cells with a color value less than or equal to minValue. Defaults to #dc3912 if not specified. Deprecated: Use min_value_color_style. */
  var minValueColor: js.UndefOr[Color] = js.undefined
  
  /** The background color for cells with a color value less than or equal to minValue. Defaults to #dc3912 if not specified. If min_value_color is also set, this field takes precedence. */
  var minValueColorStyle: js.UndefOr[ColorStyle] = js.undefined
  
  /** The background color for cells that have no color data associated with them. Defaults to #000000 if not specified. Deprecated: Use no_data_color_style. */
  var noDataColor: js.UndefOr[Color] = js.undefined
  
  /** The background color for cells that have no color data associated with them. Defaults to #000000 if not specified. If no_data_color is also set, this field takes precedence. */
  var noDataColorStyle: js.UndefOr[ColorStyle] = js.undefined
}
object TreemapChartColorScale {
  
  inline def apply(): TreemapChartColorScale = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TreemapChartColorScale]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TreemapChartColorScale] (val x: Self) extends AnyVal {
    
    inline def setMaxValueColor(value: Color): Self = StObject.set(x, "maxValueColor", value.asInstanceOf[js.Any])
    
    inline def setMaxValueColorStyle(value: ColorStyle): Self = StObject.set(x, "maxValueColorStyle", value.asInstanceOf[js.Any])
    
    inline def setMaxValueColorStyleUndefined: Self = StObject.set(x, "maxValueColorStyle", js.undefined)
    
    inline def setMaxValueColorUndefined: Self = StObject.set(x, "maxValueColor", js.undefined)
    
    inline def setMidValueColor(value: Color): Self = StObject.set(x, "midValueColor", value.asInstanceOf[js.Any])
    
    inline def setMidValueColorStyle(value: ColorStyle): Self = StObject.set(x, "midValueColorStyle", value.asInstanceOf[js.Any])
    
    inline def setMidValueColorStyleUndefined: Self = StObject.set(x, "midValueColorStyle", js.undefined)
    
    inline def setMidValueColorUndefined: Self = StObject.set(x, "midValueColor", js.undefined)
    
    inline def setMinValueColor(value: Color): Self = StObject.set(x, "minValueColor", value.asInstanceOf[js.Any])
    
    inline def setMinValueColorStyle(value: ColorStyle): Self = StObject.set(x, "minValueColorStyle", value.asInstanceOf[js.Any])
    
    inline def setMinValueColorStyleUndefined: Self = StObject.set(x, "minValueColorStyle", js.undefined)
    
    inline def setMinValueColorUndefined: Self = StObject.set(x, "minValueColor", js.undefined)
    
    inline def setNoDataColor(value: Color): Self = StObject.set(x, "noDataColor", value.asInstanceOf[js.Any])
    
    inline def setNoDataColorStyle(value: ColorStyle): Self = StObject.set(x, "noDataColorStyle", value.asInstanceOf[js.Any])
    
    inline def setNoDataColorStyleUndefined: Self = StObject.set(x, "noDataColorStyle", js.undefined)
    
    inline def setNoDataColorUndefined: Self = StObject.set(x, "noDataColor", js.undefined)
  }
}
