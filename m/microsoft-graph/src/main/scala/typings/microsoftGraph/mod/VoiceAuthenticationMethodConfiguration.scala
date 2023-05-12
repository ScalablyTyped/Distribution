package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VoiceAuthenticationMethodConfiguration
  extends StObject
     with AuthenticationMethodConfiguration {
  
  // A collection of groups that are enabled to use the authentication method. Expanded by default.
  var includeTargets: js.UndefOr[NullableOption[js.Array[AuthenticationMethodTarget]]] = js.undefined
  
  // true if users can register office phones, otherwise, false.
  var isOfficePhoneAllowed: js.UndefOr[NullableOption[Boolean]] = js.undefined
}
object VoiceAuthenticationMethodConfiguration {
  
  inline def apply(): VoiceAuthenticationMethodConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VoiceAuthenticationMethodConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VoiceAuthenticationMethodConfiguration] (val x: Self) extends AnyVal {
    
    inline def setIncludeTargets(value: NullableOption[js.Array[AuthenticationMethodTarget]]): Self = StObject.set(x, "includeTargets", value.asInstanceOf[js.Any])
    
    inline def setIncludeTargetsNull: Self = StObject.set(x, "includeTargets", null)
    
    inline def setIncludeTargetsUndefined: Self = StObject.set(x, "includeTargets", js.undefined)
    
    inline def setIncludeTargetsVarargs(value: AuthenticationMethodTarget*): Self = StObject.set(x, "includeTargets", js.Array(value*))
    
    inline def setIsOfficePhoneAllowed(value: NullableOption[Boolean]): Self = StObject.set(x, "isOfficePhoneAllowed", value.asInstanceOf[js.Any])
    
    inline def setIsOfficePhoneAllowedNull: Self = StObject.set(x, "isOfficePhoneAllowed", null)
    
    inline def setIsOfficePhoneAllowedUndefined: Self = StObject.set(x, "isOfficePhoneAllowed", js.undefined)
  }
}
