package typings.nextAuth.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait End extends StObject {
  
  var display_url: String
  
  var end: Double
  
  var expanded_url: String
  
  var start: Double
  
  var url: String
}
object End {
  
  inline def apply(display_url: String, end: Double, expanded_url: String, start: Double, url: String): End = {
    val __obj = js.Dynamic.literal(display_url = display_url.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], expanded_url = expanded_url.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[End]
  }
  
  extension [Self <: End](x: Self) {
    
    inline def setDisplay_url(value: String): Self = StObject.set(x, "display_url", value.asInstanceOf[js.Any])
    
    inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setExpanded_url(value: String): Self = StObject.set(x, "expanded_url", value.asInstanceOf[js.Any])
    
    inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
