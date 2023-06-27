package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content272 extends StObject {
  
  var content: `272`
  
  var headers: Link
}
object Content272 {
  
  inline def apply(content: `272`, headers: Link): Content272 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content272]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content272] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `272`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Link): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
