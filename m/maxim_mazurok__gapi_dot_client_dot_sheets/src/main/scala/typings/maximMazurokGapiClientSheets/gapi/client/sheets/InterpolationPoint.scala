package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InterpolationPoint extends StObject {
  
  /** The color this interpolation point should use. */
  var color: js.UndefOr[Color] = js.undefined
  
  /** The color this interpolation point should use. If color is also set, this field takes precedence. */
  var colorStyle: js.UndefOr[ColorStyle] = js.undefined
  
  /** How the value should be interpreted. */
  var `type`: js.UndefOr[String] = js.undefined
  
  /** The value this interpolation point uses. May be a formula. Unused if type is MIN or MAX. */
  var value: js.UndefOr[String] = js.undefined
}
object InterpolationPoint {
  
  inline def apply(): InterpolationPoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InterpolationPoint]
  }
  
  extension [Self <: InterpolationPoint](x: Self) {
    
    inline def setColor(value: Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorStyle(value: ColorStyle): Self = StObject.set(x, "colorStyle", value.asInstanceOf[js.Any])
    
    inline def setColorStyleUndefined: Self = StObject.set(x, "colorStyle", js.undefined)
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
