package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content531 extends StObject {
  
  var content: `531`
  
  var headers: LinkString
}
object Content531 {
  
  inline def apply(content: `531`, headers: LinkString): Content531 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content531]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content531] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `531`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: LinkString): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
