package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content23 extends StObject {
  
  var content: `23`
  
  var headers: Location
}
object Content23 {
  
  inline def apply(content: `23`, headers: Location): Content23 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content23]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content23] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `23`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Location): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
