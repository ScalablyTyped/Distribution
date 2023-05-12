package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content46 extends StObject {
  
  var content: `46`
  
  var headers: Link
}
object Content46 {
  
  inline def apply(content: `46`, headers: Link): Content46 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content46]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content46] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `46`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Link): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
