package typings.maximMazurokGapiClientSlides.gapi.client.slides

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OpaqueColor extends StObject {
  
  /** An opaque RGB color. */
  var rgbColor: js.UndefOr[RgbColor] = js.undefined
  
  /** An opaque theme color. */
  var themeColor: js.UndefOr[String] = js.undefined
}
object OpaqueColor {
  
  inline def apply(): OpaqueColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OpaqueColor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OpaqueColor] (val x: Self) extends AnyVal {
    
    inline def setRgbColor(value: RgbColor): Self = StObject.set(x, "rgbColor", value.asInstanceOf[js.Any])
    
    inline def setRgbColorUndefined: Self = StObject.set(x, "rgbColor", js.undefined)
    
    inline def setThemeColor(value: String): Self = StObject.set(x, "themeColor", value.asInstanceOf[js.Any])
    
    inline def setThemeColorUndefined: Self = StObject.set(x, "themeColor", js.undefined)
  }
}
