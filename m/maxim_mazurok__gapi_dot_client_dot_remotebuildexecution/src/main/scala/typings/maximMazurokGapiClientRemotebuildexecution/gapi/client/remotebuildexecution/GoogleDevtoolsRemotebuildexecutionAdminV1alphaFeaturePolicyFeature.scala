package typings.maximMazurokGapiClientRemotebuildexecution.gapi.client.remotebuildexecution

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeature extends StObject {
  
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
  implicit class GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeatureMutableBuilder[Self <: GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeature] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowedValues(value: js.Array[String]): Self = StObject.set(x, "allowedValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowedValuesUndefined: Self = StObject.set(x, "allowedValues", js.undefined)
    
    @scala.inline
    def setAllowedValuesVarargs(value: String*): Self = StObject.set(x, "allowedValues", js.Array(value :_*))
    
    @scala.inline
    def setPolicy(value: String): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyUndefined: Self = StObject.set(x, "policy", js.undefined)
  }
}
