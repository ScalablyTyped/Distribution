package typings.maximMazurokGapiClientServicedirectory.gapi.client.servicedirectory

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientServicedirectory.anon.Callback
import typings.maximMazurokGapiClientServicedirectory.anon.Filter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocationsResource extends StObject {
  
  /** Gets information about a location. */
  def get(): Request[Location] = js.native
  def get(request: Callback): Request[Location] = js.native
  
  /** Lists information about the supported locations for this service. */
  def list(): Request[ListLocationsResponse] = js.native
  def list(request: Filter): Request[ListLocationsResponse] = js.native
  
  var namespaces: NamespacesResource = js.native
}
