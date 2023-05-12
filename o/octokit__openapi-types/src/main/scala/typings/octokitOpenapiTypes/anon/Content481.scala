package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content481 extends StObject {
  
  var content: `481`
  
  var headers: LinkString
}
object Content481 {
  
  inline def apply(content: `481`, headers: LinkString): Content481 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content481]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content481] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `481`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: LinkString): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
