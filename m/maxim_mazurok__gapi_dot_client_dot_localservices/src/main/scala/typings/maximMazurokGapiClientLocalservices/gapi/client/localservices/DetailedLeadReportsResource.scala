package typings.maximMazurokGapiClientLocalservices.gapi.client.localservices

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientLocalservices.anon.Accesstoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DetailedLeadReportsResource extends js.Object {
  
  /**
    * Get detailed lead reports containing leads that have been received by all linked GLS accounts. Caller needs to provide their manager customer id and the associated auth credential
    * that allows them read permissions on their linked accounts.
    */
  def search(): Request[GoogleAdsHomeservicesLocalservicesV1SearchDetailedLeadReportsResponse] = js.native
  def search(request: Accesstoken): Request[GoogleAdsHomeservicesLocalservicesV1SearchDetailedLeadReportsResponse] = js.native
}
