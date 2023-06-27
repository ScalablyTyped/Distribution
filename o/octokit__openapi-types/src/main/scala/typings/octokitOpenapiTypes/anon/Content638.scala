package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content638 extends StObject {
  
  var content: `638`
  
  var headers: LinkString
}
object Content638 {
  
  inline def apply(content: `638`, headers: LinkString): Content638 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content638]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content638] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `638`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: LinkString): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
