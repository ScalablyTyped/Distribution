package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `499` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: DocumentationurlErrorsMessage | ErrorsMessage
}
object `499` {
  
  inline def apply(applicationSlashjson: DocumentationurlErrorsMessage | ErrorsMessage): `499` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`499`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `499`] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: DocumentationurlErrorsMessage | ErrorsMessage): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
