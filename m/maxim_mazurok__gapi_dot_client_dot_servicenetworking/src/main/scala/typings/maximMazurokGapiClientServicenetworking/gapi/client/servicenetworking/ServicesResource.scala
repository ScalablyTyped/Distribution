package typings.maximMazurokGapiClientServicenetworking.gapi.client.servicenetworking

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientServicenetworking.anon.AccesstokenAlt
import typings.maximMazurokGapiClientServicenetworking.anon.AltCallback
import typings.maximMazurokGapiClientServicenetworking.anon.CallbackFields
import typings.maximMazurokGapiClientServicenetworking.anon.FieldsKey
import typings.maximMazurokGapiClientServicenetworking.anon.Key
import typings.maximMazurokGapiClientServicenetworking.anon.KeyOauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServicesResource extends js.Object {
  
  /**
    * For service producers, provisions a new subnet in a peered service's shared VPC network in the requested region and with the requested size that's expressed as a CIDR range (number
    * of leading bits of ipV4 network mask). The method checks against the assigned allocated ranges to find a non-conflicting IP address range. The method will reuse a subnet if
    * subsequent calls contain the same subnet name, region, and prefix length. This method will make producer's tenant project to be a shared VPC service project as needed.
    */
  def addSubnetwork(request: AccesstokenAlt): Request[Operation] = js.native
  def addSubnetwork(request: Key, body: AddSubnetworkRequest): Request[Operation] = js.native
  
  var connections: ConnectionsResource = js.native
  
  /** Disables VPC service controls for a connection. */
  def disableVpcServiceControls(request: AltCallback): Request[Operation] = js.native
  def disableVpcServiceControls(request: Key, body: DisableVpcServiceControlsRequest): Request[Operation] = js.native
  
  var dnsRecordSets: DnsRecordSetsResource = js.native
  
  var dnsZones: DnsZonesResource = js.native
  
  /** Enables VPC service controls for a connection. */
  def enableVpcServiceControls(request: CallbackFields): Request[Operation] = js.native
  def enableVpcServiceControls(request: Key, body: EnableVpcServiceControlsRequest): Request[Operation] = js.native
  
  var projects: ProjectsResource = js.native
  
  var roles: RolesResource = js.native
  
  /**
    * Service producers can use this method to find a currently unused range within consumer allocated ranges. This returned range is not reserved, and not guaranteed to remain unused. It
    * will validate previously provided allocated ranges, find non-conflicting sub-range of requested size (expressed in number of leading bits of ipv4 network mask, as in CIDR range
    * notation).
    */
  def searchRange(request: FieldsKey): Request[Operation] = js.native
  def searchRange(request: Key, body: SearchRangeRequest): Request[Operation] = js.native
  
  /**
    * Service producers use this method to validate if the consumer provided network, project and requested range are valid. This allows them to use a fail-fast mechanism for consumer
    * requests, and not have to wait for AddSubnetwork operation completion to determine if user request is invalid.
    */
  def validate(request: KeyOauthtoken): Request[ValidateConsumerConfigResponse] = js.native
  def validate(request: Key, body: ValidateConsumerConfigRequest): Request[ValidateConsumerConfigResponse] = js.native
}
