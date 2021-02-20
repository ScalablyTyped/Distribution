package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Archiveurl
import typings.octokitTypes.anon.Avatarurl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReposAddCollaboratorResponseData extends StObject {
  
  var created_at: String = js.native
  
  var html_url: String = js.native
  
  var id: Double = js.native
  
  var invitee: Avatarurl = js.native
  
  var inviter: Avatarurl = js.native
  
  var permissions: String = js.native
  
  var repository: Archiveurl = js.native
  
  var url: String = js.native
}
object ReposAddCollaboratorResponseData {
  
  @scala.inline
  def apply(
    created_at: String,
    html_url: String,
    id: Double,
    invitee: Avatarurl,
    inviter: Avatarurl,
    permissions: String,
    repository: Archiveurl,
    url: String
  ): ReposAddCollaboratorResponseData = {
    val __obj = js.Dynamic.literal(created_at = created_at.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], invitee = invitee.asInstanceOf[js.Any], inviter = inviter.asInstanceOf[js.Any], permissions = permissions.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposAddCollaboratorResponseData]
  }
  
  @scala.inline
  implicit class ReposAddCollaboratorResponseDataMutableBuilder[Self <: ReposAddCollaboratorResponseData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtml_url(value: String): Self = StObject.set(x, "html_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvitee(value: Avatarurl): Self = StObject.set(x, "invitee", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInviter(value: Avatarurl): Self = StObject.set(x, "inviter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermissions(value: String): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepository(value: Archiveurl): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
