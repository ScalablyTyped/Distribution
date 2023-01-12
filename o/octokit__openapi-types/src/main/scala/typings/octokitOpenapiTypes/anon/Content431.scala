package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content431 extends StObject {
  
  var content: `431`
  
  var headers: Link
}
object Content431 {
  
  inline def apply(content: `431`, headers: Link): Content431 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content431]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content431] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `431`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Link): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
