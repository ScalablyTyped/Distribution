package typings.maximMazurokGapiClientMonitoring.gapi.client.monitoring

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientMonitoring.anon.Callback
import typings.maximMazurokGapiClientMonitoring.anon.FieldsFilter
import typings.maximMazurokGapiClientMonitoring.anon.KeyOauthtoken
import typings.maximMazurokGapiClientMonitoring.anon.NameOauthtoken
import typings.maximMazurokGapiClientMonitoring.anon.Oauthtoken
import typings.maximMazurokGapiClientMonitoring.anon.ServiceLevelObjectiveId
import typings.maximMazurokGapiClientMonitoring.anon.View
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServiceLevelObjectivesResource extends StObject {
  
  def create(request: KeyOauthtoken, body: ServiceLevelObjective): Request[ServiceLevelObjective] = js.native
  /** Create a ServiceLevelObjective for the given Service. */
  def create(request: ServiceLevelObjectiveId): Request[ServiceLevelObjective] = js.native
  
  /** Delete the given ServiceLevelObjective. */
  def delete(): Request[js.Object] = js.native
  def delete(request: Callback): Request[js.Object] = js.native
  
  /** Get a ServiceLevelObjective by name. */
  def get(): Request[ServiceLevelObjective] = js.native
  def get(request: View): Request[ServiceLevelObjective] = js.native
  
  /** List the ServiceLevelObjectives for the given Service. */
  def list(): Request[ListServiceLevelObjectivesResponse] = js.native
  def list(request: FieldsFilter): Request[ListServiceLevelObjectivesResponse] = js.native
  
  /** Update the given ServiceLevelObjective. */
  def patch(request: NameOauthtoken): Request[ServiceLevelObjective] = js.native
  def patch(request: Oauthtoken, body: ServiceLevelObjective): Request[ServiceLevelObjective] = js.native
}
