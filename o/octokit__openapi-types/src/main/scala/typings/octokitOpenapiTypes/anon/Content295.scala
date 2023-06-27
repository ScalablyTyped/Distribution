package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content295 extends StObject {
  
  var content: `295`
  
  var headers: Location
}
object Content295 {
  
  inline def apply(content: `295`, headers: Location): Content295 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content295]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content295] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `295`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Location): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
