package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content467HeadersLink extends StObject {
  
  var content: `467`
  
  var headers: Link
}
object Content467HeadersLink {
  
  inline def apply(content: `467`, headers: Link): Content467HeadersLink = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content467HeadersLink]
  }
  
  extension [Self <: Content467HeadersLink](x: Self) {
    
    inline def setContent(value: `467`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Link): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
