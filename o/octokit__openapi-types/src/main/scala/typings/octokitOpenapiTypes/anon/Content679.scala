package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content679 extends StObject {
  
  var content: `679`
  
  var headers: LinkString
}
object Content679 {
  
  inline def apply(content: `679`, headers: LinkString): Content679 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content679]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content679] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `679`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: LinkString): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
