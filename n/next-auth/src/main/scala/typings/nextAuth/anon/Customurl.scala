package typings.nextAuth.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Customurl extends StObject {
  
  var custom_url: String | Null
  
  var id: Double | Null
  
  var url: String
}
object Customurl {
  
  inline def apply(url: String): Customurl = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any], custom_url = null, id = null)
    __obj.asInstanceOf[Customurl]
  }
  
  extension [Self <: Customurl](x: Self) {
    
    inline def setCustom_url(value: String): Self = StObject.set(x, "custom_url", value.asInstanceOf[js.Any])
    
    inline def setCustom_urlNull: Self = StObject.set(x, "custom_url", null)
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
