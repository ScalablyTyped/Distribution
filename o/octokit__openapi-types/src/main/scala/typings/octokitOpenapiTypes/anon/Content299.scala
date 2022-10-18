package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content299 extends StObject {
  
  var content: `299`
  
  var headers: `24`
}
object Content299 {
  
  inline def apply(content: `299`, headers: `24`): Content299 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content299]
  }
  
  extension [Self <: Content299](x: Self) {
    
    inline def setContent(value: `299`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: `24`): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
