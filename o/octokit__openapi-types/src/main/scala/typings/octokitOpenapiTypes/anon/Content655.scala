package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content655 extends StObject {
  
  var content: `655`
  
  var headers: LinkString
}
object Content655 {
  
  inline def apply(content: `655`, headers: LinkString): Content655 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content655]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content655] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `655`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: LinkString): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
