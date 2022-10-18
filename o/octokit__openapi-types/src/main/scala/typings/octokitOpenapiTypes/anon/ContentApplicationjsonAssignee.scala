package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonAssignee extends StObject {
  
  var content: ApplicationjsonAssignee
  
  var headers: Location
}
object ContentApplicationjsonAssignee {
  
  inline def apply(content: ApplicationjsonAssignee, headers: Location): ContentApplicationjsonAssignee = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonAssignee]
  }
  
  extension [Self <: ContentApplicationjsonAssignee](x: Self) {
    
    inline def setContent(value: ApplicationjsonAssignee): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Location): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
