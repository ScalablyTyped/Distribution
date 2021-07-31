package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.`0`
import typings.octokitTypes.octokitTypesStrings.collaborators_only
import typings.octokitTypes.octokitTypesStrings.contributors_only
import typings.octokitTypes.octokitTypesStrings.existing_users
import typings.octokitTypes.octokitTypesStrings.sombra
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InteractionsSetRestrictionsForRepoEndpoint
  extends StObject
     with RequiredPreview[sombra] {
  
  /**
    * Specifies the group of GitHub users who can comment, open issues, or create pull requests for the given repository. Must be one of: `existing_users`, `contributors_only`, or `collaborators_only`.
    */
  var limit: existing_users | contributors_only | collaborators_only
  
  var owner: String
  
  var repo: String
}
object InteractionsSetRestrictionsForRepoEndpoint {
  
  @scala.inline
  def apply(
    limit: existing_users | contributors_only | collaborators_only,
    mediaType: `0`[sombra],
    owner: String,
    repo: String
  ): InteractionsSetRestrictionsForRepoEndpoint = {
    val __obj = js.Dynamic.literal(limit = limit.asInstanceOf[js.Any], mediaType = mediaType.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[InteractionsSetRestrictionsForRepoEndpoint]
  }
  
  @scala.inline
  implicit class InteractionsSetRestrictionsForRepoEndpointMutableBuilder[Self <: InteractionsSetRestrictionsForRepoEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLimit(value: existing_users | contributors_only | collaborators_only): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
  }
}
