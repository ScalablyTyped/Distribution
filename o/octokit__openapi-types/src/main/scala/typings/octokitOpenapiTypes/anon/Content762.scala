package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content762 extends StObject {
  
  var content: `762`
  
  var headers: LinkString
}
object Content762 {
  
  inline def apply(content: `762`, headers: LinkString): Content762 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content762]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content762] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `762`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: LinkString): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
