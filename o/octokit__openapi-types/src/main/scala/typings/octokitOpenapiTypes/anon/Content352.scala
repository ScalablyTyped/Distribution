package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content352 extends StObject {
  
  var content: `352`
  
  var headers: Location
}
object Content352 {
  
  inline def apply(content: `352`, headers: Location): Content352 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content352]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content352] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `352`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Location): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
