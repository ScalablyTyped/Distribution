package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content636 extends StObject {
  
  var content: `636`
  
  var headers: LinkString
}
object Content636 {
  
  inline def apply(content: `636`, headers: LinkString): Content636 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content636]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content636] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `636`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: LinkString): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
