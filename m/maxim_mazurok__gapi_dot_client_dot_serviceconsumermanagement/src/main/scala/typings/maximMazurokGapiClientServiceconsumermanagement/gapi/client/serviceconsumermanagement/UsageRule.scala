package typings.maximMazurokGapiClientServiceconsumermanagement.gapi.client.serviceconsumermanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UsageRule extends StObject {
  
  /** If true, the selected method allows unregistered calls, e.g. calls that don't identify any user or application. */
  var allowUnregisteredCalls: js.UndefOr[Boolean] = js.native
  
  /** Selects the methods to which this rule applies. Use '*' to indicate all methods in all APIs. Refer to selector for syntax details. */
  var selector: js.UndefOr[String] = js.native
  
  /**
    * If true, the selected method should skip service control and the control plane features, such as quota and billing, will not be available. This flag is used by Google Cloud
    * Endpoints to bypass checks for internal methods, such as service health check methods.
    */
  var skipServiceControl: js.UndefOr[Boolean] = js.native
}
object UsageRule {
  
  @scala.inline
  def apply(): UsageRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UsageRule]
  }
  
  @scala.inline
  implicit class UsageRuleMutableBuilder[Self <: UsageRule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowUnregisteredCalls(value: Boolean): Self = StObject.set(x, "allowUnregisteredCalls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowUnregisteredCallsUndefined: Self = StObject.set(x, "allowUnregisteredCalls", js.undefined)
    
    @scala.inline
    def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
    
    @scala.inline
    def setSkipServiceControl(value: Boolean): Self = StObject.set(x, "skipServiceControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkipServiceControlUndefined: Self = StObject.set(x, "skipServiceControl", js.undefined)
  }
}
