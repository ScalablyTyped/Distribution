package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content478 extends StObject {
  
  var content: `478`
  
  var headers: Link
}
object Content478 {
  
  inline def apply(content: `478`, headers: Link): Content478 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content478]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content478] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `478`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Link): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
