package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content691 extends StObject {
  
  var content: `691`
  
  var headers: LinkString
}
object Content691 {
  
  inline def apply(content: `691`, headers: LinkString): Content691 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content691]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content691] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `691`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: LinkString): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
