package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content458 extends StObject {
  
  var content: `458`
  
  var headers: Link
}
object Content458 {
  
  inline def apply(content: `458`, headers: Link): Content458 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content458]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content458] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `458`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Link): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
