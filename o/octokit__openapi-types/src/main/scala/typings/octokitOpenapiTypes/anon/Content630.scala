package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content630 extends StObject {
  
  var content: `630`
  
  var headers: LinkString
}
object Content630 {
  
  inline def apply(content: `630`, headers: LinkString): Content630 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content630]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content630] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `630`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: LinkString): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
