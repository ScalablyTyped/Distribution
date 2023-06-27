package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content61 extends StObject {
  
  var content: `61`
  
  var headers: Link
}
object Content61 {
  
  inline def apply(content: `61`, headers: Link): Content61 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content61]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content61] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `61`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Link): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
