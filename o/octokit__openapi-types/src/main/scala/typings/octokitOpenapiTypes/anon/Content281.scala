package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content281 extends StObject {
  
  var content: `281`
  
  var headers: Location
}
object Content281 {
  
  inline def apply(content: `281`, headers: Location): Content281 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content281]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content281] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `281`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Location): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
