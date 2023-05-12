package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content667 extends StObject {
  
  var content: `667`
  
  var headers: LinkString
}
object Content667 {
  
  inline def apply(content: `667`, headers: LinkString): Content667 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content667]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content667] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `667`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: LinkString): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
