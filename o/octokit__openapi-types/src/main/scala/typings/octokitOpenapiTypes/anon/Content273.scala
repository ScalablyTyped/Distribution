package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content273 extends StObject {
  
  var content: `273`
  
  var headers: Link
}
object Content273 {
  
  inline def apply(content: `273`, headers: Link): Content273 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content273]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content273] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `273`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Link): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
