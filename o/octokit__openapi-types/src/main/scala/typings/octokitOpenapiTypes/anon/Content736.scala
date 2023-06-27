package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content736 extends StObject {
  
  var content: `736`
  
  var headers: LinkString
}
object Content736 {
  
  inline def apply(content: `736`, headers: LinkString): Content736 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content736]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content736] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `736`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: LinkString): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
