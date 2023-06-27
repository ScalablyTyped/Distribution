package typings.officeJsPreview.Office

import typings.officeJsPreview.Office.MailboxEnums.DelegatePermissions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the properties of an appointment or message in a shared folder or shared mailbox.
  *
  * For more information on how this object is used, see
  * {@link https://learn.microsoft.com/office/dev/add-ins/outlook/delegate-access | Enable shared folders and shared mailbox scenarios in an Outlook add-in}.
  *
  * @remarks
  * [Api set: Mailbox 1.8 for shared folder support, Mailbox 1.13 for shared mailbox support]
  *
  * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: **read item**
  *
  * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose or Read
  */
trait SharedProperties extends StObject {
  
  /**
    * The permissions that the delegate has on a shared folder, or the user has on a shared mailbox.
    */
  var delegatePermissions: DelegatePermissions
  
  /**
    * The email address of the owner of a shared item.
    */
  var owner: String
  
  /**
    * The location of the owner's mailbox for the delegate's access. This location may differ based on the Outlook client.
    *
    * Use with `targetRestUrl` to construct the REST operation's URL.
    *
    * Example usage: `targetRestUrl + "/{api_version}/users/" + targetMailbox + "/{REST_operation}"`
    */
  var targetMailbox: String
  
  /**
    * The REST API's base URL (currently https://outlook.office.com/api).
    *
    * Use with `targetMailbox` to construct the REST operation's URL.
    *
    * Example usage: `targetRestUrl + "/{api_version}/users/" + targetMailbox + "/{REST_operation}"`
    */
  var targetRestUrl: String
}
object SharedProperties {
  
  inline def apply(
    delegatePermissions: DelegatePermissions,
    owner: String,
    targetMailbox: String,
    targetRestUrl: String
  ): SharedProperties = {
    val __obj = js.Dynamic.literal(delegatePermissions = delegatePermissions.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], targetMailbox = targetMailbox.asInstanceOf[js.Any], targetRestUrl = targetRestUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[SharedProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SharedProperties] (val x: Self) extends AnyVal {
    
    inline def setDelegatePermissions(value: DelegatePermissions): Self = StObject.set(x, "delegatePermissions", value.asInstanceOf[js.Any])
    
    inline def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setTargetMailbox(value: String): Self = StObject.set(x, "targetMailbox", value.asInstanceOf[js.Any])
    
    inline def setTargetRestUrl(value: String): Self = StObject.set(x, "targetRestUrl", value.asInstanceOf[js.Any])
  }
}
