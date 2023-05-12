package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content170 extends StObject {
  
  var content: `170`
  
  var headers: Location
}
object Content170 {
  
  inline def apply(content: `170`, headers: Location): Content170 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content170]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content170] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `170`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Location): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
