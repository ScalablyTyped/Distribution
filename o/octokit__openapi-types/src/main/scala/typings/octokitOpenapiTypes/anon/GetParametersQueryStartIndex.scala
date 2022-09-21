package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersQueryStartIndex extends StObject {
  
  /**
    * **Note:** The SCIM API endpoints for enterprise accounts are currently in beta and are subject to change.
    *
    * Retrieves a paginated list of all provisioned enterprise members, including pending invitations.
    *
    * When a user with a SAML-provisioned external identity leaves (or is removed from) an enterprise, the account's metadata is immediately removed. However, the returned list of user accounts might not always match the organization or enterprise member list you see on GitHub. This can happen in certain cases where an external identity associated with an organization will not match an organization member:
    *   - When a user with a SCIM-provisioned external identity is removed from an enterprise, the account's metadata is preserved to allow the user to re-join the organization in the future.
    *   - When inviting a user to join an organization, you can expect to see their external identity in the results before they accept the invitation, or if the invitation is cancelled (or never accepted).
    *   - When a user is invited over SCIM, an external identity is created that matches with the invitee's email address. However, this identity is only linked to a user account when the user accepts the invitation by going through SAML SSO.
    *
    * The returned list of external identities can include an entry for a `null` user. These are unlinked SAML identities that are created when a user goes through the following Single Sign-On (SSO) process but does not sign in to their GitHub account after completing SSO:
    *
    * 1. The user is granted access by the IdP and is not a member of the GitHub enterprise.
    *
    * 1. The user attempts to access the GitHub enterprise and initiates the SAML SSO process, and is not currently signed in to their GitHub account.
    *
    * 1. After successfully authenticating with the SAML SSO IdP, the `null` external identity entry is created and the user is prompted to sign in to their GitHub account:
    *    - If the user signs in, their GitHub account is linked to this entry.
    *    - If the user does not sign in (or does not create a new account when prompted), they are not added to the GitHub enterprise, and the external identity `null` entry remains in place.
    */
  var get: ParametersQueryStartIndex
  
  /**
    * **Note:** The SCIM API endpoints for enterprise accounts are currently in beta and are subject to change.
    *
    * Provision enterprise membership for a user, and send organization invitation emails to the email address.
    *
    * You can optionally include the groups a user will be invited to join. If you do not provide a list of `groups`, the user is provisioned for the enterprise, but no organization invitation emails will be sent.
    */
  var post: RequestBodyContentApplicationjsonEmails
}
object GetParametersQueryStartIndex {
  
  inline def apply(get: ParametersQueryStartIndex, post: RequestBodyContentApplicationjsonEmails): GetParametersQueryStartIndex = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersQueryStartIndex]
  }
  
  extension [Self <: GetParametersQueryStartIndex](x: Self) {
    
    inline def setGet(value: ParametersQueryStartIndex): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPost(value: RequestBodyContentApplicationjsonEmails): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
