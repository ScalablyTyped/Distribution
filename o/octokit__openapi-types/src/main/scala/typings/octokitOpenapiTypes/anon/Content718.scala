package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content718 extends StObject {
  
  var content: `718`
  
  var headers: LinkString
}
object Content718 {
  
  inline def apply(content: `718`, headers: LinkString): Content718 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content718]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content718] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `718`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: LinkString): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
