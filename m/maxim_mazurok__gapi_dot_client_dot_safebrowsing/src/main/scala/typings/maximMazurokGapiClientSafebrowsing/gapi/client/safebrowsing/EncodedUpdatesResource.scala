package typings.maximMazurokGapiClientSafebrowsing.gapi.client.safebrowsing

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientSafebrowsing.anon.Accesstoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EncodedUpdatesResource extends js.Object {
  
  def get(): Request[FetchThreatListUpdatesResponse] = js.native
  def get(request: Accesstoken): Request[FetchThreatListUpdatesResponse] = js.native
}
