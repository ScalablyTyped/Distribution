package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content539 extends StObject {
  
  var content: `539`
  
  var headers: LinkString
}
object Content539 {
  
  inline def apply(content: `539`, headers: LinkString): Content539 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content539]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content539] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `539`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: LinkString): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
