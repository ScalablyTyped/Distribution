package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Headers25 extends StObject {
  
  var content: `48`
  
  var headers: `25`
}
object Headers25 {
  
  inline def apply(content: `48`, headers: `25`): Headers25 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Headers25]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Headers25] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `48`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: `25`): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
