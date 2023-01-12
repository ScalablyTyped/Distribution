package typings.plotlyJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Font extends StObject {
  
  var color: Color
  
  /**
    * HTML font family - the typeface that will be applied by the web browser.
    * The web browser will only be able to apply a font if it is available on the system
    * which it operates. Provide multiple font families, separated by commas, to indicate
    * the preference in which to apply fonts if they aren't available on the system.
    * The plotly service (at https://plot.ly or on-premise) generates images on a server,
    * where only a select number of fonts are installed and supported.
    * These include *Arial*, *Balto*, *Courier New*, *Droid Sans*, *Droid Serif*,
    * *Droid Sans Mono*, *Gravitas One*, *Old Standard TT*, *Open Sans*, *Overpass*,
    * *PT Sans Narrow*, *Raleway*, *Times New Roman*.
    * @default "Arial, sans-serif"
    */
  var family: String
  
  /**
    * number greater than or equal to 1
    * @default 13
    */
  var size: Double
}
object Font {
  
  inline def apply(color: Color, family: String, size: Double): Font = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], family = family.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Font]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Font] (val x: Self) extends AnyVal {
    
    inline def setColor(value: Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String])*): Self = StObject.set(x, "color", js.Array(value*))
    
    inline def setFamily(value: String): Self = StObject.set(x, "family", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
