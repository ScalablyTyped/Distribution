package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThemeColorPair extends StObject {
  
  /** The concrete color corresponding to the theme color type. */
  var color: js.UndefOr[ColorStyle] = js.undefined
  
  /** The type of the spreadsheet theme color. */
  var colorType: js.UndefOr[String] = js.undefined
}
object ThemeColorPair {
  
  inline def apply(): ThemeColorPair = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThemeColorPair]
  }
  
  extension [Self <: ThemeColorPair](x: Self) {
    
    inline def setColor(value: ColorStyle): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorType(value: String): Self = StObject.set(x, "colorType", value.asInstanceOf[js.Any])
    
    inline def setColorTypeUndefined: Self = StObject.set(x, "colorType", js.undefined)
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
  }
}
