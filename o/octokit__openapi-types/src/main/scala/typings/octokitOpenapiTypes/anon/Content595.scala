package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content595 extends StObject {
  
  var content: `595`
  
  var headers: LinkString
}
object Content595 {
  
  inline def apply(content: `595`, headers: LinkString): Content595 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content595]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content595] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `595`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: LinkString): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
