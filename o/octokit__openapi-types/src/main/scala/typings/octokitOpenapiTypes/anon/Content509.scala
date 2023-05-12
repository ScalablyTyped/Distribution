package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content509 extends StObject {
  
  var content: `509`
  
  var headers: LinkString
}
object Content509 {
  
  inline def apply(content: `509`, headers: LinkString): Content509 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content509]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content509] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `509`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: LinkString): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
