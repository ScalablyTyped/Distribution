package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FilterCriteria extends js.Object {
  
  /** A condition that must be true for values to be shown. (This does not override hidden_values -- if a value is listed there, it will still be hidden.) */
  var condition: js.UndefOr[BooleanCondition] = js.native
  
  /** Values that should be hidden. */
  var hiddenValues: js.UndefOr[js.Array[String]] = js.native
  
  /** The background fill color to filter by; only cells with this fill color are shown. Mutually exclusive with visible_foreground_color. */
  var visibleBackgroundColor: js.UndefOr[Color] = js.native
  
  /**
    * The background fill color to filter by; only cells with this fill color are shown. This field is mutually exclusive with visible_foreground_color, and must be set to an RGB-type
    * color. If visible_background_color is also set, this field takes precedence.
    */
  var visibleBackgroundColorStyle: js.UndefOr[ColorStyle] = js.native
  
  /** The foreground color to filter by; only cells with this foreground color are shown. Mutually exclusive with visible_background_color. */
  var visibleForegroundColor: js.UndefOr[Color] = js.native
  
  /**
    * The foreground color to filter by; only cells with this foreground color are shown. This field is mutually exclusive with visible_background_color, and must be set to an RGB-type
    * color. If visible_foreground_color is also set, this field takes precedence.
    */
  var visibleForegroundColorStyle: js.UndefOr[ColorStyle] = js.native
}
object FilterCriteria {
  
  @scala.inline
  def apply(): FilterCriteria = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilterCriteria]
  }
  
  @scala.inline
  implicit class FilterCriteriaOps[Self <: FilterCriteria] (val x: Self) extends AnyVal {
    
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
    def setCondition(value: BooleanCondition): Self = this.set("condition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCondition: Self = this.set("condition", js.undefined)
    
    @scala.inline
    def setHiddenValuesVarargs(value: String*): Self = this.set("hiddenValues", js.Array(value :_*))
    
    @scala.inline
    def setHiddenValues(value: js.Array[String]): Self = this.set("hiddenValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHiddenValues: Self = this.set("hiddenValues", js.undefined)
    
    @scala.inline
    def setVisibleBackgroundColor(value: Color): Self = this.set("visibleBackgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisibleBackgroundColor: Self = this.set("visibleBackgroundColor", js.undefined)
    
    @scala.inline
    def setVisibleBackgroundColorStyle(value: ColorStyle): Self = this.set("visibleBackgroundColorStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisibleBackgroundColorStyle: Self = this.set("visibleBackgroundColorStyle", js.undefined)
    
    @scala.inline
    def setVisibleForegroundColor(value: Color): Self = this.set("visibleForegroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisibleForegroundColor: Self = this.set("visibleForegroundColor", js.undefined)
    
    @scala.inline
    def setVisibleForegroundColorStyle(value: ColorStyle): Self = this.set("visibleForegroundColorStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisibleForegroundColorStyle: Self = this.set("visibleForegroundColorStyle", js.undefined)
  }
}
