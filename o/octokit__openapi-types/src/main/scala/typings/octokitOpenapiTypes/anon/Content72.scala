package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content72 extends StObject {
  
  var content: `72`
  
  var headers: Link
}
object Content72 {
  
  inline def apply(content: `72`, headers: Link): Content72 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content72]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content72] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `72`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Link): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
