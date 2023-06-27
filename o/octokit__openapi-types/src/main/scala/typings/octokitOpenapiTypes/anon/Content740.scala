package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content740 extends StObject {
  
  var content: `740`
  
  var headers: LinkString
}
object Content740 {
  
  inline def apply(content: `740`, headers: LinkString): Content740 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content740]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content740] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `740`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: LinkString): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
