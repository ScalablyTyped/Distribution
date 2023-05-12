package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonVariablesArray extends StObject {
  
  var content: ApplicationjsonVariablesArray
  
  var headers: LinkString
}
object ContentApplicationjsonVariablesArray {
  
  inline def apply(content: ApplicationjsonVariablesArray, headers: LinkString): ContentApplicationjsonVariablesArray = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonVariablesArray]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonVariablesArray] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonVariablesArray): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: LinkString): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
