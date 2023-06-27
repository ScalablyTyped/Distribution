package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content581 extends StObject {
  
  var content: `581`
  
  var headers: LinkString
}
object Content581 {
  
  inline def apply(content: `581`, headers: LinkString): Content581 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content581]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content581] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `581`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: LinkString): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
