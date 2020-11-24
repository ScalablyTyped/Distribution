package typings.maximMazurokGapiClientWebfonts.gapi.client.webfonts

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientWebfonts.anon.Accesstoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebfontsResource extends js.Object {
  
  /** Retrieves the list of fonts currently served by the Google Fonts Developer API. */
  def list(): Request[WebfontList] = js.native
  def list(request: Accesstoken): Request[WebfontList] = js.native
}
