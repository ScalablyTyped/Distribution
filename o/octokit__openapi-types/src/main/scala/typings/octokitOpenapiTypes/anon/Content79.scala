package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content79 extends StObject {
  
  var content: `79`
  
  var headers: Link
}
object Content79 {
  
  inline def apply(content: `79`, headers: Link): Content79 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content79]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content79] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `79`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Link): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
