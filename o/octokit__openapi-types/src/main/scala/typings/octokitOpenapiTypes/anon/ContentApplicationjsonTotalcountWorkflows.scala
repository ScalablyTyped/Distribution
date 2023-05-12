package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonTotalcountWorkflows extends StObject {
  
  var content: ApplicationjsonTotalcountWorkflows
  
  var headers: LinkString
}
object ContentApplicationjsonTotalcountWorkflows {
  
  inline def apply(content: ApplicationjsonTotalcountWorkflows, headers: LinkString): ContentApplicationjsonTotalcountWorkflows = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonTotalcountWorkflows]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonTotalcountWorkflows] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonTotalcountWorkflows): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: LinkString): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
