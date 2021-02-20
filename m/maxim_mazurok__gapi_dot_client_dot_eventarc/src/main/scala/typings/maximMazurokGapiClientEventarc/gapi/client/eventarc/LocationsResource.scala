package typings.maximMazurokGapiClientEventarc.gapi.client.eventarc

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientEventarc.anon.Alt
import typings.maximMazurokGapiClientEventarc.anon.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocationsResource extends StObject {
  
  /** Gets information about a location. */
  def get(): Request[Location] = js.native
  def get(request: Alt): Request[Location] = js.native
  
  /** Lists information about the supported locations for this service. */
  def list(): Request[ListLocationsResponse] = js.native
  def list(request: Callback): Request[ListLocationsResponse] = js.native
  
  var operations: OperationsResource = js.native
  
  var triggers: TriggersResource = js.native
}
