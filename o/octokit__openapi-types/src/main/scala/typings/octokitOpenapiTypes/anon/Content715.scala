package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content715 extends StObject {
  
  var content: `715`
  
  var headers: LinkString
}
object Content715 {
  
  inline def apply(content: `715`, headers: LinkString): Content715 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content715]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content715] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `715`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: LinkString): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
