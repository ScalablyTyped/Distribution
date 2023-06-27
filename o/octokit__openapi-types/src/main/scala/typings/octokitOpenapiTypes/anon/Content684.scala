package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content684 extends StObject {
  
  var content: `684`
  
  var headers: LinkString
}
object Content684 {
  
  inline def apply(content: `684`, headers: LinkString): Content684 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content684]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content684] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `684`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: LinkString): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
