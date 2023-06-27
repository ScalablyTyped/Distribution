package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteParametersPathTeamidUsername extends StObject {
  
  /**
    * Remove team member (Legacy)
    * @deprecated
    * @description The "Remove team member" endpoint (described below) is deprecated.
    *
    * We recommend using the [Remove team membership for a user](https://docs.github.com/rest/reference/teams#remove-team-membership-for-a-user) endpoint instead. It allows you to remove both active and pending memberships.
    *
    * Team synchronization is available for organizations using GitHub Enterprise Cloud. For more information, see [GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    *
    * To remove a team member, the authenticated user must have 'admin' permissions to the team or be an owner of the org that the team is associated with. Removing a team member does not delete the user, it just removes them from the team.
    *
    * **Note:** When you have team synchronization set up for a team with your organization's identity provider (IdP), you will see an error if you attempt to use the API for making changes to the team's membership. If you have access to manage group membership in your IdP, you can manage GitHub team membership through your identity provider, which automatically adds and removes team members in an organization. For more information, see "[Synchronizing teams between your identity provider and GitHub](https://docs.github.com/articles/synchronizing-teams-between-your-identity-provider-and-github/)."
    */
  var delete: ParametersPathTeamidUsername
  
  /**
    * Get team member (Legacy)
    * @deprecated
    * @description The "Get team member" endpoint (described below) is deprecated.
    *
    * We recommend using the [Get team membership for a user](https://docs.github.com/rest/reference/teams#get-team-membership-for-a-user) endpoint instead. It allows you to get both active and pending memberships.
    *
    * To list members in a team, the team must be visible to the authenticated user.
    */
  var get: ParametersPathTeamidUsername
  
  /**
    * Add team member (Legacy)
    * @deprecated
    * @description The "Add team member" endpoint (described below) is deprecated.
    *
    * We recommend using the [Add or update team membership for a user](https://docs.github.com/rest/reference/teams#add-or-update-team-membership-for-a-user) endpoint instead. It allows you to invite new organization members to your teams.
    *
    * Team synchronization is available for organizations using GitHub Enterprise Cloud. For more information, see [GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    *
    * To add someone to a team, the authenticated user must be an organization owner or a team maintainer in the team they're changing. The person being added to the team must be a member of the team's organization.
    *
    * **Note:** When you have team synchronization set up for a team with your organization's identity provider (IdP), you will see an error if you attempt to use the API for making changes to the team's membership. If you have access to manage group membership in your IdP, you can manage GitHub team membership through your identity provider, which automatically adds and removes team members in an organization. For more information, see "[Synchronizing teams between your identity provider and GitHub](https://docs.github.com/articles/synchronizing-teams-between-your-identity-provider-and-github/)."
    *
    * Note that you'll need to set `Content-Length` to zero when calling out to this endpoint. For more information, see "[HTTP verbs](https://docs.github.com/rest/overview/resources-in-the-rest-api#http-verbs)."
    */
  var put: ParametersPathTeamidUsernameResponses102
}
object DeleteParametersPathTeamidUsername {
  
  inline def apply(
    delete: ParametersPathTeamidUsername,
    get: ParametersPathTeamidUsername,
    put: ParametersPathTeamidUsernameResponses102
  ): DeleteParametersPathTeamidUsername = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], put = put.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteParametersPathTeamidUsername]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteParametersPathTeamidUsername] (val x: Self) extends AnyVal {
    
    inline def setDelete(value: ParametersPathTeamidUsername): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: ParametersPathTeamidUsername): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPut(value: ParametersPathTeamidUsernameResponses102): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
  }
}
