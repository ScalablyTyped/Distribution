package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content214 extends StObject {
  
  var content: `214`
  
  var headers: Link
}
object Content214 {
  
  inline def apply(content: `214`, headers: Link): Content214 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content214]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content214] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `214`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Link): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
