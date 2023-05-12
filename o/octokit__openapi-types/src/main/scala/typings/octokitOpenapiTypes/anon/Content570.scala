package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content570 extends StObject {
  
  var content: `570`
  
  var headers: LinkString
}
object Content570 {
  
  inline def apply(content: `570`, headers: LinkString): Content570 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content570]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content570] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `570`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: LinkString): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
