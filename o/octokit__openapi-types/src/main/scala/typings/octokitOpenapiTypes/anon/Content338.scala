package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content338 extends StObject {
  
  var content: `338`
  
  var headers: Link
}
object Content338 {
  
  inline def apply(content: `338`, headers: Link): Content338 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content338]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content338] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `338`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Link): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
