package typings.maximMazurokGapiClientRealtimebidding.gapi.client.realtimebidding

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientRealtimebidding.anon.PageToken
import typings.maximMazurokGapiClientRealtimebidding.anon.PrettyPrint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BiddersResource extends StObject {
  
  var creatives: CreativesResource = js.native
  
  var endpoints: EndpointsResource = js.native
  
  /** Gets a bidder account by its name. */
  def get(): Request[Bidder] = js.native
  def get(request: PrettyPrint): Request[Bidder] = js.native
  
  /** Lists all the bidder accounts that belong to the caller. */
  def list(): Request[ListBiddersResponse] = js.native
  def list(request: PageToken): Request[ListBiddersResponse] = js.native
  
  var pretargetingConfigs: PretargetingConfigsResource = js.native
  
  var publisherConnections: PublisherConnectionsResource = js.native
}
