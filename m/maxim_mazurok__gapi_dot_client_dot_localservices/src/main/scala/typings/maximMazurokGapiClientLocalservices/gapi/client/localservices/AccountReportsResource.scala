package typings.maximMazurokGapiClientLocalservices.gapi.client.localservices

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientLocalservices.anon.Accesstoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccountReportsResource extends js.Object {
  
  /**
    * Get account reports containing aggregate account data of all linked GLS accounts. Caller needs to provide their manager customer id and the associated auth credential that allows
    * them read permissions on their linked accounts.
    */
  def search(): Request[GoogleAdsHomeservicesLocalservicesV1SearchAccountReportsResponse] = js.native
  def search(request: Accesstoken): Request[GoogleAdsHomeservicesLocalservicesV1SearchAccountReportsResponse] = js.native
}
