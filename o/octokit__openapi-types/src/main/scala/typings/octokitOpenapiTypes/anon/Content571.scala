package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content571 extends StObject {
  
  var content: `571`
  
  var headers: LinkString
}
object Content571 {
  
  inline def apply(content: `571`, headers: LinkString): Content571 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content571]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content571] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `571`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: LinkString): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
