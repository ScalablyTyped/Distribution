package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content574 extends StObject {
  
  var content: `574`
  
  var headers: LinkString
}
object Content574 {
  
  inline def apply(content: `574`, headers: LinkString): Content574 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content574]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content574] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `574`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: LinkString): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
