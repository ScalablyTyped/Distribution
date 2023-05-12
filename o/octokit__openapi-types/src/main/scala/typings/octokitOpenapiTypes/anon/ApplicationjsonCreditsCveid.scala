package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonCreditsCveid extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: CreditsCveid
}
object ApplicationjsonCreditsCveid {
  
  inline def apply(applicationSlashjson: CreditsCveid): ApplicationjsonCreditsCveid = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonCreditsCveid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonCreditsCveid] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: CreditsCveid): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
