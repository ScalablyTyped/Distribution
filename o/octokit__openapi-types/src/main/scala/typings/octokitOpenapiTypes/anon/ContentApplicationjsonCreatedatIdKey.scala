package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonCreatedatIdKey extends StObject {
  
  var content: ApplicationjsonCreatedatIdKey
}
object ContentApplicationjsonCreatedatIdKey {
  
  inline def apply(content: ApplicationjsonCreatedatIdKey): ContentApplicationjsonCreatedatIdKey = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonCreatedatIdKey]
  }
  
  extension [Self <: ContentApplicationjsonCreatedatIdKey](x: Self) {
    
    inline def setContent(value: ApplicationjsonCreatedatIdKey): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
