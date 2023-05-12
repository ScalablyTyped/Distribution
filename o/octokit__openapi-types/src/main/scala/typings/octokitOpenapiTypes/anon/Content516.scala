package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content516 extends StObject {
  
  var content: `516`
  
  var headers: LinkString
}
object Content516 {
  
  inline def apply(content: `516`, headers: LinkString): Content516 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content516]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content516] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `516`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: LinkString): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
