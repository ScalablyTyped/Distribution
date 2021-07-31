package typings.maximMazurokGapiClientMl.gapi.client.ml

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientMl.anon.Alt
import typings.maximMazurokGapiClientMl.anon.PageToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocationsResource extends StObject {
  
  /** Get the complete list of CMLE capabilities in a location, along with their location-specific properties. */
  def get(): Request[GoogleCloudMlV1Location] = js.native
  def get(request: Alt): Request[GoogleCloudMlV1Location] = js.native
  
  /** List all locations that provides at least one type of CMLE capability. */
  def list(): Request[GoogleCloudMlV1ListLocationsResponse] = js.native
  def list(request: PageToken): Request[GoogleCloudMlV1ListLocationsResponse] = js.native
  
  var operations: OperationsResource = js.native
  
  var studies: StudiesResource = js.native
}
