package typings.maximMazurokGapiClientSasportal.gapi.client.sasportal

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientSasportal.anon.AccesstokenAlt
import typings.maximMazurokGapiClientSasportal.anon.Name
import typings.maximMazurokGapiClientSasportal.anon.PageToken
import typings.maximMazurokGapiClientSasportal.anon.QuotaUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomersResource extends js.Object {
  
  var deployments: DeploymentsResource = js.native
  
  var devices: DevicesResource = js.native
  
  /** Returns a requested customer. */
  def get(): Request[SasPortalCustomer] = js.native
  def get(request: Name): Request[SasPortalCustomer] = js.native
  
  /** Returns a list of requested customers. */
  def list(): Request[SasPortalListCustomersResponse] = js.native
  def list(request: PageToken): Request[SasPortalListCustomersResponse] = js.native
  
  var nodes: NodesResource = js.native
  
  /** Updates an existing customer. */
  def patch(request: AccesstokenAlt): Request[SasPortalCustomer] = js.native
  def patch(request: QuotaUser, body: SasPortalCustomer): Request[SasPortalCustomer] = js.native
}
