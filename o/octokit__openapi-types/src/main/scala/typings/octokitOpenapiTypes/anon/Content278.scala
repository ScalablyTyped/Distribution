package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content278 extends StObject {
  
  var content: `278`
  
  var headers: Link
}
object Content278 {
  
  inline def apply(content: `278`, headers: Link): Content278 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content278]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content278] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `278`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Link): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
