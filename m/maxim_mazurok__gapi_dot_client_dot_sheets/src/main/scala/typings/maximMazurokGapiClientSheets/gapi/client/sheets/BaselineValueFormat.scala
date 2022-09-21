package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaselineValueFormat extends StObject {
  
  /** The comparison type of key value with baseline value. */
  var comparisonType: js.UndefOr[String] = js.undefined
  
  /** Description which is appended after the baseline value. This field is optional. */
  var description: js.UndefOr[String] = js.undefined
  
  /** Color to be used, in case baseline value represents a negative change for key value. This field is optional. Deprecated: Use negative_color_style. */
  var negativeColor: js.UndefOr[Color] = js.undefined
  
  /** Color to be used, in case baseline value represents a negative change for key value. This field is optional. If negative_color is also set, this field takes precedence. */
  var negativeColorStyle: js.UndefOr[ColorStyle] = js.undefined
  
  /** Specifies the horizontal text positioning of baseline value. This field is optional. If not specified, default positioning is used. */
  var position: js.UndefOr[TextPosition] = js.undefined
  
  /** Color to be used, in case baseline value represents a positive change for key value. This field is optional. Deprecated: Use positive_color_style. */
  var positiveColor: js.UndefOr[Color] = js.undefined
  
  /** Color to be used, in case baseline value represents a positive change for key value. This field is optional. If positive_color is also set, this field takes precedence. */
  var positiveColorStyle: js.UndefOr[ColorStyle] = js.undefined
  
  /** Text formatting options for baseline value. The link field is not supported. */
  var textFormat: js.UndefOr[TextFormat] = js.undefined
}
object BaselineValueFormat {
  
  inline def apply(): BaselineValueFormat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaselineValueFormat]
  }
  
  extension [Self <: BaselineValueFormat](x: Self) {
    
    inline def setComparisonType(value: String): Self = StObject.set(x, "comparisonType", value.asInstanceOf[js.Any])
    
    inline def setComparisonTypeUndefined: Self = StObject.set(x, "comparisonType", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setNegativeColor(value: Color): Self = StObject.set(x, "negativeColor", value.asInstanceOf[js.Any])
    
    inline def setNegativeColorStyle(value: ColorStyle): Self = StObject.set(x, "negativeColorStyle", value.asInstanceOf[js.Any])
    
    inline def setNegativeColorStyleUndefined: Self = StObject.set(x, "negativeColorStyle", js.undefined)
    
    inline def setNegativeColorUndefined: Self = StObject.set(x, "negativeColor", js.undefined)
    
    inline def setPosition(value: TextPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setPositiveColor(value: Color): Self = StObject.set(x, "positiveColor", value.asInstanceOf[js.Any])
    
    inline def setPositiveColorStyle(value: ColorStyle): Self = StObject.set(x, "positiveColorStyle", value.asInstanceOf[js.Any])
    
    inline def setPositiveColorStyleUndefined: Self = StObject.set(x, "positiveColorStyle", js.undefined)
    
    inline def setPositiveColorUndefined: Self = StObject.set(x, "positiveColor", js.undefined)
    
    inline def setTextFormat(value: TextFormat): Self = StObject.set(x, "textFormat", value.asInstanceOf[js.Any])
    
    inline def setTextFormatUndefined: Self = StObject.set(x, "textFormat", js.undefined)
  }
}
