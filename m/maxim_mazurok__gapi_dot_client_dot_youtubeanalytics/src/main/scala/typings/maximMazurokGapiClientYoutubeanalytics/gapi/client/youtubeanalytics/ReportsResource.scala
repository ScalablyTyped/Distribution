package typings.maximMazurokGapiClientYoutubeanalytics.gapi.client.youtubeanalytics

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientYoutubeanalytics.anon.Currency
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReportsResource extends js.Object {
  
  /** Retrieve your YouTube Analytics reports. */
  def query(): Request[QueryResponse] = js.native
  def query(request: Currency): Request[QueryResponse] = js.native
}
