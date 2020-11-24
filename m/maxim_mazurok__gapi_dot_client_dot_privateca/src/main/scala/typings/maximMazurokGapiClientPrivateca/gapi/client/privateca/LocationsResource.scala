package typings.maximMazurokGapiClientPrivateca.gapi.client.privateca

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientPrivateca.anon.Accesstoken
import typings.maximMazurokGapiClientPrivateca.anon.Filter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocationsResource extends js.Object {
  
  var certificateAuthorities: CertificateAuthoritiesResource = js.native
  
  /** Gets information about a location. */
  def get(): Request[Location] = js.native
  def get(request: Accesstoken): Request[Location] = js.native
  
  /** Lists information about the supported locations for this service. */
  def list(): Request[ListLocationsResponse] = js.native
  def list(request: Filter): Request[ListLocationsResponse] = js.native
  
  var operations: OperationsResource = js.native
  
  var reusableConfigs: ReusableConfigsResource = js.native
}
