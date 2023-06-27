package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content384 extends StObject {
  
  var content: `384`
  
  var headers: Link
}
object Content384 {
  
  inline def apply(content: `384`, headers: Link): Content384 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content384]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content384] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `384`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Link): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
