package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content560 extends StObject {
  
  var content: `560`
  
  var headers: LinkString
}
object Content560 {
  
  inline def apply(content: `560`, headers: LinkString): Content560 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content560]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content560] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `560`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: LinkString): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
