package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content813 extends StObject {
  
  var content: `813`
  
  var headers: LinkString
}
object Content813 {
  
  inline def apply(content: `813`, headers: LinkString): Content813 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content813]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content813] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `813`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: LinkString): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
