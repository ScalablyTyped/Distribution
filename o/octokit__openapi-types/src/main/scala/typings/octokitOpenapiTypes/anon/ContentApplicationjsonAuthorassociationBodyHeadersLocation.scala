package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonAuthorassociationBodyHeadersLocation extends StObject {
  
  var content: ApplicationjsonAuthorassociationBody
  
  var headers: Location
}
object ContentApplicationjsonAuthorassociationBodyHeadersLocation {
  
  inline def apply(content: ApplicationjsonAuthorassociationBody, headers: Location): ContentApplicationjsonAuthorassociationBodyHeadersLocation = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonAuthorassociationBodyHeadersLocation]
  }
  
  extension [Self <: ContentApplicationjsonAuthorassociationBodyHeadersLocation](x: Self) {
    
    inline def setContent(value: ApplicationjsonAuthorassociationBody): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Location): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
