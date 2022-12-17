package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.admin
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.billing_manager
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.direct_member
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Email extends StObject {
  
  /** @description **Required unless you provide `invitee_id`**. Email address of the person you are inviting, which can be an existing GitHub user. */
  var email: js.UndefOr[String] = js.undefined
  
  /** @description **Required unless you provide `email`**. GitHub user ID for the person you are inviting. */
  var invitee_id: js.UndefOr[Double] = js.undefined
  
  /**
    * @description The role for the new member.
    * \* `admin` - Organization owners with full administrative rights to the organization and complete access to all repositories and teams.
    * \* `direct_member` - Non-owner organization members with ability to see other members and join teams by invitation.
    * \* `billing_manager` - Non-owner organization members with ability to manage the billing settings of your organization.
    * @default direct_member
    * @enum {string}
    */
  var role: js.UndefOr[admin | direct_member | billing_manager] = js.undefined
  
  /** @description Specify IDs for the teams you want to invite new members to. */
  var team_ids: js.UndefOr[js.Array[Double]] = js.undefined
}
object Email {
  
  inline def apply(): Email = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Email]
  }
  
  extension [Self <: Email](x: Self) {
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setInvitee_id(value: Double): Self = StObject.set(x, "invitee_id", value.asInstanceOf[js.Any])
    
    inline def setInvitee_idUndefined: Self = StObject.set(x, "invitee_id", js.undefined)
    
    inline def setRole(value: admin | direct_member | billing_manager): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    
    inline def setTeam_ids(value: js.Array[Double]): Self = StObject.set(x, "team_ids", value.asInstanceOf[js.Any])
    
    inline def setTeam_idsUndefined: Self = StObject.set(x, "team_ids", js.undefined)
    
    inline def setTeam_idsVarargs(value: Double*): Self = StObject.set(x, "team_ids", js.Array(value*))
  }
}
