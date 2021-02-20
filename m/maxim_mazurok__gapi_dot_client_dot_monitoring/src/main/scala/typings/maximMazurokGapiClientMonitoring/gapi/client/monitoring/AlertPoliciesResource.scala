package typings.maximMazurokGapiClientMonitoring.gapi.client.monitoring

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientMonitoring.anon.Accesstoken
import typings.maximMazurokGapiClientMonitoring.anon.Alt
import typings.maximMazurokGapiClientMonitoring.anon.Callback
import typings.maximMazurokGapiClientMonitoring.anon.Fields
import typings.maximMazurokGapiClientMonitoring.anon.Key
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AlertPoliciesResource extends StObject {
  
  /** Creates a new alerting policy. */
  def create(request: Accesstoken): Request[AlertPolicy] = js.native
  def create(request: Alt, body: AlertPolicy): Request[AlertPolicy] = js.native
  
  /** Deletes an alerting policy. */
  def delete(): Request[js.Object] = js.native
  def delete(request: Alt): Request[js.Object] = js.native
  
  /** Gets a single alerting policy. */
  def get(): Request[AlertPolicy] = js.native
  def get(request: Alt): Request[AlertPolicy] = js.native
  
  /** Lists the existing alerting policies for the workspace. */
  def list(): Request[ListAlertPoliciesResponse] = js.native
  def list(request: Callback): Request[ListAlertPoliciesResponse] = js.native
  
  /**
    * Updates an alerting policy. You can either replace the entire policy with a new one or replace only certain fields in the current alerting policy by specifying the fields to be
    * updated via updateMask. Returns the updated alerting policy.
    */
  def patch(request: Fields): Request[AlertPolicy] = js.native
  def patch(request: Key, body: AlertPolicy): Request[AlertPolicy] = js.native
}
