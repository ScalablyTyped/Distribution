package typings.normalizeJss.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BorderBottom extends StObject {
  
  var borderBottom: String
  
  var textDecoration: String
}
object BorderBottom {
  
  inline def apply(borderBottom: String, textDecoration: String): BorderBottom = {
    val __obj = js.Dynamic.literal(borderBottom = borderBottom.asInstanceOf[js.Any], textDecoration = textDecoration.asInstanceOf[js.Any])
    __obj.asInstanceOf[BorderBottom]
  }
  
  extension [Self <: BorderBottom](x: Self) {
    
    inline def setBorderBottom(value: String): Self = StObject.set(x, "borderBottom", value.asInstanceOf[js.Any])
    
    inline def setTextDecoration(value: String): Self = StObject.set(x, "textDecoration", value.asInstanceOf[js.Any])
  }
}
