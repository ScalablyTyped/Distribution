package typings.maximMazurokGapiClientGmail.gapi.client.gmail

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientGmail.anon.Alt
import typings.maximMazurokGapiClientGmail.anon.AltCallback
import typings.maximMazurokGapiClientGmail.anon.ForwardingEmail
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ForwardingAddressesResource extends StObject {
  
  /**
    * Creates a forwarding address. If ownership verification is required, a message will be sent to the recipient and the resource's verification status will be set to `pending`;
    * otherwise, the resource will be created with verification status set to `accepted`. This method is only available to service account clients that have been delegated domain-wide
    * authority.
    */
  def create(request: AltCallback): Request[ForwardingAddress] = js.native
  def create(request: Alt, body: ForwardingAddress): Request[ForwardingAddress] = js.native
  
  /**
    * Deletes the specified forwarding address and revokes any verification that may have been required. This method is only available to service account clients that have been delegated
    * domain-wide authority.
    */
  def delete(): Request[Unit] = js.native
  def delete(request: ForwardingEmail): Request[Unit] = js.native
  
  /** Gets the specified forwarding address. */
  def get(): Request[ForwardingAddress] = js.native
  def get(request: ForwardingEmail): Request[ForwardingAddress] = js.native
  
  /** Lists the forwarding addresses for the specified account. */
  def list(): Request[ListForwardingAddressesResponse] = js.native
  def list(request: Alt): Request[ListForwardingAddressesResponse] = js.native
}
