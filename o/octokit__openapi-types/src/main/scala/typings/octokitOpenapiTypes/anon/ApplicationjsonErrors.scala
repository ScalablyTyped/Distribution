package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonErrors extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Errors
}
object ApplicationjsonErrors {
  
  inline def apply(applicationSlashjson: Errors): ApplicationjsonErrors = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonErrors]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonErrors] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: Errors): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
