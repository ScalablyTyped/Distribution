package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content271 extends StObject {
  
  var content: `271`
  
  var headers: Link
}
object Content271 {
  
  inline def apply(content: `271`, headers: Link): Content271 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content271]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content271] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `271`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Link): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
