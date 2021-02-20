package typings.maximMazurokGapiClientFirestore.gapi.client.firestore

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientFirestore.anon.Accesstoken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocationsResource extends StObject {
  
  /** Gets information about a location. */
  def get(): Request[Location] = js.native
  def get(request: Accesstoken): Request[Location] = js.native
  
  /** Lists information about the supported locations for this service. */
  def list(): Request[ListLocationsResponse] = js.native
  def list(request: typings.maximMazurokGapiClientFirestore.anon.Filter): Request[ListLocationsResponse] = js.native
}
