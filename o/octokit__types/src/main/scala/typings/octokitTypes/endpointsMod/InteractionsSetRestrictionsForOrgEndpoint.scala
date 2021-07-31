package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.`0`
import typings.octokitTypes.octokitTypesStrings.collaborators_only
import typings.octokitTypes.octokitTypesStrings.contributors_only
import typings.octokitTypes.octokitTypesStrings.existing_users
import typings.octokitTypes.octokitTypesStrings.sombra
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InteractionsSetRestrictionsForOrgEndpoint
  extends StObject
     with RequiredPreview[sombra] {
  
  /**
    * Specifies the group of GitHub users who can comment, open issues, or create pull requests in public repositories for the given organization. Must be one of: `existing_users`, `contributors_only`, or `collaborators_only`.
    */
  var limit: existing_users | contributors_only | collaborators_only
  
  @JSName("org")
  var org_ : String
}
object InteractionsSetRestrictionsForOrgEndpoint {
  
  @scala.inline
  def apply(
    limit: existing_users | contributors_only | collaborators_only,
    mediaType: `0`[sombra],
    org_ : String
  ): InteractionsSetRestrictionsForOrgEndpoint = {
    val __obj = js.Dynamic.literal(limit = limit.asInstanceOf[js.Any], mediaType = mediaType.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[InteractionsSetRestrictionsForOrgEndpoint]
  }
  
  @scala.inline
  implicit class InteractionsSetRestrictionsForOrgEndpointMutableBuilder[Self <: InteractionsSetRestrictionsForOrgEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLimit(value: existing_users | contributors_only | collaborators_only): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrg_(value: String): Self = StObject.set(x, "org", value.asInstanceOf[js.Any])
  }
}
