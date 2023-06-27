package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content21 extends StObject {
  
  var content: `21`
  
  var headers: Link
}
object Content21 {
  
  inline def apply(content: `21`, headers: Link): Content21 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content21]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content21] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `21`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Link): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
