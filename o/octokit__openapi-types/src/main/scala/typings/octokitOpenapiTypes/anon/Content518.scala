package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content518 extends StObject {
  
  var content: `518`
  
  var headers: LinkString
}
object Content518 {
  
  inline def apply(content: `518`, headers: LinkString): Content518 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content518]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content518] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `518`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: LinkString): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
