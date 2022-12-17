package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content451HeadersLink extends StObject {
  
  var content: `451`
  
  var headers: Link
}
object Content451HeadersLink {
  
  inline def apply(content: `451`, headers: Link): Content451HeadersLink = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content451HeadersLink]
  }
  
  extension [Self <: Content451HeadersLink](x: Self) {
    
    inline def setContent(value: `451`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Link): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
