package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonErrorsArray extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: ErrorsArray
}
object ApplicationjsonErrorsArray {
  
  inline def apply(applicationSlashjson: ErrorsArray): ApplicationjsonErrorsArray = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonErrorsArray]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonErrorsArray] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: ErrorsArray): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
