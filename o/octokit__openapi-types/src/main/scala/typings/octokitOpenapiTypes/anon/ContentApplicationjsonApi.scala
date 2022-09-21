package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonApi extends StObject {
  
  var content: ApplicationjsonApi
}
object ContentApplicationjsonApi {
  
  inline def apply(content: ApplicationjsonApi): ContentApplicationjsonApi = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonApi]
  }
  
  extension [Self <: ContentApplicationjsonApi](x: Self) {
    
    inline def setContent(value: ApplicationjsonApi): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
