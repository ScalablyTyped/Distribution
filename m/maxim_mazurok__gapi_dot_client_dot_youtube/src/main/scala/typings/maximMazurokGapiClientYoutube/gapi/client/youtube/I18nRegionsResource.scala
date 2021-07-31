package typings.maximMazurokGapiClientYoutube.gapi.client.youtube

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientYoutube.anon.CallbackFields
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// tslint:disable-next-line:interface-name
@js.native
trait I18nRegionsResource extends StObject {
  
  /** Retrieves a list of resources, possibly filtered. */
  def list(): Request[I18nRegionListResponse] = js.native
  def list(request: CallbackFields): Request[I18nRegionListResponse] = js.native
}
