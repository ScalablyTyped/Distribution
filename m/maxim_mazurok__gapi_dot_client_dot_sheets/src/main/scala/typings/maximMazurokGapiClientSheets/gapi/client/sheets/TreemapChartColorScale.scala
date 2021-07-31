package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TreemapChartColorScale extends StObject {
  
  /** The background color for cells with a color value greater than or equal to maxValue. Defaults to #109618 if not specified. */
  var maxValueColor: js.UndefOr[Color] = js.undefined
  
  /**
    * The background color for cells with a color value greater than or equal to maxValue. Defaults to #109618 if not specified. If max_value_color is also set, this field takes
    * precedence.
    */
  var maxValueColorStyle: js.UndefOr[ColorStyle] = js.undefined
  
  /** The background color for cells with a color value at the midpoint between minValue and maxValue. Defaults to #efe6dc if not specified. */
  var midValueColor: js.UndefOr[Color] = js.undefined
  
  /**
    * The background color for cells with a color value at the midpoint between minValue and maxValue. Defaults to #efe6dc if not specified. If mid_value_color is also set, this field
    * takes precedence.
    */
  var midValueColorStyle: js.UndefOr[ColorStyle] = js.undefined
  
  /** The background color for cells with a color value less than or equal to minValue. Defaults to #dc3912 if not specified. */
  var minValueColor: js.UndefOr[Color] = js.undefined
  
  /** The background color for cells with a color value less than or equal to minValue. Defaults to #dc3912 if not specified. If min_value_color is also set, this field takes precedence. */
  var minValueColorStyle: js.UndefOr[ColorStyle] = js.undefined
  
  /** The background color for cells that have no color data associated with them. Defaults to #000000 if not specified. */
  var noDataColor: js.UndefOr[Color] = js.undefined
  
  /** The background color for cells that have no color data associated with them. Defaults to #000000 if not specified. If no_data_color is also set, this field takes precedence. */
  var noDataColorStyle: js.UndefOr[ColorStyle] = js.undefined
}
object TreemapChartColorScale {
  
  @scala.inline
  def apply(): TreemapChartColorScale = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TreemapChartColorScale]
  }
  
  @scala.inline
  implicit class TreemapChartColorScaleMutableBuilder[Self <: TreemapChartColorScale] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxValueColor(value: Color): Self = StObject.set(x, "maxValueColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxValueColorStyle(value: ColorStyle): Self = StObject.set(x, "maxValueColorStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxValueColorStyleUndefined: Self = StObject.set(x, "maxValueColorStyle", js.undefined)
    
    @scala.inline
    def setMaxValueColorUndefined: Self = StObject.set(x, "maxValueColor", js.undefined)
    
    @scala.inline
    def setMidValueColor(value: Color): Self = StObject.set(x, "midValueColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMidValueColorStyle(value: ColorStyle): Self = StObject.set(x, "midValueColorStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMidValueColorStyleUndefined: Self = StObject.set(x, "midValueColorStyle", js.undefined)
    
    @scala.inline
    def setMidValueColorUndefined: Self = StObject.set(x, "midValueColor", js.undefined)
    
    @scala.inline
    def setMinValueColor(value: Color): Self = StObject.set(x, "minValueColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinValueColorStyle(value: ColorStyle): Self = StObject.set(x, "minValueColorStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinValueColorStyleUndefined: Self = StObject.set(x, "minValueColorStyle", js.undefined)
    
    @scala.inline
    def setMinValueColorUndefined: Self = StObject.set(x, "minValueColor", js.undefined)
    
    @scala.inline
    def setNoDataColor(value: Color): Self = StObject.set(x, "noDataColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoDataColorStyle(value: ColorStyle): Self = StObject.set(x, "noDataColorStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoDataColorStyleUndefined: Self = StObject.set(x, "noDataColorStyle", js.undefined)
    
    @scala.inline
    def setNoDataColorUndefined: Self = StObject.set(x, "noDataColor", js.undefined)
  }
}
