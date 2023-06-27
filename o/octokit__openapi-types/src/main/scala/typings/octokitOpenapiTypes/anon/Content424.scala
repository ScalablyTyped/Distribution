package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content424 extends StObject {
  
  var content: `424`
  
  var headers: Link
}
object Content424 {
  
  inline def apply(content: `424`, headers: Link): Content424 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content424]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content424] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `424`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Link): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
