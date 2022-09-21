package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonDescriptionId extends StObject {
  
  var content: ApplicationjsonDescriptionId
  
  var headers: Location
}
object ContentApplicationjsonDescriptionId {
  
  inline def apply(content: ApplicationjsonDescriptionId, headers: Location): ContentApplicationjsonDescriptionId = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonDescriptionId]
  }
  
  extension [Self <: ContentApplicationjsonDescriptionId](x: Self) {
    
    inline def setContent(value: ApplicationjsonDescriptionId): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Location): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
