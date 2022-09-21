package typings.maximMazurokGapiClientNotebooks.gapi.client.notebooks

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientNotebooks.anon.Callback
import typings.maximMazurokGapiClientNotebooks.anon.PageSize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocationsResource extends StObject {
  
  var environments: EnvironmentsResource = js.native
  
  var executions: ExecutionsResource = js.native
  
  /** Gets information about a location. */
  def get(): Request[Location] = js.native
  def get(request: Callback): Request[Location] = js.native
  
  var instances: InstancesResource = js.native
  
  /** Lists information about the supported locations for this service. */
  def list(): Request[ListLocationsResponse] = js.native
  def list(request: PageSize): Request[ListLocationsResponse] = js.native
  
  var operations: OperationsResource = js.native
  
  var runtimes: RuntimesResource = js.native
  
  var schedules: SchedulesResource = js.native
}
