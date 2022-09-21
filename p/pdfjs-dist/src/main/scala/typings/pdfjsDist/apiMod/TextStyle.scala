package typings.pdfjsDist.apiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextStyle extends StObject {
  
  /**
    * - Font ascent.
    */
  var ascent: Double
  
  /**
    * - Font descent.
    */
  var descent: Double
  
  /**
    * - The possible font family.
    */
  var fontFamily: String
  
  /**
    * - Whether or not the text is in vertical mode.
    */
  var vertical: Boolean
}
object TextStyle {
  
  inline def apply(ascent: Double, descent: Double, fontFamily: String, vertical: Boolean): TextStyle = {
    val __obj = js.Dynamic.literal(ascent = ascent.asInstanceOf[js.Any], descent = descent.asInstanceOf[js.Any], fontFamily = fontFamily.asInstanceOf[js.Any], vertical = vertical.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextStyle]
  }
  
  extension [Self <: TextStyle](x: Self) {
    
    inline def setAscent(value: Double): Self = StObject.set(x, "ascent", value.asInstanceOf[js.Any])
    
    inline def setDescent(value: Double): Self = StObject.set(x, "descent", value.asInstanceOf[js.Any])
    
    inline def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
    
    inline def setVertical(value: Boolean): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
  }
}
