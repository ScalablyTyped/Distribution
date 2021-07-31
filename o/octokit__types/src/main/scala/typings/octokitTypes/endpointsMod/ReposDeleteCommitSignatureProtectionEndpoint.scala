package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.`0`
import typings.octokitTypes.octokitTypesStrings.zzzax
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReposDeleteCommitSignatureProtectionEndpoint
  extends StObject
     with RequiredPreview[zzzax] {
  
  var branch: String
  
  var owner: String
  
  var repo: String
}
object ReposDeleteCommitSignatureProtectionEndpoint {
  
  @scala.inline
  def apply(branch: String, mediaType: `0`[zzzax], owner: String, repo: String): ReposDeleteCommitSignatureProtectionEndpoint = {
    val __obj = js.Dynamic.literal(branch = branch.asInstanceOf[js.Any], mediaType = mediaType.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposDeleteCommitSignatureProtectionEndpoint]
  }
  
  @scala.inline
  implicit class ReposDeleteCommitSignatureProtectionEndpointMutableBuilder[Self <: ReposDeleteCommitSignatureProtectionEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBranch(value: String): Self = StObject.set(x, "branch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
  }
}
