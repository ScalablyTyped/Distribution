package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content820 extends StObject {
  
  var content: `820`
  
  var headers: LinkString
}
object Content820 {
  
  inline def apply(content: `820`, headers: LinkString): Content820 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content820]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content820] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `820`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: LinkString): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
