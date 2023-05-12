package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content219 extends StObject {
  
  var content: `219`
  
  var headers: Link
}
object Content219 {
  
  inline def apply(content: `219`, headers: Link): Content219 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content219]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content219] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `219`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Link): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
