package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content584 extends StObject {
  
  var content: `584`
  
  var headers: LinkString
}
object Content584 {
  
  inline def apply(content: `584`, headers: LinkString): Content584 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content584]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content584] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `584`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: LinkString): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
