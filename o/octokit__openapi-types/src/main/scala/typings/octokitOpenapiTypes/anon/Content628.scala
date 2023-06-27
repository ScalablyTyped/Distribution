package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content628 extends StObject {
  
  var content: `628`
  
  var headers: LinkString
}
object Content628 {
  
  inline def apply(content: `628`, headers: LinkString): Content628 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content628]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content628] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `628`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: LinkString): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
