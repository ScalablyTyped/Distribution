package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientDisplayvideo.anon.AltCallbackCustomBiddingAlgorithmId
import typings.maximMazurokGapiClientDisplayvideo.anon.CallbackCustomBiddingAlgorithmId
import typings.maximMazurokGapiClientDisplayvideo.anon.CallbackCustomBiddingAlgorithmIdFields
import typings.maximMazurokGapiClientDisplayvideo.anon.CallbackFieldsFilter
import typings.maximMazurokGapiClientDisplayvideo.anon.PrettyPrintQuotaUserUploadType
import typings.maximMazurokGapiClientDisplayvideo.anon.ResourceUploadTypeUploadprotocol
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomBiddingAlgorithmsResource extends StObject {
  
  def create(request: PrettyPrintQuotaUserUploadType, body: CustomBiddingAlgorithm): Request[CustomBiddingAlgorithm] = js.native
  /** Creates a new custom bidding algorithm. Returns the newly created custom bidding algorithm if successful. */
  def create(request: ResourceUploadTypeUploadprotocol): Request[CustomBiddingAlgorithm] = js.native
  
  /** Gets a custom bidding algorithm. */
  def get(): Request[CustomBiddingAlgorithm] = js.native
  def get(request: CallbackCustomBiddingAlgorithmId): Request[CustomBiddingAlgorithm] = js.native
  
  /** Lists custom bidding algorithms that are accessible to the current user and can be used in bidding stratgies. The order is defined by the order_by parameter. */
  def list(): Request[ListCustomBiddingAlgorithmsResponse] = js.native
  def list(request: CallbackFieldsFilter): Request[ListCustomBiddingAlgorithmsResponse] = js.native
  
  /** Updates an existing custom bidding algorithm. Returns the updated custom bidding algorithm if successful. */
  def patch(request: AltCallbackCustomBiddingAlgorithmId): Request[CustomBiddingAlgorithm] = js.native
  def patch(request: CallbackCustomBiddingAlgorithmIdFields, body: CustomBiddingAlgorithm): Request[CustomBiddingAlgorithm] = js.native
  
  var scripts: ScriptsResource = js.native
  
  /**
    * Creates a custom bidding script reference object for a script file. The resulting reference object provides a resource path to which the script file should be uploaded. This
    * reference object should be included in when creating a new custom bidding script object.
    */
  def uploadScript(): Request[CustomBiddingScriptRef] = js.native
  def uploadScript(request: CallbackCustomBiddingAlgorithmId): Request[CustomBiddingScriptRef] = js.native
}
