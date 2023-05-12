package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content659 extends StObject {
  
  var content: `659`
  
  var headers: LinkString
}
object Content659 {
  
  inline def apply(content: `659`, headers: LinkString): Content659 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content659]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content659] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `659`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: LinkString): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
