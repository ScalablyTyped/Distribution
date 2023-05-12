package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content347 extends StObject {
  
  var content: `347`
  
  var headers: Link
}
object Content347 {
  
  inline def apply(content: `347`, headers: Link): Content347 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content347]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content347] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `347`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Link): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
