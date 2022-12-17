package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonLabelsurl extends StObject {
  
  var content: ApplicationjsonLabelsurl
  
  var headers: Location
}
object ContentApplicationjsonLabelsurl {
  
  inline def apply(content: ApplicationjsonLabelsurl, headers: Location): ContentApplicationjsonLabelsurl = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonLabelsurl]
  }
  
  extension [Self <: ContentApplicationjsonLabelsurl](x: Self) {
    
    inline def setContent(value: ApplicationjsonLabelsurl): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Location): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
