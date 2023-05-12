package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonTotalcountVariables extends StObject {
  
  var content: ApplicationjsonTotalcountVariables
  
  var headers: Link
}
object ContentApplicationjsonTotalcountVariables {
  
  inline def apply(content: ApplicationjsonTotalcountVariables, headers: Link): ContentApplicationjsonTotalcountVariables = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonTotalcountVariables]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonTotalcountVariables] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonTotalcountVariables): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Link): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
