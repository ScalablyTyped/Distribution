package typings.maximMazurokGapiClientServicenetworking.gapi.client.servicenetworking

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientServicenetworking.anon.Key
import typings.maximMazurokGapiClientServicenetworking.anon.QuotaUser
import typings.maximMazurokGapiClientServicenetworking.anon.Resource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DnsZonesResource extends StObject {
  
  def add(request: Key, body: AddDnsZoneRequest): Request[Operation] = js.native
  /** Service producers can use this method to add private DNS zones in the shared producer host project and matching peering zones in the consumer project. */
  def add(request: QuotaUser): Request[Operation] = js.native
  
  def remove(request: Key, body: RemoveDnsZoneRequest): Request[Operation] = js.native
  /** Service producers can use this method to remove private DNS zones in the shared producer host project and matching peering zones in the consumer project. */
  def remove(request: Resource): Request[Operation] = js.native
}
