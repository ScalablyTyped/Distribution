package typings.maximMazurokGapiClientSiteverification.gapi.client.siteverification

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientSiteverification.anon.Alt
import typings.maximMazurokGapiClientSiteverification.anon.Fields
import typings.maximMazurokGapiClientSiteverification.anon.Id
import typings.maximMazurokGapiClientSiteverification.anon.Key
import typings.maximMazurokGapiClientSiteverification.anon.Oauthtoken
import typings.maximMazurokGapiClientSiteverification.anon.PrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebResourceResource extends js.Object {
  
  /** Relinquish ownership of a website or domain. */
  def delete(): Request[Unit] = js.native
  def delete(request: Alt): Request[Unit] = js.native
  
  /** Get the most current data for a website or domain. */
  def get(): Request[SiteVerificationWebResourceResource] = js.native
  def get(request: Alt): Request[SiteVerificationWebResourceResource] = js.native
  
  /** Get a verification token for placing on a website or domain. */
  def getToken(request: Fields): Request[SiteVerificationWebResourceGettokenResponse] = js.native
  def getToken(request: Key, body: SiteVerificationWebResourceGettokenRequest): Request[SiteVerificationWebResourceGettokenResponse] = js.native
  
  /** Attempt verification of a website or domain. */
  def insert(request: Oauthtoken): Request[SiteVerificationWebResourceResource] = js.native
  def insert(request: PrettyPrint, body: SiteVerificationWebResourceResource): Request[SiteVerificationWebResourceResource] = js.native
  
  /** Get the list of your verified websites and domains. */
  def list(): Request[SiteVerificationWebResourceListResponse] = js.native
  def list(request: Key): Request[SiteVerificationWebResourceListResponse] = js.native
  
  def patch(request: Alt, body: SiteVerificationWebResourceResource): Request[SiteVerificationWebResourceResource] = js.native
  /** Modify the list of owners for your website or domain. This method supports patch semantics. */
  def patch(request: Id): Request[SiteVerificationWebResourceResource] = js.native
  
  def update(request: Alt, body: SiteVerificationWebResourceResource): Request[SiteVerificationWebResourceResource] = js.native
  /** Modify the list of owners for your website or domain. */
  def update(request: Id): Request[SiteVerificationWebResourceResource] = js.native
}
