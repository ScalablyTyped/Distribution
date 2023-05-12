package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content355 extends StObject {
  
  var content: `355`
  
  var headers: Link
}
object Content355 {
  
  inline def apply(content: `355`, headers: Link): Content355 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content355]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content355] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `355`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Link): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
