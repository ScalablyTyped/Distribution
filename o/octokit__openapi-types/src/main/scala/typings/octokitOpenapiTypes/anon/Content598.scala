package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content598 extends StObject {
  
  var content: `598`
  
  var headers: LinkString
}
object Content598 {
  
  inline def apply(content: `598`, headers: LinkString): Content598 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content598]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content598] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `598`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: LinkString): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
