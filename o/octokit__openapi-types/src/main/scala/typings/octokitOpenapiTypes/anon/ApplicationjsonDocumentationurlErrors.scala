package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonDocumentationurlErrors extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: DocumentationurlErrors
}
object ApplicationjsonDocumentationurlErrors {
  
  inline def apply(applicationSlashjson: DocumentationurlErrors): ApplicationjsonDocumentationurlErrors = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonDocumentationurlErrors]
  }
  
  extension [Self <: ApplicationjsonDocumentationurlErrors](x: Self) {
    
    inline def setApplicationSlashjson(value: DocumentationurlErrors): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
