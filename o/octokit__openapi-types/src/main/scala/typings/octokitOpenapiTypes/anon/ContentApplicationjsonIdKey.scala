package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonIdKey extends StObject {
  
  var content: ApplicationjsonIdKey
}
object ContentApplicationjsonIdKey {
  
  inline def apply(content: ApplicationjsonIdKey): ContentApplicationjsonIdKey = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonIdKey]
  }
  
  extension [Self <: ContentApplicationjsonIdKey](x: Self) {
    
    inline def setContent(value: ApplicationjsonIdKey): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
