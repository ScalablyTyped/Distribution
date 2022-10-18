package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonCodeDocumentationurlErrors extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: CodeDocumentationurlErrors
}
object ApplicationjsonCodeDocumentationurlErrors {
  
  inline def apply(applicationSlashjson: CodeDocumentationurlErrors): ApplicationjsonCodeDocumentationurlErrors = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonCodeDocumentationurlErrors]
  }
  
  extension [Self <: ApplicationjsonCodeDocumentationurlErrors](x: Self) {
    
    inline def setApplicationSlashjson(value: CodeDocumentationurlErrors): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
