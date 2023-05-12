package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content483 extends StObject {
  
  var content: `483`
  
  var headers: LinkString
}
object Content483 {
  
  inline def apply(content: `483`, headers: LinkString): Content483 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content483]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content483] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `483`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: LinkString): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
