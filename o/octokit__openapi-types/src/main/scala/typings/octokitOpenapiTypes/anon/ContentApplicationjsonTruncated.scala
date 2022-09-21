package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonTruncated extends StObject {
  
  var content: ApplicationjsonTruncated
  
  var headers: Location
}
object ContentApplicationjsonTruncated {
  
  inline def apply(content: ApplicationjsonTruncated, headers: Location): ContentApplicationjsonTruncated = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonTruncated]
  }
  
  extension [Self <: ContentApplicationjsonTruncated](x: Self) {
    
    inline def setContent(value: ApplicationjsonTruncated): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Location): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
