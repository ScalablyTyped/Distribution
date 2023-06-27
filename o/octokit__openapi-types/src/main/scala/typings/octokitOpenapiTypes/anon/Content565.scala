package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content565 extends StObject {
  
  var content: `565`
  
  var headers: LinkString
}
object Content565 {
  
  inline def apply(content: `565`, headers: LinkString): Content565 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content565]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content565] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `565`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: LinkString): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
