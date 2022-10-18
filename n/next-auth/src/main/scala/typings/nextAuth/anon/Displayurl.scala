package typings.nextAuth.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Displayurl extends StObject {
  
  var display_url: String
  
  var expanded_url: String
  
  var indices: js.Array[Double]
  
  var url: String
}
object Displayurl {
  
  inline def apply(display_url: String, expanded_url: String, indices: js.Array[Double], url: String): Displayurl = {
    val __obj = js.Dynamic.literal(display_url = display_url.asInstanceOf[js.Any], expanded_url = expanded_url.asInstanceOf[js.Any], indices = indices.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Displayurl]
  }
  
  extension [Self <: Displayurl](x: Self) {
    
    inline def setDisplay_url(value: String): Self = StObject.set(x, "display_url", value.asInstanceOf[js.Any])
    
    inline def setExpanded_url(value: String): Self = StObject.set(x, "expanded_url", value.asInstanceOf[js.Any])
    
    inline def setIndices(value: js.Array[Double]): Self = StObject.set(x, "indices", value.asInstanceOf[js.Any])
    
    inline def setIndicesVarargs(value: Double*): Self = StObject.set(x, "indices", js.Array(value*))
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
