package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content658 extends StObject {
  
  var content: `658`
  
  var headers: LinkString
}
object Content658 {
  
  inline def apply(content: `658`, headers: LinkString): Content658 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content658]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content658] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `658`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: LinkString): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
