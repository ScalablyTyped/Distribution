package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content677 extends StObject {
  
  var content: `677`
  
  var headers: LinkString
}
object Content677 {
  
  inline def apply(content: `677`, headers: LinkString): Content677 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content677]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content677] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `677`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: LinkString): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
