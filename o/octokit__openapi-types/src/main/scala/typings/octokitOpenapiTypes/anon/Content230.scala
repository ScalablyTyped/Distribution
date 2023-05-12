package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content230 extends StObject {
  
  var content: `230`
  
  var headers: Link
}
object Content230 {
  
  inline def apply(content: `230`, headers: Link): Content230 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content230]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content230] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `230`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Link): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
