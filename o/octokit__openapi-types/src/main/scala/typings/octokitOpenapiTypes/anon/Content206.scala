package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content206 extends StObject {
  
  var content: `206`
  
  var headers: Link
}
object Content206 {
  
  inline def apply(content: `206`, headers: Link): Content206 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content206]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content206] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `206`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Link): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
