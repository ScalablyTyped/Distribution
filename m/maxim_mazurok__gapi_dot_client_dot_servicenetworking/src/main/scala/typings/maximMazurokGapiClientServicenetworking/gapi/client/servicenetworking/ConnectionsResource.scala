package typings.maximMazurokGapiClientServicenetworking.gapi.client.servicenetworking

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientServicenetworking.anon.Fields
import typings.maximMazurokGapiClientServicenetworking.anon.Force
import typings.maximMazurokGapiClientServicenetworking.anon.Key
import typings.maximMazurokGapiClientServicenetworking.anon.Name
import typings.maximMazurokGapiClientServicenetworking.anon.Network
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConnectionsResource extends StObject {
  
  /**
    * Creates a private connection that establishes a VPC Network Peering connection to a VPC network in the service producer's organization. The administrator of the service consumer's
    * VPC network invokes this method. The administrator must assign one or more allocated IP ranges for provisioning subnetworks in the service producer's VPC network. This connection is
    * used for all supported services in the service producer's organization, so it only needs to be invoked once.
    */
  def create(request: Fields): Request[Operation] = js.native
  def create(request: Key, body: Connection): Request[Operation] = js.native
  
  /** List the private connections that are configured in a service consumer's VPC network. */
  def list(): Request[ListConnectionsResponse] = js.native
  def list(request: Network): Request[ListConnectionsResponse] = js.native
  
  /** Updates the allocated ranges that are assigned to a connection. */
  def patch(request: Force): Request[Operation] = js.native
  def patch(request: Name, body: Connection): Request[Operation] = js.native
}
