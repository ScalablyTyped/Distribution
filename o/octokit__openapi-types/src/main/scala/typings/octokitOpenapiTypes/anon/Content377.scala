package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content377 extends StObject {
  
  var content: `377`
  
  var headers: Link
}
object Content377 {
  
  inline def apply(content: `377`, headers: Link): Content377 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content377]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content377] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `377`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Link): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
