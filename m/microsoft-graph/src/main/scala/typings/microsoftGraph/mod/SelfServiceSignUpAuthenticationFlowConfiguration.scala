package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SelfServiceSignUpAuthenticationFlowConfiguration extends StObject {
  
  /**
    * Indicates whether self-service sign-up flow is enabled or disabled. The default value is false. This property is not a
    * key. Required.
    */
  var isEnabled: js.UndefOr[Boolean] = js.undefined
}
object SelfServiceSignUpAuthenticationFlowConfiguration {
  
  inline def apply(): SelfServiceSignUpAuthenticationFlowConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SelfServiceSignUpAuthenticationFlowConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SelfServiceSignUpAuthenticationFlowConfiguration] (val x: Self) extends AnyVal {
    
    inline def setIsEnabled(value: Boolean): Self = StObject.set(x, "isEnabled", value.asInstanceOf[js.Any])
    
    inline def setIsEnabledUndefined: Self = StObject.set(x, "isEnabled", js.undefined)
  }
}
