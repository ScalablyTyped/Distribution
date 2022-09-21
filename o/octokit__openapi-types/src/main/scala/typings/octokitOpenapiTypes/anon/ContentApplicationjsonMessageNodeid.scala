package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonMessageNodeid extends StObject {
  
  var content: ApplicationjsonMessageNodeid
  
  var headers: Location
}
object ContentApplicationjsonMessageNodeid {
  
  inline def apply(content: ApplicationjsonMessageNodeid, headers: Location): ContentApplicationjsonMessageNodeid = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonMessageNodeid]
  }
  
  extension [Self <: ContentApplicationjsonMessageNodeid](x: Self) {
    
    inline def setContent(value: ApplicationjsonMessageNodeid): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Location): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
