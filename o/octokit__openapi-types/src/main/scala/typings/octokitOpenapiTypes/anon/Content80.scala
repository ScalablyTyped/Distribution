package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content80 extends StObject {
  
  var content: `80`
  
  var headers: Link
}
object Content80 {
  
  inline def apply(content: `80`, headers: Link): Content80 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content80]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content80] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `80`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Link): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
