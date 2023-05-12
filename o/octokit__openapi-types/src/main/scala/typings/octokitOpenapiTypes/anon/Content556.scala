package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content556 extends StObject {
  
  var content: `556`
  
  var headers: LinkString
}
object Content556 {
  
  inline def apply(content: `556`, headers: LinkString): Content556 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content556]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content556] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `556`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: LinkString): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
