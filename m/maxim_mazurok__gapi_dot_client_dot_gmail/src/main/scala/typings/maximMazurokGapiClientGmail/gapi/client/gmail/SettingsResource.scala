package typings.maximMazurokGapiClientGmail.gapi.client.gmail

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientGmail.anon.Alt
import typings.maximMazurokGapiClientGmail.anon.PrettyPrintQuotaUser
import typings.maximMazurokGapiClientGmail.anon.QuotaUserResource
import typings.maximMazurokGapiClientGmail.anon.ResourceUploadType
import typings.maximMazurokGapiClientGmail.anon.UploadTypeUploadprotocol
import typings.maximMazurokGapiClientGmail.anon.UploadprotocolUserId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SettingsResource extends StObject {
  
  var delegates: DelegatesResource = js.native
  
  var filters: FiltersResource = js.native
  
  var forwardingAddresses: ForwardingAddressesResource = js.native
  
  /** Gets the auto-forwarding setting for the specified account. */
  def getAutoForwarding(): Request[AutoForwarding] = js.native
  def getAutoForwarding(request: Alt): Request[AutoForwarding] = js.native
  
  /** Gets IMAP settings. */
  def getImap(): Request[ImapSettings] = js.native
  def getImap(request: Alt): Request[ImapSettings] = js.native
  
  /** Gets language settings. */
  def getLanguage(): Request[LanguageSettings] = js.native
  def getLanguage(request: Alt): Request[LanguageSettings] = js.native
  
  /** Gets POP settings. */
  def getPop(): Request[PopSettings] = js.native
  def getPop(request: Alt): Request[PopSettings] = js.native
  
  /** Gets vacation responder settings. */
  def getVacation(): Request[VacationSettings] = js.native
  def getVacation(request: Alt): Request[VacationSettings] = js.native
  
  var sendAs: SendAsResource = js.native
  
  def updateAutoForwarding(request: Alt, body: AutoForwarding): Request[AutoForwarding] = js.native
  /**
    * Updates the auto-forwarding setting for the specified account. A verified forwarding address must be specified when auto-forwarding is enabled. This method is only available to
    * service account clients that have been delegated domain-wide authority.
    */
  def updateAutoForwarding(request: PrettyPrintQuotaUser): Request[AutoForwarding] = js.native
  
  def updateImap(request: Alt, body: ImapSettings): Request[ImapSettings] = js.native
  /** Updates IMAP settings. */
  def updateImap(request: QuotaUserResource): Request[ImapSettings] = js.native
  
  def updateLanguage(request: Alt, body: LanguageSettings): Request[LanguageSettings] = js.native
  /**
    * Updates language settings. If successful, the return object contains the `displayLanguage` that was saved for the user, which may differ from the value passed into the request. This
    * is because the requested `displayLanguage` may not be directly supported by Gmail but have a close variant that is, and so the variant may be chosen and saved instead.
    */
  def updateLanguage(request: ResourceUploadType): Request[LanguageSettings] = js.native
  
  def updatePop(request: Alt, body: PopSettings): Request[PopSettings] = js.native
  /** Updates POP settings. */
  def updatePop(request: UploadTypeUploadprotocol): Request[PopSettings] = js.native
  
  def updateVacation(request: Alt, body: VacationSettings): Request[VacationSettings] = js.native
  /** Updates vacation responder settings. */
  def updateVacation(request: UploadprotocolUserId): Request[VacationSettings] = js.native
}
