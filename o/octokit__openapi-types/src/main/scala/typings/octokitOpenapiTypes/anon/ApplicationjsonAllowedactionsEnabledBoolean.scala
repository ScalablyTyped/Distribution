package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonAllowedactionsEnabledBoolean extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: AllowedactionsEnabledBoolean
}
object ApplicationjsonAllowedactionsEnabledBoolean {
  
  inline def apply(applicationSlashjson: AllowedactionsEnabledBoolean): ApplicationjsonAllowedactionsEnabledBoolean = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonAllowedactionsEnabledBoolean]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonAllowedactionsEnabledBoolean] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: AllowedactionsEnabledBoolean): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
