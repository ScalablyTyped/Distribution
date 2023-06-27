package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content299 extends StObject {
  
  var content: `299`
  
  var headers: Link
}
object Content299 {
  
  inline def apply(content: `299`, headers: Link): Content299 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content299]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content299] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `299`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Link): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
