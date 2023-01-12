package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonCodeDocumentationurl extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: CodeDocumentationurl
}
object ApplicationjsonCodeDocumentationurl {
  
  inline def apply(applicationSlashjson: CodeDocumentationurl): ApplicationjsonCodeDocumentationurl = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonCodeDocumentationurl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonCodeDocumentationurl] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: CodeDocumentationurl): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
