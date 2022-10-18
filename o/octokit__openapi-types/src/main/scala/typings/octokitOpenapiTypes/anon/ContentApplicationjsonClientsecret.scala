package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonClientsecret extends StObject {
  
  var content: ApplicationjsonClientsecret
}
object ContentApplicationjsonClientsecret {
  
  inline def apply(content: ApplicationjsonClientsecret): ContentApplicationjsonClientsecret = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonClientsecret]
  }
  
  extension [Self <: ContentApplicationjsonClientsecret](x: Self) {
    
    inline def setContent(value: ApplicationjsonClientsecret): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
