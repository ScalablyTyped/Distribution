package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content313 extends StObject {
  
  var content: `313`
  
  var headers: Location
}
object Content313 {
  
  inline def apply(content: `313`, headers: Location): Content313 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content313]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content313] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `313`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Location): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
