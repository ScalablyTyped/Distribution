package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SmsAuthenticationMethodConfiguration
  extends StObject
     with AuthenticationMethodConfiguration {
  
  // A collection of groups that are enabled to use the authentication method.
  var includeTargets: js.UndefOr[NullableOption[js.Array[SmsAuthenticationMethodTarget]]] = js.undefined
}
object SmsAuthenticationMethodConfiguration {
  
  inline def apply(): SmsAuthenticationMethodConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SmsAuthenticationMethodConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SmsAuthenticationMethodConfiguration] (val x: Self) extends AnyVal {
    
    inline def setIncludeTargets(value: NullableOption[js.Array[SmsAuthenticationMethodTarget]]): Self = StObject.set(x, "includeTargets", value.asInstanceOf[js.Any])
    
    inline def setIncludeTargetsNull: Self = StObject.set(x, "includeTargets", null)
    
    inline def setIncludeTargetsUndefined: Self = StObject.set(x, "includeTargets", js.undefined)
    
    inline def setIncludeTargetsVarargs(value: SmsAuthenticationMethodTarget*): Self = StObject.set(x, "includeTargets", js.Array(value*))
  }
}
