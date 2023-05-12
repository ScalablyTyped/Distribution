package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content617 extends StObject {
  
  var content: `617`
  
  var headers: LinkString
}
object Content617 {
  
  inline def apply(content: `617`, headers: LinkString): Content617 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content617]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content617] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `617`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: LinkString): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
