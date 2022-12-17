package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content440HeadersLink extends StObject {
  
  var content: `440`
  
  var headers: Link
}
object Content440HeadersLink {
  
  inline def apply(content: `440`, headers: Link): Content440HeadersLink = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content440HeadersLink]
  }
  
  extension [Self <: Content440HeadersLink](x: Self) {
    
    inline def setContent(value: `440`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Link): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
