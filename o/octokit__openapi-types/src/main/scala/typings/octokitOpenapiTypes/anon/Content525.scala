package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content525 extends StObject {
  
  var content: `525`
  
  var headers: LinkString
}
object Content525 {
  
  inline def apply(content: `525`, headers: LinkString): Content525 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content525]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content525] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `525`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: LinkString): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
