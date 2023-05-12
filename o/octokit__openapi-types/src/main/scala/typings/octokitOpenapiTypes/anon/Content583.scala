package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content583 extends StObject {
  
  var content: `583`
  
  var headers: LinkString
}
object Content583 {
  
  inline def apply(content: `583`, headers: LinkString): Content583 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content583]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content583] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `583`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: LinkString): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
