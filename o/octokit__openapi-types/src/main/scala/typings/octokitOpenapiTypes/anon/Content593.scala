package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content593 extends StObject {
  
  var content: `593`
  
  var headers: LinkString
}
object Content593 {
  
  inline def apply(content: `593`, headers: LinkString): Content593 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content593]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content593] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `593`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: LinkString): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
