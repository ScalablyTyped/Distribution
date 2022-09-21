package typings.maximMazurokGapiClientServicenetworking.gapi.client.servicenetworking

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RangeReservation extends StObject {
  
  /**
    * Required. The size of the desired subnet. Use usual CIDR range notation. For example, '30' to find unused x.x.x.x/30 CIDR range. The goal is to determine if one of the allocated
    * ranges has enough free space for a subnet of the requested size.
    */
  var ipPrefixLength: js.UndefOr[Double] = js.undefined
  
  /**
    * Optional. The name of one or more allocated IP address ranges associated with this private service access connection. If no range names are provided all ranges associated with this
    * connection will be considered. If a CIDR range with the specified IP prefix length is not available within these ranges the validation fails.
    */
  var requestedRanges: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Optional. The size of the desired secondary ranges for the subnet. Use usual CIDR range notation. For example, '30' to find unused x.x.x.x/30 CIDR range. The goal is to determine
    * that the allocated ranges have enough free space for all the requested secondary ranges.
    */
  var secondaryRangeIpPrefixLengths: js.UndefOr[js.Array[Double]] = js.undefined
  
  /**
    * Optional. List of subnetwork candidates to validate. The required input fields are `name`, `network`, and `region`. Subnetworks from this list which exist will be returned in the
    * response with the `ip_cidr_range`, `secondary_ip_cider_ranges`, and `outside_allocation` fields set.
    */
  var subnetworkCandidates: js.UndefOr[js.Array[Subnetwork]] = js.undefined
}
object RangeReservation {
  
  inline def apply(): RangeReservation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RangeReservation]
  }
  
  extension [Self <: RangeReservation](x: Self) {
    
    inline def setIpPrefixLength(value: Double): Self = StObject.set(x, "ipPrefixLength", value.asInstanceOf[js.Any])
    
    inline def setIpPrefixLengthUndefined: Self = StObject.set(x, "ipPrefixLength", js.undefined)
    
    inline def setRequestedRanges(value: js.Array[String]): Self = StObject.set(x, "requestedRanges", value.asInstanceOf[js.Any])
    
    inline def setRequestedRangesUndefined: Self = StObject.set(x, "requestedRanges", js.undefined)
    
    inline def setRequestedRangesVarargs(value: String*): Self = StObject.set(x, "requestedRanges", js.Array(value*))
    
    inline def setSecondaryRangeIpPrefixLengths(value: js.Array[Double]): Self = StObject.set(x, "secondaryRangeIpPrefixLengths", value.asInstanceOf[js.Any])
    
    inline def setSecondaryRangeIpPrefixLengthsUndefined: Self = StObject.set(x, "secondaryRangeIpPrefixLengths", js.undefined)
    
    inline def setSecondaryRangeIpPrefixLengthsVarargs(value: Double*): Self = StObject.set(x, "secondaryRangeIpPrefixLengths", js.Array(value*))
    
    inline def setSubnetworkCandidates(value: js.Array[Subnetwork]): Self = StObject.set(x, "subnetworkCandidates", value.asInstanceOf[js.Any])
    
    inline def setSubnetworkCandidatesUndefined: Self = StObject.set(x, "subnetworkCandidates", js.undefined)
    
    inline def setSubnetworkCandidatesVarargs(value: Subnetwork*): Self = StObject.set(x, "subnetworkCandidates", js.Array(value*))
  }
}
