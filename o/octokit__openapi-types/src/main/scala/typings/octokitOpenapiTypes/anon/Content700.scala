package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content700 extends StObject {
  
  var content: `700`
  
  var headers: LinkString
}
object Content700 {
  
  inline def apply(content: `700`, headers: LinkString): Content700 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content700]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content700] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `700`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: LinkString): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
