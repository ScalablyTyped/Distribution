package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientDisplayvideo.anon.CallbackCustomBiddingAlgorithmId
import typings.maximMazurokGapiClientDisplayvideo.anon.CustomBiddingAlgorithmId
import typings.maximMazurokGapiClientDisplayvideo.anon.CustomBiddingAlgorithmIdFields
import typings.maximMazurokGapiClientDisplayvideo.anon.CustomBiddingScriptId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScriptsResource extends StObject {
  
  def create(request: CallbackCustomBiddingAlgorithmId, body: CustomBiddingScript): Request[CustomBiddingScript] = js.native
  /** Creates a new custom bidding script. Returns the newly created script if successful. */
  def create(request: CustomBiddingAlgorithmId): Request[CustomBiddingScript] = js.native
  
  /** Gets a custom bidding script. */
  def get(): Request[CustomBiddingScript] = js.native
  def get(request: CustomBiddingScriptId): Request[CustomBiddingScript] = js.native
  
  /** Lists custom bidding scripts that belong to the given algorithm. The order is defined by the order_by parameter. */
  def list(): Request[ListCustomBiddingScriptsResponse] = js.native
  def list(request: CustomBiddingAlgorithmIdFields): Request[ListCustomBiddingScriptsResponse] = js.native
}
