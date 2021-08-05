package typings.maximMazurokGapiClientRemotebuildexecution.gapi.client.remotebuildexecution

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeature extends StObject {
  
  /** A list of acceptable values. Only effective when the policy is `RESTRICTED`. */
  var allowedValues: js.UndefOr[js.Array[String]] = js.undefined
  
  /** The policy of the feature. */
  var policy: js.UndefOr[String] = js.undefined
}
object GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeature {
  
  inline def apply(): GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeature = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeature]
  }
  
  extension [Self <: GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeature](x: Self) {
    
    inline def setAllowedValues(value: js.Array[String]): Self = StObject.set(x, "allowedValues", value.asInstanceOf[js.Any])
    
    inline def setAllowedValuesUndefined: Self = StObject.set(x, "allowedValues", js.undefined)
    
    inline def setAllowedValuesVarargs(value: String*): Self = StObject.set(x, "allowedValues", js.Array(value :_*))
    
    inline def setPolicy(value: String): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
    
    inline def setPolicyUndefined: Self = StObject.set(x, "policy", js.undefined)
  }
}
