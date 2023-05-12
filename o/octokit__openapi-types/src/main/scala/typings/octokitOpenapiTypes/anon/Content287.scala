package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content287 extends StObject {
  
  var content: `287`
  
  var headers: Location
}
object Content287 {
  
  inline def apply(content: `287`, headers: Location): Content287 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content287]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content287] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `287`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Location): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
