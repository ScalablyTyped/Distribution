package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content612 extends StObject {
  
  var content: `612`
  
  var headers: LinkString
}
object Content612 {
  
  inline def apply(content: `612`, headers: LinkString): Content612 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content612]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content612] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `612`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: LinkString): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
