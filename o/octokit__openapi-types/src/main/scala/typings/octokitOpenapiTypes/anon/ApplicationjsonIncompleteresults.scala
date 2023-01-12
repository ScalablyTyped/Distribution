package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonIncompleteresults extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Incompleteresults
}
object ApplicationjsonIncompleteresults {
  
  inline def apply(applicationSlashjson: Incompleteresults): ApplicationjsonIncompleteresults = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonIncompleteresults]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonIncompleteresults] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: Incompleteresults): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
