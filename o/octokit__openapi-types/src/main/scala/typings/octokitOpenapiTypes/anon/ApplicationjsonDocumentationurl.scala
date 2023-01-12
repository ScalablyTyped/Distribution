package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonDocumentationurl extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Documentationurl
}
object ApplicationjsonDocumentationurl {
  
  inline def apply(applicationSlashjson: Documentationurl): ApplicationjsonDocumentationurl = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonDocumentationurl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonDocumentationurl] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: Documentationurl): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
