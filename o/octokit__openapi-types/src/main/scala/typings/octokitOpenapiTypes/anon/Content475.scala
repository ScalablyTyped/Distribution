package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content475 extends StObject {
  
  var content: `475`
  
  var headers: LinkString
}
object Content475 {
  
  inline def apply(content: `475`, headers: LinkString): Content475 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content475]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content475] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `475`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: LinkString): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
