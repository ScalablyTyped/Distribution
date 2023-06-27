package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content91 extends StObject {
  
  var content: `91`
  
  var headers: Link
}
object Content91 {
  
  inline def apply(content: `91`, headers: Link): Content91 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content91]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content91] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `91`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Link): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
