package typings.maximMazurokGapiClientServicenetworking.gapi.client.servicenetworking

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddSubnetworkRequest extends StObject {
  
  /** Optional. The IAM permission check determines whether the consumer project has 'servicenetworking.services.use' permission or not. */
  var checkServiceNetworkingUsePermission: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Optional. Specifies a custom time bucket for Arcus subnetwork request idempotency. If two equivalent concurrent requests are made, Arcus will know to ignore the request if it has
    * already been completed or is in progress. Only requests with matching compute_idempotency_window have guaranteed idempotency. Changing this time window between requests results in
    * undefined behavior. Zero (or empty) value with custom_compute_idempotency_window=true specifies no idempotency (i.e. no request ID is provided to Arcus). Maximum value of 14 days
    * (enforced by Arcus limit). For more information on how to use, see: go/revisit-sn-idempotency-window
    */
  var computeIdempotencyWindow: js.UndefOr[String] = js.undefined
  
  /**
    * Required. A resource that represents the service consumer, such as `projects/123456`. The project number can be different from the value in the consumer network parameter. For
    * example, the network might be part of a Shared VPC network. In those cases, Service Networking validates that this resource belongs to that Shared VPC.
    */
  var consumer: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The name of the service consumer's VPC network. The network must have an existing private connection that was provisioned through the connections.create method. The name
    * must be in the following format: `projects/{project}/global/networks/{network}`, where {project} is a project number, such as `12345`. {network} is the name of a VPC network in the
    * project.
    */
  var consumerNetwork: js.UndefOr[String] = js.undefined
  
  /** Optional. Description of the subnet. */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The prefix length of the subnet's IP address range. Use CIDR range notation, such as `30` to provision a subnet with an `x.x.x.x/30` CIDR range. The IP address range is
    * drawn from a pool of available ranges in the service consumer's allocated range.
    */
  var ipPrefixLength: js.UndefOr[Double] = js.undefined
  
  /**
    * Optional. Enable outside allocation using public IP addresses. Any public IP range may be specified. If this field is provided, we will not use customer reserved ranges for this
    * primary IP range.
    */
  var outsideAllocationPublicIpRange: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. The private IPv6 google access type for the VMs in this subnet. For information about the access types that can be set using this field, see
    * [subnetwork](https://cloud.google.com/compute/docs/reference/rest/v1/subnetworks) in the Compute API documentation.
    */
  var privateIpv6GoogleAccess: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. Defines the purpose field of the subnet, e.g. 'PRIVATE_SERVICE_CONNECT'. For information about the purposes that can be set using this field, see
    * [subnetwork](https://cloud.google.com/compute/docs/reference/rest/v1/subnetworks) in the Compute API documentation.
    */
  var purpose: js.UndefOr[String] = js.undefined
  
  /** Required. The name of a [region](/compute/docs/regions-zones) for the subnet, such `europe-west1`. */
  var region: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. The starting address of a range. The address must be a valid IPv4 address in the x.x.x.x format. This value combined with the IP prefix range is the CIDR range for the
    * subnet. The range must be within the allocated range that is assigned to the private connection. If the CIDR range isn't available, the call fails.
    */
  var requestedAddress: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. The name of one or more allocated IP address ranges associated with this private service access connection. If no range names are provided all ranges associated with this
    * connection will be considered. If a CIDR range with the specified IP prefix length is not available within these ranges, the call fails.
    */
  var requestedRanges: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Optional. A list of secondary IP ranges to be created within the new subnetwork. */
  var secondaryIpRangeSpecs: js.UndefOr[js.Array[SecondaryIpRangeSpec]] = js.undefined
  
  /** Required. A name for the new subnet. For information about the naming requirements, see [subnetwork](/compute/docs/reference/rest/v1/subnetworks) in the Compute API documentation. */
  var subnetwork: js.UndefOr[String] = js.undefined
  
  /** A list of members that are granted the `roles/servicenetworking.subnetworkAdmin` role on the subnet. */
  var subnetworkUsers: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Optional. Specifies if Service Networking should use a custom time bucket for Arcus idempotency. If false, Service Networking uses a 300 second (5 minute) Arcus idempotency window.
    * If true, Service Networking uses a custom idempotency window provided by the user in field compute_idempotency_window. For more information on how to use, see:
    * go/revisit-sn-idempotency-window
    */
  var useCustomComputeIdempotencyWindow: js.UndefOr[Boolean] = js.undefined
}
object AddSubnetworkRequest {
  
  inline def apply(): AddSubnetworkRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddSubnetworkRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AddSubnetworkRequest] (val x: Self) extends AnyVal {
    
    inline def setCheckServiceNetworkingUsePermission(value: Boolean): Self = StObject.set(x, "checkServiceNetworkingUsePermission", value.asInstanceOf[js.Any])
    
    inline def setCheckServiceNetworkingUsePermissionUndefined: Self = StObject.set(x, "checkServiceNetworkingUsePermission", js.undefined)
    
    inline def setComputeIdempotencyWindow(value: String): Self = StObject.set(x, "computeIdempotencyWindow", value.asInstanceOf[js.Any])
    
    inline def setComputeIdempotencyWindowUndefined: Self = StObject.set(x, "computeIdempotencyWindow", js.undefined)
    
    inline def setConsumer(value: String): Self = StObject.set(x, "consumer", value.asInstanceOf[js.Any])
    
    inline def setConsumerNetwork(value: String): Self = StObject.set(x, "consumerNetwork", value.asInstanceOf[js.Any])
    
    inline def setConsumerNetworkUndefined: Self = StObject.set(x, "consumerNetwork", js.undefined)
    
    inline def setConsumerUndefined: Self = StObject.set(x, "consumer", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setIpPrefixLength(value: Double): Self = StObject.set(x, "ipPrefixLength", value.asInstanceOf[js.Any])
    
    inline def setIpPrefixLengthUndefined: Self = StObject.set(x, "ipPrefixLength", js.undefined)
    
    inline def setOutsideAllocationPublicIpRange(value: String): Self = StObject.set(x, "outsideAllocationPublicIpRange", value.asInstanceOf[js.Any])
    
    inline def setOutsideAllocationPublicIpRangeUndefined: Self = StObject.set(x, "outsideAllocationPublicIpRange", js.undefined)
    
    inline def setPrivateIpv6GoogleAccess(value: String): Self = StObject.set(x, "privateIpv6GoogleAccess", value.asInstanceOf[js.Any])
    
    inline def setPrivateIpv6GoogleAccessUndefined: Self = StObject.set(x, "privateIpv6GoogleAccess", js.undefined)
    
    inline def setPurpose(value: String): Self = StObject.set(x, "purpose", value.asInstanceOf[js.Any])
    
    inline def setPurposeUndefined: Self = StObject.set(x, "purpose", js.undefined)
    
    inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    inline def setRequestedAddress(value: String): Self = StObject.set(x, "requestedAddress", value.asInstanceOf[js.Any])
    
    inline def setRequestedAddressUndefined: Self = StObject.set(x, "requestedAddress", js.undefined)
    
    inline def setRequestedRanges(value: js.Array[String]): Self = StObject.set(x, "requestedRanges", value.asInstanceOf[js.Any])
    
    inline def setRequestedRangesUndefined: Self = StObject.set(x, "requestedRanges", js.undefined)
    
    inline def setRequestedRangesVarargs(value: String*): Self = StObject.set(x, "requestedRanges", js.Array(value*))
    
    inline def setSecondaryIpRangeSpecs(value: js.Array[SecondaryIpRangeSpec]): Self = StObject.set(x, "secondaryIpRangeSpecs", value.asInstanceOf[js.Any])
    
    inline def setSecondaryIpRangeSpecsUndefined: Self = StObject.set(x, "secondaryIpRangeSpecs", js.undefined)
    
    inline def setSecondaryIpRangeSpecsVarargs(value: SecondaryIpRangeSpec*): Self = StObject.set(x, "secondaryIpRangeSpecs", js.Array(value*))
    
    inline def setSubnetwork(value: String): Self = StObject.set(x, "subnetwork", value.asInstanceOf[js.Any])
    
    inline def setSubnetworkUndefined: Self = StObject.set(x, "subnetwork", js.undefined)
    
    inline def setSubnetworkUsers(value: js.Array[String]): Self = StObject.set(x, "subnetworkUsers", value.asInstanceOf[js.Any])
    
    inline def setSubnetworkUsersUndefined: Self = StObject.set(x, "subnetworkUsers", js.undefined)
    
    inline def setSubnetworkUsersVarargs(value: String*): Self = StObject.set(x, "subnetworkUsers", js.Array(value*))
    
    inline def setUseCustomComputeIdempotencyWindow(value: Boolean): Self = StObject.set(x, "useCustomComputeIdempotencyWindow", value.asInstanceOf[js.Any])
    
    inline def setUseCustomComputeIdempotencyWindowUndefined: Self = StObject.set(x, "useCustomComputeIdempotencyWindow", js.undefined)
  }
}
