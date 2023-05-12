package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content485 extends StObject {
  
  var content: `485`
  
  var headers: `25`
}
object Content485 {
  
  inline def apply(content: `485`, headers: `25`): Content485 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content485]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content485] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `485`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: `25`): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
