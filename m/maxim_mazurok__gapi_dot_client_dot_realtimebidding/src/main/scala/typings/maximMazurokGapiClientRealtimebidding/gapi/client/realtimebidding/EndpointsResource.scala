package typings.maximMazurokGapiClientRealtimebidding.gapi.client.realtimebidding

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientRealtimebidding.anon.Oauthtoken
import typings.maximMazurokGapiClientRealtimebidding.anon.PageSize
import typings.maximMazurokGapiClientRealtimebidding.anon.PrettyPrint
import typings.maximMazurokGapiClientRealtimebidding.anon.QuotaUser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EndpointsResource extends StObject {
  
  /** Gets a bidder endpoint by its name. */
  def get(): Request[Endpoint] = js.native
  def get(request: PrettyPrint): Request[Endpoint] = js.native
  
  /** Lists all the bidder's endpoints. */
  def list(): Request[ListEndpointsResponse] = js.native
  def list(request: PageSize): Request[ListEndpointsResponse] = js.native
  
  def patch(request: Oauthtoken, body: Endpoint): Request[Endpoint] = js.native
  /** Updates a bidder's endpoint. */
  def patch(request: QuotaUser): Request[Endpoint] = js.native
}
