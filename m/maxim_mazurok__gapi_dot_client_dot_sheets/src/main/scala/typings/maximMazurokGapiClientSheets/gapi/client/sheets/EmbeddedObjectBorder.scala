package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EmbeddedObjectBorder extends StObject {
  
  /** The color of the border. Deprecated: Use color_style. */
  var color: js.UndefOr[Color] = js.undefined
  
  /** The color of the border. If color is also set, this field takes precedence. */
  var colorStyle: js.UndefOr[ColorStyle] = js.undefined
}
object EmbeddedObjectBorder {
  
  inline def apply(): EmbeddedObjectBorder = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EmbeddedObjectBorder]
  }
  
  extension [Self <: EmbeddedObjectBorder](x: Self) {
    
    inline def setColor(value: Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorStyle(value: ColorStyle): Self = StObject.set(x, "colorStyle", value.asInstanceOf[js.Any])
    
    inline def setColorStyleUndefined: Self = StObject.set(x, "colorStyle", js.undefined)
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
  }
}
