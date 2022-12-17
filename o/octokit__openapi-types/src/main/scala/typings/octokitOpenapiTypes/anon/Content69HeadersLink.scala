package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content69HeadersLink extends StObject {
  
  var content: `69`
  
  var headers: Link
}
object Content69HeadersLink {
  
  inline def apply(content: `69`, headers: Link): Content69HeadersLink = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content69HeadersLink]
  }
  
  extension [Self <: Content69HeadersLink](x: Self) {
    
    inline def setContent(value: `69`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Link): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
