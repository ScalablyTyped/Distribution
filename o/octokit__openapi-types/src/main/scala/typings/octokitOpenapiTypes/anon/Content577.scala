package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content577 extends StObject {
  
  var content: `577`
  
  var headers: LinkString
}
object Content577 {
  
  inline def apply(content: `577`, headers: LinkString): Content577 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content577]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content577] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `577`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: LinkString): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
