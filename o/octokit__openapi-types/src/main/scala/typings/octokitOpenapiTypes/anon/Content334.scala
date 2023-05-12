package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content334 extends StObject {
  
  var content: `334`
  
  var headers: Link
}
object Content334 {
  
  inline def apply(content: `334`, headers: Link): Content334 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content334]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content334] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `334`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Link): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
