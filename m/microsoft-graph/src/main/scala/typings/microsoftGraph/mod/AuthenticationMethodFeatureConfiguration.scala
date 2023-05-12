package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthenticationMethodFeatureConfiguration extends StObject {
  
  // A single entity that is excluded from this feature.
  var excludeTarget: js.UndefOr[NullableOption[FeatureTarget]] = js.undefined
  
  // A single entity that is included in this feature.
  var includeTarget: js.UndefOr[NullableOption[FeatureTarget]] = js.undefined
  
  /**
    * Enable or disable the feature. Possible values are: default, enabled, disabled, unknownFutureValue. The default value
    * is used when the configuration hasn't been explicitly set and uses the default behavior of Azure AD for the setting.
    * The default value is disabled.
    */
  var state: js.UndefOr[NullableOption[AdvancedConfigState]] = js.undefined
}
object AuthenticationMethodFeatureConfiguration {
  
  inline def apply(): AuthenticationMethodFeatureConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthenticationMethodFeatureConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AuthenticationMethodFeatureConfiguration] (val x: Self) extends AnyVal {
    
    inline def setExcludeTarget(value: NullableOption[FeatureTarget]): Self = StObject.set(x, "excludeTarget", value.asInstanceOf[js.Any])
    
    inline def setExcludeTargetNull: Self = StObject.set(x, "excludeTarget", null)
    
    inline def setExcludeTargetUndefined: Self = StObject.set(x, "excludeTarget", js.undefined)
    
    inline def setIncludeTarget(value: NullableOption[FeatureTarget]): Self = StObject.set(x, "includeTarget", value.asInstanceOf[js.Any])
    
    inline def setIncludeTargetNull: Self = StObject.set(x, "includeTarget", null)
    
    inline def setIncludeTargetUndefined: Self = StObject.set(x, "includeTarget", js.undefined)
    
    inline def setState(value: NullableOption[AdvancedConfigState]): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
