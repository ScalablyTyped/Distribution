package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonDocumentationurlMessage extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: DocumentationurlMessage
}
object ApplicationjsonDocumentationurlMessage {
  
  inline def apply(applicationSlashjson: DocumentationurlMessage): ApplicationjsonDocumentationurlMessage = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonDocumentationurlMessage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonDocumentationurlMessage] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: DocumentationurlMessage): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
