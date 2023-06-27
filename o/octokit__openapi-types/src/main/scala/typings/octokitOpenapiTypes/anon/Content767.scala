package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content767 extends StObject {
  
  var content: `767`
  
  var headers: LinkString
}
object Content767 {
  
  inline def apply(content: `767`, headers: LinkString): Content767 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content767]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content767] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `767`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: LinkString): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
