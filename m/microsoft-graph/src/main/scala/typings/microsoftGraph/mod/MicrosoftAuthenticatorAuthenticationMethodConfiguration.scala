package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MicrosoftAuthenticatorAuthenticationMethodConfiguration
  extends StObject
     with AuthenticationMethodConfiguration {
  
  // A collection of users or groups who are enabled to use the authentication method.
  var includeTargets: js.UndefOr[NullableOption[js.Array[MicrosoftAuthenticatorAuthenticationMethodTarget]]] = js.undefined
}
object MicrosoftAuthenticatorAuthenticationMethodConfiguration {
  
  inline def apply(): MicrosoftAuthenticatorAuthenticationMethodConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MicrosoftAuthenticatorAuthenticationMethodConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MicrosoftAuthenticatorAuthenticationMethodConfiguration] (val x: Self) extends AnyVal {
    
    inline def setIncludeTargets(value: NullableOption[js.Array[MicrosoftAuthenticatorAuthenticationMethodTarget]]): Self = StObject.set(x, "includeTargets", value.asInstanceOf[js.Any])
    
    inline def setIncludeTargetsNull: Self = StObject.set(x, "includeTargets", null)
    
    inline def setIncludeTargetsUndefined: Self = StObject.set(x, "includeTargets", js.undefined)
    
    inline def setIncludeTargetsVarargs(value: MicrosoftAuthenticatorAuthenticationMethodTarget*): Self = StObject.set(x, "includeTargets", js.Array(value*))
  }
}
