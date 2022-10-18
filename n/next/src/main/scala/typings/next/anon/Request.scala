package typings.next.anon

import typings.next.distServerWebSpecExtensionRequestMod.NextRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Request extends StObject {
  
  var page: String
  
  var request: NextRequest
}
object Request {
  
  inline def apply(page: String, request: NextRequest): Request = {
    val __obj = js.Dynamic.literal(page = page.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[Request]
  }
  
  extension [Self <: Request](x: Self) {
    
    inline def setPage(value: String): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: NextRequest): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
  }
}
