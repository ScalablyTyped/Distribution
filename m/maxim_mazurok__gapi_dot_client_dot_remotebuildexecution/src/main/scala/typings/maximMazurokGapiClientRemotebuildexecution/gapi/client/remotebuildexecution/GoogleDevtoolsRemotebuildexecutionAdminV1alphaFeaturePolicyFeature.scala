package typings.maximMazurokGapiClientRemotebuildexecution.gapi.client.remotebuildexecution

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeature extends js.Object {
  
  /** A list of acceptable values. Only effective when the policy is `RESTRICTED`. */
  var allowedValues: js.UndefOr[js.Array[String]] = js.native
  
  /** The policy of the feature. */
  var policy: js.UndefOr[String] = js.native
}
object GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeature {
  
  @scala.inline
  def apply(): GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeature = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeature]
  }
  
  @scala.inline
  implicit class GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeatureOps[Self <: GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeature] (val x: Self) extends AnyVal {
    
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
    def setAllowedValuesVarargs(value: String*): Self = this.set("allowedValues", js.Array(value :_*))
    
    @scala.inline
    def setAllowedValues(value: js.Array[String]): Self = this.set("allowedValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowedValues: Self = this.set("allowedValues", js.undefined)
    
    @scala.inline
    def setPolicy(value: String): Self = this.set("policy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolicy: Self = this.set("policy", js.undefined)
  }
}
