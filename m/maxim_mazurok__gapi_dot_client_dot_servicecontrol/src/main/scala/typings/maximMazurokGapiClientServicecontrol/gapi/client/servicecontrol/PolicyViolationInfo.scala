package typings.maximMazurokGapiClientServicecontrol.gapi.client.servicecontrol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PolicyViolationInfo extends StObject {
  
  /** Indicates the orgpolicy violations for this resource. */
  var orgPolicyViolationInfo: js.UndefOr[OrgPolicyViolationInfo] = js.undefined
}
object PolicyViolationInfo {
  
  inline def apply(): PolicyViolationInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolicyViolationInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PolicyViolationInfo] (val x: Self) extends AnyVal {
    
    inline def setOrgPolicyViolationInfo(value: OrgPolicyViolationInfo): Self = StObject.set(x, "orgPolicyViolationInfo", value.asInstanceOf[js.Any])
    
    inline def setOrgPolicyViolationInfoUndefined: Self = StObject.set(x, "orgPolicyViolationInfo", js.undefined)
  }
}
