package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content43 extends StObject {
  
  var content: `43`
  
  var headers: Link
}
object Content43 {
  
  inline def apply(content: `43`, headers: Link): Content43 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content43]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content43] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `43`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Link): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
