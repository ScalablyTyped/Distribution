package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.admin
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.maintain
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.read
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.triage
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.write
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Expired extends StObject {
  
  /**
    * Format: date-time
    * @example 2016-06-13T14:52:50-05:00
    */
  var created_at: String
  
  /** @description Whether or not the invitation has expired */
  var expired: js.UndefOr[Boolean] = js.undefined
  
  /** @example https://github.com/octocat/Hello-World/invitations */
  var html_url: String
  
  /**
    * @description Unique identifier of the repository invitation.
    * @example 42
    */
  var id: Double
  
  var invitee: Avatarurl | Null
  
  var inviter: Avatarurl | Null
  
  var node_id: String
  
  /**
    * @description The permission associated with the invitation.
    * @example read
    * @enum {string}
    */
  var permissions: read | write | admin | triage | maintain
  
  var repository: Branchesurl
  
  /**
    * @description URL for the repository invitation
    * @example https://api.github.com/user/repository-invitations/1
    */
  var url: String
}
object Expired {
  
  inline def apply(
    created_at: String,
    html_url: String,
    id: Double,
    node_id: String,
    permissions: read | write | admin | triage | maintain,
    repository: Branchesurl,
    url: String
  ): Expired = {
    val __obj = js.Dynamic.literal(created_at = created_at.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], permissions = permissions.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], invitee = null, inviter = null)
    __obj.asInstanceOf[Expired]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Expired] (val x: Self) extends AnyVal {
    
    inline def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    inline def setExpired(value: Boolean): Self = StObject.set(x, "expired", value.asInstanceOf[js.Any])
    
    inline def setExpiredUndefined: Self = StObject.set(x, "expired", js.undefined)
    
    inline def setHtml_url(value: String): Self = StObject.set(x, "html_url", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setInvitee(value: Avatarurl): Self = StObject.set(x, "invitee", value.asInstanceOf[js.Any])
    
    inline def setInviteeNull: Self = StObject.set(x, "invitee", null)
    
    inline def setInviter(value: Avatarurl): Self = StObject.set(x, "inviter", value.asInstanceOf[js.Any])
    
    inline def setInviterNull: Self = StObject.set(x, "inviter", null)
    
    inline def setNode_id(value: String): Self = StObject.set(x, "node_id", value.asInstanceOf[js.Any])
    
    inline def setPermissions(value: read | write | admin | triage | maintain): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
    
    inline def setRepository(value: Branchesurl): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
