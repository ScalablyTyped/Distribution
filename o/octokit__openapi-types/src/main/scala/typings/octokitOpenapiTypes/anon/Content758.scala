package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content758 extends StObject {
  
  var content: `758`
  
  var headers: LinkString
}
object Content758 {
  
  inline def apply(content: `758`, headers: LinkString): Content758 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content758]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content758] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `758`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: LinkString): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
