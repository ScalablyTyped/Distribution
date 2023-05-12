package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content607 extends StObject {
  
  var content: `607`
  
  var headers: LinkString
}
object Content607 {
  
  inline def apply(content: `607`, headers: LinkString): Content607 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content607]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content607] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `607`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: LinkString): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
