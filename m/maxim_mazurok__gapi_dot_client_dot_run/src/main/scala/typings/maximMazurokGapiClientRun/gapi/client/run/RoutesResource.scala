package typings.maximMazurokGapiClientRun.gapi.client.run

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientRun.anon.Alt
import typings.maximMazurokGapiClientRun.anon.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RoutesResource extends js.Object {
  
  /** Get information about a route. */
  def get(): Request[Route] = js.native
  def get(request: Alt): Request[Route] = js.native
  
  /** List routes. */
  def list(): Request[ListRoutesResponse] = js.native
  def list(request: Callback): Request[ListRoutesResponse] = js.native
}
