package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content693 extends StObject {
  
  var content: `693`
  
  var headers: LinkString
}
object Content693 {
  
  inline def apply(content: `693`, headers: LinkString): Content693 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content693]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content693] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `693`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: LinkString): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
