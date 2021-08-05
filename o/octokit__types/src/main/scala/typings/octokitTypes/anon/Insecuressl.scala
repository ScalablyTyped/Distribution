package typings.octokitTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Insecuressl extends StObject {
  
  var content_type: String
  
  var insecure_ssl: String
  
  var url: String
}
object Insecuressl {
  
  inline def apply(content_type: String, insecure_ssl: String, url: String): Insecuressl = {
    val __obj = js.Dynamic.literal(content_type = content_type.asInstanceOf[js.Any], insecure_ssl = insecure_ssl.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Insecuressl]
  }
  
  extension [Self <: Insecuressl](x: Self) {
    
    inline def setContent_type(value: String): Self = StObject.set(x, "content_type", value.asInstanceOf[js.Any])
    
    inline def setInsecure_ssl(value: String): Self = StObject.set(x, "insecure_ssl", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
