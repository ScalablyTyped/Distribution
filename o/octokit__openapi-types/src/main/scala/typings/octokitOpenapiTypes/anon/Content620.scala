package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content620 extends StObject {
  
  var content: `620`
  
  var headers: LinkString
}
object Content620 {
  
  inline def apply(content: `620`, headers: LinkString): Content620 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content620]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content620] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `620`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: LinkString): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
