package typings.maximMazurokGapiClientGmailpostmastertools.gapi.client.gmailpostmastertools

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientGmailpostmastertools.anon.Accesstoken
import typings.maximMazurokGapiClientGmailpostmastertools.anon.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DomainsResource extends js.Object {
  
  /** Gets a specific domain registered by the client. Returns NOT_FOUND if the domain does not exist. */
  def get(): Request[Domain] = js.native
  def get(request: Accesstoken): Request[Domain] = js.native
  
  /**
    * Lists the domains that have been registered by the client. The order of domains in the response is unspecified and non-deterministic. Newly created domains will not necessarily be
    * added to the end of this list.
    */
  def list(): Request[ListDomainsResponse] = js.native
  def list(request: Callback): Request[ListDomainsResponse] = js.native
  
  var trafficStats: TrafficStatsResource = js.native
}
