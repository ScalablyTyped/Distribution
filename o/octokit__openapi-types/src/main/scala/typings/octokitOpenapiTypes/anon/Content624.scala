package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content624 extends StObject {
  
  var content: `624`
  
  var headers: LinkString
}
object Content624 {
  
  inline def apply(content: `624`, headers: LinkString): Content624 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content624]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content624] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `624`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: LinkString): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
