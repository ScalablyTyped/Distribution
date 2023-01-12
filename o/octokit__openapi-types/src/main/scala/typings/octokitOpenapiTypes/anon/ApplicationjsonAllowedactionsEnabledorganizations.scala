package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonAllowedactionsEnabledorganizations extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: AllowedactionsEnabledorganizations
}
object ApplicationjsonAllowedactionsEnabledorganizations {
  
  inline def apply(applicationSlashjson: AllowedactionsEnabledorganizations): ApplicationjsonAllowedactionsEnabledorganizations = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonAllowedactionsEnabledorganizations]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonAllowedactionsEnabledorganizations] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: AllowedactionsEnabledorganizations): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
