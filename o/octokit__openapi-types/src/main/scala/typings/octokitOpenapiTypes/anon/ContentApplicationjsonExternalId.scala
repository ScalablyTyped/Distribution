package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonExternalId extends StObject {
  
  var content: ApplicationjsonExternalId
}
object ContentApplicationjsonExternalId {
  
  inline def apply(content: ApplicationjsonExternalId): ContentApplicationjsonExternalId = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonExternalId]
  }
  
  extension [Self <: ContentApplicationjsonExternalId](x: Self) {
    
    inline def setContent(value: ApplicationjsonExternalId): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
