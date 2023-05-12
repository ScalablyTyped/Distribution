package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content48 extends StObject {
  
  var content: `48`
  
  var headers: Link
}
object Content48 {
  
  inline def apply(content: `48`, headers: Link): Content48 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content48]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content48] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `48`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Link): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
