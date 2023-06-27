package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content374 extends StObject {
  
  var content: `374`
  
  var headers: Link
}
object Content374 {
  
  inline def apply(content: `374`, headers: Link): Content374 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content374]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content374] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `374`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Link): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
