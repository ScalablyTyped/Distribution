package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MicrosoftAuthenticatorAuthenticationMethodConfiguration
  extends StObject
     with AuthenticationMethodConfiguration {
  
  /**
    * A collection of Microsoft Authenticator settings such as application context and location context, and whether they are
    * enabled for all users or specific users only.
    */
  var featureSettings: js.UndefOr[NullableOption[MicrosoftAuthenticatorFeatureSettings]] = js.undefined
  
  // A collection of groups that are enabled to use the authentication method. Expanded by default.
  var includeTargets: js.UndefOr[NullableOption[js.Array[MicrosoftAuthenticatorAuthenticationMethodTarget]]] = js.undefined
  
  var isSoftwareOathEnabled: js.UndefOr[NullableOption[Boolean]] = js.undefined
}
object MicrosoftAuthenticatorAuthenticationMethodConfiguration {
  
  inline def apply(): MicrosoftAuthenticatorAuthenticationMethodConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MicrosoftAuthenticatorAuthenticationMethodConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MicrosoftAuthenticatorAuthenticationMethodConfiguration] (val x: Self) extends AnyVal {
    
    inline def setFeatureSettings(value: NullableOption[MicrosoftAuthenticatorFeatureSettings]): Self = StObject.set(x, "featureSettings", value.asInstanceOf[js.Any])
    
    inline def setFeatureSettingsNull: Self = StObject.set(x, "featureSettings", null)
    
    inline def setFeatureSettingsUndefined: Self = StObject.set(x, "featureSettings", js.undefined)
    
    inline def setIncludeTargets(value: NullableOption[js.Array[MicrosoftAuthenticatorAuthenticationMethodTarget]]): Self = StObject.set(x, "includeTargets", value.asInstanceOf[js.Any])
    
    inline def setIncludeTargetsNull: Self = StObject.set(x, "includeTargets", null)
    
    inline def setIncludeTargetsUndefined: Self = StObject.set(x, "includeTargets", js.undefined)
    
    inline def setIncludeTargetsVarargs(value: MicrosoftAuthenticatorAuthenticationMethodTarget*): Self = StObject.set(x, "includeTargets", js.Array(value*))
    
    inline def setIsSoftwareOathEnabled(value: NullableOption[Boolean]): Self = StObject.set(x, "isSoftwareOathEnabled", value.asInstanceOf[js.Any])
    
    inline def setIsSoftwareOathEnabledNull: Self = StObject.set(x, "isSoftwareOathEnabled", null)
    
    inline def setIsSoftwareOathEnabledUndefined: Self = StObject.set(x, "isSoftwareOathEnabled", js.undefined)
  }
}
