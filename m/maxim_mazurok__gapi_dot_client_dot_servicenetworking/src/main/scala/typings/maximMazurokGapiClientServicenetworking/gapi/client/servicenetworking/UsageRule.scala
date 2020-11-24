package typings.maximMazurokGapiClientServicenetworking.gapi.client.servicenetworking

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UsageRule extends js.Object {
  
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
  implicit class UsageRuleOps[Self <: UsageRule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAllowUnregisteredCalls(value: Boolean): Self = this.set("allowUnregisteredCalls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowUnregisteredCalls: Self = this.set("allowUnregisteredCalls", js.undefined)
    
    @scala.inline
    def setSelector(value: String): Self = this.set("selector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelector: Self = this.set("selector", js.undefined)
    
    @scala.inline
    def setSkipServiceControl(value: Boolean): Self = this.set("skipServiceControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkipServiceControl: Self = this.set("skipServiceControl", js.undefined)
  }
}
