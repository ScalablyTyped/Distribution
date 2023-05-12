package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content71Headers25 extends StObject {
  
  var content: `71`
  
  var headers: `25`
}
object Content71Headers25 {
  
  inline def apply(content: `71`, headers: `25`): Content71Headers25 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content71Headers25]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content71Headers25] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `71`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: `25`): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
