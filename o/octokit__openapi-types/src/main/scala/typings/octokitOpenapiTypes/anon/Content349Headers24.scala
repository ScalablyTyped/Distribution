package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content349Headers24 extends StObject {
  
  var content: `349`
  
  var headers: `24`
}
object Content349Headers24 {
  
  inline def apply(content: `349`, headers: `24`): Content349Headers24 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content349Headers24]
  }
  
  extension [Self <: Content349Headers24](x: Self) {
    
    inline def setContent(value: `349`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: `24`): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
