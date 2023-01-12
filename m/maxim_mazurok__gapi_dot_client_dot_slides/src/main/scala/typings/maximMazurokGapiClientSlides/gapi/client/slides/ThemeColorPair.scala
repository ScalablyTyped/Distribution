package typings.maximMazurokGapiClientSlides.gapi.client.slides

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThemeColorPair extends StObject {
  
  /** The concrete color corresponding to the theme color type above. */
  var color: js.UndefOr[RgbColor] = js.undefined
  
  /** The type of the theme color. */
  var `type`: js.UndefOr[String] = js.undefined
}
object ThemeColorPair {
  
  inline def apply(): ThemeColorPair = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThemeColorPair]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ThemeColorPair] (val x: Self) extends AnyVal {
    
    inline def setColor(value: RgbColor): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
