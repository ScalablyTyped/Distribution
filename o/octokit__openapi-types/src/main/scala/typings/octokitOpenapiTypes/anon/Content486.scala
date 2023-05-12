package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content486 extends StObject {
  
  var content: `486`
  
  var headers: LinkString
}
object Content486 {
  
  inline def apply(content: `486`, headers: LinkString): Content486 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content486]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content486] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `486`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: LinkString): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
