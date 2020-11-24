package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TreemapChartColorScale extends js.Object {
  
  /** The background color for cells with a color value greater than or equal to maxValue. Defaults to #109618 if not specified. */
  var maxValueColor: js.UndefOr[Color] = js.native
  
  /**
    * The background color for cells with a color value greater than or equal to maxValue. Defaults to #109618 if not specified. If max_value_color is also set, this field takes
    * precedence.
    */
  var maxValueColorStyle: js.UndefOr[ColorStyle] = js.native
  
  /** The background color for cells with a color value at the midpoint between minValue and maxValue. Defaults to #efe6dc if not specified. */
  var midValueColor: js.UndefOr[Color] = js.native
  
  /**
    * The background color for cells with a color value at the midpoint between minValue and maxValue. Defaults to #efe6dc if not specified. If mid_value_color is also set, this field
    * takes precedence.
    */
  var midValueColorStyle: js.UndefOr[ColorStyle] = js.native
  
  /** The background color for cells with a color value less than or equal to minValue. Defaults to #dc3912 if not specified. */
  var minValueColor: js.UndefOr[Color] = js.native
  
  /** The background color for cells with a color value less than or equal to minValue. Defaults to #dc3912 if not specified. If min_value_color is also set, this field takes precedence. */
  var minValueColorStyle: js.UndefOr[ColorStyle] = js.native
  
  /** The background color for cells that have no color data associated with them. Defaults to #000000 if not specified. */
  var noDataColor: js.UndefOr[Color] = js.native
  
  /** The background color for cells that have no color data associated with them. Defaults to #000000 if not specified. If no_data_color is also set, this field takes precedence. */
  var noDataColorStyle: js.UndefOr[ColorStyle] = js.native
}
object TreemapChartColorScale {
  
  @scala.inline
  def apply(): TreemapChartColorScale = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TreemapChartColorScale]
  }
  
  @scala.inline
  implicit class TreemapChartColorScaleOps[Self <: TreemapChartColorScale] (val x: Self) extends AnyVal {
    
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
    def setMaxValueColor(value: Color): Self = this.set("maxValueColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxValueColor: Self = this.set("maxValueColor", js.undefined)
    
    @scala.inline
    def setMaxValueColorStyle(value: ColorStyle): Self = this.set("maxValueColorStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxValueColorStyle: Self = this.set("maxValueColorStyle", js.undefined)
    
    @scala.inline
    def setMidValueColor(value: Color): Self = this.set("midValueColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMidValueColor: Self = this.set("midValueColor", js.undefined)
    
    @scala.inline
    def setMidValueColorStyle(value: ColorStyle): Self = this.set("midValueColorStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMidValueColorStyle: Self = this.set("midValueColorStyle", js.undefined)
    
    @scala.inline
    def setMinValueColor(value: Color): Self = this.set("minValueColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinValueColor: Self = this.set("minValueColor", js.undefined)
    
    @scala.inline
    def setMinValueColorStyle(value: ColorStyle): Self = this.set("minValueColorStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinValueColorStyle: Self = this.set("minValueColorStyle", js.undefined)
    
    @scala.inline
    def setNoDataColor(value: Color): Self = this.set("noDataColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoDataColor: Self = this.set("noDataColor", js.undefined)
    
    @scala.inline
    def setNoDataColorStyle(value: ColorStyle): Self = this.set("noDataColorStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoDataColorStyle: Self = this.set("noDataColorStyle", js.undefined)
  }
}
