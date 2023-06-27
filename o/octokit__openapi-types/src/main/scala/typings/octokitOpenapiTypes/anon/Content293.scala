package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content293 extends StObject {
  
  var content: `293`
  
  var headers: Link
}
object Content293 {
  
  inline def apply(content: `293`, headers: Link): Content293 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content293]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content293] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `293`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Link): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
