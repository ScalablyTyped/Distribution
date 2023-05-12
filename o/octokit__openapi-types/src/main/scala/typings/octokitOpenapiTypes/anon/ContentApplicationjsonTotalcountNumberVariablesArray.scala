package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonTotalcountNumberVariablesArray extends StObject {
  
  var content: ApplicationjsonTotalcountNumberVariablesArray
  
  var headers: LinkString
}
object ContentApplicationjsonTotalcountNumberVariablesArray {
  
  inline def apply(content: ApplicationjsonTotalcountNumberVariablesArray, headers: LinkString): ContentApplicationjsonTotalcountNumberVariablesArray = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonTotalcountNumberVariablesArray]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonTotalcountNumberVariablesArray] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonTotalcountNumberVariablesArray): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: LinkString): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
