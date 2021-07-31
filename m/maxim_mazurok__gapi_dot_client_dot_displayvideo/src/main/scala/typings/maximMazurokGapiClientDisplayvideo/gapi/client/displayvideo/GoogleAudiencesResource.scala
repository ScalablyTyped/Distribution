package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientDisplayvideo.anon.GoogleAudienceId
import typings.maximMazurokGapiClientDisplayvideo.anon.PartnerIdPrettyPrint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleAudiencesResource extends StObject {
  
  /** Gets a Google audience. */
  def get(): Request[GoogleAudience] = js.native
  def get(request: GoogleAudienceId): Request[GoogleAudience] = js.native
  
  /** Lists Google audiences. The order is defined by the order_by parameter. */
  def list(): Request[ListGoogleAudiencesResponse] = js.native
  def list(request: PartnerIdPrettyPrint): Request[ListGoogleAudiencesResponse] = js.native
}
