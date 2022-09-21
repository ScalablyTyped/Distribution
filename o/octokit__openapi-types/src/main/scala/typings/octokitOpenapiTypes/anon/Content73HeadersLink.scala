package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content73HeadersLink extends StObject {
  
  var content: `73`
  
  var headers: Link
}
object Content73HeadersLink {
  
  inline def apply(content: `73`, headers: Link): Content73HeadersLink = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content73HeadersLink]
  }
  
  extension [Self <: Content73HeadersLink](x: Self) {
    
    inline def setContent(value: `73`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Link): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
