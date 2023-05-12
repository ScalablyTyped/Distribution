package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content137 extends StObject {
  
  var content: `137`
  
  var headers: Link
}
object Content137 {
  
  inline def apply(content: `137`, headers: Link): Content137 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content137]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content137] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `137`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Link): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
