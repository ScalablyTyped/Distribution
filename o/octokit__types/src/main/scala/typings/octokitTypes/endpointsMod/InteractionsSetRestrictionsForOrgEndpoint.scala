package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.`4`
import typings.octokitTypes.octokitTypesStrings.collaborators_only
import typings.octokitTypes.octokitTypesStrings.contributors_only
import typings.octokitTypes.octokitTypesStrings.existing_users
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  org :string,   limit :'existing_users' | 'contributors_only' | 'collaborators_only'} & @octokit/types.@octokit/types/dist-types/generated/Endpoints.RequiredPreview<'sombra'> */
@js.native
trait InteractionsSetRestrictionsForOrgEndpoint extends StObject {
  
  /**
    * Specifies the group of GitHub users who can comment, open issues, or create pull requests in public repositories for the given organization. Must be one of: `existing_users`, `contributors_only`, or `collaborators_only`.
    */
  var limit: existing_users | contributors_only | collaborators_only = js.native
  
  var mediaType: `4` = js.native
  
  @JSName("org")
  var org_ : String = js.native
}
object InteractionsSetRestrictionsForOrgEndpoint {
  
  @scala.inline
  def apply(limit: existing_users | contributors_only | collaborators_only, mediaType: `4`, org_ : String): InteractionsSetRestrictionsForOrgEndpoint = {
    val __obj = js.Dynamic.literal(limit = limit.asInstanceOf[js.Any], mediaType = mediaType.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[InteractionsSetRestrictionsForOrgEndpoint]
  }
  
  @scala.inline
  implicit class InteractionsSetRestrictionsForOrgEndpointMutableBuilder[Self <: InteractionsSetRestrictionsForOrgEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLimit(value: existing_users | contributors_only | collaborators_only): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaType(value: `4`): Self = StObject.set(x, "mediaType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrg_(value: String): Self = StObject.set(x, "org", value.asInstanceOf[js.Any])
  }
}
