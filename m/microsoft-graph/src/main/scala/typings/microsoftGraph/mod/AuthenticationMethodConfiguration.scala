package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthenticationMethodConfiguration
  extends StObject
     with Entity {
  
  // Groups of users that are excluded from a policy.
  var excludeTargets: js.UndefOr[NullableOption[js.Array[ExcludeTarget]]] = js.undefined
  
  // The state of the policy. Possible values are: enabled, disabled.
  var state: js.UndefOr[NullableOption[AuthenticationMethodState]] = js.undefined
}
object AuthenticationMethodConfiguration {
  
  inline def apply(): AuthenticationMethodConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthenticationMethodConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AuthenticationMethodConfiguration] (val x: Self) extends AnyVal {
    
    inline def setExcludeTargets(value: NullableOption[js.Array[ExcludeTarget]]): Self = StObject.set(x, "excludeTargets", value.asInstanceOf[js.Any])
    
    inline def setExcludeTargetsNull: Self = StObject.set(x, "excludeTargets", null)
    
    inline def setExcludeTargetsUndefined: Self = StObject.set(x, "excludeTargets", js.undefined)
    
    inline def setExcludeTargetsVarargs(value: ExcludeTarget*): Self = StObject.set(x, "excludeTargets", js.Array(value*))
    
    inline def setState(value: NullableOption[AuthenticationMethodState]): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
