package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonRunnersTotalcount extends StObject {
  
  var content: ApplicationjsonRunnersTotalcount
  
  var headers: LinkString
}
object ContentApplicationjsonRunnersTotalcount {
  
  inline def apply(content: ApplicationjsonRunnersTotalcount, headers: LinkString): ContentApplicationjsonRunnersTotalcount = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonRunnersTotalcount]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonRunnersTotalcount] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonRunnersTotalcount): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: LinkString): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
