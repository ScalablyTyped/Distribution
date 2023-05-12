package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content529 extends StObject {
  
  var content: `529`
  
  var headers: LinkString
}
object Content529 {
  
  inline def apply(content: `529`, headers: LinkString): Content529 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content529]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content529] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `529`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: LinkString): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
