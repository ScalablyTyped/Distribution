package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content381 extends StObject {
  
  var content: `381`
  
  var headers: Link
}
object Content381 {
  
  inline def apply(content: `381`, headers: Link): Content381 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content381]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content381] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `381`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Link): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
