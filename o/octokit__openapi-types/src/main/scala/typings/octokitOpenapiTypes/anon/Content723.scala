package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content723 extends StObject {
  
  var content: `723`
  
  var headers: LinkString
}
object Content723 {
  
  inline def apply(content: `723`, headers: LinkString): Content723 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content723]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content723] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `723`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: LinkString): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
