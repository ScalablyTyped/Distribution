package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content351 extends StObject {
  
  var content: `351`
  
  var headers: Location
}
object Content351 {
  
  inline def apply(content: `351`, headers: Location): Content351 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content351]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content351] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `351`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Location): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
