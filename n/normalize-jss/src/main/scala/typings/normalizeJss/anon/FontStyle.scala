package typings.normalizeJss.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FontStyle extends StObject {
  
  var fontStyle: String
}
object FontStyle {
  
  inline def apply(fontStyle: String): FontStyle = {
    val __obj = js.Dynamic.literal(fontStyle = fontStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontStyle]
  }
  
  extension [Self <: FontStyle](x: Self) {
    
    inline def setFontStyle(value: String): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
  }
}
