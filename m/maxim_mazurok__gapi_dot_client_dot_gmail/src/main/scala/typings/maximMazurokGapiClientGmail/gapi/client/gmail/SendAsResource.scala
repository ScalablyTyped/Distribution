package typings.maximMazurokGapiClientGmail.gapi.client.gmail

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientGmail.anon.Alt
import typings.maximMazurokGapiClientGmail.anon.FieldsKey
import typings.maximMazurokGapiClientGmail.anon.KeyOauthtoken
import typings.maximMazurokGapiClientGmail.anon.OauthtokenPrettyPrint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SendAsResource extends StObject {
  
  def create(request: Alt, body: SendAs): Request[SendAs] = js.native
  /**
    * Creates a custom "from" send-as alias. If an SMTP MSA is specified, Gmail will attempt to connect to the SMTP service to validate the configuration before creating the alias. If
    * ownership verification is required for the alias, a message will be sent to the email address and the resource's verification status will be set to `pending`; otherwise, the
    * resource will be created with verification status set to `accepted`. If a signature is provided, Gmail will sanitize the HTML before saving it with the alias. This method is only
    * available to service account clients that have been delegated domain-wide authority.
    */
  def create(request: KeyOauthtoken): Request[SendAs] = js.native
  
  /**
    * Deletes the specified send-as alias. Revokes any verification that may have been required for using it. This method is only available to service account clients that have been
    * delegated domain-wide authority.
    */
  def delete(): Request[Unit] = js.native
  def delete(request: FieldsKey): Request[Unit] = js.native
  
  /** Gets the specified send-as alias. Fails with an HTTP 404 error if the specified address is not a member of the collection. */
  def get(): Request[SendAs] = js.native
  def get(request: FieldsKey): Request[SendAs] = js.native
  
  /** Lists the send-as aliases for the specified account. The result includes the primary send-as address associated with the account as well as any custom "from" aliases. */
  def list(): Request[ListSendAsResponse] = js.native
  def list(request: Alt): Request[ListSendAsResponse] = js.native
  
  def patch(request: FieldsKey, body: SendAs): Request[SendAs] = js.native
  /** Patch the specified send-as alias. */
  def patch(request: OauthtokenPrettyPrint): Request[SendAs] = js.native
  
  var smimeInfo: SmimeInfoResource = js.native
  
  def update(request: FieldsKey, body: SendAs): Request[SendAs] = js.native
  /**
    * Updates a send-as alias. If a signature is provided, Gmail will sanitize the HTML before saving it with the alias. Addresses other than the primary address for the account can only
    * be updated by service account clients that have been delegated domain-wide authority.
    */
  def update(request: OauthtokenPrettyPrint): Request[SendAs] = js.native
  
  /**
    * Sends a verification email to the specified send-as alias address. The verification status must be `pending`. This method is only available to service account clients that have been
    * delegated domain-wide authority.
    */
  def verify(): Request[Unit] = js.native
  def verify(request: FieldsKey): Request[Unit] = js.native
}
