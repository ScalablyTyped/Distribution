package typings.maximMazurokGapiClientRealtimebidding.gapi.client.realtimebidding

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientRealtimebidding.anon.Accesstoken
import typings.maximMazurokGapiClientRealtimebidding.anon.Alt
import typings.maximMazurokGapiClientRealtimebidding.anon.Callback
import typings.maximMazurokGapiClientRealtimebidding.anon.Fields
import typings.maximMazurokGapiClientRealtimebidding.anon.Key
import typings.maximMazurokGapiClientRealtimebidding.anon.Name
import typings.maximMazurokGapiClientRealtimebidding.anon.Oauthtoken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreativesResource extends StObject {
  
  def create(request: Callback, body: Creative): Request[Creative] = js.native
  /** Creates a creative. */
  def create(request: Fields): Request[Creative] = js.native
  
  /** Gets a creative. */
  def get(): Request[Creative] = js.native
  def get(request: Key): Request[Creative] = js.native
  
  /** Lists creatives. */
  def list(): Request[ListCreativesResponse] = js.native
  def list(request: Accesstoken): Request[ListCreativesResponse] = js.native
  
  /** Updates a creative. */
  def patch(request: Name): Request[Creative] = js.native
  def patch(request: Oauthtoken, body: Creative): Request[Creative] = js.native
  
  /**
    * Watches all creatives pertaining to a bidder. It is sufficient to invoke this endpoint once per bidder. A Pub/Sub topic will be created and notifications will be pushed to the topic
    * when any of the bidder's creatives change status. All of the bidder's service accounts will have access to read from the topic. Subsequent invocations of this method will return the
    * existing Pub/Sub configuration.
    */
  def watch(request: Alt): Request[WatchCreativesResponse] = js.native
  def watch(request: Callback, body: WatchCreativesRequest): Request[WatchCreativesResponse] = js.native
}
