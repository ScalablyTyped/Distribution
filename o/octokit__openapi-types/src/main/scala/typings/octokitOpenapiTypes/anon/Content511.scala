package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content511 extends StObject {
  
  var content: `511`
  
  var headers: LinkString
}
object Content511 {
  
  inline def apply(content: `511`, headers: LinkString): Content511 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content511]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content511] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `511`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: LinkString): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
