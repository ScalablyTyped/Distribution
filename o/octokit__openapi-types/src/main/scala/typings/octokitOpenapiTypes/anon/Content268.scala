package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content268 extends StObject {
  
  var content: `268`
  
  var headers: Link
}
object Content268 {
  
  inline def apply(content: `268`, headers: Link): Content268 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content268]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content268] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `268`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Link): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
