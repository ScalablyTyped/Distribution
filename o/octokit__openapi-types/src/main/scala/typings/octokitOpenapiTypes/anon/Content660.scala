package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content660 extends StObject {
  
  var content: `660`
  
  var headers: LinkString
}
object Content660 {
  
  inline def apply(content: `660`, headers: LinkString): Content660 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content660]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content660] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `660`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: LinkString): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
