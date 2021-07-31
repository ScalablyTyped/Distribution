package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SamlSingleSignOnSettings extends StObject {
  
  // The relative URI the service provider would redirect to after completion of the single sign-on flow.
  var relayState: js.UndefOr[NullableOption[String]] = js.undefined
}
object SamlSingleSignOnSettings {
  
  @scala.inline
  def apply(): SamlSingleSignOnSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SamlSingleSignOnSettings]
  }
  
  @scala.inline
  implicit class SamlSingleSignOnSettingsMutableBuilder[Self <: SamlSingleSignOnSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRelayState(value: NullableOption[String]): Self = StObject.set(x, "relayState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelayStateNull: Self = StObject.set(x, "relayState", null)
    
    @scala.inline
    def setRelayStateUndefined: Self = StObject.set(x, "relayState", js.undefined)
  }
}
