package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonWorkflows extends StObject {
  
  var content: ApplicationjsonWorkflows
  
  var headers: Link
}
object ContentApplicationjsonWorkflows {
  
  inline def apply(content: ApplicationjsonWorkflows, headers: Link): ContentApplicationjsonWorkflows = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonWorkflows]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonWorkflows] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonWorkflows): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Link): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
