package typings.maximMazurokGapiClientGmail.gapi.client.gmail

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientGmail.anon.Alt
import typings.maximMazurokGapiClientGmail.anon.DelegateEmail
import typings.maximMazurokGapiClientGmail.anon.Xgafv
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DelegatesResource extends StObject {
  
  def create(request: Alt, body: Delegate): Request[Delegate] = js.native
  /**
    * Adds a delegate with its verification status set directly to `accepted`, without sending any verification email. The delegate user must be a member of the same G Suite organization
    * as the delegator user. Gmail imposes limitations on the number of delegates and delegators each user in a G Suite organization can have. These limits depend on your organization,
    * but in general each user can have up to 25 delegates and up to 10 delegators. Note that a delegate user must be referred to by their primary email address, and not an email alias.
    * Also note that when a new delegate is created, there may be up to a one minute delay before the new delegate is available for use. This method is only available to service account
    * clients that have been delegated domain-wide authority.
    */
  def create(request: Xgafv): Request[Delegate] = js.native
  
  /**
    * Removes the specified delegate (which can be of any verification status), and revokes any verification that may have been required for using it. Note that a delegate user must be
    * referred to by their primary email address, and not an email alias. This method is only available to service account clients that have been delegated domain-wide authority.
    */
  def delete(): Request[Unit] = js.native
  def delete(request: DelegateEmail): Request[Unit] = js.native
  
  /**
    * Gets the specified delegate. Note that a delegate user must be referred to by their primary email address, and not an email alias. This method is only available to service account
    * clients that have been delegated domain-wide authority.
    */
  def get(): Request[Delegate] = js.native
  def get(request: DelegateEmail): Request[Delegate] = js.native
  
  /** Lists the delegates for the specified account. This method is only available to service account clients that have been delegated domain-wide authority. */
  def list(): Request[ListDelegatesResponse] = js.native
  def list(request: Alt): Request[ListDelegatesResponse] = js.native
}
