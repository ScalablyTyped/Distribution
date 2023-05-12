package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content664 extends StObject {
  
  var content: `664`
  
  var headers: LinkString
}
object Content664 {
  
  inline def apply(content: `664`, headers: LinkString): Content664 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content664]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content664] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `664`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: LinkString): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
