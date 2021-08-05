package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SamlSingleSignOnSettings extends StObject {
  
  // The relative URI the service provider would redirect to after completion of the single sign-on flow.
  var relayState: js.UndefOr[NullableOption[String]] = js.undefined
}
object SamlSingleSignOnSettings {
  
  inline def apply(): SamlSingleSignOnSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SamlSingleSignOnSettings]
  }
  
  extension [Self <: SamlSingleSignOnSettings](x: Self) {
    
    inline def setRelayState(value: NullableOption[String]): Self = StObject.set(x, "relayState", value.asInstanceOf[js.Any])
    
    inline def setRelayStateNull: Self = StObject.set(x, "relayState", null)
    
    inline def setRelayStateUndefined: Self = StObject.set(x, "relayState", js.undefined)
  }
}
