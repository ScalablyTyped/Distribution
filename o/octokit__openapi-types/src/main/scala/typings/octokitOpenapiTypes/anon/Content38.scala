package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content38 extends StObject {
  
  var content: `38`
  
  var headers: Link
}
object Content38 {
  
  inline def apply(content: `38`, headers: Link): Content38 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content38]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content38] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `38`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Link): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
