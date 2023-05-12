package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content594 extends StObject {
  
  var content: `594`
  
  var headers: LinkString
}
object Content594 {
  
  inline def apply(content: `594`, headers: LinkString): Content594 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content594]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content594] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `594`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: LinkString): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
