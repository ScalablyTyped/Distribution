package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonVariables extends StObject {
  
  var content: ApplicationjsonVariables
  
  var headers: Link
}
object ContentApplicationjsonVariables {
  
  inline def apply(content: ApplicationjsonVariables, headers: Link): ContentApplicationjsonVariables = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonVariables]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonVariables] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonVariables): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Link): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
