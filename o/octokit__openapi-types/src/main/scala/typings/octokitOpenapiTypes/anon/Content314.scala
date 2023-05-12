package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content314 extends StObject {
  
  var content: `314`
  
  var headers: Link
}
object Content314 {
  
  inline def apply(content: `314`, headers: Link): Content314 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content314]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content314] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `314`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Link): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
