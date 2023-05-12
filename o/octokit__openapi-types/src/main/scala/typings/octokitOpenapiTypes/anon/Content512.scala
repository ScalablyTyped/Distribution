package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content512 extends StObject {
  
  var content: `512`
  
  var headers: LinkString
}
object Content512 {
  
  inline def apply(content: `512`, headers: LinkString): Content512 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content512]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content512] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `512`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: LinkString): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
