package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonCodeDocumentationurlMessage extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: CodeDocumentationurlMessage
}
object ApplicationjsonCodeDocumentationurlMessage {
  
  inline def apply(applicationSlashjson: CodeDocumentationurlMessage): ApplicationjsonCodeDocumentationurlMessage = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonCodeDocumentationurlMessage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonCodeDocumentationurlMessage] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: CodeDocumentationurlMessage): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
