package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content563 extends StObject {
  
  var content: `563`
  
  var headers: LinkString
}
object Content563 {
  
  inline def apply(content: `563`, headers: LinkString): Content563 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content563]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content563] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `563`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: LinkString): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
