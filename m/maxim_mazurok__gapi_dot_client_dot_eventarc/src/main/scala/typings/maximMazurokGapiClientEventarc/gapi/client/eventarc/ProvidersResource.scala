package typings.maximMazurokGapiClientEventarc.gapi.client.eventarc

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientEventarc.anon.Callback
import typings.maximMazurokGapiClientEventarc.anon.PageSize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProvidersResource extends StObject {
  
  /** Get a single Provider. */
  def get(): Request[Provider] = js.native
  def get(request: Callback): Request[Provider] = js.native
  
  /** List providers. */
  def list(): Request[ListProvidersResponse] = js.native
  def list(request: PageSize): Request[ListProvidersResponse] = js.native
}
