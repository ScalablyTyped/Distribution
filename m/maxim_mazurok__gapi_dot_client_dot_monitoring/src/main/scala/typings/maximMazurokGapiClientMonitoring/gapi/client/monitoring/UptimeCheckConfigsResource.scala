package typings.maximMazurokGapiClientMonitoring.gapi.client.monitoring

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientMonitoring.anon.Alt
import typings.maximMazurokGapiClientMonitoring.anon.FieldsKey
import typings.maximMazurokGapiClientMonitoring.anon.Key
import typings.maximMazurokGapiClientMonitoring.anon.KeyName
import typings.maximMazurokGapiClientMonitoring.anon.KeyOauthtoken
import typings.maximMazurokGapiClientMonitoring.anon.Parent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UptimeCheckConfigsResource extends js.Object {
  
  def create(request: FieldsKey, body: UptimeCheckConfig): Request[UptimeCheckConfig] = js.native
  /** Creates a new Uptime check configuration. */
  def create(request: Parent): Request[UptimeCheckConfig] = js.native
  
  /**
    * Deletes an Uptime check configuration. Note that this method will fail if the Uptime check configuration is referenced by an alert policy or other dependent configs that would be
    * rendered invalid by the deletion.
    */
  def delete(): Request[js.Object] = js.native
  def delete(request: Alt): Request[js.Object] = js.native
  
  /** Gets a single Uptime check configuration. */
  def get(): Request[UptimeCheckConfig] = js.native
  def get(request: Alt): Request[UptimeCheckConfig] = js.native
  
  /** Lists the existing valid Uptime check configurations for the project (leaving out any invalid configurations). */
  def list(): Request[ListUptimeCheckConfigsResponse] = js.native
  def list(request: KeyOauthtoken): Request[ListUptimeCheckConfigsResponse] = js.native
  
  /**
    * Updates an Uptime check configuration. You can either replace the entire configuration with a new one or replace only certain fields in the current configuration by specifying the
    * fields to be updated via updateMask. Returns the updated configuration.
    */
  def patch(request: KeyName): Request[UptimeCheckConfig] = js.native
  def patch(request: Key, body: UptimeCheckConfig): Request[UptimeCheckConfig] = js.native
}
