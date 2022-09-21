package typings.maximMazurokGapiClientNotebooks.gapi.client.notebooks

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientNotebooks.anon.Callback
import typings.maximMazurokGapiClientNotebooks.anon.FieldsKeyName
import typings.maximMazurokGapiClientNotebooks.anon.Filter
import typings.maximMazurokGapiClientNotebooks.anon.KeyOauthtoken
import typings.maximMazurokGapiClientNotebooks.anon.ScheduleId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchedulesResource extends StObject {
  
  def create(request: KeyOauthtoken, body: Schedule): Request[Operation] = js.native
  /** Creates a new Scheduled Notebook in a given project and location. */
  def create(request: ScheduleId): Request[Operation] = js.native
  
  /** Deletes schedule and all underlying jobs */
  def delete(): Request[Operation] = js.native
  def delete(request: Callback): Request[Operation] = js.native
  
  /** Gets details of schedule */
  def get(): Request[Schedule] = js.native
  def get(request: Callback): Request[Schedule] = js.native
  
  /** Lists schedules in a given project and location. */
  def list(): Request[ListSchedulesResponse] = js.native
  def list(request: Filter): Request[ListSchedulesResponse] = js.native
  
  def trigger(request: Callback, body: TriggerScheduleRequest): Request[Operation] = js.native
  /** Triggers execution of an existing schedule. */
  def trigger(request: FieldsKeyName): Request[Operation] = js.native
}
