package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content497Headers25 extends StObject {
  
  var content: `497`
  
  var headers: `25`
}
object Content497Headers25 {
  
  inline def apply(content: `497`, headers: `25`): Content497Headers25 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content497Headers25]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content497Headers25] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `497`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: `25`): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
