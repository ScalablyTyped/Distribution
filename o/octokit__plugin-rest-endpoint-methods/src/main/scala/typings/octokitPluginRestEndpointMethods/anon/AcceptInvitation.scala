package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.distTypesRequestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AcceptInvitation extends StObject {
  
  /**
    * @deprecated octokit.rest.repos.acceptInvitation() has been renamed to octokit.rest.repos.acceptInvitationForAuthenticatedUser() (2021-10-05)
    */
  def acceptInvitation(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PATCH /user/repository_invitations/{invitation_id}']['response'] */ js.Any
  ]
  def acceptInvitation(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PATCH /user/repository_invitations/{invitation_id}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PATCH /user/repository_invitations/{invitation_id}']['response'] */ js.Any
  ]
  
  def acceptInvitationForAuthenticatedUser(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PATCH /user/repository_invitations/{invitation_id}']['response'] */ js.Any
  ]
  def acceptInvitationForAuthenticatedUser(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PATCH /user/repository_invitations/{invitation_id}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PATCH /user/repository_invitations/{invitation_id}']['response'] */ js.Any
  ]
  @JSName("acceptInvitationForAuthenticatedUser")
  var acceptInvitationForAuthenticatedUser_Original: `530`
  
  /**
    * @deprecated octokit.rest.repos.acceptInvitation() has been renamed to octokit.rest.repos.acceptInvitationForAuthenticatedUser() (2021-10-05)
    */
  @JSName("acceptInvitation")
  var acceptInvitation_Original: `530`
  
  /**
    * Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    *
    * Grants the specified apps push access for this branch. Only installed GitHub Apps with `write` access to the `contents` permission can be added as authorized actors on a protected branch.
    *
    * | Type    | Description                                                                                                                                                |
    * | ------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------- |
    * | `array` | The GitHub Apps that have push access to this branch. Use the app's `slug`. **Note**: The list of users, apps, and teams in total is limited to 100 items. |
    */
  def addAppAccessRestrictions(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/branches/{branch}/protection/restrictions/apps']['response'] */ js.Any
  ]
  def addAppAccessRestrictions(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/branches/{branch}/protection/restrictions/apps']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/branches/{branch}/protection/restrictions/apps']['response'] */ js.Any
  ]
  /**
    * Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    *
    * Grants the specified apps push access for this branch. Only installed GitHub Apps with `write` access to the `contents` permission can be added as authorized actors on a protected branch.
    *
    * | Type    | Description                                                                                                                                                |
    * | ------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------- |
    * | `array` | The GitHub Apps that have push access to this branch. Use the app's `slug`. **Note**: The list of users, apps, and teams in total is limited to 100 items. |
    */
  @JSName("addAppAccessRestrictions")
  var addAppAccessRestrictions_Original: `531`
  
  /**
    * This endpoint triggers [notifications](https://docs.github.com/github/managing-subscriptions-and-notifications-on-github/about-notifications). Creating content too quickly using this endpoint may result in secondary rate limiting. See "[Secondary rate limits](https://docs.github.com/rest/overview/resources-in-the-rest-api#secondary-rate-limits)" and "[Dealing with secondary rate limits](https://docs.github.com/rest/guides/best-practices-for-integrators#dealing-with-secondary-rate-limits)" for details.
    *
    * Adding an outside collaborator may be restricted by enterprise administrators. For more information, see "[Enforcing repository management policies in your enterprise](https://docs.github.com/enterprise-cloud@latest/admin/policies/enforcing-policies-for-your-enterprise/enforcing-repository-management-policies-in-your-enterprise#enforcing-a-policy-for-inviting-outside-collaborators-to-repositories)."
    *
    * For more information on permission levels, see "[Repository permission levels for an organization](https://docs.github.com/github/setting-up-and-managing-organizations-and-teams/repository-permission-levels-for-an-organization#permission-levels-for-repositories-owned-by-an-organization)". There are restrictions on which permissions can be granted to organization members when an organization base role is in place. In this case, the permission being given must be equal to or higher than the org base permission. Otherwise, the request will fail with:
    *
    * ```
    * Cannot assign {member} permission of {role name}
    * ```
    *
    * Note that, if you choose not to pass any parameters, you'll need to set `Content-Length` to zero when calling out to this endpoint. For more information, see "[HTTP verbs](https://docs.github.com/rest/overview/resources-in-the-rest-api#http-verbs)."
    *
    * The invitee will receive a notification that they have been invited to the repository, which they must accept or decline. They may do this via the notifications page, the email they receive, or by using the [repository invitations API endpoints](https://docs.github.com/rest/reference/repos#invitations).
    *
    * **Updating an existing collaborator's permission level**
    *
    * The endpoint can also be used to change the permissions of an existing collaborator without first removing and re-adding the collaborator. To change the permissions, use the same endpoint and pass a different `permission` parameter. The response will be a `204`, with no other indication that the permission level changed.
    *
    * **Rate limits**
    *
    * You are limited to sending 50 invitations to a repository per 24 hour period. Note there is no limit if you are inviting organization members to an organization repository.
    */
  def addCollaborator(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /repos/{owner}/{repo}/collaborators/{username}']['response'] */ js.Any
  ]
  def addCollaborator(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /repos/{owner}/{repo}/collaborators/{username}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /repos/{owner}/{repo}/collaborators/{username}']['response'] */ js.Any
  ]
  /**
    * This endpoint triggers [notifications](https://docs.github.com/github/managing-subscriptions-and-notifications-on-github/about-notifications). Creating content too quickly using this endpoint may result in secondary rate limiting. See "[Secondary rate limits](https://docs.github.com/rest/overview/resources-in-the-rest-api#secondary-rate-limits)" and "[Dealing with secondary rate limits](https://docs.github.com/rest/guides/best-practices-for-integrators#dealing-with-secondary-rate-limits)" for details.
    *
    * Adding an outside collaborator may be restricted by enterprise administrators. For more information, see "[Enforcing repository management policies in your enterprise](https://docs.github.com/enterprise-cloud@latest/admin/policies/enforcing-policies-for-your-enterprise/enforcing-repository-management-policies-in-your-enterprise#enforcing-a-policy-for-inviting-outside-collaborators-to-repositories)."
    *
    * For more information on permission levels, see "[Repository permission levels for an organization](https://docs.github.com/github/setting-up-and-managing-organizations-and-teams/repository-permission-levels-for-an-organization#permission-levels-for-repositories-owned-by-an-organization)". There are restrictions on which permissions can be granted to organization members when an organization base role is in place. In this case, the permission being given must be equal to or higher than the org base permission. Otherwise, the request will fail with:
    *
    * ```
    * Cannot assign {member} permission of {role name}
    * ```
    *
    * Note that, if you choose not to pass any parameters, you'll need to set `Content-Length` to zero when calling out to this endpoint. For more information, see "[HTTP verbs](https://docs.github.com/rest/overview/resources-in-the-rest-api#http-verbs)."
    *
    * The invitee will receive a notification that they have been invited to the repository, which they must accept or decline. They may do this via the notifications page, the email they receive, or by using the [repository invitations API endpoints](https://docs.github.com/rest/reference/repos#invitations).
    *
    * **Updating an existing collaborator's permission level**
    *
    * The endpoint can also be used to change the permissions of an existing collaborator without first removing and re-adding the collaborator. To change the permissions, use the same endpoint and pass a different `permission` parameter. The response will be a `204`, with no other indication that the permission level changed.
    *
    * **Rate limits**
    *
    * You are limited to sending 50 invitations to a repository per 24 hour period. Note there is no limit if you are inviting organization members to an organization repository.
    */
  @JSName("addCollaborator")
  var addCollaborator_Original: `532`
  
  /**
    * Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    */
  def addStatusCheckContexts(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/branches/{branch}/protection/required_status_checks/contexts']['response'] */ js.Any
  ]
  def addStatusCheckContexts(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/branches/{branch}/protection/required_status_checks/contexts']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/branches/{branch}/protection/required_status_checks/contexts']['response'] */ js.Any
  ]
  /**
    * Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    */
  @JSName("addStatusCheckContexts")
  var addStatusCheckContexts_Original: `533`
  
  /**
    * Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    *
    * Grants the specified teams push access for this branch. You can also give push access to child teams.
    *
    * | Type    | Description                                                                                                                                |
    * | ------- | ------------------------------------------------------------------------------------------------------------------------------------------ |
    * | `array` | The teams that can have push access. Use the team's `slug`. **Note**: The list of users, apps, and teams in total is limited to 100 items. |
    */
  def addTeamAccessRestrictions(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/branches/{branch}/protection/restrictions/teams']['response'] */ js.Any
  ]
  def addTeamAccessRestrictions(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/branches/{branch}/protection/restrictions/teams']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/branches/{branch}/protection/restrictions/teams']['response'] */ js.Any
  ]
  /**
    * Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    *
    * Grants the specified teams push access for this branch. You can also give push access to child teams.
    *
    * | Type    | Description                                                                                                                                |
    * | ------- | ------------------------------------------------------------------------------------------------------------------------------------------ |
    * | `array` | The teams that can have push access. Use the team's `slug`. **Note**: The list of users, apps, and teams in total is limited to 100 items. |
    */
  @JSName("addTeamAccessRestrictions")
  var addTeamAccessRestrictions_Original: `534`
  
  /**
    * Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    *
    * Grants the specified people push access for this branch.
    *
    * | Type    | Description                                                                                                                   |
    * | ------- | ----------------------------------------------------------------------------------------------------------------------------- |
    * | `array` | Usernames for people who can have push access. **Note**: The list of users, apps, and teams in total is limited to 100 items. |
    */
  def addUserAccessRestrictions(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/branches/{branch}/protection/restrictions/users']['response'] */ js.Any
  ]
  def addUserAccessRestrictions(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/branches/{branch}/protection/restrictions/users']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/branches/{branch}/protection/restrictions/users']['response'] */ js.Any
  ]
  /**
    * Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    *
    * Grants the specified people push access for this branch.
    *
    * | Type    | Description                                                                                                                   |
    * | ------- | ----------------------------------------------------------------------------------------------------------------------------- |
    * | `array` | Usernames for people who can have push access. **Note**: The list of users, apps, and teams in total is limited to 100 items. |
    */
  @JSName("addUserAccessRestrictions")
  var addUserAccessRestrictions_Original: `535`
  
  /**
    * For organization-owned repositories, the list of collaborators includes outside collaborators, organization members that are direct collaborators, organization members with access through team memberships, organization members with access through default organization permissions, and organization owners.
    *
    * Team members will include the members of child teams.
    *
    * You must authenticate using an access token with the `read:org` and `repo` scopes with push access to use this
    * endpoint. GitHub Apps must have the `members` organization permission and `metadata` repository permission to use this
    * endpoint.
    */
  def checkCollaborator(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/collaborators/{username}']['response'] */ js.Any
  ]
  def checkCollaborator(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/collaborators/{username}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/collaborators/{username}']['response'] */ js.Any
  ]
  /**
    * For organization-owned repositories, the list of collaborators includes outside collaborators, organization members that are direct collaborators, organization members with access through team memberships, organization members with access through default organization permissions, and organization owners.
    *
    * Team members will include the members of child teams.
    *
    * You must authenticate using an access token with the `read:org` and `repo` scopes with push access to use this
    * endpoint. GitHub Apps must have the `members` organization permission and `metadata` repository permission to use this
    * endpoint.
    */
  @JSName("checkCollaborator")
  var checkCollaborator_Original: `536`
  
  /**
    * Shows whether dependency alerts are enabled or disabled for a repository. The authenticated user must have admin read access to the repository. For more information, see "[About security alerts for vulnerable dependencies](https://docs.github.com/en/articles/about-security-alerts-for-vulnerable-dependencies)".
    */
  def checkVulnerabilityAlerts(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/vulnerability-alerts']['response'] */ js.Any
  ]
  def checkVulnerabilityAlerts(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/vulnerability-alerts']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/vulnerability-alerts']['response'] */ js.Any
  ]
  /**
    * Shows whether dependency alerts are enabled or disabled for a repository. The authenticated user must have admin read access to the repository. For more information, see "[About security alerts for vulnerable dependencies](https://docs.github.com/en/articles/about-security-alerts-for-vulnerable-dependencies)".
    */
  @JSName("checkVulnerabilityAlerts")
  var checkVulnerabilityAlerts_Original: `537`
  
  /**
    * List any syntax errors that are detected in the CODEOWNERS
    * file.
    *
    * For more information about the correct CODEOWNERS syntax,
    * see "[About code owners](https://docs.github.com/repositories/managing-your-repositorys-settings-and-features/customizing-your-repository/about-code-owners)."
    */
  def codeownersErrors(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/codeowners/errors']['response'] */ js.Any
  ]
  def codeownersErrors(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/codeowners/errors']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/codeowners/errors']['response'] */ js.Any
  ]
  /**
    * List any syntax errors that are detected in the CODEOWNERS
    * file.
    *
    * For more information about the correct CODEOWNERS syntax,
    * see "[About code owners](https://docs.github.com/repositories/managing-your-repositorys-settings-and-features/customizing-your-repository/about-code-owners)."
    */
  @JSName("codeownersErrors")
  var codeownersErrors_Original: `538`
  
  /**
    * **Deprecated**: Use `repos.compareCommitsWithBasehead()` (`GET /repos/{owner}/{repo}/compare/{basehead}`) instead. Both `:base` and `:head` must be branch names in `:repo`. To compare branches across other repositories in the same network as `:repo`, use the format `<USERNAME>:branch`.
    *
    * The response from the API is equivalent to running the `git log base..head` command; however, commits are returned in chronological order. Pass the appropriate [media type](https://docs.github.com/rest/overview/media-types/#commits-commit-comparison-and-pull-requests) to fetch diff and patch formats.
    *
    * The response also includes details on the files that were changed between the two commits. This includes the status of the change (for example, if a file was added, removed, modified, or renamed), and details of the change itself. For example, files with a `renamed` status have a `previous_filename` field showing the previous filename of the file, and files with a `modified` status have a `patch` field showing the changes made to the file.
    *
    * **Working with large comparisons**
    *
    * To process a response with a large number of commits, you can use (`per_page` or `page`) to paginate the results. When using paging, the list of changed files is only returned with page 1, but includes all changed files for the entire comparison. For more information on working with pagination, see "[Traversing with pagination](/rest/guides/traversing-with-pagination)."
    *
    * When calling this API without any paging parameters (`per_page` or `page`), the returned list is limited to 250 commits and the last commit in the list is the most recent of the entire comparison. When a paging parameter is specified, the first commit in the returned list of each page is the earliest.
    *
    * **Signature verification object**
    *
    * The response will include a `verification` object that describes the result of verifying the commit's signature. The following fields are included in the `verification` object:
    *
    * | Name | Type | Description |
    * | ---- | ---- | ----------- |
    * | `verified` | `boolean` | Indicates whether GitHub considers the signature in this commit to be verified. |
    * | `reason` | `string` | The reason for verified value. Possible values and their meanings are enumerated in table below. |
    * | `signature` | `string` | The signature that was extracted from the commit. |
    * | `payload` | `string` | The value that was signed. |
    *
    * These are the possible values for `reason` in the `verification` object:
    *
    * | Value | Description |
    * | ----- | ----------- |
    * | `expired_key` | The key that made the signature is expired. |
    * | `not_signing_key` | The "signing" flag is not among the usage flags in the GPG key that made the signature. |
    * | `gpgverify_error` | There was an error communicating with the signature verification service. |
    * | `gpgverify_unavailable` | The signature verification service is currently unavailable. |
    * | `unsigned` | The object does not include a signature. |
    * | `unknown_signature_type` | A non-PGP signature was found in the commit. |
    * | `no_user` | No user was associated with the `committer` email address in the commit. |
    * | `unverified_email` | The `committer` email address in the commit was associated with a user, but the email address is not verified on her/his account. |
    * | `bad_email` | The `committer` email address in the commit is not included in the identities of the PGP key that made the signature. |
    * | `unknown_key` | The key that made the signature has not been registered with any user's account. |
    * | `malformed_signature` | There was an error parsing the signature. |
    * | `invalid` | The signature could not be cryptographically verified using the key whose key-id was found in the signature. |
    * | `valid` | None of the above errors applied, so the signature is considered to be verified. |
    */
  def compareCommits(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/compare/{base}...{head}']['response'] */ js.Any
  ]
  def compareCommits(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/compare/{base}...{head}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/compare/{base}...{head}']['response'] */ js.Any
  ]
  
  /**
    * The `basehead` param is comprised of two parts: `base` and `head`. Both must be branch names in `repo`. To compare branches across other repositories in the same network as `repo`, use the format `<USERNAME>:branch`.
    *
    * The response from the API is equivalent to running the `git log base..head` command; however, commits are returned in chronological order. Pass the appropriate [media type](https://docs.github.com/rest/overview/media-types/#commits-commit-comparison-and-pull-requests) to fetch diff and patch formats.
    *
    * The response also includes details on the files that were changed between the two commits. This includes the status of the change (for example, if a file was added, removed, modified, or renamed), and details of the change itself. For example, files with a `renamed` status have a `previous_filename` field showing the previous filename of the file, and files with a `modified` status have a `patch` field showing the changes made to the file.
    *
    * **Working with large comparisons**
    *
    * To process a response with a large number of commits, you can use (`per_page` or `page`) to paginate the results. When using paging, the list of changed files is only returned with page 1, but includes all changed files for the entire comparison. For more information on working with pagination, see "[Traversing with pagination](/rest/guides/traversing-with-pagination)."
    *
    * When calling this API without any paging parameters (`per_page` or `page`), the returned list is limited to 250 commits and the last commit in the list is the most recent of the entire comparison. When a paging parameter is specified, the first commit in the returned list of each page is the earliest.
    *
    * **Signature verification object**
    *
    * The response will include a `verification` object that describes the result of verifying the commit's signature. The following fields are included in the `verification` object:
    *
    * | Name | Type | Description |
    * | ---- | ---- | ----------- |
    * | `verified` | `boolean` | Indicates whether GitHub considers the signature in this commit to be verified. |
    * | `reason` | `string` | The reason for verified value. Possible values and their meanings are enumerated in table below. |
    * | `signature` | `string` | The signature that was extracted from the commit. |
    * | `payload` | `string` | The value that was signed. |
    *
    * These are the possible values for `reason` in the `verification` object:
    *
    * | Value | Description |
    * | ----- | ----------- |
    * | `expired_key` | The key that made the signature is expired. |
    * | `not_signing_key` | The "signing" flag is not among the usage flags in the GPG key that made the signature. |
    * | `gpgverify_error` | There was an error communicating with the signature verification service. |
    * | `gpgverify_unavailable` | The signature verification service is currently unavailable. |
    * | `unsigned` | The object does not include a signature. |
    * | `unknown_signature_type` | A non-PGP signature was found in the commit. |
    * | `no_user` | No user was associated with the `committer` email address in the commit. |
    * | `unverified_email` | The `committer` email address in the commit was associated with a user, but the email address is not verified on her/his account. |
    * | `bad_email` | The `committer` email address in the commit is not included in the identities of the PGP key that made the signature. |
    * | `unknown_key` | The key that made the signature has not been registered with any user's account. |
    * | `malformed_signature` | There was an error parsing the signature. |
    * | `invalid` | The signature could not be cryptographically verified using the key whose key-id was found in the signature. |
    * | `valid` | None of the above errors applied, so the signature is considered to be verified. |
    */
  def compareCommitsWithBasehead(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/compare/{basehead}']['response'] */ js.Any
  ]
  def compareCommitsWithBasehead(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/compare/{basehead}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/compare/{basehead}']['response'] */ js.Any
  ]
  /**
    * The `basehead` param is comprised of two parts: `base` and `head`. Both must be branch names in `repo`. To compare branches across other repositories in the same network as `repo`, use the format `<USERNAME>:branch`.
    *
    * The response from the API is equivalent to running the `git log base..head` command; however, commits are returned in chronological order. Pass the appropriate [media type](https://docs.github.com/rest/overview/media-types/#commits-commit-comparison-and-pull-requests) to fetch diff and patch formats.
    *
    * The response also includes details on the files that were changed between the two commits. This includes the status of the change (for example, if a file was added, removed, modified, or renamed), and details of the change itself. For example, files with a `renamed` status have a `previous_filename` field showing the previous filename of the file, and files with a `modified` status have a `patch` field showing the changes made to the file.
    *
    * **Working with large comparisons**
    *
    * To process a response with a large number of commits, you can use (`per_page` or `page`) to paginate the results. When using paging, the list of changed files is only returned with page 1, but includes all changed files for the entire comparison. For more information on working with pagination, see "[Traversing with pagination](/rest/guides/traversing-with-pagination)."
    *
    * When calling this API without any paging parameters (`per_page` or `page`), the returned list is limited to 250 commits and the last commit in the list is the most recent of the entire comparison. When a paging parameter is specified, the first commit in the returned list of each page is the earliest.
    *
    * **Signature verification object**
    *
    * The response will include a `verification` object that describes the result of verifying the commit's signature. The following fields are included in the `verification` object:
    *
    * | Name | Type | Description |
    * | ---- | ---- | ----------- |
    * | `verified` | `boolean` | Indicates whether GitHub considers the signature in this commit to be verified. |
    * | `reason` | `string` | The reason for verified value. Possible values and their meanings are enumerated in table below. |
    * | `signature` | `string` | The signature that was extracted from the commit. |
    * | `payload` | `string` | The value that was signed. |
    *
    * These are the possible values for `reason` in the `verification` object:
    *
    * | Value | Description |
    * | ----- | ----------- |
    * | `expired_key` | The key that made the signature is expired. |
    * | `not_signing_key` | The "signing" flag is not among the usage flags in the GPG key that made the signature. |
    * | `gpgverify_error` | There was an error communicating with the signature verification service. |
    * | `gpgverify_unavailable` | The signature verification service is currently unavailable. |
    * | `unsigned` | The object does not include a signature. |
    * | `unknown_signature_type` | A non-PGP signature was found in the commit. |
    * | `no_user` | No user was associated with the `committer` email address in the commit. |
    * | `unverified_email` | The `committer` email address in the commit was associated with a user, but the email address is not verified on her/his account. |
    * | `bad_email` | The `committer` email address in the commit is not included in the identities of the PGP key that made the signature. |
    * | `unknown_key` | The key that made the signature has not been registered with any user's account. |
    * | `malformed_signature` | There was an error parsing the signature. |
    * | `invalid` | The signature could not be cryptographically verified using the key whose key-id was found in the signature. |
    * | `valid` | None of the above errors applied, so the signature is considered to be verified. |
    */
  @JSName("compareCommitsWithBasehead")
  var compareCommitsWithBasehead_Original: `540`
  
  /**
    * **Deprecated**: Use `repos.compareCommitsWithBasehead()` (`GET /repos/{owner}/{repo}/compare/{basehead}`) instead. Both `:base` and `:head` must be branch names in `:repo`. To compare branches across other repositories in the same network as `:repo`, use the format `<USERNAME>:branch`.
    *
    * The response from the API is equivalent to running the `git log base..head` command; however, commits are returned in chronological order. Pass the appropriate [media type](https://docs.github.com/rest/overview/media-types/#commits-commit-comparison-and-pull-requests) to fetch diff and patch formats.
    *
    * The response also includes details on the files that were changed between the two commits. This includes the status of the change (for example, if a file was added, removed, modified, or renamed), and details of the change itself. For example, files with a `renamed` status have a `previous_filename` field showing the previous filename of the file, and files with a `modified` status have a `patch` field showing the changes made to the file.
    *
    * **Working with large comparisons**
    *
    * To process a response with a large number of commits, you can use (`per_page` or `page`) to paginate the results. When using paging, the list of changed files is only returned with page 1, but includes all changed files for the entire comparison. For more information on working with pagination, see "[Traversing with pagination](/rest/guides/traversing-with-pagination)."
    *
    * When calling this API without any paging parameters (`per_page` or `page`), the returned list is limited to 250 commits and the last commit in the list is the most recent of the entire comparison. When a paging parameter is specified, the first commit in the returned list of each page is the earliest.
    *
    * **Signature verification object**
    *
    * The response will include a `verification` object that describes the result of verifying the commit's signature. The following fields are included in the `verification` object:
    *
    * | Name | Type | Description |
    * | ---- | ---- | ----------- |
    * | `verified` | `boolean` | Indicates whether GitHub considers the signature in this commit to be verified. |
    * | `reason` | `string` | The reason for verified value. Possible values and their meanings are enumerated in table below. |
    * | `signature` | `string` | The signature that was extracted from the commit. |
    * | `payload` | `string` | The value that was signed. |
    *
    * These are the possible values for `reason` in the `verification` object:
    *
    * | Value | Description |
    * | ----- | ----------- |
    * | `expired_key` | The key that made the signature is expired. |
    * | `not_signing_key` | The "signing" flag is not among the usage flags in the GPG key that made the signature. |
    * | `gpgverify_error` | There was an error communicating with the signature verification service. |
    * | `gpgverify_unavailable` | The signature verification service is currently unavailable. |
    * | `unsigned` | The object does not include a signature. |
    * | `unknown_signature_type` | A non-PGP signature was found in the commit. |
    * | `no_user` | No user was associated with the `committer` email address in the commit. |
    * | `unverified_email` | The `committer` email address in the commit was associated with a user, but the email address is not verified on her/his account. |
    * | `bad_email` | The `committer` email address in the commit is not included in the identities of the PGP key that made the signature. |
    * | `unknown_key` | The key that made the signature has not been registered with any user's account. |
    * | `malformed_signature` | There was an error parsing the signature. |
    * | `invalid` | The signature could not be cryptographically verified using the key whose key-id was found in the signature. |
    * | `valid` | None of the above errors applied, so the signature is considered to be verified. |
    */
  @JSName("compareCommits")
  var compareCommits_Original: `539`
  
  /**
    * Users with admin access to the repository can create an autolink.
    */
  def createAutolink(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/autolinks']['response'] */ js.Any
  ]
  def createAutolink(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/autolinks']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/autolinks']['response'] */ js.Any
  ]
  /**
    * Users with admin access to the repository can create an autolink.
    */
  @JSName("createAutolink")
  var createAutolink_Original: `541`
  
  /**
    * Create a comment for a commit using its `:commit_sha`.
    *
    * This endpoint triggers [notifications](https://docs.github.com/en/github/managing-subscriptions-and-notifications-on-github/about-notifications). Creating content too quickly using this endpoint may result in secondary rate limiting. See "[Secondary rate limits](https://docs.github.com/rest/overview/resources-in-the-rest-api#secondary-rate-limits)" and "[Dealing with secondary rate limits](https://docs.github.com/rest/guides/best-practices-for-integrators#dealing-with-secondary-rate-limits)" for details.
    */
  def createCommitComment(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/commits/{commit_sha}/comments']['response'] */ js.Any
  ]
  def createCommitComment(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/commits/{commit_sha}/comments']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/commits/{commit_sha}/comments']['response'] */ js.Any
  ]
  /**
    * Create a comment for a commit using its `:commit_sha`.
    *
    * This endpoint triggers [notifications](https://docs.github.com/en/github/managing-subscriptions-and-notifications-on-github/about-notifications). Creating content too quickly using this endpoint may result in secondary rate limiting. See "[Secondary rate limits](https://docs.github.com/rest/overview/resources-in-the-rest-api#secondary-rate-limits)" and "[Dealing with secondary rate limits](https://docs.github.com/rest/guides/best-practices-for-integrators#dealing-with-secondary-rate-limits)" for details.
    */
  @JSName("createCommitComment")
  var createCommitComment_Original: `542`
  
  /**
    * Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    *
    * When authenticated with admin or owner permissions to the repository, you can use this endpoint to require signed commits on a branch. You must enable branch protection to require signed commits.
    */
  def createCommitSignatureProtection(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/branches/{branch}/protection/required_signatures']['response'] */ js.Any
  ]
  def createCommitSignatureProtection(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/branches/{branch}/protection/required_signatures']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/branches/{branch}/protection/required_signatures']['response'] */ js.Any
  ]
  /**
    * Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    *
    * When authenticated with admin or owner permissions to the repository, you can use this endpoint to require signed commits on a branch. You must enable branch protection to require signed commits.
    */
  @JSName("createCommitSignatureProtection")
  var createCommitSignatureProtection_Original: `543`
  
  /**
    * Users with push access in a repository can create commit statuses for a given SHA.
    *
    * Note: there is a limit of 1000 statuses per `sha` and `context` within a repository. Attempts to create more than 1000 statuses will result in a validation error.
    */
  def createCommitStatus(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/statuses/{sha}']['response'] */ js.Any
  ]
  def createCommitStatus(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/statuses/{sha}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/statuses/{sha}']['response'] */ js.Any
  ]
  /**
    * Users with push access in a repository can create commit statuses for a given SHA.
    *
    * Note: there is a limit of 1000 statuses per `sha` and `context` within a repository. Attempts to create more than 1000 statuses will result in a validation error.
    */
  @JSName("createCommitStatus")
  var createCommitStatus_Original: `544`
  
  /**
    * You can create a read-only deploy key.
    */
  def createDeployKey(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/keys']['response'] */ js.Any
  ]
  def createDeployKey(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/keys']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/keys']['response'] */ js.Any
  ]
  /**
    * You can create a read-only deploy key.
    */
  @JSName("createDeployKey")
  var createDeployKey_Original: `545`
  
  /**
    * Deployments offer a few configurable parameters with certain defaults.
    *
    * The `ref` parameter can be any named branch, tag, or SHA. At GitHub we often deploy branches and verify them
    * before we merge a pull request.
    *
    * The `environment` parameter allows deployments to be issued to different runtime environments. Teams often have
    * multiple environments for verifying their applications, such as `production`, `staging`, and `qa`. This parameter
    * makes it easier to track which environments have requested deployments. The default environment is `production`.
    *
    * The `auto_merge` parameter is used to ensure that the requested ref is not behind the repository's default branch. If
    * the ref _is_ behind the default branch for the repository, we will attempt to merge it for you. If the merge succeeds,
    * the API will return a successful merge commit. If merge conflicts prevent the merge from succeeding, the API will
    * return a failure response.
    *
    * By default, [commit statuses](https://docs.github.com/rest/commits/statuses) for every submitted context must be in a `success`
    * state. The `required_contexts` parameter allows you to specify a subset of contexts that must be `success`, or to
    * specify contexts that have not yet been submitted. You are not required to use commit statuses to deploy. If you do
    * not require any contexts or create any commit statuses, the deployment will always succeed.
    *
    * The `payload` parameter is available for any extra information that a deployment system might need. It is a JSON text
    * field that will be passed on when a deployment event is dispatched.
    *
    * The `task` parameter is used by the deployment system to allow different execution paths. In the web world this might
    * be `deploy:migrations` to run schema changes on the system. In the compiled world this could be a flag to compile an
    * application with debugging enabled.
    *
    * Users with `repo` or `repo_deployment` scopes can create a deployment for a given ref.
    *
    * #### Merged branch response
    * You will see this response when GitHub automatically merges the base branch into the topic branch instead of creating
    * a deployment. This auto-merge happens when:
    * *   Auto-merge option is enabled in the repository
    * *   Topic branch does not include the latest changes on the base branch, which is `master` in the response example
    * *   There are no merge conflicts
    *
    * If there are no new commits in the base branch, a new request to create a deployment should give a successful
    * response.
    *
    * #### Merge conflict response
    * This error happens when the `auto_merge` option is enabled and when the default branch (in this case `master`), can't
    * be merged into the branch that's being deployed (in this case `topic-branch`), due to merge conflicts.
    *
    * #### Failed commit status checks
    * This error happens when the `required_contexts` parameter indicates that one or more contexts need to have a `success`
    * status for the commit to be deployed, but one or more of the required contexts do not have a state of `success`.
    */
  def createDeployment(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/deployments']['response'] */ js.Any
  ]
  def createDeployment(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/deployments']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/deployments']['response'] */ js.Any
  ]
  
  /**
    * Creates a deployment branch policy for an environment.
    *
    * You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `administration:write` permission for the repository to use this endpoint.
    */
  def createDeploymentBranchPolicy(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/environments/{environment_name}/deployment-branch-policies']['response'] */ js.Any
  ]
  def createDeploymentBranchPolicy(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/environments/{environment_name}/deployment-branch-policies']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/environments/{environment_name}/deployment-branch-policies']['response'] */ js.Any
  ]
  /**
    * Creates a deployment branch policy for an environment.
    *
    * You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `administration:write` permission for the repository to use this endpoint.
    */
  @JSName("createDeploymentBranchPolicy")
  var createDeploymentBranchPolicy_Original: `547`
  
  /**
    * Users with `push` access can create deployment statuses for a given deployment.
    *
    * GitHub Apps require `read & write` access to "Deployments" and `read-only` access to "Repo contents" (for private repos). OAuth Apps require the `repo_deployment` scope.
    */
  def createDeploymentStatus(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/deployments/{deployment_id}/statuses']['response'] */ js.Any
  ]
  def createDeploymentStatus(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/deployments/{deployment_id}/statuses']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/deployments/{deployment_id}/statuses']['response'] */ js.Any
  ]
  /**
    * Users with `push` access can create deployment statuses for a given deployment.
    *
    * GitHub Apps require `read & write` access to "Deployments" and `read-only` access to "Repo contents" (for private repos). OAuth Apps require the `repo_deployment` scope.
    */
  @JSName("createDeploymentStatus")
  var createDeploymentStatus_Original: `548`
  
  /**
    * Deployments offer a few configurable parameters with certain defaults.
    *
    * The `ref` parameter can be any named branch, tag, or SHA. At GitHub we often deploy branches and verify them
    * before we merge a pull request.
    *
    * The `environment` parameter allows deployments to be issued to different runtime environments. Teams often have
    * multiple environments for verifying their applications, such as `production`, `staging`, and `qa`. This parameter
    * makes it easier to track which environments have requested deployments. The default environment is `production`.
    *
    * The `auto_merge` parameter is used to ensure that the requested ref is not behind the repository's default branch. If
    * the ref _is_ behind the default branch for the repository, we will attempt to merge it for you. If the merge succeeds,
    * the API will return a successful merge commit. If merge conflicts prevent the merge from succeeding, the API will
    * return a failure response.
    *
    * By default, [commit statuses](https://docs.github.com/rest/commits/statuses) for every submitted context must be in a `success`
    * state. The `required_contexts` parameter allows you to specify a subset of contexts that must be `success`, or to
    * specify contexts that have not yet been submitted. You are not required to use commit statuses to deploy. If you do
    * not require any contexts or create any commit statuses, the deployment will always succeed.
    *
    * The `payload` parameter is available for any extra information that a deployment system might need. It is a JSON text
    * field that will be passed on when a deployment event is dispatched.
    *
    * The `task` parameter is used by the deployment system to allow different execution paths. In the web world this might
    * be `deploy:migrations` to run schema changes on the system. In the compiled world this could be a flag to compile an
    * application with debugging enabled.
    *
    * Users with `repo` or `repo_deployment` scopes can create a deployment for a given ref.
    *
    * #### Merged branch response
    * You will see this response when GitHub automatically merges the base branch into the topic branch instead of creating
    * a deployment. This auto-merge happens when:
    * *   Auto-merge option is enabled in the repository
    * *   Topic branch does not include the latest changes on the base branch, which is `master` in the response example
    * *   There are no merge conflicts
    *
    * If there are no new commits in the base branch, a new request to create a deployment should give a successful
    * response.
    *
    * #### Merge conflict response
    * This error happens when the `auto_merge` option is enabled and when the default branch (in this case `master`), can't
    * be merged into the branch that's being deployed (in this case `topic-branch`), due to merge conflicts.
    *
    * #### Failed commit status checks
    * This error happens when the `required_contexts` parameter indicates that one or more contexts need to have a `success`
    * status for the commit to be deployed, but one or more of the required contexts do not have a state of `success`.
    */
  @JSName("createDeployment")
  var createDeployment_Original: `546`
  
  /**
    * You can use this endpoint to trigger a webhook event called `repository_dispatch` when you want activity that happens outside of GitHub to trigger a GitHub Actions workflow or GitHub App webhook. You must configure your GitHub Actions workflow or GitHub App to run when the `repository_dispatch` event occurs. For an example `repository_dispatch` webhook payload, see "[RepositoryDispatchEvent](https://docs.github.com/webhooks/event-payloads/#repository_dispatch)."
    *
    * The `client_payload` parameter is available for any extra information that your workflow might need. This parameter is a JSON payload that will be passed on when the webhook event is dispatched. For example, the `client_payload` can include a message that a user would like to send using a GitHub Actions workflow. Or the `client_payload` can be used as a test to debug your workflow.
    *
    * This endpoint requires write access to the repository by providing either:
    *
    *   - Personal access tokens with `repo` scope. For more information, see "[Creating a personal access token for the command line](https://docs.github.com/articles/creating-a-personal-access-token-for-the-command-line)" in the GitHub Help documentation.
    *   - GitHub Apps with both `metadata:read` and `contents:read&write` permissions.
    *
    * This input example shows how you can use the `client_payload` as a test to debug your workflow.
    */
  def createDispatchEvent(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/dispatches']['response'] */ js.Any
  ]
  def createDispatchEvent(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/dispatches']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/dispatches']['response'] */ js.Any
  ]
  /**
    * You can use this endpoint to trigger a webhook event called `repository_dispatch` when you want activity that happens outside of GitHub to trigger a GitHub Actions workflow or GitHub App webhook. You must configure your GitHub Actions workflow or GitHub App to run when the `repository_dispatch` event occurs. For an example `repository_dispatch` webhook payload, see "[RepositoryDispatchEvent](https://docs.github.com/webhooks/event-payloads/#repository_dispatch)."
    *
    * The `client_payload` parameter is available for any extra information that your workflow might need. This parameter is a JSON payload that will be passed on when the webhook event is dispatched. For example, the `client_payload` can include a message that a user would like to send using a GitHub Actions workflow. Or the `client_payload` can be used as a test to debug your workflow.
    *
    * This endpoint requires write access to the repository by providing either:
    *
    *   - Personal access tokens with `repo` scope. For more information, see "[Creating a personal access token for the command line](https://docs.github.com/articles/creating-a-personal-access-token-for-the-command-line)" in the GitHub Help documentation.
    *   - GitHub Apps with both `metadata:read` and `contents:read&write` permissions.
    *
    * This input example shows how you can use the `client_payload` as a test to debug your workflow.
    */
  @JSName("createDispatchEvent")
  var createDispatchEvent_Original: `549`
  
  /**
    * Creates a new repository for the authenticated user.
    *
    * **OAuth scope requirements**
    *
    * When using [OAuth](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/), authorizations must include:
    *
    * *   `public_repo` scope or `repo` scope to create a public repository. Note: For GitHub AE, use `repo` scope to create an internal repository.
    * *   `repo` scope to create a private repository.
    */
  def createForAuthenticatedUser(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /user/repos']['response'] */ js.Any
  ]
  def createForAuthenticatedUser(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /user/repos']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /user/repos']['response'] */ js.Any
  ]
  /**
    * Creates a new repository for the authenticated user.
    *
    * **OAuth scope requirements**
    *
    * When using [OAuth](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/), authorizations must include:
    *
    * *   `public_repo` scope or `repo` scope to create a public repository. Note: For GitHub AE, use `repo` scope to create an internal repository.
    * *   `repo` scope to create a private repository.
    */
  @JSName("createForAuthenticatedUser")
  var createForAuthenticatedUser_Original: `550`
  
  /**
    * Create a fork for the authenticated user.
    *
    * **Note**: Forking a Repository happens asynchronously. You may have to wait a short period of time before you can access the git objects. If this takes longer than 5 minutes, be sure to contact [GitHub Support](https://support.github.com/contact?tags=dotcom-rest-api).
    */
  def createFork(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/forks']['response'] */ js.Any
  ]
  def createFork(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/forks']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/forks']['response'] */ js.Any
  ]
  /**
    * Create a fork for the authenticated user.
    *
    * **Note**: Forking a Repository happens asynchronously. You may have to wait a short period of time before you can access the git objects. If this takes longer than 5 minutes, be sure to contact [GitHub Support](https://support.github.com/contact?tags=dotcom-rest-api).
    */
  @JSName("createFork")
  var createFork_Original: `551`
  
  /**
    * Creates a new repository in the specified organization. The authenticated user must be a member of the organization.
    *
    * **OAuth scope requirements**
    *
    * When using [OAuth](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/), authorizations must include:
    *
    * *   `public_repo` scope or `repo` scope to create a public repository. Note: For GitHub AE, use `repo` scope to create an internal repository.
    * *   `repo` scope to create a private repository
    */
  def createInOrg(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /orgs/{org}/repos']['response'] */ js.Any
  ]
  def createInOrg(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /orgs/{org}/repos']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /orgs/{org}/repos']['response'] */ js.Any
  ]
  /**
    * Creates a new repository in the specified organization. The authenticated user must be a member of the organization.
    *
    * **OAuth scope requirements**
    *
    * When using [OAuth](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/), authorizations must include:
    *
    * *   `public_repo` scope or `repo` scope to create a public repository. Note: For GitHub AE, use `repo` scope to create an internal repository.
    * *   `repo` scope to create a private repository
    */
  @JSName("createInOrg")
  var createInOrg_Original: `552`
  
  /**
    * Create or update an environment with protection rules, such as required reviewers. For more information about environment protection rules, see "[Environments](/actions/reference/environments#environment-protection-rules)."
    *
    * **Note:** To create or update name patterns that branches must match in order to deploy to this environment, see "[Deployment branch policies](/rest/deployments/branch-policies)."
    *
    * **Note:** To create or update secrets for an environment, see "[Secrets](/rest/reference/actions#secrets)."
    *
    * You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `administration:write` permission for the repository to use this endpoint.
    */
  def createOrUpdateEnvironment(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /repos/{owner}/{repo}/environments/{environment_name}']['response'] */ js.Any
  ]
  def createOrUpdateEnvironment(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /repos/{owner}/{repo}/environments/{environment_name}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /repos/{owner}/{repo}/environments/{environment_name}']['response'] */ js.Any
  ]
  /**
    * Create or update an environment with protection rules, such as required reviewers. For more information about environment protection rules, see "[Environments](/actions/reference/environments#environment-protection-rules)."
    *
    * **Note:** To create or update name patterns that branches must match in order to deploy to this environment, see "[Deployment branch policies](/rest/deployments/branch-policies)."
    *
    * **Note:** To create or update secrets for an environment, see "[Secrets](/rest/reference/actions#secrets)."
    *
    * You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `administration:write` permission for the repository to use this endpoint.
    */
  @JSName("createOrUpdateEnvironment")
  var createOrUpdateEnvironment_Original: `553`
  
  /**
    * Creates a new file or replaces an existing file in a repository. You must authenticate using an access token with the `workflow` scope to use this endpoint.
    *
    * **Note:** If you use this endpoint and the "[Delete a file](https://docs.github.com/rest/reference/repos/#delete-file)" endpoint in parallel, the concurrent requests will conflict and you will receive errors. You must use these endpoints serially instead.
    */
  def createOrUpdateFileContents(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /repos/{owner}/{repo}/contents/{path}']['response'] */ js.Any
  ]
  def createOrUpdateFileContents(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /repos/{owner}/{repo}/contents/{path}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /repos/{owner}/{repo}/contents/{path}']['response'] */ js.Any
  ]
  /**
    * Creates a new file or replaces an existing file in a repository. You must authenticate using an access token with the `workflow` scope to use this endpoint.
    *
    * **Note:** If you use this endpoint and the "[Delete a file](https://docs.github.com/rest/reference/repos/#delete-file)" endpoint in parallel, the concurrent requests will conflict and you will receive errors. You must use these endpoints serially instead.
    */
  @JSName("createOrUpdateFileContents")
  var createOrUpdateFileContents_Original: `554`
  
  /**
    * Create a GitHub Pages deployment for a repository.
    *
    * Users must have write permissions. GitHub Apps must have the `pages:write` permission to use this endpoint.
    */
  def createPagesDeployment(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/pages/deployment']['response'] */ js.Any
  ]
  def createPagesDeployment(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/pages/deployment']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/pages/deployment']['response'] */ js.Any
  ]
  /**
    * Create a GitHub Pages deployment for a repository.
    *
    * Users must have write permissions. GitHub Apps must have the `pages:write` permission to use this endpoint.
    */
  @JSName("createPagesDeployment")
  var createPagesDeployment_Original: `555`
  
  /**
    * Configures a GitHub Pages site. For more information, see "[About GitHub Pages](/github/working-with-github-pages/about-github-pages)."
    */
  def createPagesSite(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/pages']['response'] */ js.Any
  ]
  def createPagesSite(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/pages']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/pages']['response'] */ js.Any
  ]
  /**
    * Configures a GitHub Pages site. For more information, see "[About GitHub Pages](/github/working-with-github-pages/about-github-pages)."
    */
  @JSName("createPagesSite")
  var createPagesSite_Original: `556`
  
  /**
    * Users with push access to the repository can create a release.
    *
    * This endpoint triggers [notifications](https://docs.github.com/en/github/managing-subscriptions-and-notifications-on-github/about-notifications). Creating content too quickly using this endpoint may result in secondary rate limiting. See "[Secondary rate limits](https://docs.github.com/rest/overview/resources-in-the-rest-api#secondary-rate-limits)" and "[Dealing with secondary rate limits](https://docs.github.com/rest/guides/best-practices-for-integrators#dealing-with-secondary-rate-limits)" for details.
    */
  def createRelease(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/releases']['response'] */ js.Any
  ]
  def createRelease(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/releases']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/releases']['response'] */ js.Any
  ]
  /**
    * Users with push access to the repository can create a release.
    *
    * This endpoint triggers [notifications](https://docs.github.com/en/github/managing-subscriptions-and-notifications-on-github/about-notifications). Creating content too quickly using this endpoint may result in secondary rate limiting. See "[Secondary rate limits](https://docs.github.com/rest/overview/resources-in-the-rest-api#secondary-rate-limits)" and "[Dealing with secondary rate limits](https://docs.github.com/rest/guides/best-practices-for-integrators#dealing-with-secondary-rate-limits)" for details.
    */
  @JSName("createRelease")
  var createRelease_Original: `557`
  
  /**
    * This creates a tag protection state for a repository.
    * This endpoint is only available to repository administrators.
    */
  def createTagProtection(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/tags/protection']['response'] */ js.Any
  ]
  def createTagProtection(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/tags/protection']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/tags/protection']['response'] */ js.Any
  ]
  /**
    * This creates a tag protection state for a repository.
    * This endpoint is only available to repository administrators.
    */
  @JSName("createTagProtection")
  var createTagProtection_Original: `558`
  
  /**
    * Creates a new repository using a repository template. Use the `template_owner` and `template_repo` route parameters to specify the repository to use as the template. If the repository is not public, the authenticated user must own or be a member of an organization that owns the repository. To check if a repository is available to use as a template, get the repository's information using the [Get a repository](https://docs.github.com/rest/reference/repos#get-a-repository) endpoint and check that the `is_template` key is `true`.
    *
    * **OAuth scope requirements**
    *
    * When using [OAuth](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/), authorizations must include:
    *
    * *   `public_repo` scope or `repo` scope to create a public repository. Note: For GitHub AE, use `repo` scope to create an internal repository.
    * *   `repo` scope to create a private repository
    */
  def createUsingTemplate(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{template_owner}/{template_repo}/generate']['response'] */ js.Any
  ]
  def createUsingTemplate(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{template_owner}/{template_repo}/generate']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{template_owner}/{template_repo}/generate']['response'] */ js.Any
  ]
  /**
    * Creates a new repository using a repository template. Use the `template_owner` and `template_repo` route parameters to specify the repository to use as the template. If the repository is not public, the authenticated user must own or be a member of an organization that owns the repository. To check if a repository is available to use as a template, get the repository's information using the [Get a repository](https://docs.github.com/rest/reference/repos#get-a-repository) endpoint and check that the `is_template` key is `true`.
    *
    * **OAuth scope requirements**
    *
    * When using [OAuth](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/), authorizations must include:
    *
    * *   `public_repo` scope or `repo` scope to create a public repository. Note: For GitHub AE, use `repo` scope to create an internal repository.
    * *   `repo` scope to create a private repository
    */
  @JSName("createUsingTemplate")
  var createUsingTemplate_Original: `559`
  
  /**
    * Repositories can have multiple webhooks installed. Each webhook should have a unique `config`. Multiple webhooks can
    * share the same `config` as long as those webhooks do not have any `events` that overlap.
    */
  def createWebhook(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/hooks']['response'] */ js.Any
  ]
  def createWebhook(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/hooks']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/hooks']['response'] */ js.Any
  ]
  /**
    * Repositories can have multiple webhooks installed. Each webhook should have a unique `config`. Multiple webhooks can
    * share the same `config` as long as those webhooks do not have any `events` that overlap.
    */
  @JSName("createWebhook")
  var createWebhook_Original: `560`
  
  /**
    * @deprecated octokit.rest.repos.declineInvitation() has been renamed to octokit.rest.repos.declineInvitationForAuthenticatedUser() (2021-10-05)
    */
  def declineInvitation(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /user/repository_invitations/{invitation_id}']['response'] */ js.Any
  ]
  def declineInvitation(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /user/repository_invitations/{invitation_id}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /user/repository_invitations/{invitation_id}']['response'] */ js.Any
  ]
  
  def declineInvitationForAuthenticatedUser(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /user/repository_invitations/{invitation_id}']['response'] */ js.Any
  ]
  def declineInvitationForAuthenticatedUser(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /user/repository_invitations/{invitation_id}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /user/repository_invitations/{invitation_id}']['response'] */ js.Any
  ]
  @JSName("declineInvitationForAuthenticatedUser")
  var declineInvitationForAuthenticatedUser_Original: `561`
  
  /**
    * @deprecated octokit.rest.repos.declineInvitation() has been renamed to octokit.rest.repos.declineInvitationForAuthenticatedUser() (2021-10-05)
    */
  @JSName("declineInvitation")
  var declineInvitation_Original: `561`
  
  /**
    * Deleting a repository requires admin access. If OAuth is used, the `delete_repo` scope is required.
    *
    * If an organization owner has configured the organization to prevent members from deleting organization-owned
    * repositories, you will get a `403 Forbidden` response.
    */
  def delete(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/{owner}/{repo}']['response'] */ js.Any
  ]
  def delete(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/{owner}/{repo}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/{owner}/{repo}']['response'] */ js.Any
  ]
  
  /**
    * Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    *
    * Disables the ability to restrict who can push to this branch.
    */
  def deleteAccessRestrictions(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/{owner}/{repo}/branches/{branch}/protection/restrictions']['response'] */ js.Any
  ]
  def deleteAccessRestrictions(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/{owner}/{repo}/branches/{branch}/protection/restrictions']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/{owner}/{repo}/branches/{branch}/protection/restrictions']['response'] */ js.Any
  ]
  /**
    * Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    *
    * Disables the ability to restrict who can push to this branch.
    */
  @JSName("deleteAccessRestrictions")
  var deleteAccessRestrictions_Original: `563`
  
  /**
    * Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    *
    * Removing admin enforcement requires admin or owner permissions to the repository and branch protection to be enabled.
    */
  def deleteAdminBranchProtection(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/{owner}/{repo}/branches/{branch}/protection/enforce_admins']['response'] */ js.Any
  ]
  def deleteAdminBranchProtection(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/{owner}/{repo}/branches/{branch}/protection/enforce_admins']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/{owner}/{repo}/branches/{branch}/protection/enforce_admins']['response'] */ js.Any
  ]
  /**
    * Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    *
    * Removing admin enforcement requires admin or owner permissions to the repository and branch protection to be enabled.
    */
  @JSName("deleteAdminBranchProtection")
  var deleteAdminBranchProtection_Original: `564`
  
  /**
    * You must authenticate using an access token with the repo scope to use this endpoint.
    */
  def deleteAnEnvironment(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/{owner}/{repo}/environments/{environment_name}']['response'] */ js.Any
  ]
  def deleteAnEnvironment(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/{owner}/{repo}/environments/{environment_name}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/{owner}/{repo}/environments/{environment_name}']['response'] */ js.Any
  ]
  /**
    * You must authenticate using an access token with the repo scope to use this endpoint.
    */
  @JSName("deleteAnEnvironment")
  var deleteAnEnvironment_Original: `565`
  
  /**
    * This deletes a single autolink reference by ID that was configured for the given repository.
    *
    * Information about autolinks are only available to repository administrators.
    */
  def deleteAutolink(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/{owner}/{repo}/autolinks/{autolink_id}']['response'] */ js.Any
  ]
  def deleteAutolink(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/{owner}/{repo}/autolinks/{autolink_id}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/{owner}/{repo}/autolinks/{autolink_id}']['response'] */ js.Any
  ]
  /**
    * This deletes a single autolink reference by ID that was configured for the given repository.
    *
    * Information about autolinks are only available to repository administrators.
    */
  @JSName("deleteAutolink")
  var deleteAutolink_Original: `566`
  
  /**
    * Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    */
  def deleteBranchProtection(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/{owner}/{repo}/branches/{branch}/protection']['response'] */ js.Any
  ]
  def deleteBranchProtection(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/{owner}/{repo}/branches/{branch}/protection']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/{owner}/{repo}/branches/{branch}/protection']['response'] */ js.Any
  ]
  /**
    * Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    */
  @JSName("deleteBranchProtection")
  var deleteBranchProtection_Original: `567`
  
  def deleteCommitComment(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/{owner}/{repo}/comments/{comment_id}']['response'] */ js.Any
  ]
  def deleteCommitComment(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/{owner}/{repo}/comments/{comment_id}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/{owner}/{repo}/comments/{comment_id}']['response'] */ js.Any
  ]
  @JSName("deleteCommitComment")
  var deleteCommitComment_Original: `568`
  
  /**
    * Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    *
    * When authenticated with admin or owner permissions to the repository, you can use this endpoint to disable required signed commits on a branch. You must enable branch protection to require signed commits.
    */
  def deleteCommitSignatureProtection(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/{owner}/{repo}/branches/{branch}/protection/required_signatures']['response'] */ js.Any
  ]
  def deleteCommitSignatureProtection(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/{owner}/{repo}/branches/{branch}/protection/required_signatures']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/{owner}/{repo}/branches/{branch}/protection/required_signatures']['response'] */ js.Any
  ]
  /**
    * Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    *
    * When authenticated with admin or owner permissions to the repository, you can use this endpoint to disable required signed commits on a branch. You must enable branch protection to require signed commits.
    */
  @JSName("deleteCommitSignatureProtection")
  var deleteCommitSignatureProtection_Original: `569`
  
  /**
    * Deploy keys are immutable. If you need to update a key, remove the key and create a new one instead.
    */
  def deleteDeployKey(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/{owner}/{repo}/keys/{key_id}']['response'] */ js.Any
  ]
  def deleteDeployKey(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/{owner}/{repo}/keys/{key_id}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/{owner}/{repo}/keys/{key_id}']['response'] */ js.Any
  ]
  /**
    * Deploy keys are immutable. If you need to update a key, remove the key and create a new one instead.
    */
  @JSName("deleteDeployKey")
  var deleteDeployKey_Original: `570`
  
  /**
    * If the repository only has one deployment, you can delete the deployment regardless of its status. If the repository has more than one deployment, you can only delete inactive deployments. This ensures that repositories with multiple deployments will always have an active deployment. Anyone with `repo` or `repo_deployment` scopes can delete a deployment.
    *
    * To set a deployment as inactive, you must:
    *
    * *   Create a new deployment that is active so that the system has a record of the current state, then delete the previously active deployment.
    * *   Mark the active deployment as inactive by adding any non-successful deployment status.
    *
    * For more information, see "[Create a deployment](https://docs.github.com/rest/reference/repos/#create-a-deployment)" and "[Create a deployment status](https://docs.github.com/rest/reference/repos#create-a-deployment-status)."
    */
  def deleteDeployment(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/{owner}/{repo}/deployments/{deployment_id}']['response'] */ js.Any
  ]
  def deleteDeployment(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/{owner}/{repo}/deployments/{deployment_id}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/{owner}/{repo}/deployments/{deployment_id}']['response'] */ js.Any
  ]
  
  /**
    * Deletes a deployment branch policy for an environment.
    *
    * You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `administration:write` permission for the repository to use this endpoint.
    */
  def deleteDeploymentBranchPolicy(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/{owner}/{repo}/environments/{environment_name}/deployment-branch-policies/{branch_policy_id}']['response'] */ js.Any
  ]
  def deleteDeploymentBranchPolicy(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/{owner}/{repo}/environments/{environment_name}/deployment-branch-policies/{branch_policy_id}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/{owner}/{repo}/environments/{environment_name}/deployment-branch-policies/{branch_policy_id}']['response'] */ js.Any
  ]
  /**
    * Deletes a deployment branch policy for an environment.
    *
    * You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `administration:write` permission for the repository to use this endpoint.
    */
  @JSName("deleteDeploymentBranchPolicy")
  var deleteDeploymentBranchPolicy_Original: `572`
  
  /**
    * If the repository only has one deployment, you can delete the deployment regardless of its status. If the repository has more than one deployment, you can only delete inactive deployments. This ensures that repositories with multiple deployments will always have an active deployment. Anyone with `repo` or `repo_deployment` scopes can delete a deployment.
    *
    * To set a deployment as inactive, you must:
    *
    * *   Create a new deployment that is active so that the system has a record of the current state, then delete the previously active deployment.
    * *   Mark the active deployment as inactive by adding any non-successful deployment status.
    *
    * For more information, see "[Create a deployment](https://docs.github.com/rest/reference/repos/#create-a-deployment)" and "[Create a deployment status](https://docs.github.com/rest/reference/repos#create-a-deployment-status)."
    */
  @JSName("deleteDeployment")
  var deleteDeployment_Original: `571`
  
  /**
    * Deletes a file in a repository.
    *
    * You can provide an additional `committer` parameter, which is an object containing information about the committer. Or, you can provide an `author` parameter, which is an object containing information about the author.
    *
    * The `author` section is optional and is filled in with the `committer` information if omitted. If the `committer` information is omitted, the authenticated user's information is used.
    *
    * You must provide values for both `name` and `email`, whether you choose to use `author` or `committer`. Otherwise, you'll receive a `422` status code.
    *
    * **Note:** If you use this endpoint and the "[Create or update file contents](https://docs.github.com/rest/reference/repos/#create-or-update-file-contents)" endpoint in parallel, the concurrent requests will conflict and you will receive errors. You must use these endpoints serially instead.
    */
  def deleteFile(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/{owner}/{repo}/contents/{path}']['response'] */ js.Any
  ]
  def deleteFile(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/{owner}/{repo}/contents/{path}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/{owner}/{repo}/contents/{path}']['response'] */ js.Any
  ]
  /**
    * Deletes a file in a repository.
    *
    * You can provide an additional `committer` parameter, which is an object containing information about the committer. Or, you can provide an `author` parameter, which is an object containing information about the author.
    *
    * The `author` section is optional and is filled in with the `committer` information if omitted. If the `committer` information is omitted, the authenticated user's information is used.
    *
    * You must provide values for both `name` and `email`, whether you choose to use `author` or `committer`. Otherwise, you'll receive a `422` status code.
    *
    * **Note:** If you use this endpoint and the "[Create or update file contents](https://docs.github.com/rest/reference/repos/#create-or-update-file-contents)" endpoint in parallel, the concurrent requests will conflict and you will receive errors. You must use these endpoints serially instead.
    */
  @JSName("deleteFile")
  var deleteFile_Original: `573`
  
  def deleteInvitation(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/{owner}/{repo}/invitations/{invitation_id}']['response'] */ js.Any
  ]
  def deleteInvitation(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/{owner}/{repo}/invitations/{invitation_id}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/{owner}/{repo}/invitations/{invitation_id}']['response'] */ js.Any
  ]
  @JSName("deleteInvitation")
  var deleteInvitation_Original: `574`
  
  def deletePagesSite(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/{owner}/{repo}/pages']['response'] */ js.Any
  ]
  def deletePagesSite(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/{owner}/{repo}/pages']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/{owner}/{repo}/pages']['response'] */ js.Any
  ]
  @JSName("deletePagesSite")
  var deletePagesSite_Original: `575`
  
  /**
    * Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    */
  def deletePullRequestReviewProtection(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/{owner}/{repo}/branches/{branch}/protection/required_pull_request_reviews']['response'] */ js.Any
  ]
  def deletePullRequestReviewProtection(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/{owner}/{repo}/branches/{branch}/protection/required_pull_request_reviews']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/{owner}/{repo}/branches/{branch}/protection/required_pull_request_reviews']['response'] */ js.Any
  ]
  /**
    * Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    */
  @JSName("deletePullRequestReviewProtection")
  var deletePullRequestReviewProtection_Original: `576`
  
  /**
    * Users with push access to the repository can delete a release.
    */
  def deleteRelease(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/{owner}/{repo}/releases/{release_id}']['response'] */ js.Any
  ]
  def deleteRelease(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/{owner}/{repo}/releases/{release_id}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/{owner}/{repo}/releases/{release_id}']['response'] */ js.Any
  ]
  
  def deleteReleaseAsset(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/{owner}/{repo}/releases/assets/{asset_id}']['response'] */ js.Any
  ]
  def deleteReleaseAsset(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/{owner}/{repo}/releases/assets/{asset_id}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/{owner}/{repo}/releases/assets/{asset_id}']['response'] */ js.Any
  ]
  @JSName("deleteReleaseAsset")
  var deleteReleaseAsset_Original: `578`
  
  /**
    * Users with push access to the repository can delete a release.
    */
  @JSName("deleteRelease")
  var deleteRelease_Original: `577`
  
  /**
    * This deletes a tag protection state for a repository.
    * This endpoint is only available to repository administrators.
    */
  def deleteTagProtection(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/{owner}/{repo}/tags/protection/{tag_protection_id}']['response'] */ js.Any
  ]
  def deleteTagProtection(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/{owner}/{repo}/tags/protection/{tag_protection_id}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/{owner}/{repo}/tags/protection/{tag_protection_id}']['response'] */ js.Any
  ]
  /**
    * This deletes a tag protection state for a repository.
    * This endpoint is only available to repository administrators.
    */
  @JSName("deleteTagProtection")
  var deleteTagProtection_Original: `579`
  
  def deleteWebhook(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/{owner}/{repo}/hooks/{hook_id}']['response'] */ js.Any
  ]
  def deleteWebhook(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/{owner}/{repo}/hooks/{hook_id}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/{owner}/{repo}/hooks/{hook_id}']['response'] */ js.Any
  ]
  @JSName("deleteWebhook")
  var deleteWebhook_Original: `580`
  
  /**
    * Deleting a repository requires admin access. If OAuth is used, the `delete_repo` scope is required.
    *
    * If an organization owner has configured the organization to prevent members from deleting organization-owned
    * repositories, you will get a `403 Forbidden` response.
    */
  @JSName("delete")
  var delete_Original: `562`
  
  /**
    * Disables automated security fixes for a repository. The authenticated user must have admin access to the repository. For more information, see "[Configuring automated security fixes](https://docs.github.com/en/articles/configuring-automated-security-fixes)".
    */
  def disableAutomatedSecurityFixes(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/{owner}/{repo}/automated-security-fixes']['response'] */ js.Any
  ]
  def disableAutomatedSecurityFixes(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/{owner}/{repo}/automated-security-fixes']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/{owner}/{repo}/automated-security-fixes']['response'] */ js.Any
  ]
  /**
    * Disables automated security fixes for a repository. The authenticated user must have admin access to the repository. For more information, see "[Configuring automated security fixes](https://docs.github.com/en/articles/configuring-automated-security-fixes)".
    */
  @JSName("disableAutomatedSecurityFixes")
  var disableAutomatedSecurityFixes_Original: `581`
  
  def disableLfsForRepo(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/{owner}/{repo}/lfs']['response'] */ js.Any
  ]
  def disableLfsForRepo(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/{owner}/{repo}/lfs']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/{owner}/{repo}/lfs']['response'] */ js.Any
  ]
  @JSName("disableLfsForRepo")
  var disableLfsForRepo_Original: `582`
  
  /**
    * Disables dependency alerts and the dependency graph for a repository. The authenticated user must have admin access to the repository. For more information, see "[About security alerts for vulnerable dependencies](https://docs.github.com/en/articles/about-security-alerts-for-vulnerable-dependencies)".
    */
  def disableVulnerabilityAlerts(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/{owner}/{repo}/vulnerability-alerts']['response'] */ js.Any
  ]
  def disableVulnerabilityAlerts(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/{owner}/{repo}/vulnerability-alerts']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/{owner}/{repo}/vulnerability-alerts']['response'] */ js.Any
  ]
  /**
    * Disables dependency alerts and the dependency graph for a repository. The authenticated user must have admin access to the repository. For more information, see "[About security alerts for vulnerable dependencies](https://docs.github.com/en/articles/about-security-alerts-for-vulnerable-dependencies)".
    */
  @JSName("disableVulnerabilityAlerts")
  var disableVulnerabilityAlerts_Original: `583`
  
  /**
    * Gets a redirect URL to download a zip archive for a repository. If you omit `:ref`, the repository’s default branch (usually
    * `master`) will be used. Please make sure your HTTP framework is configured to follow redirects or you will need to use
    * the `Location` header to make a second `GET` request.
    *
    * **Note**: For private repositories, these links are temporary and expire after five minutes. If the repository is empty, you will receive a 404 when you follow the redirect.
    * @deprecated octokit.rest.repos.downloadArchive() has been renamed to octokit.rest.repos.downloadZipballArchive() (2020-09-17)
    */
  def downloadArchive(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/zipball/{ref}']['response'] */ js.Any
  ]
  def downloadArchive(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/zipball/{ref}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/zipball/{ref}']['response'] */ js.Any
  ]
  /**
    * Gets a redirect URL to download a zip archive for a repository. If you omit `:ref`, the repository’s default branch (usually
    * `master`) will be used. Please make sure your HTTP framework is configured to follow redirects or you will need to use
    * the `Location` header to make a second `GET` request.
    *
    * **Note**: For private repositories, these links are temporary and expire after five minutes. If the repository is empty, you will receive a 404 when you follow the redirect.
    * @deprecated octokit.rest.repos.downloadArchive() has been renamed to octokit.rest.repos.downloadZipballArchive() (2020-09-17)
    */
  @JSName("downloadArchive")
  var downloadArchive_Original: `584`
  
  /**
    * Gets a redirect URL to download a tar archive for a repository. If you omit `:ref`, the repository’s default branch (usually
    * `master`) will be used. Please make sure your HTTP framework is configured to follow redirects or you will need to use
    * the `Location` header to make a second `GET` request.
    * **Note**: For private repositories, these links are temporary and expire after five minutes.
    */
  def downloadTarballArchive(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/tarball/{ref}']['response'] */ js.Any
  ]
  def downloadTarballArchive(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/tarball/{ref}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/tarball/{ref}']['response'] */ js.Any
  ]
  /**
    * Gets a redirect URL to download a tar archive for a repository. If you omit `:ref`, the repository’s default branch (usually
    * `master`) will be used. Please make sure your HTTP framework is configured to follow redirects or you will need to use
    * the `Location` header to make a second `GET` request.
    * **Note**: For private repositories, these links are temporary and expire after five minutes.
    */
  @JSName("downloadTarballArchive")
  var downloadTarballArchive_Original: `585`
  
  /**
    * Gets a redirect URL to download a zip archive for a repository. If you omit `:ref`, the repository’s default branch (usually
    * `master`) will be used. Please make sure your HTTP framework is configured to follow redirects or you will need to use
    * the `Location` header to make a second `GET` request.
    *
    * **Note**: For private repositories, these links are temporary and expire after five minutes. If the repository is empty, you will receive a 404 when you follow the redirect.
    */
  def downloadZipballArchive(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/zipball/{ref}']['response'] */ js.Any
  ]
  def downloadZipballArchive(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/zipball/{ref}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/zipball/{ref}']['response'] */ js.Any
  ]
  /**
    * Gets a redirect URL to download a zip archive for a repository. If you omit `:ref`, the repository’s default branch (usually
    * `master`) will be used. Please make sure your HTTP framework is configured to follow redirects or you will need to use
    * the `Location` header to make a second `GET` request.
    *
    * **Note**: For private repositories, these links are temporary and expire after five minutes. If the repository is empty, you will receive a 404 when you follow the redirect.
    */
  @JSName("downloadZipballArchive")
  var downloadZipballArchive_Original: `584`
  
  /**
    * Enables automated security fixes for a repository. The authenticated user must have admin access to the repository. For more information, see "[Configuring automated security fixes](https://docs.github.com/en/articles/configuring-automated-security-fixes)".
    */
  def enableAutomatedSecurityFixes(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /repos/{owner}/{repo}/automated-security-fixes']['response'] */ js.Any
  ]
  def enableAutomatedSecurityFixes(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /repos/{owner}/{repo}/automated-security-fixes']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /repos/{owner}/{repo}/automated-security-fixes']['response'] */ js.Any
  ]
  /**
    * Enables automated security fixes for a repository. The authenticated user must have admin access to the repository. For more information, see "[Configuring automated security fixes](https://docs.github.com/en/articles/configuring-automated-security-fixes)".
    */
  @JSName("enableAutomatedSecurityFixes")
  var enableAutomatedSecurityFixes_Original: `586`
  
  def enableLfsForRepo(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /repos/{owner}/{repo}/lfs']['response'] */ js.Any
  ]
  def enableLfsForRepo(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /repos/{owner}/{repo}/lfs']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /repos/{owner}/{repo}/lfs']['response'] */ js.Any
  ]
  @JSName("enableLfsForRepo")
  var enableLfsForRepo_Original: `587`
  
  /**
    * Enables dependency alerts and the dependency graph for a repository. The authenticated user must have admin access to the repository. For more information, see "[About security alerts for vulnerable dependencies](https://docs.github.com/en/articles/about-security-alerts-for-vulnerable-dependencies)".
    */
  def enableVulnerabilityAlerts(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /repos/{owner}/{repo}/vulnerability-alerts']['response'] */ js.Any
  ]
  def enableVulnerabilityAlerts(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /repos/{owner}/{repo}/vulnerability-alerts']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /repos/{owner}/{repo}/vulnerability-alerts']['response'] */ js.Any
  ]
  /**
    * Enables dependency alerts and the dependency graph for a repository. The authenticated user must have admin access to the repository. For more information, see "[About security alerts for vulnerable dependencies](https://docs.github.com/en/articles/about-security-alerts-for-vulnerable-dependencies)".
    */
  @JSName("enableVulnerabilityAlerts")
  var enableVulnerabilityAlerts_Original: `588`
  
  /**
    * Generate a name and body describing a [release](https://docs.github.com/rest/reference/repos#releases). The body content will be markdown formatted and contain information like the changes since last release and users who contributed. The generated release notes are not saved anywhere. They are intended to be generated and used when creating a new release.
    */
  def generateReleaseNotes(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/releases/generate-notes']['response'] */ js.Any
  ]
  def generateReleaseNotes(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/releases/generate-notes']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/releases/generate-notes']['response'] */ js.Any
  ]
  /**
    * Generate a name and body describing a [release](https://docs.github.com/rest/reference/repos#releases). The body content will be markdown formatted and contain information like the changes since last release and users who contributed. The generated release notes are not saved anywhere. They are intended to be generated and used when creating a new release.
    */
  @JSName("generateReleaseNotes")
  var generateReleaseNotes_Original: `589`
  
  /**
    * The `parent` and `source` objects are present when the repository is a fork. `parent` is the repository this repository was forked from, `source` is the ultimate source for the network.
    */
  def get(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}']['response'] */ js.Any
  ]
  def get(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}']['response'] */ js.Any
  ]
  
  /**
    * Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    *
    * Lists who has access to this protected branch.
    *
    * **Note**: Users, apps, and teams `restrictions` are only available for organization-owned repositories.
    */
  def getAccessRestrictions(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/branches/{branch}/protection/restrictions']['response'] */ js.Any
  ]
  def getAccessRestrictions(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/branches/{branch}/protection/restrictions']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/branches/{branch}/protection/restrictions']['response'] */ js.Any
  ]
  /**
    * Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    *
    * Lists who has access to this protected branch.
    *
    * **Note**: Users, apps, and teams `restrictions` are only available for organization-owned repositories.
    */
  @JSName("getAccessRestrictions")
  var getAccessRestrictions_Original: `591`
  
  /**
    * Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    */
  def getAdminBranchProtection(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/branches/{branch}/protection/enforce_admins']['response'] */ js.Any
  ]
  def getAdminBranchProtection(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/branches/{branch}/protection/enforce_admins']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/branches/{branch}/protection/enforce_admins']['response'] */ js.Any
  ]
  /**
    * Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    */
  @JSName("getAdminBranchProtection")
  var getAdminBranchProtection_Original: `592`
  
  /**
    * Lists the environments for a repository.
    *
    * Anyone with read access to the repository can use this endpoint. If the repository is private, you must use an access token with the `repo` scope. GitHub Apps must have the `actions:read` permission to use this endpoint.
    */
  def getAllEnvironments(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/environments']['response'] */ js.Any
  ]
  def getAllEnvironments(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/environments']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/environments']['response'] */ js.Any
  ]
  /**
    * Lists the environments for a repository.
    *
    * Anyone with read access to the repository can use this endpoint. If the repository is private, you must use an access token with the `repo` scope. GitHub Apps must have the `actions:read` permission to use this endpoint.
    */
  @JSName("getAllEnvironments")
  var getAllEnvironments_Original: `593`
  
  /**
    * Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    */
  def getAllStatusCheckContexts(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/branches/{branch}/protection/required_status_checks/contexts']['response'] */ js.Any
  ]
  def getAllStatusCheckContexts(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/branches/{branch}/protection/required_status_checks/contexts']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/branches/{branch}/protection/required_status_checks/contexts']['response'] */ js.Any
  ]
  /**
    * Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    */
  @JSName("getAllStatusCheckContexts")
  var getAllStatusCheckContexts_Original: `594`
  
  def getAllTopics(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/topics']['response'] */ js.Any
  ]
  def getAllTopics(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/topics']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/topics']['response'] */ js.Any
  ]
  @JSName("getAllTopics")
  var getAllTopics_Original: `595`
  
  /**
    * Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    *
    * Lists the GitHub Apps that have push access to this branch. Only installed GitHub Apps with `write` access to the `contents` permission can be added as authorized actors on a protected branch.
    */
  def getAppsWithAccessToProtectedBranch(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/branches/{branch}/protection/restrictions/apps']['response'] */ js.Any
  ]
  def getAppsWithAccessToProtectedBranch(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/branches/{branch}/protection/restrictions/apps']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/branches/{branch}/protection/restrictions/apps']['response'] */ js.Any
  ]
  /**
    * Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    *
    * Lists the GitHub Apps that have push access to this branch. Only installed GitHub Apps with `write` access to the `contents` permission can be added as authorized actors on a protected branch.
    */
  @JSName("getAppsWithAccessToProtectedBranch")
  var getAppsWithAccessToProtectedBranch_Original: `596`
  
  /**
    * This returns a single autolink reference by ID that was configured for the given repository.
    *
    * Information about autolinks are only available to repository administrators.
    */
  def getAutolink(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/autolinks/{autolink_id}']['response'] */ js.Any
  ]
  def getAutolink(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/autolinks/{autolink_id}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/autolinks/{autolink_id}']['response'] */ js.Any
  ]
  /**
    * This returns a single autolink reference by ID that was configured for the given repository.
    *
    * Information about autolinks are only available to repository administrators.
    */
  @JSName("getAutolink")
  var getAutolink_Original: `597`
  
  def getBranch(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/branches/{branch}']['response'] */ js.Any
  ]
  def getBranch(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/branches/{branch}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/branches/{branch}']['response'] */ js.Any
  ]
  
  /**
    * Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    */
  def getBranchProtection(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/branches/{branch}/protection']['response'] */ js.Any
  ]
  def getBranchProtection(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/branches/{branch}/protection']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/branches/{branch}/protection']['response'] */ js.Any
  ]
  /**
    * Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    */
  @JSName("getBranchProtection")
  var getBranchProtection_Original: `599`
  
  @JSName("getBranch")
  var getBranch_Original: `598`
  
  /**
    * Get the total number of clones and breakdown per day or week for the last 14 days. Timestamps are aligned to UTC midnight of the beginning of the day or week. Week begins on Monday.
    */
  def getClones(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/traffic/clones']['response'] */ js.Any
  ]
  def getClones(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/traffic/clones']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/traffic/clones']['response'] */ js.Any
  ]
  /**
    * Get the total number of clones and breakdown per day or week for the last 14 days. Timestamps are aligned to UTC midnight of the beginning of the day or week. Week begins on Monday.
    */
  @JSName("getClones")
  var getClones_Original: `600`
  
  /**
    * Returns a weekly aggregate of the number of additions and deletions pushed to a repository.
    */
  def getCodeFrequencyStats(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/stats/code_frequency']['response'] */ js.Any
  ]
  def getCodeFrequencyStats(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/stats/code_frequency']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/stats/code_frequency']['response'] */ js.Any
  ]
  /**
    * Returns a weekly aggregate of the number of additions and deletions pushed to a repository.
    */
  @JSName("getCodeFrequencyStats")
  var getCodeFrequencyStats_Original: `601`
  
  /**
    * Checks the repository permission of a collaborator. The possible repository permissions are `admin`, `write`, `read`, and `none`.
    */
  def getCollaboratorPermissionLevel(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/collaborators/{username}/permission']['response'] */ js.Any
  ]
  def getCollaboratorPermissionLevel(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/collaborators/{username}/permission']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/collaborators/{username}/permission']['response'] */ js.Any
  ]
  /**
    * Checks the repository permission of a collaborator. The possible repository permissions are `admin`, `write`, `read`, and `none`.
    */
  @JSName("getCollaboratorPermissionLevel")
  var getCollaboratorPermissionLevel_Original: `602`
  
  /**
    * Users with pull access in a repository can access a combined view of commit statuses for a given ref. The ref can be a SHA, a branch name, or a tag name.
    *
    *
    * Additionally, a combined `state` is returned. The `state` is one of:
    *
    * *   **failure** if any of the contexts report as `error` or `failure`
    * *   **pending** if there are no statuses or a context is `pending`
    * *   **success** if the latest status for all contexts is `success`
    */
  def getCombinedStatusForRef(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/commits/{ref}/status']['response'] */ js.Any
  ]
  def getCombinedStatusForRef(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/commits/{ref}/status']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/commits/{ref}/status']['response'] */ js.Any
  ]
  /**
    * Users with pull access in a repository can access a combined view of commit statuses for a given ref. The ref can be a SHA, a branch name, or a tag name.
    *
    *
    * Additionally, a combined `state` is returned. The `state` is one of:
    *
    * *   **failure** if any of the contexts report as `error` or `failure`
    * *   **pending** if there are no statuses or a context is `pending`
    * *   **success** if the latest status for all contexts is `success`
    */
  @JSName("getCombinedStatusForRef")
  var getCombinedStatusForRef_Original: `603`
  
  /**
    * Returns the contents of a single commit reference. You must have `read` access for the repository to use this endpoint.
    *
    * **Note:** If there are more than 300 files in the commit diff, the response will include pagination link headers for the remaining files, up to a limit of 3000 files. Each page contains the static commit information, and the only changes are to the file listing.
    *
    * You can pass the appropriate [media type](https://docs.github.com/rest/overview/media-types/#commits-commit-comparison-and-pull-requests) to  fetch `diff` and `patch` formats. Diffs with binary data will have no `patch` property.
    *
    * To return only the SHA-1 hash of the commit reference, you can provide the `sha` custom [media type](https://docs.github.com/rest/overview/media-types/#commits-commit-comparison-and-pull-requests) in the `Accept` header. You can use this endpoint to check if a remote reference's SHA-1 hash is the same as your local reference's SHA-1 hash by providing the local SHA-1 reference as the ETag.
    *
    * **Signature verification object**
    *
    * The response will include a `verification` object that describes the result of verifying the commit's signature. The following fields are included in the `verification` object:
    *
    * | Name | Type | Description |
    * | ---- | ---- | ----------- |
    * | `verified` | `boolean` | Indicates whether GitHub considers the signature in this commit to be verified. |
    * | `reason` | `string` | The reason for verified value. Possible values and their meanings are enumerated in table below. |
    * | `signature` | `string` | The signature that was extracted from the commit. |
    * | `payload` | `string` | The value that was signed. |
    *
    * These are the possible values for `reason` in the `verification` object:
    *
    * | Value | Description |
    * | ----- | ----------- |
    * | `expired_key` | The key that made the signature is expired. |
    * | `not_signing_key` | The "signing" flag is not among the usage flags in the GPG key that made the signature. |
    * | `gpgverify_error` | There was an error communicating with the signature verification service. |
    * | `gpgverify_unavailable` | The signature verification service is currently unavailable. |
    * | `unsigned` | The object does not include a signature. |
    * | `unknown_signature_type` | A non-PGP signature was found in the commit. |
    * | `no_user` | No user was associated with the `committer` email address in the commit. |
    * | `unverified_email` | The `committer` email address in the commit was associated with a user, but the email address is not verified on her/his account. |
    * | `bad_email` | The `committer` email address in the commit is not included in the identities of the PGP key that made the signature. |
    * | `unknown_key` | The key that made the signature has not been registered with any user's account. |
    * | `malformed_signature` | There was an error parsing the signature. |
    * | `invalid` | The signature could not be cryptographically verified using the key whose key-id was found in the signature. |
    * | `valid` | None of the above errors applied, so the signature is considered to be verified. |
    */
  def getCommit(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/commits/{ref}']['response'] */ js.Any
  ]
  def getCommit(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/commits/{ref}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/commits/{ref}']['response'] */ js.Any
  ]
  
  /**
    * Returns the last year of commit activity grouped by week. The `days` array is a group of commits per day, starting on `Sunday`.
    */
  def getCommitActivityStats(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/stats/commit_activity']['response'] */ js.Any
  ]
  def getCommitActivityStats(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/stats/commit_activity']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/stats/commit_activity']['response'] */ js.Any
  ]
  /**
    * Returns the last year of commit activity grouped by week. The `days` array is a group of commits per day, starting on `Sunday`.
    */
  @JSName("getCommitActivityStats")
  var getCommitActivityStats_Original: `605`
  
  def getCommitComment(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/comments/{comment_id}']['response'] */ js.Any
  ]
  def getCommitComment(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/comments/{comment_id}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/comments/{comment_id}']['response'] */ js.Any
  ]
  @JSName("getCommitComment")
  var getCommitComment_Original: `606`
  
  /**
    * Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    *
    * When authenticated with admin or owner permissions to the repository, you can use this endpoint to check whether a branch requires signed commits. An enabled status of `true` indicates you must sign commits on this branch. For more information, see [Signing commits with GPG](https://docs.github.com/articles/signing-commits-with-gpg) in GitHub Help.
    *
    * **Note**: You must enable branch protection to require signed commits.
    */
  def getCommitSignatureProtection(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/branches/{branch}/protection/required_signatures']['response'] */ js.Any
  ]
  def getCommitSignatureProtection(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/branches/{branch}/protection/required_signatures']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/branches/{branch}/protection/required_signatures']['response'] */ js.Any
  ]
  /**
    * Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    *
    * When authenticated with admin or owner permissions to the repository, you can use this endpoint to check whether a branch requires signed commits. An enabled status of `true` indicates you must sign commits on this branch. For more information, see [Signing commits with GPG](https://docs.github.com/articles/signing-commits-with-gpg) in GitHub Help.
    *
    * **Note**: You must enable branch protection to require signed commits.
    */
  @JSName("getCommitSignatureProtection")
  var getCommitSignatureProtection_Original: `607`
  
  /**
    * Returns the contents of a single commit reference. You must have `read` access for the repository to use this endpoint.
    *
    * **Note:** If there are more than 300 files in the commit diff, the response will include pagination link headers for the remaining files, up to a limit of 3000 files. Each page contains the static commit information, and the only changes are to the file listing.
    *
    * You can pass the appropriate [media type](https://docs.github.com/rest/overview/media-types/#commits-commit-comparison-and-pull-requests) to  fetch `diff` and `patch` formats. Diffs with binary data will have no `patch` property.
    *
    * To return only the SHA-1 hash of the commit reference, you can provide the `sha` custom [media type](https://docs.github.com/rest/overview/media-types/#commits-commit-comparison-and-pull-requests) in the `Accept` header. You can use this endpoint to check if a remote reference's SHA-1 hash is the same as your local reference's SHA-1 hash by providing the local SHA-1 reference as the ETag.
    *
    * **Signature verification object**
    *
    * The response will include a `verification` object that describes the result of verifying the commit's signature. The following fields are included in the `verification` object:
    *
    * | Name | Type | Description |
    * | ---- | ---- | ----------- |
    * | `verified` | `boolean` | Indicates whether GitHub considers the signature in this commit to be verified. |
    * | `reason` | `string` | The reason for verified value. Possible values and their meanings are enumerated in table below. |
    * | `signature` | `string` | The signature that was extracted from the commit. |
    * | `payload` | `string` | The value that was signed. |
    *
    * These are the possible values for `reason` in the `verification` object:
    *
    * | Value | Description |
    * | ----- | ----------- |
    * | `expired_key` | The key that made the signature is expired. |
    * | `not_signing_key` | The "signing" flag is not among the usage flags in the GPG key that made the signature. |
    * | `gpgverify_error` | There was an error communicating with the signature verification service. |
    * | `gpgverify_unavailable` | The signature verification service is currently unavailable. |
    * | `unsigned` | The object does not include a signature. |
    * | `unknown_signature_type` | A non-PGP signature was found in the commit. |
    * | `no_user` | No user was associated with the `committer` email address in the commit. |
    * | `unverified_email` | The `committer` email address in the commit was associated with a user, but the email address is not verified on her/his account. |
    * | `bad_email` | The `committer` email address in the commit is not included in the identities of the PGP key that made the signature. |
    * | `unknown_key` | The key that made the signature has not been registered with any user's account. |
    * | `malformed_signature` | There was an error parsing the signature. |
    * | `invalid` | The signature could not be cryptographically verified using the key whose key-id was found in the signature. |
    * | `valid` | None of the above errors applied, so the signature is considered to be verified. |
    */
  @JSName("getCommit")
  var getCommit_Original: `604`
  
  /**
    * Returns all community profile metrics for a repository. The repository must be public, and cannot be a fork.
    *
    * The returned metrics include an overall health score, the repository description, the presence of documentation, the
    * detected code of conduct, the detected license, and the presence of ISSUE\_TEMPLATE, PULL\_REQUEST\_TEMPLATE,
    * README, and CONTRIBUTING files.
    *
    * The `health_percentage` score is defined as a percentage of how many of
    * these four documents are present: README, CONTRIBUTING, LICENSE, and
    * CODE_OF_CONDUCT. For example, if all four documents are present, then
    * the `health_percentage` is `100`. If only one is present, then the
    * `health_percentage` is `25`.
    *
    * `content_reports_enabled` is only returned for organization-owned repositories.
    */
  def getCommunityProfileMetrics(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/community/profile']['response'] */ js.Any
  ]
  def getCommunityProfileMetrics(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/community/profile']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/community/profile']['response'] */ js.Any
  ]
  /**
    * Returns all community profile metrics for a repository. The repository must be public, and cannot be a fork.
    *
    * The returned metrics include an overall health score, the repository description, the presence of documentation, the
    * detected code of conduct, the detected license, and the presence of ISSUE\_TEMPLATE, PULL\_REQUEST\_TEMPLATE,
    * README, and CONTRIBUTING files.
    *
    * The `health_percentage` score is defined as a percentage of how many of
    * these four documents are present: README, CONTRIBUTING, LICENSE, and
    * CODE_OF_CONDUCT. For example, if all four documents are present, then
    * the `health_percentage` is `100`. If only one is present, then the
    * `health_percentage` is `25`.
    *
    * `content_reports_enabled` is only returned for organization-owned repositories.
    */
  @JSName("getCommunityProfileMetrics")
  var getCommunityProfileMetrics_Original: `608`
  
  /**
    * Gets the contents of a file or directory in a repository. Specify the file path or directory in `:path`. If you omit
    * `:path`, you will receive the contents of the repository's root directory. See the description below regarding what the API response includes for directories.
    *
    * Files and symlinks support [a custom media type](https://docs.github.com/rest/reference/repos#custom-media-types) for
    * retrieving the raw content or rendered HTML (when supported). All content types support [a custom media
    * type](https://docs.github.com/rest/reference/repos#custom-media-types) to ensure the content is returned in a consistent
    * object format.
    *
    * **Notes**:
    * *   To get a repository's contents recursively, you can [recursively get the tree](https://docs.github.com/rest/reference/git#trees).
    * *   This API has an upper limit of 1,000 files for a directory. If you need to retrieve more files, use the [Git Trees
    * API](https://docs.github.com/rest/reference/git#get-a-tree).
    *  *  Download URLs expire and are meant to be used just once. To ensure the download URL does not expire, please use the contents API to obtain a fresh download URL for each download.
    * #### Size limits
    * If the requested file's size is:
    * * 1 MB or smaller: All features of this endpoint are supported.
    * * Between 1-100 MB: Only the `raw` or `object` [custom media types](https://docs.github.com/rest/repos/contents#custom-media-types-for-repository-contents) are supported. Both will work as normal, except that when using the `object` media type, the `content` field will be an empty string and the `encoding` field will be `"none"`. To get the contents of these larger files, use the `raw` media type.
    *  * Greater than 100 MB: This endpoint is not supported.
    *
    * #### If the content is a directory
    * The response will be an array of objects, one object for each item in the directory.
    * When listing the contents of a directory, submodules have their "type" specified as "file". Logically, the value
    * _should_ be "submodule". This behavior exists in API v3 [for backwards compatibility purposes](https://git.io/v1YCW).
    * In the next major version of the API, the type will be returned as "submodule".
    *
    * #### If the content is a symlink
    * If the requested `:path` points to a symlink, and the symlink's target is a normal file in the repository, then the
    * API responds with the content of the file (in the format shown in the example. Otherwise, the API responds with an object
    * describing the symlink itself.
    *
    * #### If the content is a submodule
    * The `submodule_git_url` identifies the location of the submodule repository, and the `sha` identifies a specific
    * commit within the submodule repository. Git uses the given URL when cloning the submodule repository, and checks out
    * the submodule at that specific commit.
    *
    * If the submodule repository is not hosted on github.com, the Git URLs (`git_url` and `_links["git"]`) and the
    * github.com URLs (`html_url` and `_links["html"]`) will have null values.
    */
  def getContent(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/contents/{path}']['response'] */ js.Any
  ]
  def getContent(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/contents/{path}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/contents/{path}']['response'] */ js.Any
  ]
  /**
    * Gets the contents of a file or directory in a repository. Specify the file path or directory in `:path`. If you omit
    * `:path`, you will receive the contents of the repository's root directory. See the description below regarding what the API response includes for directories.
    *
    * Files and symlinks support [a custom media type](https://docs.github.com/rest/reference/repos#custom-media-types) for
    * retrieving the raw content or rendered HTML (when supported). All content types support [a custom media
    * type](https://docs.github.com/rest/reference/repos#custom-media-types) to ensure the content is returned in a consistent
    * object format.
    *
    * **Notes**:
    * *   To get a repository's contents recursively, you can [recursively get the tree](https://docs.github.com/rest/reference/git#trees).
    * *   This API has an upper limit of 1,000 files for a directory. If you need to retrieve more files, use the [Git Trees
    * API](https://docs.github.com/rest/reference/git#get-a-tree).
    *  *  Download URLs expire and are meant to be used just once. To ensure the download URL does not expire, please use the contents API to obtain a fresh download URL for each download.
    * #### Size limits
    * If the requested file's size is:
    * * 1 MB or smaller: All features of this endpoint are supported.
    * * Between 1-100 MB: Only the `raw` or `object` [custom media types](https://docs.github.com/rest/repos/contents#custom-media-types-for-repository-contents) are supported. Both will work as normal, except that when using the `object` media type, the `content` field will be an empty string and the `encoding` field will be `"none"`. To get the contents of these larger files, use the `raw` media type.
    *  * Greater than 100 MB: This endpoint is not supported.
    *
    * #### If the content is a directory
    * The response will be an array of objects, one object for each item in the directory.
    * When listing the contents of a directory, submodules have their "type" specified as "file". Logically, the value
    * _should_ be "submodule". This behavior exists in API v3 [for backwards compatibility purposes](https://git.io/v1YCW).
    * In the next major version of the API, the type will be returned as "submodule".
    *
    * #### If the content is a symlink
    * If the requested `:path` points to a symlink, and the symlink's target is a normal file in the repository, then the
    * API responds with the content of the file (in the format shown in the example. Otherwise, the API responds with an object
    * describing the symlink itself.
    *
    * #### If the content is a submodule
    * The `submodule_git_url` identifies the location of the submodule repository, and the `sha` identifies a specific
    * commit within the submodule repository. Git uses the given URL when cloning the submodule repository, and checks out
    * the submodule at that specific commit.
    *
    * If the submodule repository is not hosted on github.com, the Git URLs (`git_url` and `_links["git"]`) and the
    * github.com URLs (`html_url` and `_links["html"]`) will have null values.
    */
  @JSName("getContent")
  var getContent_Original: `609`
  
  /**
    * Returns the `total` number of commits authored by the contributor. In addition, the response includes a Weekly Hash (`weeks` array) with the following information:
    *
    * *   `w` - Start of the week, given as a [Unix timestamp](http://en.wikipedia.org/wiki/Unix_time).
    * *   `a` - Number of additions
    * *   `d` - Number of deletions
    * *   `c` - Number of commits
    */
  def getContributorsStats(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/stats/contributors']['response'] */ js.Any
  ]
  def getContributorsStats(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/stats/contributors']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/stats/contributors']['response'] */ js.Any
  ]
  /**
    * Returns the `total` number of commits authored by the contributor. In addition, the response includes a Weekly Hash (`weeks` array) with the following information:
    *
    * *   `w` - Start of the week, given as a [Unix timestamp](http://en.wikipedia.org/wiki/Unix_time).
    * *   `a` - Number of additions
    * *   `d` - Number of deletions
    * *   `c` - Number of commits
    */
  @JSName("getContributorsStats")
  var getContributorsStats_Original: `610`
  
  def getDeployKey(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/keys/{key_id}']['response'] */ js.Any
  ]
  def getDeployKey(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/keys/{key_id}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/keys/{key_id}']['response'] */ js.Any
  ]
  @JSName("getDeployKey")
  var getDeployKey_Original: `611`
  
  def getDeployment(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/deployments/{deployment_id}']['response'] */ js.Any
  ]
  def getDeployment(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/deployments/{deployment_id}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/deployments/{deployment_id}']['response'] */ js.Any
  ]
  
  /**
    * Gets a deployment branch policy for an environment.
    *
    * Anyone with read access to the repository can use this endpoint. If the repository is private, you must use an access token with the `repo` scope. GitHub Apps must have the `actions:read` permission to use this endpoint.
    */
  def getDeploymentBranchPolicy(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/environments/{environment_name}/deployment-branch-policies/{branch_policy_id}']['response'] */ js.Any
  ]
  def getDeploymentBranchPolicy(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/environments/{environment_name}/deployment-branch-policies/{branch_policy_id}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/environments/{environment_name}/deployment-branch-policies/{branch_policy_id}']['response'] */ js.Any
  ]
  /**
    * Gets a deployment branch policy for an environment.
    *
    * Anyone with read access to the repository can use this endpoint. If the repository is private, you must use an access token with the `repo` scope. GitHub Apps must have the `actions:read` permission to use this endpoint.
    */
  @JSName("getDeploymentBranchPolicy")
  var getDeploymentBranchPolicy_Original: `613`
  
  /**
    * Users with pull access can view a deployment status for a deployment:
    */
  def getDeploymentStatus(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/deployments/{deployment_id}/statuses/{status_id}']['response'] */ js.Any
  ]
  def getDeploymentStatus(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/deployments/{deployment_id}/statuses/{status_id}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/deployments/{deployment_id}/statuses/{status_id}']['response'] */ js.Any
  ]
  /**
    * Users with pull access can view a deployment status for a deployment:
    */
  @JSName("getDeploymentStatus")
  var getDeploymentStatus_Original: `614`
  
  @JSName("getDeployment")
  var getDeployment_Original: `612`
  
  /**
    * **Note:** To get information about name patterns that branches must match in order to deploy to this environment, see "[Get a deployment branch policy](/rest/deployments/branch-policies#get-a-deployment-branch-policy)."
    *
    * Anyone with read access to the repository can use this endpoint. If the
    * repository is private, you must use an access token with the `repo` scope. GitHub
    * Apps must have the `actions:read` permission to use this endpoint.
    */
  def getEnvironment(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/environments/{environment_name}']['response'] */ js.Any
  ]
  def getEnvironment(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/environments/{environment_name}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/environments/{environment_name}']['response'] */ js.Any
  ]
  /**
    * **Note:** To get information about name patterns that branches must match in order to deploy to this environment, see "[Get a deployment branch policy](/rest/deployments/branch-policies#get-a-deployment-branch-policy)."
    *
    * Anyone with read access to the repository can use this endpoint. If the
    * repository is private, you must use an access token with the `repo` scope. GitHub
    * Apps must have the `actions:read` permission to use this endpoint.
    */
  @JSName("getEnvironment")
  var getEnvironment_Original: `615`
  
  def getLatestPagesBuild(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/pages/builds/latest']['response'] */ js.Any
  ]
  def getLatestPagesBuild(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/pages/builds/latest']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/pages/builds/latest']['response'] */ js.Any
  ]
  @JSName("getLatestPagesBuild")
  var getLatestPagesBuild_Original: `616`
  
  /**
    * View the latest published full release for the repository.
    *
    * The latest release is the most recent non-prerelease, non-draft release, sorted by the `created_at` attribute. The `created_at` attribute is the date of the commit used for the release, and not the date when the release was drafted or published.
    */
  def getLatestRelease(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/releases/latest']['response'] */ js.Any
  ]
  def getLatestRelease(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/releases/latest']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/releases/latest']['response'] */ js.Any
  ]
  /**
    * View the latest published full release for the repository.
    *
    * The latest release is the most recent non-prerelease, non-draft release, sorted by the `created_at` attribute. The `created_at` attribute is the date of the commit used for the release, and not the date when the release was drafted or published.
    */
  @JSName("getLatestRelease")
  var getLatestRelease_Original: `617`
  
  def getPages(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/pages']['response'] */ js.Any
  ]
  def getPages(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/pages']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/pages']['response'] */ js.Any
  ]
  
  def getPagesBuild(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/pages/builds/{build_id}']['response'] */ js.Any
  ]
  def getPagesBuild(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/pages/builds/{build_id}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/pages/builds/{build_id}']['response'] */ js.Any
  ]
  @JSName("getPagesBuild")
  var getPagesBuild_Original: `619`
  
  /**
    * Gets a health check of the DNS settings for the `CNAME` record configured for a repository's GitHub Pages.
    *
    * The first request to this endpoint returns a `202 Accepted` status and starts an asynchronous background task to get the results for the domain. After the background task completes, subsequent requests to this endpoint return a `200 OK` status with the health check results in the response.
    *
    * Users must have admin or owner permissions. GitHub Apps must have the `pages:write` and `administration:write` permission to use this endpoint.
    */
  def getPagesHealthCheck(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/pages/health']['response'] */ js.Any
  ]
  def getPagesHealthCheck(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/pages/health']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/pages/health']['response'] */ js.Any
  ]
  /**
    * Gets a health check of the DNS settings for the `CNAME` record configured for a repository's GitHub Pages.
    *
    * The first request to this endpoint returns a `202 Accepted` status and starts an asynchronous background task to get the results for the domain. After the background task completes, subsequent requests to this endpoint return a `200 OK` status with the health check results in the response.
    *
    * Users must have admin or owner permissions. GitHub Apps must have the `pages:write` and `administration:write` permission to use this endpoint.
    */
  @JSName("getPagesHealthCheck")
  var getPagesHealthCheck_Original: `620`
  
  @JSName("getPages")
  var getPages_Original: `618`
  
  /**
    * Returns the total commit counts for the `owner` and total commit counts in `all`. `all` is everyone combined, including the `owner` in the last 52 weeks. If you'd like to get the commit counts for non-owners, you can subtract `owner` from `all`.
    *
    * The array order is oldest week (index 0) to most recent week.
    */
  def getParticipationStats(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/stats/participation']['response'] */ js.Any
  ]
  def getParticipationStats(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/stats/participation']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/stats/participation']['response'] */ js.Any
  ]
  /**
    * Returns the total commit counts for the `owner` and total commit counts in `all`. `all` is everyone combined, including the `owner` in the last 52 weeks. If you'd like to get the commit counts for non-owners, you can subtract `owner` from `all`.
    *
    * The array order is oldest week (index 0) to most recent week.
    */
  @JSName("getParticipationStats")
  var getParticipationStats_Original: `621`
  
  /**
    * Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    */
  def getPullRequestReviewProtection(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/branches/{branch}/protection/required_pull_request_reviews']['response'] */ js.Any
  ]
  def getPullRequestReviewProtection(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/branches/{branch}/protection/required_pull_request_reviews']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/branches/{branch}/protection/required_pull_request_reviews']['response'] */ js.Any
  ]
  /**
    * Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    */
  @JSName("getPullRequestReviewProtection")
  var getPullRequestReviewProtection_Original: `622`
  
  /**
    * Each array contains the day number, hour number, and number of commits:
    *
    * *   `0-6`: Sunday - Saturday
    * *   `0-23`: Hour of day
    * *   Number of commits
    *
    * For example, `[2, 14, 25]` indicates that there were 25 total commits, during the 2:00pm hour on Tuesdays. All times are based on the time zone of individual commits.
    */
  def getPunchCardStats(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/stats/punch_card']['response'] */ js.Any
  ]
  def getPunchCardStats(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/stats/punch_card']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/stats/punch_card']['response'] */ js.Any
  ]
  /**
    * Each array contains the day number, hour number, and number of commits:
    *
    * *   `0-6`: Sunday - Saturday
    * *   `0-23`: Hour of day
    * *   Number of commits
    *
    * For example, `[2, 14, 25]` indicates that there were 25 total commits, during the 2:00pm hour on Tuesdays. All times are based on the time zone of individual commits.
    */
  @JSName("getPunchCardStats")
  var getPunchCardStats_Original: `623`
  
  /**
    * Gets the preferred README for a repository.
    *
    * READMEs support [custom media types](https://docs.github.com/rest/reference/repos#custom-media-types) for retrieving the raw content or rendered HTML.
    */
  def getReadme(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/readme']['response'] */ js.Any
  ]
  def getReadme(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/readme']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/readme']['response'] */ js.Any
  ]
  
  /**
    * Gets the README from a repository directory.
    *
    * READMEs support [custom media types](https://docs.github.com/rest/reference/repos#custom-media-types) for retrieving the raw content or rendered HTML.
    */
  def getReadmeInDirectory(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/readme/{dir}']['response'] */ js.Any
  ]
  def getReadmeInDirectory(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/readme/{dir}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/readme/{dir}']['response'] */ js.Any
  ]
  /**
    * Gets the README from a repository directory.
    *
    * READMEs support [custom media types](https://docs.github.com/rest/reference/repos#custom-media-types) for retrieving the raw content or rendered HTML.
    */
  @JSName("getReadmeInDirectory")
  var getReadmeInDirectory_Original: `625`
  
  /**
    * Gets the preferred README for a repository.
    *
    * READMEs support [custom media types](https://docs.github.com/rest/reference/repos#custom-media-types) for retrieving the raw content or rendered HTML.
    */
  @JSName("getReadme")
  var getReadme_Original: `624`
  
  /**
    * **Note:** This returns an `upload_url` key corresponding to the endpoint for uploading release assets. This key is a [hypermedia resource](https://docs.github.com/rest/overview/resources-in-the-rest-api#hypermedia).
    */
  def getRelease(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/releases/{release_id}']['response'] */ js.Any
  ]
  def getRelease(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/releases/{release_id}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/releases/{release_id}']['response'] */ js.Any
  ]
  
  /**
    * To download the asset's binary content, set the `Accept` header of the request to [`application/octet-stream`](https://docs.github.com/rest/overview/media-types). The API will either redirect the client to the location, or stream it directly if possible. API clients should handle both a `200` or `302` response.
    */
  def getReleaseAsset(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/releases/assets/{asset_id}']['response'] */ js.Any
  ]
  def getReleaseAsset(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/releases/assets/{asset_id}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/releases/assets/{asset_id}']['response'] */ js.Any
  ]
  /**
    * To download the asset's binary content, set the `Accept` header of the request to [`application/octet-stream`](https://docs.github.com/rest/overview/media-types). The API will either redirect the client to the location, or stream it directly if possible. API clients should handle both a `200` or `302` response.
    */
  @JSName("getReleaseAsset")
  var getReleaseAsset_Original: `627`
  
  /**
    * Get a published release with the specified tag.
    */
  def getReleaseByTag(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/releases/tags/{tag}']['response'] */ js.Any
  ]
  def getReleaseByTag(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/releases/tags/{tag}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/releases/tags/{tag}']['response'] */ js.Any
  ]
  /**
    * Get a published release with the specified tag.
    */
  @JSName("getReleaseByTag")
  var getReleaseByTag_Original: `628`
  
  /**
    * **Note:** This returns an `upload_url` key corresponding to the endpoint for uploading release assets. This key is a [hypermedia resource](https://docs.github.com/rest/overview/resources-in-the-rest-api#hypermedia).
    */
  @JSName("getRelease")
  var getRelease_Original: `626`
  
  /**
    * Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    */
  def getStatusChecksProtection(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/branches/{branch}/protection/required_status_checks']['response'] */ js.Any
  ]
  def getStatusChecksProtection(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/branches/{branch}/protection/required_status_checks']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/branches/{branch}/protection/required_status_checks']['response'] */ js.Any
  ]
  /**
    * Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    */
  @JSName("getStatusChecksProtection")
  var getStatusChecksProtection_Original: `629`
  
  /**
    * Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    *
    * Lists the teams who have push access to this branch. The list includes child teams.
    */
  def getTeamsWithAccessToProtectedBranch(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/branches/{branch}/protection/restrictions/teams']['response'] */ js.Any
  ]
  def getTeamsWithAccessToProtectedBranch(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/branches/{branch}/protection/restrictions/teams']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/branches/{branch}/protection/restrictions/teams']['response'] */ js.Any
  ]
  /**
    * Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    *
    * Lists the teams who have push access to this branch. The list includes child teams.
    */
  @JSName("getTeamsWithAccessToProtectedBranch")
  var getTeamsWithAccessToProtectedBranch_Original: `630`
  
  /**
    * Get the top 10 popular contents over the last 14 days.
    */
  def getTopPaths(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/traffic/popular/paths']['response'] */ js.Any
  ]
  def getTopPaths(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/traffic/popular/paths']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/traffic/popular/paths']['response'] */ js.Any
  ]
  /**
    * Get the top 10 popular contents over the last 14 days.
    */
  @JSName("getTopPaths")
  var getTopPaths_Original: `631`
  
  /**
    * Get the top 10 referrers over the last 14 days.
    */
  def getTopReferrers(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/traffic/popular/referrers']['response'] */ js.Any
  ]
  def getTopReferrers(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/traffic/popular/referrers']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/traffic/popular/referrers']['response'] */ js.Any
  ]
  /**
    * Get the top 10 referrers over the last 14 days.
    */
  @JSName("getTopReferrers")
  var getTopReferrers_Original: `632`
  
  /**
    * Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    *
    * Lists the people who have push access to this branch.
    */
  def getUsersWithAccessToProtectedBranch(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/branches/{branch}/protection/restrictions/users']['response'] */ js.Any
  ]
  def getUsersWithAccessToProtectedBranch(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/branches/{branch}/protection/restrictions/users']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/branches/{branch}/protection/restrictions/users']['response'] */ js.Any
  ]
  /**
    * Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    *
    * Lists the people who have push access to this branch.
    */
  @JSName("getUsersWithAccessToProtectedBranch")
  var getUsersWithAccessToProtectedBranch_Original: `633`
  
  /**
    * Get the total number of views and breakdown per day or week for the last 14 days. Timestamps are aligned to UTC midnight of the beginning of the day or week. Week begins on Monday.
    */
  def getViews(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/traffic/views']['response'] */ js.Any
  ]
  def getViews(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/traffic/views']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/traffic/views']['response'] */ js.Any
  ]
  /**
    * Get the total number of views and breakdown per day or week for the last 14 days. Timestamps are aligned to UTC midnight of the beginning of the day or week. Week begins on Monday.
    */
  @JSName("getViews")
  var getViews_Original: `634`
  
  /**
    * Returns a webhook configured in a repository. To get only the webhook `config` properties, see "[Get a webhook configuration for a repository](/rest/reference/repos#get-a-webhook-configuration-for-a-repository)."
    */
  def getWebhook(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/hooks/{hook_id}']['response'] */ js.Any
  ]
  def getWebhook(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/hooks/{hook_id}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/hooks/{hook_id}']['response'] */ js.Any
  ]
  
  /**
    * Returns the webhook configuration for a repository. To get more information about the webhook, including the `active` state and `events`, use "[Get a repository webhook](/rest/reference/orgs#get-a-repository-webhook)."
    *
    * Access tokens must have the `read:repo_hook` or `repo` scope, and GitHub Apps must have the `repository_hooks:read` permission.
    */
  def getWebhookConfigForRepo(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/hooks/{hook_id}/config']['response'] */ js.Any
  ]
  def getWebhookConfigForRepo(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/hooks/{hook_id}/config']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/hooks/{hook_id}/config']['response'] */ js.Any
  ]
  /**
    * Returns the webhook configuration for a repository. To get more information about the webhook, including the `active` state and `events`, use "[Get a repository webhook](/rest/reference/orgs#get-a-repository-webhook)."
    *
    * Access tokens must have the `read:repo_hook` or `repo` scope, and GitHub Apps must have the `repository_hooks:read` permission.
    */
  @JSName("getWebhookConfigForRepo")
  var getWebhookConfigForRepo_Original: `636`
  
  /**
    * Returns a delivery for a webhook configured in a repository.
    */
  def getWebhookDelivery(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/hooks/{hook_id}/deliveries/{delivery_id}']['response'] */ js.Any
  ]
  def getWebhookDelivery(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/hooks/{hook_id}/deliveries/{delivery_id}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/hooks/{hook_id}/deliveries/{delivery_id}']['response'] */ js.Any
  ]
  /**
    * Returns a delivery for a webhook configured in a repository.
    */
  @JSName("getWebhookDelivery")
  var getWebhookDelivery_Original: `637`
  
  /**
    * Returns a webhook configured in a repository. To get only the webhook `config` properties, see "[Get a webhook configuration for a repository](/rest/reference/repos#get-a-webhook-configuration-for-a-repository)."
    */
  @JSName("getWebhook")
  var getWebhook_Original: `635`
  
  /**
    * The `parent` and `source` objects are present when the repository is a fork. `parent` is the repository this repository was forked from, `source` is the ultimate source for the network.
    */
  @JSName("get")
  var get_Original: `590`
  
  /**
    * This returns a list of autolinks configured for the given repository.
    *
    * Information about autolinks are only available to repository administrators.
    */
  def listAutolinks(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/autolinks']['response'] */ js.Any
  ]
  def listAutolinks(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/autolinks']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/autolinks']['response'] */ js.Any
  ]
  /**
    * This returns a list of autolinks configured for the given repository.
    *
    * Information about autolinks are only available to repository administrators.
    */
  @JSName("listAutolinks")
  var listAutolinks_Original: `638`
  
  def listBranches(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/branches']['response'] */ js.Any
  ]
  def listBranches(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/branches']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/branches']['response'] */ js.Any
  ]
  
  /**
    * Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    *
    * Returns all branches where the given commit SHA is the HEAD, or latest commit for the branch.
    */
  def listBranchesForHeadCommit(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/commits/{commit_sha}/branches-where-head']['response'] */ js.Any
  ]
  def listBranchesForHeadCommit(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/commits/{commit_sha}/branches-where-head']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/commits/{commit_sha}/branches-where-head']['response'] */ js.Any
  ]
  /**
    * Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    *
    * Returns all branches where the given commit SHA is the HEAD, or latest commit for the branch.
    */
  @JSName("listBranchesForHeadCommit")
  var listBranchesForHeadCommit_Original: `640`
  
  @JSName("listBranches")
  var listBranches_Original: `639`
  
  /**
    * For organization-owned repositories, the list of collaborators includes outside collaborators, organization members that are direct collaborators, organization members with access through team memberships, organization members with access through default organization permissions, and organization owners.
    * Organization members with write, maintain, or admin privileges on the organization-owned repository can use this endpoint.
    *
    * Team members will include the members of child teams.
    *
    * You must authenticate using an access token with the `read:org` and `repo` scopes with push access to use this
    * endpoint. GitHub Apps must have the `members` organization permission and `metadata` repository permission to use this
    * endpoint.
    */
  def listCollaborators(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/collaborators']['response'] */ js.Any
  ]
  def listCollaborators(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/collaborators']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/collaborators']['response'] */ js.Any
  ]
  /**
    * For organization-owned repositories, the list of collaborators includes outside collaborators, organization members that are direct collaborators, organization members with access through team memberships, organization members with access through default organization permissions, and organization owners.
    * Organization members with write, maintain, or admin privileges on the organization-owned repository can use this endpoint.
    *
    * Team members will include the members of child teams.
    *
    * You must authenticate using an access token with the `read:org` and `repo` scopes with push access to use this
    * endpoint. GitHub Apps must have the `members` organization permission and `metadata` repository permission to use this
    * endpoint.
    */
  @JSName("listCollaborators")
  var listCollaborators_Original: `641`
  
  /**
    * Use the `:commit_sha` to specify the commit that will have its comments listed.
    */
  def listCommentsForCommit(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/commits/{commit_sha}/comments']['response'] */ js.Any
  ]
  def listCommentsForCommit(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/commits/{commit_sha}/comments']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/commits/{commit_sha}/comments']['response'] */ js.Any
  ]
  /**
    * Use the `:commit_sha` to specify the commit that will have its comments listed.
    */
  @JSName("listCommentsForCommit")
  var listCommentsForCommit_Original: `642`
  
  /**
    * Commit Comments use [these custom media types](https://docs.github.com/rest/reference/repos#custom-media-types). You can read more about the use of media types in the API [here](https://docs.github.com/rest/overview/media-types/).
    *
    * Comments are ordered by ascending ID.
    */
  def listCommitCommentsForRepo(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/comments']['response'] */ js.Any
  ]
  def listCommitCommentsForRepo(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/comments']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/comments']['response'] */ js.Any
  ]
  /**
    * Commit Comments use [these custom media types](https://docs.github.com/rest/reference/repos#custom-media-types). You can read more about the use of media types in the API [here](https://docs.github.com/rest/overview/media-types/).
    *
    * Comments are ordered by ascending ID.
    */
  @JSName("listCommitCommentsForRepo")
  var listCommitCommentsForRepo_Original: `643`
  
  /**
    * Users with pull access in a repository can view commit statuses for a given ref. The ref can be a SHA, a branch name, or a tag name. Statuses are returned in reverse chronological order. The first status in the list will be the latest one.
    *
    * This resource is also available via a legacy route: `GET /repos/:owner/:repo/statuses/:ref`.
    */
  def listCommitStatusesForRef(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/commits/{ref}/statuses']['response'] */ js.Any
  ]
  def listCommitStatusesForRef(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/commits/{ref}/statuses']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/commits/{ref}/statuses']['response'] */ js.Any
  ]
  /**
    * Users with pull access in a repository can view commit statuses for a given ref. The ref can be a SHA, a branch name, or a tag name. Statuses are returned in reverse chronological order. The first status in the list will be the latest one.
    *
    * This resource is also available via a legacy route: `GET /repos/:owner/:repo/statuses/:ref`.
    */
  @JSName("listCommitStatusesForRef")
  var listCommitStatusesForRef_Original: `644`
  
  /**
    * **Signature verification object**
    *
    * The response will include a `verification` object that describes the result of verifying the commit's signature. The following fields are included in the `verification` object:
    *
    * | Name | Type | Description |
    * | ---- | ---- | ----------- |
    * | `verified` | `boolean` | Indicates whether GitHub considers the signature in this commit to be verified. |
    * | `reason` | `string` | The reason for verified value. Possible values and their meanings are enumerated in table below. |
    * | `signature` | `string` | The signature that was extracted from the commit. |
    * | `payload` | `string` | The value that was signed. |
    *
    * These are the possible values for `reason` in the `verification` object:
    *
    * | Value | Description |
    * | ----- | ----------- |
    * | `expired_key` | The key that made the signature is expired. |
    * | `not_signing_key` | The "signing" flag is not among the usage flags in the GPG key that made the signature. |
    * | `gpgverify_error` | There was an error communicating with the signature verification service. |
    * | `gpgverify_unavailable` | The signature verification service is currently unavailable. |
    * | `unsigned` | The object does not include a signature. |
    * | `unknown_signature_type` | A non-PGP signature was found in the commit. |
    * | `no_user` | No user was associated with the `committer` email address in the commit. |
    * | `unverified_email` | The `committer` email address in the commit was associated with a user, but the email address is not verified on her/his account. |
    * | `bad_email` | The `committer` email address in the commit is not included in the identities of the PGP key that made the signature. |
    * | `unknown_key` | The key that made the signature has not been registered with any user's account. |
    * | `malformed_signature` | There was an error parsing the signature. |
    * | `invalid` | The signature could not be cryptographically verified using the key whose key-id was found in the signature. |
    * | `valid` | None of the above errors applied, so the signature is considered to be verified. |
    */
  def listCommits(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/commits']['response'] */ js.Any
  ]
  def listCommits(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/commits']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/commits']['response'] */ js.Any
  ]
  /**
    * **Signature verification object**
    *
    * The response will include a `verification` object that describes the result of verifying the commit's signature. The following fields are included in the `verification` object:
    *
    * | Name | Type | Description |
    * | ---- | ---- | ----------- |
    * | `verified` | `boolean` | Indicates whether GitHub considers the signature in this commit to be verified. |
    * | `reason` | `string` | The reason for verified value. Possible values and their meanings are enumerated in table below. |
    * | `signature` | `string` | The signature that was extracted from the commit. |
    * | `payload` | `string` | The value that was signed. |
    *
    * These are the possible values for `reason` in the `verification` object:
    *
    * | Value | Description |
    * | ----- | ----------- |
    * | `expired_key` | The key that made the signature is expired. |
    * | `not_signing_key` | The "signing" flag is not among the usage flags in the GPG key that made the signature. |
    * | `gpgverify_error` | There was an error communicating with the signature verification service. |
    * | `gpgverify_unavailable` | The signature verification service is currently unavailable. |
    * | `unsigned` | The object does not include a signature. |
    * | `unknown_signature_type` | A non-PGP signature was found in the commit. |
    * | `no_user` | No user was associated with the `committer` email address in the commit. |
    * | `unverified_email` | The `committer` email address in the commit was associated with a user, but the email address is not verified on her/his account. |
    * | `bad_email` | The `committer` email address in the commit is not included in the identities of the PGP key that made the signature. |
    * | `unknown_key` | The key that made the signature has not been registered with any user's account. |
    * | `malformed_signature` | There was an error parsing the signature. |
    * | `invalid` | The signature could not be cryptographically verified using the key whose key-id was found in the signature. |
    * | `valid` | None of the above errors applied, so the signature is considered to be verified. |
    */
  @JSName("listCommits")
  var listCommits_Original: `645`
  
  /**
    * Lists contributors to the specified repository and sorts them by the number of commits per contributor in descending order. This endpoint may return information that is a few hours old because the GitHub REST API v3 caches contributor data to improve performance.
    *
    * GitHub identifies contributors by author email address. This endpoint groups contribution counts by GitHub user, which includes all associated email addresses. To improve performance, only the first 500 author email addresses in the repository link to GitHub users. The rest will appear as anonymous contributors without associated GitHub user information.
    */
  def listContributors(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/contributors']['response'] */ js.Any
  ]
  def listContributors(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/contributors']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/contributors']['response'] */ js.Any
  ]
  /**
    * Lists contributors to the specified repository and sorts them by the number of commits per contributor in descending order. This endpoint may return information that is a few hours old because the GitHub REST API v3 caches contributor data to improve performance.
    *
    * GitHub identifies contributors by author email address. This endpoint groups contribution counts by GitHub user, which includes all associated email addresses. To improve performance, only the first 500 author email addresses in the repository link to GitHub users. The rest will appear as anonymous contributors without associated GitHub user information.
    */
  @JSName("listContributors")
  var listContributors_Original: `646`
  
  def listDeployKeys(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/keys']['response'] */ js.Any
  ]
  def listDeployKeys(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/keys']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/keys']['response'] */ js.Any
  ]
  @JSName("listDeployKeys")
  var listDeployKeys_Original: `647`
  
  /**
    * Lists the deployment branch policies for an environment.
    *
    * Anyone with read access to the repository can use this endpoint. If the repository is private, you must use an access token with the `repo` scope. GitHub Apps must have the `actions:read` permission to use this endpoint.
    */
  def listDeploymentBranchPolicies(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/environments/{environment_name}/deployment-branch-policies']['response'] */ js.Any
  ]
  def listDeploymentBranchPolicies(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/environments/{environment_name}/deployment-branch-policies']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/environments/{environment_name}/deployment-branch-policies']['response'] */ js.Any
  ]
  /**
    * Lists the deployment branch policies for an environment.
    *
    * Anyone with read access to the repository can use this endpoint. If the repository is private, you must use an access token with the `repo` scope. GitHub Apps must have the `actions:read` permission to use this endpoint.
    */
  @JSName("listDeploymentBranchPolicies")
  var listDeploymentBranchPolicies_Original: `648`
  
  /**
    * Users with pull access can view deployment statuses for a deployment:
    */
  def listDeploymentStatuses(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/deployments/{deployment_id}/statuses']['response'] */ js.Any
  ]
  def listDeploymentStatuses(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/deployments/{deployment_id}/statuses']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/deployments/{deployment_id}/statuses']['response'] */ js.Any
  ]
  /**
    * Users with pull access can view deployment statuses for a deployment:
    */
  @JSName("listDeploymentStatuses")
  var listDeploymentStatuses_Original: `649`
  
  /**
    * Simple filtering of deployments is available via query parameters:
    */
  def listDeployments(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/deployments']['response'] */ js.Any
  ]
  def listDeployments(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/deployments']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/deployments']['response'] */ js.Any
  ]
  /**
    * Simple filtering of deployments is available via query parameters:
    */
  @JSName("listDeployments")
  var listDeployments_Original: `650`
  
  /**
    * Lists repositories that the authenticated user has explicit permission (`:read`, `:write`, or `:admin`) to access.
    *
    * The authenticated user has explicit permission to access repositories they own, repositories where they are a collaborator, and repositories that they can access through an organization membership.
    */
  def listForAuthenticatedUser(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /user/repos']['response'] */ js.Any
  ]
  def listForAuthenticatedUser(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /user/repos']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /user/repos']['response'] */ js.Any
  ]
  /**
    * Lists repositories that the authenticated user has explicit permission (`:read`, `:write`, or `:admin`) to access.
    *
    * The authenticated user has explicit permission to access repositories they own, repositories where they are a collaborator, and repositories that they can access through an organization membership.
    */
  @JSName("listForAuthenticatedUser")
  var listForAuthenticatedUser_Original: `651`
  
  /**
    * Lists repositories for the specified organization.
    */
  def listForOrg(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/repos']['response'] */ js.Any
  ]
  def listForOrg(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/repos']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/repos']['response'] */ js.Any
  ]
  /**
    * Lists repositories for the specified organization.
    */
  @JSName("listForOrg")
  var listForOrg_Original: `652`
  
  /**
    * Lists public repositories for the specified user. Note: For GitHub AE, this endpoint will list internal repositories for the specified user.
    */
  def listForUser(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /users/{username}/repos']['response'] */ js.Any
  ]
  def listForUser(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /users/{username}/repos']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /users/{username}/repos']['response'] */ js.Any
  ]
  /**
    * Lists public repositories for the specified user. Note: For GitHub AE, this endpoint will list internal repositories for the specified user.
    */
  @JSName("listForUser")
  var listForUser_Original: `653`
  
  def listForks(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/forks']['response'] */ js.Any
  ]
  def listForks(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/forks']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/forks']['response'] */ js.Any
  ]
  @JSName("listForks")
  var listForks_Original: `654`
  
  /**
    * When authenticating as a user with admin rights to a repository, this endpoint will list all currently open repository invitations.
    */
  def listInvitations(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/invitations']['response'] */ js.Any
  ]
  def listInvitations(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/invitations']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/invitations']['response'] */ js.Any
  ]
  
  /**
    * When authenticating as a user, this endpoint will list all currently open repository invitations for that user.
    */
  def listInvitationsForAuthenticatedUser(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /user/repository_invitations']['response'] */ js.Any
  ]
  def listInvitationsForAuthenticatedUser(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /user/repository_invitations']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /user/repository_invitations']['response'] */ js.Any
  ]
  /**
    * When authenticating as a user, this endpoint will list all currently open repository invitations for that user.
    */
  @JSName("listInvitationsForAuthenticatedUser")
  var listInvitationsForAuthenticatedUser_Original: `656`
  
  /**
    * When authenticating as a user with admin rights to a repository, this endpoint will list all currently open repository invitations.
    */
  @JSName("listInvitations")
  var listInvitations_Original: `655`
  
  /**
    * Lists languages for the specified repository. The value shown for each language is the number of bytes of code written in that language.
    */
  def listLanguages(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/languages']['response'] */ js.Any
  ]
  def listLanguages(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/languages']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/languages']['response'] */ js.Any
  ]
  /**
    * Lists languages for the specified repository. The value shown for each language is the number of bytes of code written in that language.
    */
  @JSName("listLanguages")
  var listLanguages_Original: `657`
  
  def listPagesBuilds(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/pages/builds']['response'] */ js.Any
  ]
  def listPagesBuilds(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/pages/builds']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/pages/builds']['response'] */ js.Any
  ]
  @JSName("listPagesBuilds")
  var listPagesBuilds_Original: `658`
  
  /**
    * Lists all public repositories in the order that they were created.
    *
    * Note:
    * - For GitHub Enterprise Server, this endpoint will only list repositories available to all users on the enterprise.
    * - Pagination is powered exclusively by the `since` parameter. Use the [Link header](https://docs.github.com/rest/overview/resources-in-the-rest-api#link-header) to get the URL for the next page of repositories.
    */
  def listPublic(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repositories']['response'] */ js.Any
  ]
  def listPublic(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repositories']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repositories']['response'] */ js.Any
  ]
  /**
    * Lists all public repositories in the order that they were created.
    *
    * Note:
    * - For GitHub Enterprise Server, this endpoint will only list repositories available to all users on the enterprise.
    * - Pagination is powered exclusively by the `since` parameter. Use the [Link header](https://docs.github.com/rest/overview/resources-in-the-rest-api#link-header) to get the URL for the next page of repositories.
    */
  @JSName("listPublic")
  var listPublic_Original: `659`
  
  /**
    * Lists the merged pull request that introduced the commit to the repository. If the commit is not present in the default branch, additionally returns open pull requests associated with the commit. The results may include open and closed pull requests.
    */
  def listPullRequestsAssociatedWithCommit(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/commits/{commit_sha}/pulls']['response'] */ js.Any
  ]
  def listPullRequestsAssociatedWithCommit(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/commits/{commit_sha}/pulls']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/commits/{commit_sha}/pulls']['response'] */ js.Any
  ]
  /**
    * Lists the merged pull request that introduced the commit to the repository. If the commit is not present in the default branch, additionally returns open pull requests associated with the commit. The results may include open and closed pull requests.
    */
  @JSName("listPullRequestsAssociatedWithCommit")
  var listPullRequestsAssociatedWithCommit_Original: `660`
  
  def listReleaseAssets(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/releases/{release_id}/assets']['response'] */ js.Any
  ]
  def listReleaseAssets(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/releases/{release_id}/assets']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/releases/{release_id}/assets']['response'] */ js.Any
  ]
  @JSName("listReleaseAssets")
  var listReleaseAssets_Original: `661`
  
  /**
    * This returns a list of releases, which does not include regular Git tags that have not been associated with a release. To get a list of Git tags, use the [Repository Tags API](https://docs.github.com/rest/reference/repos#list-repository-tags).
    *
    * Information about published releases are available to everyone. Only users with push access will receive listings for draft releases.
    */
  def listReleases(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/releases']['response'] */ js.Any
  ]
  def listReleases(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/releases']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/releases']['response'] */ js.Any
  ]
  /**
    * This returns a list of releases, which does not include regular Git tags that have not been associated with a release. To get a list of Git tags, use the [Repository Tags API](https://docs.github.com/rest/reference/repos#list-repository-tags).
    *
    * Information about published releases are available to everyone. Only users with push access will receive listings for draft releases.
    */
  @JSName("listReleases")
  var listReleases_Original: `662`
  
  /**
    * This returns the tag protection states of a repository.
    *
    * This information is only available to repository administrators.
    */
  def listTagProtection(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/tags/protection']['response'] */ js.Any
  ]
  def listTagProtection(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/tags/protection']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/tags/protection']['response'] */ js.Any
  ]
  /**
    * This returns the tag protection states of a repository.
    *
    * This information is only available to repository administrators.
    */
  @JSName("listTagProtection")
  var listTagProtection_Original: `663`
  
  def listTags(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/tags']['response'] */ js.Any
  ]
  def listTags(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/tags']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/tags']['response'] */ js.Any
  ]
  @JSName("listTags")
  var listTags_Original: `664`
  
  def listTeams(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/teams']['response'] */ js.Any
  ]
  def listTeams(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/teams']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/teams']['response'] */ js.Any
  ]
  @JSName("listTeams")
  var listTeams_Original: `665`
  
  /**
    * Returns a list of webhook deliveries for a webhook configured in a repository.
    */
  def listWebhookDeliveries(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/hooks/{hook_id}/deliveries']['response'] */ js.Any
  ]
  def listWebhookDeliveries(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/hooks/{hook_id}/deliveries']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/hooks/{hook_id}/deliveries']['response'] */ js.Any
  ]
  /**
    * Returns a list of webhook deliveries for a webhook configured in a repository.
    */
  @JSName("listWebhookDeliveries")
  var listWebhookDeliveries_Original: `666`
  
  /**
    * Lists webhooks for a repository. `last response` may return null if there have not been any deliveries within 30 days.
    */
  def listWebhooks(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/hooks']['response'] */ js.Any
  ]
  def listWebhooks(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/hooks']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/hooks']['response'] */ js.Any
  ]
  /**
    * Lists webhooks for a repository. `last response` may return null if there have not been any deliveries within 30 days.
    */
  @JSName("listWebhooks")
  var listWebhooks_Original: `667`
  
  def merge(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/merges']['response'] */ js.Any
  ]
  def merge(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/merges']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/merges']['response'] */ js.Any
  ]
  
  /**
    * Sync a branch of a forked repository to keep it up-to-date with the upstream repository.
    */
  def mergeUpstream(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/merge-upstream']['response'] */ js.Any
  ]
  def mergeUpstream(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/merge-upstream']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/merge-upstream']['response'] */ js.Any
  ]
  /**
    * Sync a branch of a forked repository to keep it up-to-date with the upstream repository.
    */
  @JSName("mergeUpstream")
  var mergeUpstream_Original: `669`
  
  @JSName("merge")
  var merge_Original: `668`
  
  /**
    * This will trigger a [ping event](https://docs.github.com/webhooks/#ping-event) to be sent to the hook.
    */
  def pingWebhook(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/hooks/{hook_id}/pings']['response'] */ js.Any
  ]
  def pingWebhook(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/hooks/{hook_id}/pings']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/hooks/{hook_id}/pings']['response'] */ js.Any
  ]
  /**
    * This will trigger a [ping event](https://docs.github.com/webhooks/#ping-event) to be sent to the hook.
    */
  @JSName("pingWebhook")
  var pingWebhook_Original: `670`
  
  /**
    * Redeliver a webhook delivery for a webhook configured in a repository.
    */
  def redeliverWebhookDelivery(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/hooks/{hook_id}/deliveries/{delivery_id}/attempts']['response'] */ js.Any
  ]
  def redeliverWebhookDelivery(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/hooks/{hook_id}/deliveries/{delivery_id}/attempts']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/hooks/{hook_id}/deliveries/{delivery_id}/attempts']['response'] */ js.Any
  ]
  /**
    * Redeliver a webhook delivery for a webhook configured in a repository.
    */
  @JSName("redeliverWebhookDelivery")
  var redeliverWebhookDelivery_Original: `671`
  
  /**
    * Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    *
    * Removes the ability of an app to push to this branch. Only installed GitHub Apps with `write` access to the `contents` permission can be added as authorized actors on a protected branch.
    *
    * | Type    | Description                                                                                                                                                |
    * | ------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------- |
    * | `array` | The GitHub Apps that have push access to this branch. Use the app's `slug`. **Note**: The list of users, apps, and teams in total is limited to 100 items. |
    */
  def removeAppAccessRestrictions(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/{owner}/{repo}/branches/{branch}/protection/restrictions/apps']['response'] */ js.Any
  ]
  def removeAppAccessRestrictions(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/{owner}/{repo}/branches/{branch}/protection/restrictions/apps']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/{owner}/{repo}/branches/{branch}/protection/restrictions/apps']['response'] */ js.Any
  ]
  /**
    * Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    *
    * Removes the ability of an app to push to this branch. Only installed GitHub Apps with `write` access to the `contents` permission can be added as authorized actors on a protected branch.
    *
    * | Type    | Description                                                                                                                                                |
    * | ------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------- |
    * | `array` | The GitHub Apps that have push access to this branch. Use the app's `slug`. **Note**: The list of users, apps, and teams in total is limited to 100 items. |
    */
  @JSName("removeAppAccessRestrictions")
  var removeAppAccessRestrictions_Original: `672`
  
  def removeCollaborator(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/{owner}/{repo}/collaborators/{username}']['response'] */ js.Any
  ]
  def removeCollaborator(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/{owner}/{repo}/collaborators/{username}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/{owner}/{repo}/collaborators/{username}']['response'] */ js.Any
  ]
  @JSName("removeCollaborator")
  var removeCollaborator_Original: `673`
  
  /**
    * Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    */
  def removeStatusCheckContexts(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/{owner}/{repo}/branches/{branch}/protection/required_status_checks/contexts']['response'] */ js.Any
  ]
  def removeStatusCheckContexts(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/{owner}/{repo}/branches/{branch}/protection/required_status_checks/contexts']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/{owner}/{repo}/branches/{branch}/protection/required_status_checks/contexts']['response'] */ js.Any
  ]
  /**
    * Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    */
  @JSName("removeStatusCheckContexts")
  var removeStatusCheckContexts_Original: `674`
  
  /**
    * Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    */
  def removeStatusCheckProtection(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/{owner}/{repo}/branches/{branch}/protection/required_status_checks']['response'] */ js.Any
  ]
  def removeStatusCheckProtection(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/{owner}/{repo}/branches/{branch}/protection/required_status_checks']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/{owner}/{repo}/branches/{branch}/protection/required_status_checks']['response'] */ js.Any
  ]
  /**
    * Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    */
  @JSName("removeStatusCheckProtection")
  var removeStatusCheckProtection_Original: `675`
  
  /**
    * Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    *
    * Removes the ability of a team to push to this branch. You can also remove push access for child teams.
    *
    * | Type    | Description                                                                                                                                         |
    * | ------- | --------------------------------------------------------------------------------------------------------------------------------------------------- |
    * | `array` | Teams that should no longer have push access. Use the team's `slug`. **Note**: The list of users, apps, and teams in total is limited to 100 items. |
    */
  def removeTeamAccessRestrictions(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/{owner}/{repo}/branches/{branch}/protection/restrictions/teams']['response'] */ js.Any
  ]
  def removeTeamAccessRestrictions(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/{owner}/{repo}/branches/{branch}/protection/restrictions/teams']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/{owner}/{repo}/branches/{branch}/protection/restrictions/teams']['response'] */ js.Any
  ]
  /**
    * Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    *
    * Removes the ability of a team to push to this branch. You can also remove push access for child teams.
    *
    * | Type    | Description                                                                                                                                         |
    * | ------- | --------------------------------------------------------------------------------------------------------------------------------------------------- |
    * | `array` | Teams that should no longer have push access. Use the team's `slug`. **Note**: The list of users, apps, and teams in total is limited to 100 items. |
    */
  @JSName("removeTeamAccessRestrictions")
  var removeTeamAccessRestrictions_Original: `676`
  
  /**
    * Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    *
    * Removes the ability of a user to push to this branch.
    *
    * | Type    | Description                                                                                                                                   |
    * | ------- | --------------------------------------------------------------------------------------------------------------------------------------------- |
    * | `array` | Usernames of the people who should no longer have push access. **Note**: The list of users, apps, and teams in total is limited to 100 items. |
    */
  def removeUserAccessRestrictions(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/{owner}/{repo}/branches/{branch}/protection/restrictions/users']['response'] */ js.Any
  ]
  def removeUserAccessRestrictions(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/{owner}/{repo}/branches/{branch}/protection/restrictions/users']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/{owner}/{repo}/branches/{branch}/protection/restrictions/users']['response'] */ js.Any
  ]
  /**
    * Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    *
    * Removes the ability of a user to push to this branch.
    *
    * | Type    | Description                                                                                                                                   |
    * | ------- | --------------------------------------------------------------------------------------------------------------------------------------------- |
    * | `array` | Usernames of the people who should no longer have push access. **Note**: The list of users, apps, and teams in total is limited to 100 items. |
    */
  @JSName("removeUserAccessRestrictions")
  var removeUserAccessRestrictions_Original: `677`
  
  /**
    * Renames a branch in a repository.
    *
    * **Note:** Although the API responds immediately, the branch rename process might take some extra time to complete in the background. You won't be able to push to the old branch name while the rename process is in progress. For more information, see "[Renaming a branch](https://docs.github.com/github/administering-a-repository/renaming-a-branch)".
    *
    * The permissions required to use this endpoint depends on whether you are renaming the default branch.
    *
    * To rename a non-default branch:
    *
    * * Users must have push access.
    * * GitHub Apps must have the `contents:write` repository permission.
    *
    * To rename the default branch:
    *
    * * Users must have admin or owner permissions.
    * * GitHub Apps must have the `administration:write` repository permission.
    */
  def renameBranch(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/branches/{branch}/rename']['response'] */ js.Any
  ]
  def renameBranch(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/branches/{branch}/rename']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/branches/{branch}/rename']['response'] */ js.Any
  ]
  /**
    * Renames a branch in a repository.
    *
    * **Note:** Although the API responds immediately, the branch rename process might take some extra time to complete in the background. You won't be able to push to the old branch name while the rename process is in progress. For more information, see "[Renaming a branch](https://docs.github.com/github/administering-a-repository/renaming-a-branch)".
    *
    * The permissions required to use this endpoint depends on whether you are renaming the default branch.
    *
    * To rename a non-default branch:
    *
    * * Users must have push access.
    * * GitHub Apps must have the `contents:write` repository permission.
    *
    * To rename the default branch:
    *
    * * Users must have admin or owner permissions.
    * * GitHub Apps must have the `administration:write` repository permission.
    */
  @JSName("renameBranch")
  var renameBranch_Original: `678`
  
  def replaceAllTopics(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /repos/{owner}/{repo}/topics']['response'] */ js.Any
  ]
  def replaceAllTopics(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /repos/{owner}/{repo}/topics']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /repos/{owner}/{repo}/topics']['response'] */ js.Any
  ]
  @JSName("replaceAllTopics")
  var replaceAllTopics_Original: `679`
  
  /**
    * You can request that your site be built from the latest revision on the default branch. This has the same effect as pushing a commit to your default branch, but does not require an additional commit. Manually triggering page builds can be helpful when diagnosing build warnings and failures.
    *
    * Build requests are limited to one concurrent build per repository and one concurrent build per requester. If you request a build while another is still in progress, the second request will be queued until the first completes.
    */
  def requestPagesBuild(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/pages/builds']['response'] */ js.Any
  ]
  def requestPagesBuild(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/pages/builds']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/pages/builds']['response'] */ js.Any
  ]
  /**
    * You can request that your site be built from the latest revision on the default branch. This has the same effect as pushing a commit to your default branch, but does not require an additional commit. Manually triggering page builds can be helpful when diagnosing build warnings and failures.
    *
    * Build requests are limited to one concurrent build per repository and one concurrent build per requester. If you request a build while another is still in progress, the second request will be queued until the first completes.
    */
  @JSName("requestPagesBuild")
  var requestPagesBuild_Original: `680`
  
  /**
    * Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    *
    * Adding admin enforcement requires admin or owner permissions to the repository and branch protection to be enabled.
    */
  def setAdminBranchProtection(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/branches/{branch}/protection/enforce_admins']['response'] */ js.Any
  ]
  def setAdminBranchProtection(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/branches/{branch}/protection/enforce_admins']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/branches/{branch}/protection/enforce_admins']['response'] */ js.Any
  ]
  /**
    * Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    *
    * Adding admin enforcement requires admin or owner permissions to the repository and branch protection to be enabled.
    */
  @JSName("setAdminBranchProtection")
  var setAdminBranchProtection_Original: `681`
  
  /**
    * Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    *
    * Replaces the list of apps that have push access to this branch. This removes all apps that previously had push access and grants push access to the new list of apps. Only installed GitHub Apps with `write` access to the `contents` permission can be added as authorized actors on a protected branch.
    *
    * | Type    | Description                                                                                                                                                |
    * | ------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------- |
    * | `array` | The GitHub Apps that have push access to this branch. Use the app's `slug`. **Note**: The list of users, apps, and teams in total is limited to 100 items. |
    */
  def setAppAccessRestrictions(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /repos/{owner}/{repo}/branches/{branch}/protection/restrictions/apps']['response'] */ js.Any
  ]
  def setAppAccessRestrictions(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /repos/{owner}/{repo}/branches/{branch}/protection/restrictions/apps']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /repos/{owner}/{repo}/branches/{branch}/protection/restrictions/apps']['response'] */ js.Any
  ]
  /**
    * Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    *
    * Replaces the list of apps that have push access to this branch. This removes all apps that previously had push access and grants push access to the new list of apps. Only installed GitHub Apps with `write` access to the `contents` permission can be added as authorized actors on a protected branch.
    *
    * | Type    | Description                                                                                                                                                |
    * | ------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------- |
    * | `array` | The GitHub Apps that have push access to this branch. Use the app's `slug`. **Note**: The list of users, apps, and teams in total is limited to 100 items. |
    */
  @JSName("setAppAccessRestrictions")
  var setAppAccessRestrictions_Original: `682`
  
  /**
    * Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    */
  def setStatusCheckContexts(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /repos/{owner}/{repo}/branches/{branch}/protection/required_status_checks/contexts']['response'] */ js.Any
  ]
  def setStatusCheckContexts(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /repos/{owner}/{repo}/branches/{branch}/protection/required_status_checks/contexts']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /repos/{owner}/{repo}/branches/{branch}/protection/required_status_checks/contexts']['response'] */ js.Any
  ]
  /**
    * Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    */
  @JSName("setStatusCheckContexts")
  var setStatusCheckContexts_Original: `683`
  
  /**
    * Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    *
    * Replaces the list of teams that have push access to this branch. This removes all teams that previously had push access and grants push access to the new list of teams. Team restrictions include child teams.
    *
    * | Type    | Description                                                                                                                                |
    * | ------- | ------------------------------------------------------------------------------------------------------------------------------------------ |
    * | `array` | The teams that can have push access. Use the team's `slug`. **Note**: The list of users, apps, and teams in total is limited to 100 items. |
    */
  def setTeamAccessRestrictions(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /repos/{owner}/{repo}/branches/{branch}/protection/restrictions/teams']['response'] */ js.Any
  ]
  def setTeamAccessRestrictions(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /repos/{owner}/{repo}/branches/{branch}/protection/restrictions/teams']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /repos/{owner}/{repo}/branches/{branch}/protection/restrictions/teams']['response'] */ js.Any
  ]
  /**
    * Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    *
    * Replaces the list of teams that have push access to this branch. This removes all teams that previously had push access and grants push access to the new list of teams. Team restrictions include child teams.
    *
    * | Type    | Description                                                                                                                                |
    * | ------- | ------------------------------------------------------------------------------------------------------------------------------------------ |
    * | `array` | The teams that can have push access. Use the team's `slug`. **Note**: The list of users, apps, and teams in total is limited to 100 items. |
    */
  @JSName("setTeamAccessRestrictions")
  var setTeamAccessRestrictions_Original: `684`
  
  /**
    * Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    *
    * Replaces the list of people that have push access to this branch. This removes all people that previously had push access and grants push access to the new list of people.
    *
    * | Type    | Description                                                                                                                   |
    * | ------- | ----------------------------------------------------------------------------------------------------------------------------- |
    * | `array` | Usernames for people who can have push access. **Note**: The list of users, apps, and teams in total is limited to 100 items. |
    */
  def setUserAccessRestrictions(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /repos/{owner}/{repo}/branches/{branch}/protection/restrictions/users']['response'] */ js.Any
  ]
  def setUserAccessRestrictions(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /repos/{owner}/{repo}/branches/{branch}/protection/restrictions/users']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /repos/{owner}/{repo}/branches/{branch}/protection/restrictions/users']['response'] */ js.Any
  ]
  /**
    * Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    *
    * Replaces the list of people that have push access to this branch. This removes all people that previously had push access and grants push access to the new list of people.
    *
    * | Type    | Description                                                                                                                   |
    * | ------- | ----------------------------------------------------------------------------------------------------------------------------- |
    * | `array` | Usernames for people who can have push access. **Note**: The list of users, apps, and teams in total is limited to 100 items. |
    */
  @JSName("setUserAccessRestrictions")
  var setUserAccessRestrictions_Original: `685`
  
  /**
    * This will trigger the hook with the latest push to the current repository if the hook is subscribed to `push` events. If the hook is not subscribed to `push` events, the server will respond with 204 but no test POST will be generated.
    *
    * **Note**: Previously `/repos/:owner/:repo/hooks/:hook_id/test`
    */
  def testPushWebhook(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/hooks/{hook_id}/tests']['response'] */ js.Any
  ]
  def testPushWebhook(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/hooks/{hook_id}/tests']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/hooks/{hook_id}/tests']['response'] */ js.Any
  ]
  /**
    * This will trigger the hook with the latest push to the current repository if the hook is subscribed to `push` events. If the hook is not subscribed to `push` events, the server will respond with 204 but no test POST will be generated.
    *
    * **Note**: Previously `/repos/:owner/:repo/hooks/:hook_id/test`
    */
  @JSName("testPushWebhook")
  var testPushWebhook_Original: `686`
  
  /**
    * A transfer request will need to be accepted by the new owner when transferring a personal repository to another user. The response will contain the original `owner`, and the transfer will continue asynchronously. For more details on the requirements to transfer personal and organization-owned repositories, see [about repository transfers](https://docs.github.com/articles/about-repository-transfers/).
    */
  def transfer(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/transfer']['response'] */ js.Any
  ]
  def transfer(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/transfer']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/transfer']['response'] */ js.Any
  ]
  /**
    * A transfer request will need to be accepted by the new owner when transferring a personal repository to another user. The response will contain the original `owner`, and the transfer will continue asynchronously. For more details on the requirements to transfer personal and organization-owned repositories, see [about repository transfers](https://docs.github.com/articles/about-repository-transfers/).
    */
  @JSName("transfer")
  var transfer_Original: `687`
  
  /**
    * **Note**: To edit a repository's topics, use the [Replace all repository topics](https://docs.github.com/rest/reference/repos#replace-all-repository-topics) endpoint.
    */
  def update(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PATCH /repos/{owner}/{repo}']['response'] */ js.Any
  ]
  def update(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PATCH /repos/{owner}/{repo}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PATCH /repos/{owner}/{repo}']['response'] */ js.Any
  ]
  
  /**
    * Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    *
    * Protecting a branch requires admin or owner permissions to the repository.
    *
    * **Note**: Passing new arrays of `users` and `teams` replaces their previous values.
    *
    * **Note**: The list of users, apps, and teams in total is limited to 100 items.
    */
  def updateBranchProtection(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /repos/{owner}/{repo}/branches/{branch}/protection']['response'] */ js.Any
  ]
  def updateBranchProtection(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /repos/{owner}/{repo}/branches/{branch}/protection']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /repos/{owner}/{repo}/branches/{branch}/protection']['response'] */ js.Any
  ]
  /**
    * Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    *
    * Protecting a branch requires admin or owner permissions to the repository.
    *
    * **Note**: Passing new arrays of `users` and `teams` replaces their previous values.
    *
    * **Note**: The list of users, apps, and teams in total is limited to 100 items.
    */
  @JSName("updateBranchProtection")
  var updateBranchProtection_Original: `689`
  
  def updateCommitComment(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PATCH /repos/{owner}/{repo}/comments/{comment_id}']['response'] */ js.Any
  ]
  def updateCommitComment(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PATCH /repos/{owner}/{repo}/comments/{comment_id}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PATCH /repos/{owner}/{repo}/comments/{comment_id}']['response'] */ js.Any
  ]
  @JSName("updateCommitComment")
  var updateCommitComment_Original: `690`
  
  /**
    * Updates a deployment branch policy for an environment.
    *
    * You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `administration:write` permission for the repository to use this endpoint.
    */
  def updateDeploymentBranchPolicy(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /repos/{owner}/{repo}/environments/{environment_name}/deployment-branch-policies/{branch_policy_id}']['response'] */ js.Any
  ]
  def updateDeploymentBranchPolicy(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /repos/{owner}/{repo}/environments/{environment_name}/deployment-branch-policies/{branch_policy_id}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /repos/{owner}/{repo}/environments/{environment_name}/deployment-branch-policies/{branch_policy_id}']['response'] */ js.Any
  ]
  /**
    * Updates a deployment branch policy for an environment.
    *
    * You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `administration:write` permission for the repository to use this endpoint.
    */
  @JSName("updateDeploymentBranchPolicy")
  var updateDeploymentBranchPolicy_Original: `691`
  
  /**
    * Updates information for a GitHub Pages site. For more information, see "[About GitHub Pages](/github/working-with-github-pages/about-github-pages).
    */
  def updateInformationAboutPagesSite(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /repos/{owner}/{repo}/pages']['response'] */ js.Any
  ]
  def updateInformationAboutPagesSite(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /repos/{owner}/{repo}/pages']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /repos/{owner}/{repo}/pages']['response'] */ js.Any
  ]
  /**
    * Updates information for a GitHub Pages site. For more information, see "[About GitHub Pages](/github/working-with-github-pages/about-github-pages).
    */
  @JSName("updateInformationAboutPagesSite")
  var updateInformationAboutPagesSite_Original: `692`
  
  def updateInvitation(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PATCH /repos/{owner}/{repo}/invitations/{invitation_id}']['response'] */ js.Any
  ]
  def updateInvitation(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PATCH /repos/{owner}/{repo}/invitations/{invitation_id}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PATCH /repos/{owner}/{repo}/invitations/{invitation_id}']['response'] */ js.Any
  ]
  @JSName("updateInvitation")
  var updateInvitation_Original: `693`
  
  /**
    * Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    *
    * Updating pull request review enforcement requires admin or owner permissions to the repository and branch protection to be enabled.
    *
    * **Note**: Passing new arrays of `users` and `teams` replaces their previous values.
    */
  def updatePullRequestReviewProtection(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PATCH /repos/{owner}/{repo}/branches/{branch}/protection/required_pull_request_reviews']['response'] */ js.Any
  ]
  def updatePullRequestReviewProtection(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PATCH /repos/{owner}/{repo}/branches/{branch}/protection/required_pull_request_reviews']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PATCH /repos/{owner}/{repo}/branches/{branch}/protection/required_pull_request_reviews']['response'] */ js.Any
  ]
  /**
    * Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    *
    * Updating pull request review enforcement requires admin or owner permissions to the repository and branch protection to be enabled.
    *
    * **Note**: Passing new arrays of `users` and `teams` replaces their previous values.
    */
  @JSName("updatePullRequestReviewProtection")
  var updatePullRequestReviewProtection_Original: `694`
  
  /**
    * Users with push access to the repository can edit a release.
    */
  def updateRelease(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PATCH /repos/{owner}/{repo}/releases/{release_id}']['response'] */ js.Any
  ]
  def updateRelease(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PATCH /repos/{owner}/{repo}/releases/{release_id}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PATCH /repos/{owner}/{repo}/releases/{release_id}']['response'] */ js.Any
  ]
  
  /**
    * Users with push access to the repository can edit a release asset.
    */
  def updateReleaseAsset(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PATCH /repos/{owner}/{repo}/releases/assets/{asset_id}']['response'] */ js.Any
  ]
  def updateReleaseAsset(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PATCH /repos/{owner}/{repo}/releases/assets/{asset_id}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PATCH /repos/{owner}/{repo}/releases/assets/{asset_id}']['response'] */ js.Any
  ]
  /**
    * Users with push access to the repository can edit a release asset.
    */
  @JSName("updateReleaseAsset")
  var updateReleaseAsset_Original: `696`
  
  /**
    * Users with push access to the repository can edit a release.
    */
  @JSName("updateRelease")
  var updateRelease_Original: `695`
  
  /**
    * Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    *
    * Updating required status checks requires admin or owner permissions to the repository and branch protection to be enabled.
    * @deprecated octokit.rest.repos.updateStatusCheckPotection() has been renamed to octokit.rest.repos.updateStatusCheckProtection() (2020-09-17)
    */
  def updateStatusCheckPotection(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PATCH /repos/{owner}/{repo}/branches/{branch}/protection/required_status_checks']['response'] */ js.Any
  ]
  def updateStatusCheckPotection(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PATCH /repos/{owner}/{repo}/branches/{branch}/protection/required_status_checks']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PATCH /repos/{owner}/{repo}/branches/{branch}/protection/required_status_checks']['response'] */ js.Any
  ]
  /**
    * Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    *
    * Updating required status checks requires admin or owner permissions to the repository and branch protection to be enabled.
    * @deprecated octokit.rest.repos.updateStatusCheckPotection() has been renamed to octokit.rest.repos.updateStatusCheckProtection() (2020-09-17)
    */
  @JSName("updateStatusCheckPotection")
  var updateStatusCheckPotection_Original: `697`
  
  /**
    * Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    *
    * Updating required status checks requires admin or owner permissions to the repository and branch protection to be enabled.
    */
  def updateStatusCheckProtection(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PATCH /repos/{owner}/{repo}/branches/{branch}/protection/required_status_checks']['response'] */ js.Any
  ]
  def updateStatusCheckProtection(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PATCH /repos/{owner}/{repo}/branches/{branch}/protection/required_status_checks']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PATCH /repos/{owner}/{repo}/branches/{branch}/protection/required_status_checks']['response'] */ js.Any
  ]
  /**
    * Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    *
    * Updating required status checks requires admin or owner permissions to the repository and branch protection to be enabled.
    */
  @JSName("updateStatusCheckProtection")
  var updateStatusCheckProtection_Original: `697`
  
  /**
    * Updates a webhook configured in a repository. If you previously had a `secret` set, you must provide the same `secret` or set a new `secret` or the secret will be removed. If you are only updating individual webhook `config` properties, use "[Update a webhook configuration for a repository](/rest/reference/repos#update-a-webhook-configuration-for-a-repository)."
    */
  def updateWebhook(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PATCH /repos/{owner}/{repo}/hooks/{hook_id}']['response'] */ js.Any
  ]
  def updateWebhook(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PATCH /repos/{owner}/{repo}/hooks/{hook_id}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PATCH /repos/{owner}/{repo}/hooks/{hook_id}']['response'] */ js.Any
  ]
  
  /**
    * Updates the webhook configuration for a repository. To update more information about the webhook, including the `active` state and `events`, use "[Update a repository webhook](/rest/reference/orgs#update-a-repository-webhook)."
    *
    * Access tokens must have the `write:repo_hook` or `repo` scope, and GitHub Apps must have the `repository_hooks:write` permission.
    */
  def updateWebhookConfigForRepo(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PATCH /repos/{owner}/{repo}/hooks/{hook_id}/config']['response'] */ js.Any
  ]
  def updateWebhookConfigForRepo(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PATCH /repos/{owner}/{repo}/hooks/{hook_id}/config']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PATCH /repos/{owner}/{repo}/hooks/{hook_id}/config']['response'] */ js.Any
  ]
  /**
    * Updates the webhook configuration for a repository. To update more information about the webhook, including the `active` state and `events`, use "[Update a repository webhook](/rest/reference/orgs#update-a-repository-webhook)."
    *
    * Access tokens must have the `write:repo_hook` or `repo` scope, and GitHub Apps must have the `repository_hooks:write` permission.
    */
  @JSName("updateWebhookConfigForRepo")
  var updateWebhookConfigForRepo_Original: `699`
  
  /**
    * Updates a webhook configured in a repository. If you previously had a `secret` set, you must provide the same `secret` or set a new `secret` or the secret will be removed. If you are only updating individual webhook `config` properties, use "[Update a webhook configuration for a repository](/rest/reference/repos#update-a-webhook-configuration-for-a-repository)."
    */
  @JSName("updateWebhook")
  var updateWebhook_Original: `698`
  
  /**
    * **Note**: To edit a repository's topics, use the [Replace all repository topics](https://docs.github.com/rest/reference/repos#replace-all-repository-topics) endpoint.
    */
  @JSName("update")
  var update_Original: `688`
  
  /**
    * This endpoint makes use of [a Hypermedia relation](https://docs.github.com/rest/overview/resources-in-the-rest-api#hypermedia) to determine which URL to access. The endpoint you call to upload release assets is specific to your release. Use the `upload_url` returned in
    * the response of the [Create a release endpoint](https://docs.github.com/rest/reference/repos#create-a-release) to upload a release asset.
    *
    * You need to use an HTTP client which supports [SNI](http://en.wikipedia.org/wiki/Server_Name_Indication) to make calls to this endpoint.
    *
    * Most libraries will set the required `Content-Length` header automatically. Use the required `Content-Type` header to provide the media type of the asset. For a list of media types, see [Media Types](https://www.iana.org/assignments/media-types/media-types.xhtml). For example:
    *
    * `application/zip`
    *
    * GitHub expects the asset data in its raw binary form, rather than JSON. You will send the raw binary content of the asset as the request body. Everything else about the endpoint is the same as the rest of the API. For example,
    * you'll still need to pass your authentication to be able to upload an asset.
    *
    * When an upstream failure occurs, you will receive a `502 Bad Gateway` status. This may leave an empty asset with a state of `starter`. It can be safely deleted.
    *
    * **Notes:**
    * *   GitHub renames asset filenames that have special characters, non-alphanumeric characters, and leading or trailing periods. The "[List assets for a release](https://docs.github.com/rest/reference/repos#list-assets-for-a-release)"
    * endpoint lists the renamed filenames. For more information and help, contact [GitHub Support](https://support.github.com/contact?tags=dotcom-rest-api).
    * *   If you upload an asset with the same filename as another uploaded asset, you'll receive an error and must delete the old file before you can re-upload the new asset.
    */
  def uploadReleaseAsset(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST {origin}/repos/{owner}/{repo}/releases/{release_id}/assets{?name,label}']['response'] */ js.Any
  ]
  def uploadReleaseAsset(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST {origin}/repos/{owner}/{repo}/releases/{release_id}/assets{?name,label}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST {origin}/repos/{owner}/{repo}/releases/{release_id}/assets{?name,label}']['response'] */ js.Any
  ]
  /**
    * This endpoint makes use of [a Hypermedia relation](https://docs.github.com/rest/overview/resources-in-the-rest-api#hypermedia) to determine which URL to access. The endpoint you call to upload release assets is specific to your release. Use the `upload_url` returned in
    * the response of the [Create a release endpoint](https://docs.github.com/rest/reference/repos#create-a-release) to upload a release asset.
    *
    * You need to use an HTTP client which supports [SNI](http://en.wikipedia.org/wiki/Server_Name_Indication) to make calls to this endpoint.
    *
    * Most libraries will set the required `Content-Length` header automatically. Use the required `Content-Type` header to provide the media type of the asset. For a list of media types, see [Media Types](https://www.iana.org/assignments/media-types/media-types.xhtml). For example:
    *
    * `application/zip`
    *
    * GitHub expects the asset data in its raw binary form, rather than JSON. You will send the raw binary content of the asset as the request body. Everything else about the endpoint is the same as the rest of the API. For example,
    * you'll still need to pass your authentication to be able to upload an asset.
    *
    * When an upstream failure occurs, you will receive a `502 Bad Gateway` status. This may leave an empty asset with a state of `starter`. It can be safely deleted.
    *
    * **Notes:**
    * *   GitHub renames asset filenames that have special characters, non-alphanumeric characters, and leading or trailing periods. The "[List assets for a release](https://docs.github.com/rest/reference/repos#list-assets-for-a-release)"
    * endpoint lists the renamed filenames. For more information and help, contact [GitHub Support](https://support.github.com/contact?tags=dotcom-rest-api).
    * *   If you upload an asset with the same filename as another uploaded asset, you'll receive an error and must delete the old file before you can re-upload the new asset.
    */
  @JSName("uploadReleaseAsset")
  var uploadReleaseAsset_Original: `700`
}
object AcceptInvitation {
  
