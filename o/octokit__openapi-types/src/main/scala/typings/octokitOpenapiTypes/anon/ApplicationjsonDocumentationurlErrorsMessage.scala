package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonDocumentationurlErrorsMessage extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: DocumentationurlErrorsMessage
}
object ApplicationjsonDocumentationurlErrorsMessage {
  
  inline def apply(applicationSlashjson: DocumentationurlErrorsMessage): ApplicationjsonDocumentationurlErrorsMessage = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonDocumentationurlErrorsMessage]
  }
  
  extension [Self <: ApplicationjsonDocumentationurlErrorsMessage](x: Self) {
    
    inline def setApplicationSlashjson(value: DocumentationurlErrorsMessage): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
