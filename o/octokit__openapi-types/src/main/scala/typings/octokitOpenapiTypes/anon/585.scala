package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `585` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: DocumentationurlErrorsMessage | ErrorsMessage
}
object `585` {
  
  inline def apply(applicationSlashjson: DocumentationurlErrorsMessage | ErrorsMessage): `585` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`585`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `585`] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: DocumentationurlErrorsMessage | ErrorsMessage): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
