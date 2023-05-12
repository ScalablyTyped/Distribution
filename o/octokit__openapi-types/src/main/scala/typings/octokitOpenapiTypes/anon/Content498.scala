package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content498 extends StObject {
  
  var content: `498`
  
  var headers: LinkString
}
object Content498 {
  
  inline def apply(content: `498`, headers: LinkString): Content498 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content498]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content498] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `498`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: LinkString): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
