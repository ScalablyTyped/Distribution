package typings.maximMazurokGapiClientYoutubereporting.gapi.client.youtubereporting

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientYoutubereporting.anon.IncludeSystemManaged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReportTypesResource extends js.Object {
  
  /** Lists report types. */
  def list(): Request[ListReportTypesResponse] = js.native
  def list(request: IncludeSystemManaged): Request[ListReportTypesResponse] = js.native
}
