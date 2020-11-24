package typings.maximMazurokGapiClientSearchconsole.gapi.client.searchconsole

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientSearchconsole.anon.Key
import typings.maximMazurokGapiClientSearchconsole.anon.Oauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MobileFriendlyTestResource extends js.Object {
  
  def run(request: Key, body: RunMobileFriendlyTestRequest): Request[RunMobileFriendlyTestResponse] = js.native
  /** Runs Mobile-Friendly Test for a given URL. */
  def run(request: Oauthtoken): Request[RunMobileFriendlyTestResponse] = js.native
}