  inline def apply(
    acceptInvitation: `530`,
    acceptInvitationForAuthenticatedUser: `530`,
    addAppAccessRestrictions: `531`,
    addCollaborator: `532`,
    addStatusCheckContexts: `533`,
    addTeamAccessRestrictions: `534`,
    addUserAccessRestrictions: `535`,
    checkCollaborator: `536`,
    checkVulnerabilityAlerts: `537`,
    codeownersErrors: `538`,
    compareCommits: `539`,
    compareCommitsWithBasehead: `540`,
    createAutolink: `541`,
    createCommitComment: `542`,
    createCommitSignatureProtection: `543`,
    createCommitStatus: `544`,
    createDeployKey: `545`,
    createDeployment: `546`,
    createDeploymentBranchPolicy: `547`,
    createDeploymentStatus: `548`,
    createDispatchEvent: `549`,
    createForAuthenticatedUser: `550`,
    createFork: `551`,
    createInOrg: `552`,
    createOrUpdateEnvironment: `553`,
    createOrUpdateFileContents: `554`,
    createPagesDeployment: `555`,
    createPagesSite: `556`,
    createRelease: `557`,
    createTagProtection: `558`,
    createUsingTemplate: `559`,
    createWebhook: `560`,
    declineInvitation: `561`,
    declineInvitationForAuthenticatedUser: `561`,
    delete: `562`,
    deleteAccessRestrictions: `563`,
    deleteAdminBranchProtection: `564`,
    deleteAnEnvironment: `565`,
    deleteAutolink: `566`,
    deleteBranchProtection: `567`,
    deleteCommitComment: `568`,
    deleteCommitSignatureProtection: `569`,
    deleteDeployKey: `570`,
    deleteDeployment: `571`,
    deleteDeploymentBranchPolicy: `572`,
    deleteFile: `573`,
    deleteInvitation: `574`,
    deletePagesSite: `575`,
    deletePullRequestReviewProtection: `576`,
    deleteRelease: `577`,
    deleteReleaseAsset: `578`,
    deleteTagProtection: `579`,
    deleteWebhook: `580`,
    disableAutomatedSecurityFixes: `581`,
    disableLfsForRepo: `582`,
    disableVulnerabilityAlerts: `583`,
    downloadArchive: `584`,
    downloadTarballArchive: `585`,
    downloadZipballArchive: `584`,
    enableAutomatedSecurityFixes: `586`,
    enableLfsForRepo: `587`,
    enableVulnerabilityAlerts: `588`,
    generateReleaseNotes: `589`,
    get: `590`,
    getAccessRestrictions: `591`,
    getAdminBranchProtection: `592`,
    getAllEnvironments: `593`,
    getAllStatusCheckContexts: `594`,
    getAllTopics: `595`,
    getAppsWithAccessToProtectedBranch: `596`,
    getAutolink: `597`,
    getBranch: `598`,
    getBranchProtection: `599`,
    getClones: `600`,
    getCodeFrequencyStats: `601`,
    getCollaboratorPermissionLevel: `602`,
    getCombinedStatusForRef: `603`,
    getCommit: `604`,
    getCommitActivityStats: `605`,
    getCommitComment: `606`,
    getCommitSignatureProtection: `607`,
    getCommunityProfileMetrics: `608`,
    getContent: `609`,
    getContributorsStats: `610`,
    getDeployKey: `611`,
    getDeployment: `612`,
    getDeploymentBranchPolicy: `613`,
    getDeploymentStatus: `614`,
    getEnvironment: `615`,
    getLatestPagesBuild: `616`,
    getLatestRelease: `617`,
    getPages: `618`,
    getPagesBuild: `619`,
    getPagesHealthCheck: `620`,
    getParticipationStats: `621`,
    getPullRequestReviewProtection: `622`,
    getPunchCardStats: `623`,
    getReadme: `624`,
    getReadmeInDirectory: `625`,
    getRelease: `626`,
    getReleaseAsset: `627`,
    getReleaseByTag: `628`,
    getStatusChecksProtection: `629`,
    getTeamsWithAccessToProtectedBranch: `630`,
    getTopPaths: `631`,
    getTopReferrers: `632`,
    getUsersWithAccessToProtectedBranch: `633`,
    getViews: `634`,
    getWebhook: `635`,
    getWebhookConfigForRepo: `636`,
    getWebhookDelivery: `637`,
    listAutolinks: `638`,
    listBranches: `639`,
    listBranchesForHeadCommit: `640`,
    listCollaborators: `641`,
    listCommentsForCommit: `642`,
    listCommitCommentsForRepo: `643`,
    listCommitStatusesForRef: `644`,
    listCommits: `645`,
    listContributors: `646`,
    listDeployKeys: `647`,
    listDeploymentBranchPolicies: `648`,
    listDeploymentStatuses: `649`,
    listDeployments: `650`,
    listForAuthenticatedUser: `651`,
    listForOrg: `652`,
    listForUser: `653`,
    listForks: `654`,
    listInvitations: `655`,
    listInvitationsForAuthenticatedUser: `656`,
    listLanguages: `657`,
    listPagesBuilds: `658`,
    listPublic: `659`,
    listPullRequestsAssociatedWithCommit: `660`,
    listReleaseAssets: `661`,
    listReleases: `662`,
    listTagProtection: `663`,
    listTags: `664`,
    listTeams: `665`,
    listWebhookDeliveries: `666`,
    listWebhooks: `667`,
    merge: `668`,
    mergeUpstream: `669`,
    pingWebhook: `670`,
    redeliverWebhookDelivery: `671`,
    removeAppAccessRestrictions: `672`,
    removeCollaborator: `673`,
    removeStatusCheckContexts: `674`,
    removeStatusCheckProtection: `675`,
    removeTeamAccessRestrictions: `676`,
    removeUserAccessRestrictions: `677`,
    renameBranch: `678`,
    replaceAllTopics: `679`,
    requestPagesBuild: `680`,
    setAdminBranchProtection: `681`,
    setAppAccessRestrictions: `682`,
    setStatusCheckContexts: `683`,
    setTeamAccessRestrictions: `684`,
    setUserAccessRestrictions: `685`,
    testPushWebhook: `686`,
    transfer: `687`,
    update: `688`,
    updateBranchProtection: `689`,
    updateCommitComment: `690`,
    updateDeploymentBranchPolicy: `691`,
    updateInformationAboutPagesSite: `692`,
    updateInvitation: `693`,
    updatePullRequestReviewProtection: `694`,
    updateRelease: `695`,
    updateReleaseAsset: `696`,
    updateStatusCheckPotection: `697`,
    updateStatusCheckProtection: `697`,
    updateWebhook: `698`,
    updateWebhookConfigForRepo: `699`,
    uploadReleaseAsset: `700`
  ): AcceptInvitation = {
    val __obj = js.Dynamic.literal(acceptInvitation = acceptInvitation.asInstanceOf[js.Any], acceptInvitationForAuthenticatedUser = acceptInvitationForAuthenticatedUser.asInstanceOf[js.Any], addAppAccessRestrictions = addAppAccessRestrictions.asInstanceOf[js.Any], addCollaborator = addCollaborator.asInstanceOf[js.Any], addStatusCheckContexts = addStatusCheckContexts.asInstanceOf[js.Any], addTeamAccessRestrictions = addTeamAccessRestrictions.asInstanceOf[js.Any], addUserAccessRestrictions = addUserAccessRestrictions.asInstanceOf[js.Any], checkCollaborator = checkCollaborator.asInstanceOf[js.Any], checkVulnerabilityAlerts = checkVulnerabilityAlerts.asInstanceOf[js.Any], codeownersErrors = codeownersErrors.asInstanceOf[js.Any], compareCommits = compareCommits.asInstanceOf[js.Any], compareCommitsWithBasehead = compareCommitsWithBasehead.asInstanceOf[js.Any], createAutolink = createAutolink.asInstanceOf[js.Any], createCommitComment = createCommitComment.asInstanceOf[js.Any], createCommitSignatureProtection = createCommitSignatureProtection.asInstanceOf[js.Any], createCommitStatus = createCommitStatus.asInstanceOf[js.Any], createDeployKey = createDeployKey.asInstanceOf[js.Any], createDeployment = createDeployment.asInstanceOf[js.Any], createDeploymentBranchPolicy = createDeploymentBranchPolicy.asInstanceOf[js.Any], createDeploymentStatus = createDeploymentStatus.asInstanceOf[js.Any], createDispatchEvent = createDispatchEvent.asInstanceOf[js.Any], createForAuthenticatedUser = createForAuthenticatedUser.asInstanceOf[js.Any], createFork = createFork.asInstanceOf[js.Any], createInOrg = createInOrg.asInstanceOf[js.Any], createOrUpdateEnvironment = createOrUpdateEnvironment.asInstanceOf[js.Any], createOrUpdateFileContents = createOrUpdateFileContents.asInstanceOf[js.Any], createPagesDeployment = createPagesDeployment.asInstanceOf[js.Any], createPagesSite = createPagesSite.asInstanceOf[js.Any], createRelease = createRelease.asInstanceOf[js.Any], createTagProtection = createTagProtection.asInstanceOf[js.Any], createUsingTemplate = createUsingTemplate.asInstanceOf[js.Any], createWebhook = createWebhook.asInstanceOf[js.Any], declineInvitation = declineInvitation.asInstanceOf[js.Any], declineInvitationForAuthenticatedUser = declineInvitationForAuthenticatedUser.asInstanceOf[js.Any], delete = delete.asInstanceOf[js.Any], deleteAccessRestrictions = deleteAccessRestrictions.asInstanceOf[js.Any], deleteAdminBranchProtection = deleteAdminBranchProtection.asInstanceOf[js.Any], deleteAnEnvironment = deleteAnEnvironment.asInstanceOf[js.Any], deleteAutolink = deleteAutolink.asInstanceOf[js.Any], deleteBranchProtection = deleteBranchProtection.asInstanceOf[js.Any], deleteCommitComment = deleteCommitComment.asInstanceOf[js.Any], deleteCommitSignatureProtection = deleteCommitSignatureProtection.asInstanceOf[js.Any], deleteDeployKey = deleteDeployKey.asInstanceOf[js.Any], deleteDeployment = deleteDeployment.asInstanceOf[js.Any], deleteDeploymentBranchPolicy = deleteDeploymentBranchPolicy.asInstanceOf[js.Any], deleteFile = deleteFile.asInstanceOf[js.Any], deleteInvitation = deleteInvitation.asInstanceOf[js.Any], deletePagesSite = deletePagesSite.asInstanceOf[js.Any], deletePullRequestReviewProtection = deletePullRequestReviewProtection.asInstanceOf[js.Any], deleteRelease = deleteRelease.asInstanceOf[js.Any], deleteReleaseAsset = deleteReleaseAsset.asInstanceOf[js.Any], deleteTagProtection = deleteTagProtection.asInstanceOf[js.Any], deleteWebhook = deleteWebhook.asInstanceOf[js.Any], disableAutomatedSecurityFixes = disableAutomatedSecurityFixes.asInstanceOf[js.Any], disableLfsForRepo = disableLfsForRepo.asInstanceOf[js.Any], disableVulnerabilityAlerts = disableVulnerabilityAlerts.asInstanceOf[js.Any], downloadArchive = downloadArchive.asInstanceOf[js.Any], downloadTarballArchive = downloadTarballArchive.asInstanceOf[js.Any], downloadZipballArchive = downloadZipballArchive.asInstanceOf[js.Any], enableAutomatedSecurityFixes = enableAutomatedSecurityFixes.asInstanceOf[js.Any], enableLfsForRepo = enableLfsForRepo.asInstanceOf[js.Any], enableVulnerabilityAlerts = enableVulnerabilityAlerts.asInstanceOf[js.Any], generateReleaseNotes = generateReleaseNotes.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], getAccessRestrictions = getAccessRestrictions.asInstanceOf[js.Any], getAdminBranchProtection = getAdminBranchProtection.asInstanceOf[js.Any], getAllEnvironments = getAllEnvironments.asInstanceOf[js.Any], getAllStatusCheckContexts = getAllStatusCheckContexts.asInstanceOf[js.Any], getAllTopics = getAllTopics.asInstanceOf[js.Any], getAppsWithAccessToProtectedBranch = getAppsWithAccessToProtectedBranch.asInstanceOf[js.Any], getAutolink = getAutolink.asInstanceOf[js.Any], getBranch = getBranch.asInstanceOf[js.Any], getBranchProtection = getBranchProtection.asInstanceOf[js.Any], getClones = getClones.asInstanceOf[js.Any], getCodeFrequencyStats = getCodeFrequencyStats.asInstanceOf[js.Any], getCollaboratorPermissionLevel = getCollaboratorPermissionLevel.asInstanceOf[js.Any], getCombinedStatusForRef = getCombinedStatusForRef.asInstanceOf[js.Any], getCommit = getCommit.asInstanceOf[js.Any], getCommitActivityStats = getCommitActivityStats.asInstanceOf[js.Any], getCommitComment = getCommitComment.asInstanceOf[js.Any], getCommitSignatureProtection = getCommitSignatureProtection.asInstanceOf[js.Any], getCommunityProfileMetrics = getCommunityProfileMetrics.asInstanceOf[js.Any], getContent = getContent.asInstanceOf[js.Any], getContributorsStats = getContributorsStats.asInstanceOf[js.Any], getDeployKey = getDeployKey.asInstanceOf[js.Any], getDeployment = getDeployment.asInstanceOf[js.Any], getDeploymentBranchPolicy = getDeploymentBranchPolicy.asInstanceOf[js.Any], getDeploymentStatus = getDeploymentStatus.asInstanceOf[js.Any], getEnvironment = getEnvironment.asInstanceOf[js.Any], getLatestPagesBuild = getLatestPagesBuild.asInstanceOf[js.Any], getLatestRelease = getLatestRelease.asInstanceOf[js.Any], getPages = getPages.asInstanceOf[js.Any], getPagesBuild = getPagesBuild.asInstanceOf[js.Any], getPagesHealthCheck = getPagesHealthCheck.asInstanceOf[js.Any], getParticipationStats = getParticipationStats.asInstanceOf[js.Any], getPullRequestReviewProtection = getPullRequestReviewProtection.asInstanceOf[js.Any], getPunchCardStats = getPunchCardStats.asInstanceOf[js.Any], getReadme = getReadme.asInstanceOf[js.Any], getReadmeInDirectory = getReadmeInDirectory.asInstanceOf[js.Any], getRelease = getRelease.asInstanceOf[js.Any], getReleaseAsset = getReleaseAsset.asInstanceOf[js.Any], getReleaseByTag = getReleaseByTag.asInstanceOf[js.Any], getStatusChecksProtection = getStatusChecksProtection.asInstanceOf[js.Any], getTeamsWithAccessToProtectedBranch = getTeamsWithAccessToProtectedBranch.asInstanceOf[js.Any], getTopPaths = getTopPaths.asInstanceOf[js.Any], getTopReferrers = getTopReferrers.asInstanceOf[js.Any], getUsersWithAccessToProtectedBranch = getUsersWithAccessToProtectedBranch.asInstanceOf[js.Any], getViews = getViews.asInstanceOf[js.Any], getWebhook = getWebhook.asInstanceOf[js.Any], getWebhookConfigForRepo = getWebhookConfigForRepo.asInstanceOf[js.Any], getWebhookDelivery = getWebhookDelivery.asInstanceOf[js.Any], listAutolinks = listAutolinks.asInstanceOf[js.Any], listBranches = listBranches.asInstanceOf[js.Any], listBranchesForHeadCommit = listBranchesForHeadCommit.asInstanceOf[js.Any], listCollaborators = listCollaborators.asInstanceOf[js.Any], listCommentsForCommit = listCommentsForCommit.asInstanceOf[js.Any], listCommitCommentsForRepo = listCommitCommentsForRepo.asInstanceOf[js.Any], listCommitStatusesForRef = listCommitStatusesForRef.asInstanceOf[js.Any], listCommits = listCommits.asInstanceOf[js.Any], listContributors = listContributors.asInstanceOf[js.Any], listDeployKeys = listDeployKeys.asInstanceOf[js.Any], listDeploymentBranchPolicies = listDeploymentBranchPolicies.asInstanceOf[js.Any], listDeploymentStatuses = listDeploymentStatuses.asInstanceOf[js.Any], listDeployments = listDeployments.asInstanceOf[js.Any], listForAuthenticatedUser = listForAuthenticatedUser.asInstanceOf[js.Any], listForOrg = listForOrg.asInstanceOf[js.Any], listForUser = listForUser.asInstanceOf[js.Any], listForks = listForks.asInstanceOf[js.Any], listInvitations = listInvitations.asInstanceOf[js.Any], listInvitationsForAuthenticatedUser = listInvitationsForAuthenticatedUser.asInstanceOf[js.Any], listLanguages = listLanguages.asInstanceOf[js.Any], listPagesBuilds = listPagesBuilds.asInstanceOf[js.Any], listPublic = listPublic.asInstanceOf[js.Any], listPullRequestsAssociatedWithCommit = listPullRequestsAssociatedWithCommit.asInstanceOf[js.Any], listReleaseAssets = listReleaseAssets.asInstanceOf[js.Any], listReleases = listReleases.asInstanceOf[js.Any], listTagProtection = listTagProtection.asInstanceOf[js.Any], listTags = listTags.asInstanceOf[js.Any], listTeams = listTeams.asInstanceOf[js.Any], listWebhookDeliveries = listWebhookDeliveries.asInstanceOf[js.Any], listWebhooks = listWebhooks.asInstanceOf[js.Any], merge = merge.asInstanceOf[js.Any], mergeUpstream = mergeUpstream.asInstanceOf[js.Any], pingWebhook = pingWebhook.asInstanceOf[js.Any], redeliverWebhookDelivery = redeliverWebhookDelivery.asInstanceOf[js.Any], removeAppAccessRestrictions = removeAppAccessRestrictions.asInstanceOf[js.Any], removeCollaborator = removeCollaborator.asInstanceOf[js.Any], removeStatusCheckContexts = removeStatusCheckContexts.asInstanceOf[js.Any], removeStatusCheckProtection = removeStatusCheckProtection.asInstanceOf[js.Any], removeTeamAccessRestrictions = removeTeamAccessRestrictions.asInstanceOf[js.Any], removeUserAccessRestrictions = removeUserAccessRestrictions.asInstanceOf[js.Any], renameBranch = renameBranch.asInstanceOf[js.Any], replaceAllTopics = replaceAllTopics.asInstanceOf[js.Any], requestPagesBuild = requestPagesBuild.asInstanceOf[js.Any], setAdminBranchProtection = setAdminBranchProtection.asInstanceOf[js.Any], setAppAccessRestrictions = setAppAccessRestrictions.asInstanceOf[js.Any], setStatusCheckContexts = setStatusCheckContexts.asInstanceOf[js.Any], setTeamAccessRestrictions = setTeamAccessRestrictions.asInstanceOf[js.Any], setUserAccessRestrictions = setUserAccessRestrictions.asInstanceOf[js.Any], testPushWebhook = testPushWebhook.asInstanceOf[js.Any], transfer = transfer.asInstanceOf[js.Any], update = update.asInstanceOf[js.Any], updateBranchProtection = updateBranchProtection.asInstanceOf[js.Any], updateCommitComment = updateCommitComment.asInstanceOf[js.Any], updateDeploymentBranchPolicy = updateDeploymentBranchPolicy.asInstanceOf[js.Any], updateInformationAboutPagesSite = updateInformationAboutPagesSite.asInstanceOf[js.Any], updateInvitation = updateInvitation.asInstanceOf[js.Any], updatePullRequestReviewProtection = updatePullRequestReviewProtection.asInstanceOf[js.Any], updateRelease = updateRelease.asInstanceOf[js.Any], updateReleaseAsset = updateReleaseAsset.asInstanceOf[js.Any], updateStatusCheckPotection = updateStatusCheckPotection.asInstanceOf[js.Any], updateStatusCheckProtection = updateStatusCheckProtection.asInstanceOf[js.Any], updateWebhook = updateWebhook.asInstanceOf[js.Any], updateWebhookConfigForRepo = updateWebhookConfigForRepo.asInstanceOf[js.Any], uploadReleaseAsset = uploadReleaseAsset.asInstanceOf[js.Any])
    __obj.asInstanceOf[AcceptInvitation]
  }
  
  extension [Self <: AcceptInvitation](x: Self) {
    
    inline def setAcceptInvitation(value: `530`): Self = StObject.set(x, "acceptInvitation", value.asInstanceOf[js.Any])
    
    inline def setAcceptInvitationForAuthenticatedUser(value: `530`): Self = StObject.set(x, "acceptInvitationForAuthenticatedUser", value.asInstanceOf[js.Any])
    
    inline def setAddAppAccessRestrictions(value: `531`): Self = StObject.set(x, "addAppAccessRestrictions", value.asInstanceOf[js.Any])
    
    inline def setAddCollaborator(value: `532`): Self = StObject.set(x, "addCollaborator", value.asInstanceOf[js.Any])
    
    inline def setAddStatusCheckContexts(value: `533`): Self = StObject.set(x, "addStatusCheckContexts", value.asInstanceOf[js.Any])
    
    inline def setAddTeamAccessRestrictions(value: `534`): Self = StObject.set(x, "addTeamAccessRestrictions", value.asInstanceOf[js.Any])
    
    inline def setAddUserAccessRestrictions(value: `535`): Self = StObject.set(x, "addUserAccessRestrictions", value.asInstanceOf[js.Any])
    
    inline def setCheckCollaborator(value: `536`): Self = StObject.set(x, "checkCollaborator", value.asInstanceOf[js.Any])
    
    inline def setCheckVulnerabilityAlerts(value: `537`): Self = StObject.set(x, "checkVulnerabilityAlerts", value.asInstanceOf[js.Any])
    
    inline def setCodeownersErrors(value: `538`): Self = StObject.set(x, "codeownersErrors", value.asInstanceOf[js.Any])
    
    inline def setCompareCommits(value: `539`): Self = StObject.set(x, "compareCommits", value.asInstanceOf[js.Any])
    
    inline def setCompareCommitsWithBasehead(value: `540`): Self = StObject.set(x, "compareCommitsWithBasehead", value.asInstanceOf[js.Any])
    
    inline def setCreateAutolink(value: `541`): Self = StObject.set(x, "createAutolink", value.asInstanceOf[js.Any])
    
    inline def setCreateCommitComment(value: `542`): Self = StObject.set(x, "createCommitComment", value.asInstanceOf[js.Any])
    
    inline def setCreateCommitSignatureProtection(value: `543`): Self = StObject.set(x, "createCommitSignatureProtection", value.asInstanceOf[js.Any])
    
    inline def setCreateCommitStatus(value: `544`): Self = StObject.set(x, "createCommitStatus", value.asInstanceOf[js.Any])
    
    inline def setCreateDeployKey(value: `545`): Self = StObject.set(x, "createDeployKey", value.asInstanceOf[js.Any])
    
    inline def setCreateDeployment(value: `546`): Self = StObject.set(x, "createDeployment", value.asInstanceOf[js.Any])
    
    inline def setCreateDeploymentBranchPolicy(value: `547`): Self = StObject.set(x, "createDeploymentBranchPolicy", value.asInstanceOf[js.Any])
    
    inline def setCreateDeploymentStatus(value: `548`): Self = StObject.set(x, "createDeploymentStatus", value.asInstanceOf[js.Any])
    
    inline def setCreateDispatchEvent(value: `549`): Self = StObject.set(x, "createDispatchEvent", value.asInstanceOf[js.Any])
    
    inline def setCreateForAuthenticatedUser(value: `550`): Self = StObject.set(x, "createForAuthenticatedUser", value.asInstanceOf[js.Any])
    
    inline def setCreateFork(value: `551`): Self = StObject.set(x, "createFork", value.asInstanceOf[js.Any])
    
    inline def setCreateInOrg(value: `552`): Self = StObject.set(x, "createInOrg", value.asInstanceOf[js.Any])
    
    inline def setCreateOrUpdateEnvironment(value: `553`): Self = StObject.set(x, "createOrUpdateEnvironment", value.asInstanceOf[js.Any])
    
    inline def setCreateOrUpdateFileContents(value: `554`): Self = StObject.set(x, "createOrUpdateFileContents", value.asInstanceOf[js.Any])
    
    inline def setCreatePagesDeployment(value: `555`): Self = StObject.set(x, "createPagesDeployment", value.asInstanceOf[js.Any])
    
    inline def setCreatePagesSite(value: `556`): Self = StObject.set(x, "createPagesSite", value.asInstanceOf[js.Any])
    
    inline def setCreateRelease(value: `557`): Self = StObject.set(x, "createRelease", value.asInstanceOf[js.Any])
    
    inline def setCreateTagProtection(value: `558`): Self = StObject.set(x, "createTagProtection", value.asInstanceOf[js.Any])
    
    inline def setCreateUsingTemplate(value: `559`): Self = StObject.set(x, "createUsingTemplate", value.asInstanceOf[js.Any])
    
    inline def setCreateWebhook(value: `560`): Self = StObject.set(x, "createWebhook", value.asInstanceOf[js.Any])
    
    inline def setDeclineInvitation(value: `561`): Self = StObject.set(x, "declineInvitation", value.asInstanceOf[js.Any])
    
    inline def setDeclineInvitationForAuthenticatedUser(value: `561`): Self = StObject.set(x, "declineInvitationForAuthenticatedUser", value.asInstanceOf[js.Any])
    
    inline def setDelete(value: `562`): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setDeleteAccessRestrictions(value: `563`): Self = StObject.set(x, "deleteAccessRestrictions", value.asInstanceOf[js.Any])
    
    inline def setDeleteAdminBranchProtection(value: `564`): Self = StObject.set(x, "deleteAdminBranchProtection", value.asInstanceOf[js.Any])
    
    inline def setDeleteAnEnvironment(value: `565`): Self = StObject.set(x, "deleteAnEnvironment", value.asInstanceOf[js.Any])
    
    inline def setDeleteAutolink(value: `566`): Self = StObject.set(x, "deleteAutolink", value.asInstanceOf[js.Any])
    
    inline def setDeleteBranchProtection(value: `567`): Self = StObject.set(x, "deleteBranchProtection", value.asInstanceOf[js.Any])
    
    inline def setDeleteCommitComment(value: `568`): Self = StObject.set(x, "deleteCommitComment", value.asInstanceOf[js.Any])
    
    inline def setDeleteCommitSignatureProtection(value: `569`): Self = StObject.set(x, "deleteCommitSignatureProtection", value.asInstanceOf[js.Any])
    
    inline def setDeleteDeployKey(value: `570`): Self = StObject.set(x, "deleteDeployKey", value.asInstanceOf[js.Any])
    
    inline def setDeleteDeployment(value: `571`): Self = StObject.set(x, "deleteDeployment", value.asInstanceOf[js.Any])
    
    inline def setDeleteDeploymentBranchPolicy(value: `572`): Self = StObject.set(x, "deleteDeploymentBranchPolicy", value.asInstanceOf[js.Any])
    
    inline def setDeleteFile(value: `573`): Self = StObject.set(x, "deleteFile", value.asInstanceOf[js.Any])
    
    inline def setDeleteInvitation(value: `574`): Self = StObject.set(x, "deleteInvitation", value.asInstanceOf[js.Any])
    
    inline def setDeletePagesSite(value: `575`): Self = StObject.set(x, "deletePagesSite", value.asInstanceOf[js.Any])
    
    inline def setDeletePullRequestReviewProtection(value: `576`): Self = StObject.set(x, "deletePullRequestReviewProtection", value.asInstanceOf[js.Any])
    
    inline def setDeleteRelease(value: `577`): Self = StObject.set(x, "deleteRelease", value.asInstanceOf[js.Any])
    
    inline def setDeleteReleaseAsset(value: `578`): Self = StObject.set(x, "deleteReleaseAsset", value.asInstanceOf[js.Any])
    
    inline def setDeleteTagProtection(value: `579`): Self = StObject.set(x, "deleteTagProtection", value.asInstanceOf[js.Any])
    
    inline def setDeleteWebhook(value: `580`): Self = StObject.set(x, "deleteWebhook", value.asInstanceOf[js.Any])
    
    inline def setDisableAutomatedSecurityFixes(value: `581`): Self = StObject.set(x, "disableAutomatedSecurityFixes", value.asInstanceOf[js.Any])
    
    inline def setDisableLfsForRepo(value: `582`): Self = StObject.set(x, "disableLfsForRepo", value.asInstanceOf[js.Any])
    
    inline def setDisableVulnerabilityAlerts(value: `583`): Self = StObject.set(x, "disableVulnerabilityAlerts", value.asInstanceOf[js.Any])
    
    inline def setDownloadArchive(value: `584`): Self = StObject.set(x, "downloadArchive", value.asInstanceOf[js.Any])
    
    inline def setDownloadTarballArchive(value: `585`): Self = StObject.set(x, "downloadTarballArchive", value.asInstanceOf[js.Any])
    
    inline def setDownloadZipballArchive(value: `584`): Self = StObject.set(x, "downloadZipballArchive", value.asInstanceOf[js.Any])
    
    inline def setEnableAutomatedSecurityFixes(value: `586`): Self = StObject.set(x, "enableAutomatedSecurityFixes", value.asInstanceOf[js.Any])
    
    inline def setEnableLfsForRepo(value: `587`): Self = StObject.set(x, "enableLfsForRepo", value.asInstanceOf[js.Any])
    
    inline def setEnableVulnerabilityAlerts(value: `588`): Self = StObject.set(x, "enableVulnerabilityAlerts", value.asInstanceOf[js.Any])
    
    inline def setGenerateReleaseNotes(value: `589`): Self = StObject.set(x, "generateReleaseNotes", value.asInstanceOf[js.Any])
    
    inline def setGet(value: `590`): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setGetAccessRestrictions(value: `591`): Self = StObject.set(x, "getAccessRestrictions", value.asInstanceOf[js.Any])
    
    inline def setGetAdminBranchProtection(value: `592`): Self = StObject.set(x, "getAdminBranchProtection", value.asInstanceOf[js.Any])
    
    inline def setGetAllEnvironments(value: `593`): Self = StObject.set(x, "getAllEnvironments", value.asInstanceOf[js.Any])
    
    inline def setGetAllStatusCheckContexts(value: `594`): Self = StObject.set(x, "getAllStatusCheckContexts", value.asInstanceOf[js.Any])
    
    inline def setGetAllTopics(value: `595`): Self = StObject.set(x, "getAllTopics", value.asInstanceOf[js.Any])
    
    inline def setGetAppsWithAccessToProtectedBranch(value: `596`): Self = StObject.set(x, "getAppsWithAccessToProtectedBranch", value.asInstanceOf[js.Any])
    
    inline def setGetAutolink(value: `597`): Self = StObject.set(x, "getAutolink", value.asInstanceOf[js.Any])
    
    inline def setGetBranch(value: `598`): Self = StObject.set(x, "getBranch", value.asInstanceOf[js.Any])
    
    inline def setGetBranchProtection(value: `599`): Self = StObject.set(x, "getBranchProtection", value.asInstanceOf[js.Any])
    
    inline def setGetClones(value: `600`): Self = StObject.set(x, "getClones", value.asInstanceOf[js.Any])
    
    inline def setGetCodeFrequencyStats(value: `601`): Self = StObject.set(x, "getCodeFrequencyStats", value.asInstanceOf[js.Any])
    
    inline def setGetCollaboratorPermissionLevel(value: `602`): Self = StObject.set(x, "getCollaboratorPermissionLevel", value.asInstanceOf[js.Any])
    
    inline def setGetCombinedStatusForRef(value: `603`): Self = StObject.set(x, "getCombinedStatusForRef", value.asInstanceOf[js.Any])
    
    inline def setGetCommit(value: `604`): Self = StObject.set(x, "getCommit", value.asInstanceOf[js.Any])
    
    inline def setGetCommitActivityStats(value: `605`): Self = StObject.set(x, "getCommitActivityStats", value.asInstanceOf[js.Any])
    
    inline def setGetCommitComment(value: `606`): Self = StObject.set(x, "getCommitComment", value.asInstanceOf[js.Any])
    
    inline def setGetCommitSignatureProtection(value: `607`): Self = StObject.set(x, "getCommitSignatureProtection", value.asInstanceOf[js.Any])
    
    inline def setGetCommunityProfileMetrics(value: `608`): Self = StObject.set(x, "getCommunityProfileMetrics", value.asInstanceOf[js.Any])
    
    inline def setGetContent(value: `609`): Self = StObject.set(x, "getContent", value.asInstanceOf[js.Any])
    
    inline def setGetContributorsStats(value: `610`): Self = StObject.set(x, "getContributorsStats", value.asInstanceOf[js.Any])
    
    inline def setGetDeployKey(value: `611`): Self = StObject.set(x, "getDeployKey", value.asInstanceOf[js.Any])
    
    inline def setGetDeployment(value: `612`): Self = StObject.set(x, "getDeployment", value.asInstanceOf[js.Any])
    
    inline def setGetDeploymentBranchPolicy(value: `613`): Self = StObject.set(x, "getDeploymentBranchPolicy", value.asInstanceOf[js.Any])
    
    inline def setGetDeploymentStatus(value: `614`): Self = StObject.set(x, "getDeploymentStatus", value.asInstanceOf[js.Any])
    
    inline def setGetEnvironment(value: `615`): Self = StObject.set(x, "getEnvironment", value.asInstanceOf[js.Any])
    
    inline def setGetLatestPagesBuild(value: `616`): Self = StObject.set(x, "getLatestPagesBuild", value.asInstanceOf[js.Any])
    
    inline def setGetLatestRelease(value: `617`): Self = StObject.set(x, "getLatestRelease", value.asInstanceOf[js.Any])
    
    inline def setGetPages(value: `618`): Self = StObject.set(x, "getPages", value.asInstanceOf[js.Any])
    
    inline def setGetPagesBuild(value: `619`): Self = StObject.set(x, "getPagesBuild", value.asInstanceOf[js.Any])
    
    inline def setGetPagesHealthCheck(value: `620`): Self = StObject.set(x, "getPagesHealthCheck", value.asInstanceOf[js.Any])
    
    inline def setGetParticipationStats(value: `621`): Self = StObject.set(x, "getParticipationStats", value.asInstanceOf[js.Any])
    
    inline def setGetPullRequestReviewProtection(value: `622`): Self = StObject.set(x, "getPullRequestReviewProtection", value.asInstanceOf[js.Any])
    
    inline def setGetPunchCardStats(value: `623`): Self = StObject.set(x, "getPunchCardStats", value.asInstanceOf[js.Any])
    
    inline def setGetReadme(value: `624`): Self = StObject.set(x, "getReadme", value.asInstanceOf[js.Any])
    
    inline def setGetReadmeInDirectory(value: `625`): Self = StObject.set(x, "getReadmeInDirectory", value.asInstanceOf[js.Any])
    
    inline def setGetRelease(value: `626`): Self = StObject.set(x, "getRelease", value.asInstanceOf[js.Any])
    
    inline def setGetReleaseAsset(value: `627`): Self = StObject.set(x, "getReleaseAsset", value.asInstanceOf[js.Any])
    
    inline def setGetReleaseByTag(value: `628`): Self = StObject.set(x, "getReleaseByTag", value.asInstanceOf[js.Any])
    
    inline def setGetStatusChecksProtection(value: `629`): Self = StObject.set(x, "getStatusChecksProtection", value.asInstanceOf[js.Any])
    
    inline def setGetTeamsWithAccessToProtectedBranch(value: `630`): Self = StObject.set(x, "getTeamsWithAccessToProtectedBranch", value.asInstanceOf[js.Any])
    
    inline def setGetTopPaths(value: `631`): Self = StObject.set(x, "getTopPaths", value.asInstanceOf[js.Any])
    
    inline def setGetTopReferrers(value: `632`): Self = StObject.set(x, "getTopReferrers", value.asInstanceOf[js.Any])
    
    inline def setGetUsersWithAccessToProtectedBranch(value: `633`): Self = StObject.set(x, "getUsersWithAccessToProtectedBranch", value.asInstanceOf[js.Any])
    
    inline def setGetViews(value: `634`): Self = StObject.set(x, "getViews", value.asInstanceOf[js.Any])
    
    inline def setGetWebhook(value: `635`): Self = StObject.set(x, "getWebhook", value.asInstanceOf[js.Any])
    
    inline def setGetWebhookConfigForRepo(value: `636`): Self = StObject.set(x, "getWebhookConfigForRepo", value.asInstanceOf[js.Any])
    
    inline def setGetWebhookDelivery(value: `637`): Self = StObject.set(x, "getWebhookDelivery", value.asInstanceOf[js.Any])
    
    inline def setListAutolinks(value: `638`): Self = StObject.set(x, "listAutolinks", value.asInstanceOf[js.Any])
    
    inline def setListBranches(value: `639`): Self = StObject.set(x, "listBranches", value.asInstanceOf[js.Any])
    
    inline def setListBranchesForHeadCommit(value: `640`): Self = StObject.set(x, "listBranchesForHeadCommit", value.asInstanceOf[js.Any])
    
    inline def setListCollaborators(value: `641`): Self = StObject.set(x, "listCollaborators", value.asInstanceOf[js.Any])
    
    inline def setListCommentsForCommit(value: `642`): Self = StObject.set(x, "listCommentsForCommit", value.asInstanceOf[js.Any])
    
    inline def setListCommitCommentsForRepo(value: `643`): Self = StObject.set(x, "listCommitCommentsForRepo", value.asInstanceOf[js.Any])
    
    inline def setListCommitStatusesForRef(value: `644`): Self = StObject.set(x, "listCommitStatusesForRef", value.asInstanceOf[js.Any])
    
    inline def setListCommits(value: `645`): Self = StObject.set(x, "listCommits", value.asInstanceOf[js.Any])
    
    inline def setListContributors(value: `646`): Self = StObject.set(x, "listContributors", value.asInstanceOf[js.Any])
    
    inline def setListDeployKeys(value: `647`): Self = StObject.set(x, "listDeployKeys", value.asInstanceOf[js.Any])
    
    inline def setListDeploymentBranchPolicies(value: `648`): Self = StObject.set(x, "listDeploymentBranchPolicies", value.asInstanceOf[js.Any])
    
    inline def setListDeploymentStatuses(value: `649`): Self = StObject.set(x, "listDeploymentStatuses", value.asInstanceOf[js.Any])
    
    inline def setListDeployments(value: `650`): Self = StObject.set(x, "listDeployments", value.asInstanceOf[js.Any])
    
    inline def setListForAuthenticatedUser(value: `651`): Self = StObject.set(x, "listForAuthenticatedUser", value.asInstanceOf[js.Any])
    
    inline def setListForOrg(value: `652`): Self = StObject.set(x, "listForOrg", value.asInstanceOf[js.Any])
    
    inline def setListForUser(value: `653`): Self = StObject.set(x, "listForUser", value.asInstanceOf[js.Any])
    
    inline def setListForks(value: `654`): Self = StObject.set(x, "listForks", value.asInstanceOf[js.Any])
    
    inline def setListInvitations(value: `655`): Self = StObject.set(x, "listInvitations", value.asInstanceOf[js.Any])
    
    inline def setListInvitationsForAuthenticatedUser(value: `656`): Self = StObject.set(x, "listInvitationsForAuthenticatedUser", value.asInstanceOf[js.Any])
    
    inline def setListLanguages(value: `657`): Self = StObject.set(x, "listLanguages", value.asInstanceOf[js.Any])
    
    inline def setListPagesBuilds(value: `658`): Self = StObject.set(x, "listPagesBuilds", value.asInstanceOf[js.Any])
    
    inline def setListPublic(value: `659`): Self = StObject.set(x, "listPublic", value.asInstanceOf[js.Any])
    
    inline def setListPullRequestsAssociatedWithCommit(value: `660`): Self = StObject.set(x, "listPullRequestsAssociatedWithCommit", value.asInstanceOf[js.Any])
    
    inline def setListReleaseAssets(value: `661`): Self = StObject.set(x, "listReleaseAssets", value.asInstanceOf[js.Any])
    
    inline def setListReleases(value: `662`): Self = StObject.set(x, "listReleases", value.asInstanceOf[js.Any])
    
    inline def setListTagProtection(value: `663`): Self = StObject.set(x, "listTagProtection", value.asInstanceOf[js.Any])
    
    inline def setListTags(value: `664`): Self = StObject.set(x, "listTags", value.asInstanceOf[js.Any])
    
    inline def setListTeams(value: `665`): Self = StObject.set(x, "listTeams", value.asInstanceOf[js.Any])
    
    inline def setListWebhookDeliveries(value: `666`): Self = StObject.set(x, "listWebhookDeliveries", value.asInstanceOf[js.Any])
    
    inline def setListWebhooks(value: `667`): Self = StObject.set(x, "listWebhooks", value.asInstanceOf[js.Any])
    
    inline def setMerge(value: `668`): Self = StObject.set(x, "merge", value.asInstanceOf[js.Any])
    
    inline def setMergeUpstream(value: `669`): Self = StObject.set(x, "mergeUpstream", value.asInstanceOf[js.Any])
    
    inline def setPingWebhook(value: `670`): Self = StObject.set(x, "pingWebhook", value.asInstanceOf[js.Any])
    
    inline def setRedeliverWebhookDelivery(value: `671`): Self = StObject.set(x, "redeliverWebhookDelivery", value.asInstanceOf[js.Any])
    
    inline def setRemoveAppAccessRestrictions(value: `672`): Self = StObject.set(x, "removeAppAccessRestrictions", value.asInstanceOf[js.Any])
    
    inline def setRemoveCollaborator(value: `673`): Self = StObject.set(x, "removeCollaborator", value.asInstanceOf[js.Any])
    
    inline def setRemoveStatusCheckContexts(value: `674`): Self = StObject.set(x, "removeStatusCheckContexts", value.asInstanceOf[js.Any])
    
    inline def setRemoveStatusCheckProtection(value: `675`): Self = StObject.set(x, "removeStatusCheckProtection", value.asInstanceOf[js.Any])
    
    inline def setRemoveTeamAccessRestrictions(value: `676`): Self = StObject.set(x, "removeTeamAccessRestrictions", value.asInstanceOf[js.Any])
    
    inline def setRemoveUserAccessRestrictions(value: `677`): Self = StObject.set(x, "removeUserAccessRestrictions", value.asInstanceOf[js.Any])
    
    inline def setRenameBranch(value: `678`): Self = StObject.set(x, "renameBranch", value.asInstanceOf[js.Any])
    
    inline def setReplaceAllTopics(value: `679`): Self = StObject.set(x, "replaceAllTopics", value.asInstanceOf[js.Any])
    
    inline def setRequestPagesBuild(value: `680`): Self = StObject.set(x, "requestPagesBuild", value.asInstanceOf[js.Any])
    
    inline def setSetAdminBranchProtection(value: `681`): Self = StObject.set(x, "setAdminBranchProtection", value.asInstanceOf[js.Any])
    
    inline def setSetAppAccessRestrictions(value: `682`): Self = StObject.set(x, "setAppAccessRestrictions", value.asInstanceOf[js.Any])
    
    inline def setSetStatusCheckContexts(value: `683`): Self = StObject.set(x, "setStatusCheckContexts", value.asInstanceOf[js.Any])
    
    inline def setSetTeamAccessRestrictions(value: `684`): Self = StObject.set(x, "setTeamAccessRestrictions", value.asInstanceOf[js.Any])
    
    inline def setSetUserAccessRestrictions(value: `685`): Self = StObject.set(x, "setUserAccessRestrictions", value.asInstanceOf[js.Any])
    
    inline def setTestPushWebhook(value: `686`): Self = StObject.set(x, "testPushWebhook", value.asInstanceOf[js.Any])
    
    inline def setTransfer(value: `687`): Self = StObject.set(x, "transfer", value.asInstanceOf[js.Any])
    
    inline def setUpdate(value: `688`): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
    
    inline def setUpdateBranchProtection(value: `689`): Self = StObject.set(x, "updateBranchProtection", value.asInstanceOf[js.Any])
    
    inline def setUpdateCommitComment(value: `690`): Self = StObject.set(x, "updateCommitComment", value.asInstanceOf[js.Any])
    
    inline def setUpdateDeploymentBranchPolicy(value: `691`): Self = StObject.set(x, "updateDeploymentBranchPolicy", value.asInstanceOf[js.Any])
    
    inline def setUpdateInformationAboutPagesSite(value: `692`): Self = StObject.set(x, "updateInformationAboutPagesSite", value.asInstanceOf[js.Any])
    
    inline def setUpdateInvitation(value: `693`): Self = StObject.set(x, "updateInvitation", value.asInstanceOf[js.Any])
    
    inline def setUpdatePullRequestReviewProtection(value: `694`): Self = StObject.set(x, "updatePullRequestReviewProtection", value.asInstanceOf[js.Any])
    
    inline def setUpdateRelease(value: `695`): Self = StObject.set(x, "updateRelease", value.asInstanceOf[js.Any])
    
    inline def setUpdateReleaseAsset(value: `696`): Self = StObject.set(x, "updateReleaseAsset", value.asInstanceOf[js.Any])
    
    inline def setUpdateStatusCheckPotection(value: `697`): Self = StObject.set(x, "updateStatusCheckPotection", value.asInstanceOf[js.Any])
    
    inline def setUpdateStatusCheckProtection(value: `697`): Self = StObject.set(x, "updateStatusCheckProtection", value.asInstanceOf[js.Any])
    
    inline def setUpdateWebhook(value: `698`): Self = StObject.set(x, "updateWebhook", value.asInstanceOf[js.Any])
    
    inline def setUpdateWebhookConfigForRepo(value: `699`): Self = StObject.set(x, "updateWebhookConfigForRepo", value.asInstanceOf[js.Any])
    
    inline def setUploadReleaseAsset(value: `700`): Self = StObject.set(x, "uploadReleaseAsset", value.asInstanceOf[js.Any])
  }
}
