package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonDevcontainers extends StObject {
  
  var content: ApplicationjsonDevcontainers
}
object ContentApplicationjsonDevcontainers {
  
  inline def apply(content: ApplicationjsonDevcontainers): ContentApplicationjsonDevcontainers = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonDevcontainers]
  }
  
  extension [Self <: ContentApplicationjsonDevcontainers](x: Self) {
    
    inline def setContent(value: ApplicationjsonDevcontainers): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
