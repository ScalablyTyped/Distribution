package typings.maximMazurokGapiClientYoutubereporting.gapi.client.youtubereporting

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientYoutubereporting.anon.Accesstoken
import typings.maximMazurokGapiClientYoutubereporting.anon.Alt
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReportsResource extends StObject {
  
  /** Gets the metadata of a specific report. */
  def get(): Request[Report] = js.native
  def get(request: Accesstoken): Request[Report] = js.native
  
  /** Lists reports created by a specific job. Returns NOT_FOUND if the job does not exist. */
  def list(): Request[ListReportsResponse] = js.native
  def list(request: Alt): Request[ListReportsResponse] = js.native
}
