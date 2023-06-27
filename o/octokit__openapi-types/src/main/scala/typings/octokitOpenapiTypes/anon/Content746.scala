package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content746 extends StObject {
  
  var content: `746`
  
  var headers: LinkString
}
object Content746 {
  
  inline def apply(content: `746`, headers: LinkString): Content746 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content746]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content746] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `746`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: LinkString): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
