package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaselineValueFormat extends StObject {
  
  /** The comparison type of key value with baseline value. */
  var comparisonType: js.UndefOr[String] = js.native
  
  /** Description which is appended after the baseline value. This field is optional. */
  var description: js.UndefOr[String] = js.native
  
  /** Color to be used, in case baseline value represents a negative change for key value. This field is optional. */
  var negativeColor: js.UndefOr[Color] = js.native
  
  /** Color to be used, in case baseline value represents a negative change for key value. This field is optional. If negative_color is also set, this field takes precedence. */
  var negativeColorStyle: js.UndefOr[ColorStyle] = js.native
  
  /** Specifies the horizontal text positioning of baseline value. This field is optional. If not specified, default positioning is used. */
  var position: js.UndefOr[TextPosition] = js.native
  
  /** Color to be used, in case baseline value represents a positive change for key value. This field is optional. */
  var positiveColor: js.UndefOr[Color] = js.native
  
  /** Color to be used, in case baseline value represents a positive change for key value. This field is optional. If positive_color is also set, this field takes precedence. */
  var positiveColorStyle: js.UndefOr[ColorStyle] = js.native
  
  /** Text formatting options for baseline value. */
  var textFormat: js.UndefOr[TextFormat] = js.native
}
object BaselineValueFormat {
  
  @scala.inline
  def apply(): BaselineValueFormat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaselineValueFormat]
  }
  
  @scala.inline
  implicit class BaselineValueFormatMutableBuilder[Self <: BaselineValueFormat] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComparisonType(value: String): Self = StObject.set(x, "comparisonType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComparisonTypeUndefined: Self = StObject.set(x, "comparisonType", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setNegativeColor(value: Color): Self = StObject.set(x, "negativeColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNegativeColorStyle(value: ColorStyle): Self = StObject.set(x, "negativeColorStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNegativeColorStyleUndefined: Self = StObject.set(x, "negativeColorStyle", js.undefined)
    
    @scala.inline
    def setNegativeColorUndefined: Self = StObject.set(x, "negativeColor", js.undefined)
    
    @scala.inline
    def setPosition(value: TextPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    @scala.inline
    def setPositiveColor(value: Color): Self = StObject.set(x, "positiveColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositiveColorStyle(value: ColorStyle): Self = StObject.set(x, "positiveColorStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositiveColorStyleUndefined: Self = StObject.set(x, "positiveColorStyle", js.undefined)
    
    @scala.inline
    def setPositiveColorUndefined: Self = StObject.set(x, "positiveColor", js.undefined)
    
    @scala.inline
    def setTextFormat(value: TextFormat): Self = StObject.set(x, "textFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextFormatUndefined: Self = StObject.set(x, "textFormat", js.undefined)
  }
}
