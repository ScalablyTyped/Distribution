package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content669 extends StObject {
  
  var content: `669`
  
  var headers: LinkString
}
object Content669 {
  
  inline def apply(content: `669`, headers: LinkString): Content669 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content669]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content669] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `669`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: LinkString): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
