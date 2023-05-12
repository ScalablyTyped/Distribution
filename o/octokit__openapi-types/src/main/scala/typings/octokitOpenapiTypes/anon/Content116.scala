package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content116 extends StObject {
  
  var content: `116`
  
  var headers: Link
}
object Content116 {
  
  inline def apply(content: `116`, headers: Link): Content116 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content116]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content116] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `116`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Link): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
