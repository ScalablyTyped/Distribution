package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content673 extends StObject {
  
  var content: `673`
  
  var headers: LinkString
}
object Content673 {
  
  inline def apply(content: `673`, headers: LinkString): Content673 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content673]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content673] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `673`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: LinkString): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
