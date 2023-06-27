package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content22 extends StObject {
  
  var content: `22`
  
  var headers: Location
}
object Content22 {
  
  inline def apply(content: `22`, headers: Location): Content22 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content22]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content22] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `22`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Location): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
