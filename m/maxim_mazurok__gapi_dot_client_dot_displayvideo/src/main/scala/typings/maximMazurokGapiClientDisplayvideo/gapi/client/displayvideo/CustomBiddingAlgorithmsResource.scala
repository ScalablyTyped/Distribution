package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientDisplayvideo.anon.CustomBiddingAlgorithmId
import typings.maximMazurokGapiClientDisplayvideo.anon.PartnerIdPrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomBiddingAlgorithmsResource extends js.Object {
  
  /** Gets a custom bidding algorithm. */
  def get(): Request[CustomBiddingAlgorithm] = js.native
  def get(request: CustomBiddingAlgorithmId): Request[CustomBiddingAlgorithm] = js.native
  
  /** Lists custom bidding algorithms that are accessible to the current user and can be used in bidding stratgies. The order is defined by the order_by parameter. */
  def list(): Request[ListCustomBiddingAlgorithmsResponse] = js.native
  def list(request: PartnerIdPrettyPrint): Request[ListCustomBiddingAlgorithmsResponse] = js.native
}
