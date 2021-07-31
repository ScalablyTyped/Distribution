package typings.maximMazurokGapiClientServicenetworking.gapi.client.servicenetworking

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientServicenetworking.anon.Key
import typings.maximMazurokGapiClientServicenetworking.anon.Oauthtoken
import typings.maximMazurokGapiClientServicenetworking.anon.Parent
import typings.maximMazurokGapiClientServicenetworking.anon.PrettyPrint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DnsRecordSetsResource extends StObject {
  
  def add(request: Key, body: AddDnsRecordSetRequest): Request[Operation] = js.native
  /** Service producers can use this method to add DNS record sets to private DNS zones in the shared producer host project. */
  def add(request: Oauthtoken): Request[Operation] = js.native
  
  def remove(request: Key, body: RemoveDnsRecordSetRequest): Request[Operation] = js.native
  /** Service producers can use this method to remove DNS record sets from private DNS zones in the shared producer host project. */
  def remove(request: Parent): Request[Operation] = js.native
  
  def update(request: Key, body: UpdateDnsRecordSetRequest): Request[Operation] = js.native
  /** Service producers can use this method to update DNS record sets from private DNS zones in the shared producer host project. */
  def update(request: PrettyPrint): Request[Operation] = js.native
}
