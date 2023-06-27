package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content254 extends StObject {
  
  var content: `254`
  
  var headers: Link
}
object Content254 {
  
  inline def apply(content: `254`, headers: Link): Content254 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content254]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content254] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `254`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Link): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
