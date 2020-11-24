package typings.maximMazurokGapiClientRun.gapi.client.run

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientRun.anon.Alt
import typings.maximMazurokGapiClientRun.anon.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConfigurationsResource extends js.Object {
  
  /** Get information about a configuration. */
  def get(): Request[Configuration] = js.native
  def get(request: Alt): Request[Configuration] = js.native
  
  /** List configurations. */
  def list(): Request[ListConfigurationsResponse] = js.native
  def list(request: Callback): Request[ListConfigurationsResponse] = js.native
}
