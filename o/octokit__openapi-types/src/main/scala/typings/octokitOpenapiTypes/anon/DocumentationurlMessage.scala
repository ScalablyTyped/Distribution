package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentationurlMessage extends StObject {
  
  var documentation_url: js.UndefOr[String] = js.undefined
  
  var message: js.UndefOr[String] = js.undefined
}
object DocumentationurlMessage {
  
  inline def apply(): DocumentationurlMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentationurlMessage]
  }
  
  extension [Self <: DocumentationurlMessage](x: Self) {
    
    inline def setDocumentation_url(value: String): Self = StObject.set(x, "documentation_url", value.asInstanceOf[js.Any])
    
    inline def setDocumentation_urlUndefined: Self = StObject.set(x, "documentation_url", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
  }
}
