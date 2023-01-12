package typings.maximMazurokGapiClientServicenetworking.gapi.client.servicenetworking

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValidateConsumerConfigResponse extends StObject {
  
  /** List of subnetwork candidates from the request which exist with the `ip_cidr_range`, `secondary_ip_cider_ranges`, and `outside_allocation` fields set. */
  var existingSubnetworkCandidates: js.UndefOr[js.Array[Subnetwork]] = js.undefined
  
  /** Indicates whether all the requested validations passed. */
  var isValid: js.UndefOr[Boolean] = js.undefined
  
  /** The first validation which failed. */
  var validationError: js.UndefOr[String] = js.undefined
}
object ValidateConsumerConfigResponse {
  
  inline def apply(): ValidateConsumerConfigResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValidateConsumerConfigResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ValidateConsumerConfigResponse] (val x: Self) extends AnyVal {
    
    inline def setExistingSubnetworkCandidates(value: js.Array[Subnetwork]): Self = StObject.set(x, "existingSubnetworkCandidates", value.asInstanceOf[js.Any])
    
    inline def setExistingSubnetworkCandidatesUndefined: Self = StObject.set(x, "existingSubnetworkCandidates", js.undefined)
    
    inline def setExistingSubnetworkCandidatesVarargs(value: Subnetwork*): Self = StObject.set(x, "existingSubnetworkCandidates", js.Array(value*))
    
    inline def setIsValid(value: Boolean): Self = StObject.set(x, "isValid", value.asInstanceOf[js.Any])
    
    inline def setIsValidUndefined: Self = StObject.set(x, "isValid", js.undefined)
    
    inline def setValidationError(value: String): Self = StObject.set(x, "validationError", value.asInstanceOf[js.Any])
    
    inline def setValidationErrorUndefined: Self = StObject.set(x, "validationError", js.undefined)
  }
}
