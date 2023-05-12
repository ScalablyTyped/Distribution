package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MicrosoftAuthenticatorFeatureSettings extends StObject {
  
  // Determines whether the user's Authenticator app will show them the client app they are signing into.
  var displayAppInformationRequiredState: js.UndefOr[NullableOption[AuthenticationMethodFeatureConfiguration]] = js.undefined
  
  /**
    * Determines whether the user's Authenticator app will show them the geographic location of where the authentication
    * request originated from.
    */
  var displayLocationInformationRequiredState: js.UndefOr[NullableOption[AuthenticationMethodFeatureConfiguration]] = js.undefined
}
object MicrosoftAuthenticatorFeatureSettings {
  
  inline def apply(): MicrosoftAuthenticatorFeatureSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MicrosoftAuthenticatorFeatureSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MicrosoftAuthenticatorFeatureSettings] (val x: Self) extends AnyVal {
    
    inline def setDisplayAppInformationRequiredState(value: NullableOption[AuthenticationMethodFeatureConfiguration]): Self = StObject.set(x, "displayAppInformationRequiredState", value.asInstanceOf[js.Any])
    
    inline def setDisplayAppInformationRequiredStateNull: Self = StObject.set(x, "displayAppInformationRequiredState", null)
    
    inline def setDisplayAppInformationRequiredStateUndefined: Self = StObject.set(x, "displayAppInformationRequiredState", js.undefined)
    
    inline def setDisplayLocationInformationRequiredState(value: NullableOption[AuthenticationMethodFeatureConfiguration]): Self = StObject.set(x, "displayLocationInformationRequiredState", value.asInstanceOf[js.Any])
    
    inline def setDisplayLocationInformationRequiredStateNull: Self = StObject.set(x, "displayLocationInformationRequiredState", null)
    
    inline def setDisplayLocationInformationRequiredStateUndefined: Self = StObject.set(x, "displayLocationInformationRequiredState", js.undefined)
  }
}
