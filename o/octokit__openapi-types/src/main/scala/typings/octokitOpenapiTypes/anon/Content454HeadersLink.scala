package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content454HeadersLink extends StObject {
  
  var content: `454`
  
  var headers: Link
}
object Content454HeadersLink {
  
  inline def apply(content: `454`, headers: Link): Content454HeadersLink = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content454HeadersLink]
  }
  
  extension [Self <: Content454HeadersLink](x: Self) {
    
    inline def setContent(value: `454`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Link): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
