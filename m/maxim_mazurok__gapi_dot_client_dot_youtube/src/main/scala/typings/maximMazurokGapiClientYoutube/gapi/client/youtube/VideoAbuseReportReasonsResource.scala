package typings.maximMazurokGapiClientYoutube.gapi.client.youtube

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientYoutube.anon.CallbackFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VideoAbuseReportReasonsResource extends js.Object {
  
  /** Retrieves a list of resources, possibly filtered. */
  def list(): Request[VideoAbuseReportReasonListResponse] = js.native
  def list(request: CallbackFields): Request[VideoAbuseReportReasonListResponse] = js.native
}
