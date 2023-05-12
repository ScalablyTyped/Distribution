package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content661 extends StObject {
  
  var content: `661`
  
  var headers: LinkString
}
object Content661 {
  
  inline def apply(content: `661`, headers: LinkString): Content661 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content661]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content661] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `661`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: LinkString): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
