package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AcceptInvitation extends StObject {
  
  def acceptInvitation(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PATCH /user/repository_invitations/:invitation_id']['response'] */ js.Any
  ]
  def acceptInvitation(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PATCH /user/repository_invitations/:invitation_id']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PATCH /user/repository_invitations/:invitation_id']['response'] */ js.Any
  ]
  @JSName("acceptInvitation")
  var acceptInvitation_Original: `339`
  
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
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/:owner/:repo/branches/:branch/protection/restrictions/apps']['response'] */ js.Any
  ]
  def addAppAccessRestrictions(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/:owner/:repo/branches/:branch/protection/restrictions/apps']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/:owner/:repo/branches/:branch/protection/restrictions/apps']['response'] */ js.Any
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
  var addAppAccessRestrictions_Original: `340`
  
  /**
    * This endpoint triggers [notifications](https://docs.github.com/articles/about-notifications/). Creating content too quickly using this endpoint may result in abuse rate limiting. See "[Abuse rate limits](https://developer.github.com/v3/#abuse-rate-limits)" and "[Dealing with abuse rate limits](https://developer.github.com/v3/guides/best-practices-for-integrators/#dealing-with-abuse-rate-limits)" for details.
    *
    * For more information the permission levels, see "[Repository permission levels for an organization](https://docs.github.com/en/github/setting-up-and-managing-organizations-and-teams/repository-permission-levels-for-an-organization#permission-levels-for-repositories-owned-by-an-organization)".
    *
    * Note that, if you choose not to pass any parameters, you'll need to set `Content-Length` to zero when calling out to this endpoint. For more information, see "[HTTP verbs](https://developer.github.com/v3/#http-verbs)."
    *
    * The invitee will receive a notification that they have been invited to the repository, which they must accept or decline. They may do this via the notifications page, the email they receive, or by using the [repository invitations API endpoints](https://developer.github.com/v3/repos/invitations/).
    *
    * **Rate limits**
    *
    * To prevent abuse, you are limited to sending 50 invitations to a repository per 24 hour period. Note there is no limit if you are inviting organization members to an organization repository.
    */
  def addCollaborator(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /repos/:owner/:repo/collaborators/:username']['response'] */ js.Any
  ]
  def addCollaborator(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /repos/:owner/:repo/collaborators/:username']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /repos/:owner/:repo/collaborators/:username']['response'] */ js.Any
  ]
  /**
    * This endpoint triggers [notifications](https://docs.github.com/articles/about-notifications/). Creating content too quickly using this endpoint may result in abuse rate limiting. See "[Abuse rate limits](https://developer.github.com/v3/#abuse-rate-limits)" and "[Dealing with abuse rate limits](https://developer.github.com/v3/guides/best-practices-for-integrators/#dealing-with-abuse-rate-limits)" for details.
    *
    * For more information the permission levels, see "[Repository permission levels for an organization](https://docs.github.com/en/github/setting-up-and-managing-organizations-and-teams/repository-permission-levels-for-an-organization#permission-levels-for-repositories-owned-by-an-organization)".
    *
    * Note that, if you choose not to pass any parameters, you'll need to set `Content-Length` to zero when calling out to this endpoint. For more information, see "[HTTP verbs](https://developer.github.com/v3/#http-verbs)."
    *
    * The invitee will receive a notification that they have been invited to the repository, which they must accept or decline. They may do this via the notifications page, the email they receive, or by using the [repository invitations API endpoints](https://developer.github.com/v3/repos/invitations/).
    *
    * **Rate limits**
    *
    * To prevent abuse, you are limited to sending 50 invitations to a repository per 24 hour period. Note there is no limit if you are inviting organization members to an organization repository.
    */
  @JSName("addCollaborator")
  var addCollaborator_Original: `341`
  
  /**
    * Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    */
  def addStatusCheckContexts(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/:owner/:repo/branches/:branch/protection/required_status_checks/contexts']['response'] */ js.Any
  ]
  def addStatusCheckContexts(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/:owner/:repo/branches/:branch/protection/required_status_checks/contexts']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/:owner/:repo/branches/:branch/protection/required_status_checks/contexts']['response'] */ js.Any
  ]
  /**
    * Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    */
  @JSName("addStatusCheckContexts")
  var addStatusCheckContexts_Original: `342`
  
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
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/:owner/:repo/branches/:branch/protection/restrictions/teams']['response'] */ js.Any
  ]
  def addTeamAccessRestrictions(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/:owner/:repo/branches/:branch/protection/restrictions/teams']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/:owner/:repo/branches/:branch/protection/restrictions/teams']['response'] */ js.Any
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
  var addTeamAccessRestrictions_Original: `343`
  
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
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/:owner/:repo/branches/:branch/protection/restrictions/users']['response'] */ js.Any
  ]
  def addUserAccessRestrictions(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/:owner/:repo/branches/:branch/protection/restrictions/users']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/:owner/:repo/branches/:branch/protection/restrictions/users']['response'] */ js.Any
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
  var addUserAccessRestrictions_Original: `344`
  
  /**
    * For organization-owned repositories, the list of collaborators includes outside collaborators, organization members that are direct collaborators, organization members with access through team memberships, organization members with access through default organization permissions, and organization owners.
    *
    * Team members will include the members of child teams.
    */
  def checkCollaborator(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/collaborators/:username']['response'] */ js.Any
  ]
  def checkCollaborator(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/collaborators/:username']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/collaborators/:username']['response'] */ js.Any
  ]
  /**
    * For organization-owned repositories, the list of collaborators includes outside collaborators, organization members that are direct collaborators, organization members with access through team memberships, organization members with access through default organization permissions, and organization owners.
    *
    * Team members will include the members of child teams.
    */
  @JSName("checkCollaborator")
  var checkCollaborator_Original: `345`
  
  /**
    * Shows whether dependency alerts are enabled or disabled for a repository. The authenticated user must have admin access to the repository. For more information, see "[About security alerts for vulnerable dependencies](https://docs.github.com/en/articles/about-security-alerts-for-vulnerable-dependencies)".
    */
  def checkVulnerabilityAlerts(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/vulnerability-alerts']['response'] */ js.Any
  ]
  def checkVulnerabilityAlerts(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/vulnerability-alerts']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/vulnerability-alerts']['response'] */ js.Any
  ]
  /**
    * Shows whether dependency alerts are enabled or disabled for a repository. The authenticated user must have admin access to the repository. For more information, see "[About security alerts for vulnerable dependencies](https://docs.github.com/en/articles/about-security-alerts-for-vulnerable-dependencies)".
    */
  @JSName("checkVulnerabilityAlerts")
  var checkVulnerabilityAlerts_Original: `346`
  
  /**
    * Both `:base` and `:head` must be branch names in `:repo`. To compare branches across other repositories in the same network as `:repo`, use the format `<USERNAME>:branch`.
    *
    * The response from the API is equivalent to running the `git log base..head` command; however, commits are returned in chronological order. Pass the appropriate [media type](https://developer.github.com/v3/media/#commits-commit-comparison-and-pull-requests) to fetch diff and patch formats.
    *
    * The response also includes details on the files that were changed between the two commits. This includes the status of the change (for example, if a file was added, removed, modified, or renamed), and details of the change itself. For example, files with a `renamed` status have a `previous_filename` field showing the previous filename of the file, and files with a `modified` status have a `patch` field showing the changes made to the file.
    *
    * **Working with large comparisons**
    *
    * The response will include a comparison of up to 250 commits. If you are working with a larger commit range, you can use the [List commits](https://developer.github.com/v3/repos/commits/#list-commits) to enumerate all commits in the range.
    *
    * For comparisons with extremely large diffs, you may receive an error response indicating that the diff took too long
    * to generate. You can typically resolve this error by using a smaller commit range.
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
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/compare/:base...:head']['response'] */ js.Any
  ]
  def compareCommits(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/compare/:base...:head']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/compare/:base...:head']['response'] */ js.Any
  ]
  /**
    * Both `:base` and `:head` must be branch names in `:repo`. To compare branches across other repositories in the same network as `:repo`, use the format `<USERNAME>:branch`.
    *
    * The response from the API is equivalent to running the `git log base..head` command; however, commits are returned in chronological order. Pass the appropriate [media type](https://developer.github.com/v3/media/#commits-commit-comparison-and-pull-requests) to fetch diff and patch formats.
    *
    * The response also includes details on the files that were changed between the two commits. This includes the status of the change (for example, if a file was added, removed, modified, or renamed), and details of the change itself. For example, files with a `renamed` status have a `previous_filename` field showing the previous filename of the file, and files with a `modified` status have a `patch` field showing the changes made to the file.
    *
    * **Working with large comparisons**
    *
    * The response will include a comparison of up to 250 commits. If you are working with a larger commit range, you can use the [List commits](https://developer.github.com/v3/repos/commits/#list-commits) to enumerate all commits in the range.
    *
    * For comparisons with extremely large diffs, you may receive an error response indicating that the diff took too long
    * to generate. You can typically resolve this error by using a smaller commit range.
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
  var compareCommits_Original: `347`
  
  /**
    * Create a comment for a commit using its `:commit_sha`.
    *
    * This endpoint triggers [notifications](https://docs.github.com/articles/about-notifications/). Creating content too quickly using this endpoint may result in abuse rate limiting. See "[Abuse rate limits](https://developer.github.com/v3/#abuse-rate-limits)" and "[Dealing with abuse rate limits](https://developer.github.com/v3/guides/best-practices-for-integrators/#dealing-with-abuse-rate-limits)" for details.
    */
  def createCommitComment(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/:owner/:repo/commits/:commit_sha/comments']['response'] */ js.Any
  ]
  def createCommitComment(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/:owner/:repo/commits/:commit_sha/comments']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/:owner/:repo/commits/:commit_sha/comments']['response'] */ js.Any
  ]
  /**
    * Create a comment for a commit using its `:commit_sha`.
    *
    * This endpoint triggers [notifications](https://docs.github.com/articles/about-notifications/). Creating content too quickly using this endpoint may result in abuse rate limiting. See "[Abuse rate limits](https://developer.github.com/v3/#abuse-rate-limits)" and "[Dealing with abuse rate limits](https://developer.github.com/v3/guides/best-practices-for-integrators/#dealing-with-abuse-rate-limits)" for details.
    */
  @JSName("createCommitComment")
  var createCommitComment_Original: `348`
  
  /**
    * Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    *
    * When authenticated with admin or owner permissions to the repository, you can use this endpoint to require signed commits on a branch. You must enable branch protection to require signed commits.
    */
  def createCommitSignatureProtection(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/:owner/:repo/branches/:branch/protection/required_signatures']['response'] */ js.Any
  ]
  def createCommitSignatureProtection(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/:owner/:repo/branches/:branch/protection/required_signatures']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/:owner/:repo/branches/:branch/protection/required_signatures']['response'] */ js.Any
  ]
  /**
    * Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    *
    * When authenticated with admin or owner permissions to the repository, you can use this endpoint to require signed commits on a branch. You must enable branch protection to require signed commits.
    */
  @JSName("createCommitSignatureProtection")
  var createCommitSignatureProtection_Original: `349`
  
  /**
    * Users with push access in a repository can create commit statuses for a given SHA.
    *
    * Note: there is a limit of 1000 statuses per `sha` and `context` within a repository. Attempts to create more than 1000 statuses will result in a validation error.
    */
  def createCommitStatus(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/:owner/:repo/statuses/:sha']['response'] */ js.Any
  ]
  def createCommitStatus(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/:owner/:repo/statuses/:sha']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/:owner/:repo/statuses/:sha']['response'] */ js.Any
  ]
  /**
    * Users with push access in a repository can create commit statuses for a given SHA.
    *
    * Note: there is a limit of 1000 statuses per `sha` and `context` within a repository. Attempts to create more than 1000 statuses will result in a validation error.
    */
  @JSName("createCommitStatus")
  var createCommitStatus_Original: `350`
  
  /**
    * You can create a read-only deploy key.
    */
  def createDeployKey(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/:owner/:repo/keys']['response'] */ js.Any
  ]
  def createDeployKey(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/:owner/:repo/keys']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/:owner/:repo/keys']['response'] */ js.Any
  ]
  /**
    * You can create a read-only deploy key.
    */
  @JSName("createDeployKey")
  var createDeployKey_Original: `351`
  
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
    * By default, [commit statuses](https://developer.github.com/v3/repos/statuses) for every submitted context must be in a `success`
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
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/:owner/:repo/deployments']['response'] */ js.Any
  ]
  def createDeployment(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/:owner/:repo/deployments']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/:owner/:repo/deployments']['response'] */ js.Any
  ]
  
  /**
    * Users with `push` access can create deployment statuses for a given deployment.
    *
    * GitHub Apps require `read & write` access to "Deployments" and `read-only` access to "Repo contents" (for private repos). OAuth Apps require the `repo_deployment` scope.
    */
  def createDeploymentStatus(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/:owner/:repo/deployments/:deployment_id/statuses']['response'] */ js.Any
  ]
  def createDeploymentStatus(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/:owner/:repo/deployments/:deployment_id/statuses']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/:owner/:repo/deployments/:deployment_id/statuses']['response'] */ js.Any
  ]
  /**
    * Users with `push` access can create deployment statuses for a given deployment.
    *
    * GitHub Apps require `read & write` access to "Deployments" and `read-only` access to "Repo contents" (for private repos). OAuth Apps require the `repo_deployment` scope.
    */
  @JSName("createDeploymentStatus")
  var createDeploymentStatus_Original: `353`
  
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
    * By default, [commit statuses](https://developer.github.com/v3/repos/statuses) for every submitted context must be in a `success`
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
  var createDeployment_Original: `352`
  
  /**
    * You can use this endpoint to trigger a webhook event called `repository_dispatch` when you want activity that happens outside of GitHub to trigger a GitHub Actions workflow or GitHub App webhook. You must configure your GitHub Actions workflow or GitHub App to run when the `repository_dispatch` event occurs. For an example `repository_dispatch` webhook payload, see "[RepositoryDispatchEvent](https://developer.github.com/webhooks/event-payloads/#repository_dispatch)."
    *
    * The `client_payload` parameter is available for any extra information that your workflow might need. This parameter is a JSON payload that will be passed on when the webhook event is dispatched. For example, the `client_payload` can include a message that a user would like to send using a GitHub Actions workflow. Or the `client_payload` can be used as a test to debug your workflow. For a test example, see the [input example](https://developer.github.com/v3/repos/#example-4).
    *
    * To give you write access to the repository, you must use a personal access token with the `repo` scope. For more information, see "[Creating a personal access token for the command line](https://docs.github.com/articles/creating-a-personal-access-token-for-the-command-line)" in the GitHub Help documentation.
    *
    * This input example shows how you can use the `client_payload` as a test to debug your workflow.
    */
  def createDispatchEvent(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/:owner/:repo/dispatches']['response'] */ js.Any
  ]
  def createDispatchEvent(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/:owner/:repo/dispatches']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/:owner/:repo/dispatches']['response'] */ js.Any
  ]
  /**
    * You can use this endpoint to trigger a webhook event called `repository_dispatch` when you want activity that happens outside of GitHub to trigger a GitHub Actions workflow or GitHub App webhook. You must configure your GitHub Actions workflow or GitHub App to run when the `repository_dispatch` event occurs. For an example `repository_dispatch` webhook payload, see "[RepositoryDispatchEvent](https://developer.github.com/webhooks/event-payloads/#repository_dispatch)."
    *
    * The `client_payload` parameter is available for any extra information that your workflow might need. This parameter is a JSON payload that will be passed on when the webhook event is dispatched. For example, the `client_payload` can include a message that a user would like to send using a GitHub Actions workflow. Or the `client_payload` can be used as a test to debug your workflow. For a test example, see the [input example](https://developer.github.com/v3/repos/#example-4).
    *
    * To give you write access to the repository, you must use a personal access token with the `repo` scope. For more information, see "[Creating a personal access token for the command line](https://docs.github.com/articles/creating-a-personal-access-token-for-the-command-line)" in the GitHub Help documentation.
    *
    * This input example shows how you can use the `client_payload` as a test to debug your workflow.
    */
  @JSName("createDispatchEvent")
  var createDispatchEvent_Original: `354`
  
  /**
    * Creates a new repository for the authenticated user.
    *
    * **OAuth scope requirements**
    *
    * When using [OAuth](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/), authorizations must include:
    *
    * *   `public_repo` scope or `repo` scope to create a public repository
    * *   `repo` scope to create a private repository
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
    * When using [OAuth](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/), authorizations must include:
    *
    * *   `public_repo` scope or `repo` scope to create a public repository
    * *   `repo` scope to create a private repository
    */
  @JSName("createForAuthenticatedUser")
  var createForAuthenticatedUser_Original: `355`
  
  /**
    * Create a fork for the authenticated user.
    *
    * **Note**: Forking a Repository happens asynchronously. You may have to wait a short period of time before you can access the git objects. If this takes longer than 5 minutes, be sure to contact [GitHub Support](https://github.com/contact) or [GitHub Premium Support](https://premium.githubsupport.com).
    */
  def createFork(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/:owner/:repo/forks']['response'] */ js.Any
  ]
  def createFork(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/:owner/:repo/forks']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/:owner/:repo/forks']['response'] */ js.Any
  ]
  /**
    * Create a fork for the authenticated user.
    *
    * **Note**: Forking a Repository happens asynchronously. You may have to wait a short period of time before you can access the git objects. If this takes longer than 5 minutes, be sure to contact [GitHub Support](https://github.com/contact) or [GitHub Premium Support](https://premium.githubsupport.com).
    */
  @JSName("createFork")
  var createFork_Original: `356`
  
  /**
    * Creates a new repository in the specified organization. The authenticated user must be a member of the organization.
    *
    * **OAuth scope requirements**
    *
    * When using [OAuth](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/), authorizations must include:
    *
    * *   `public_repo` scope or `repo` scope to create a public repository
    * *   `repo` scope to create a private repository
    */
  def createInOrg(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /orgs/:org/repos']['response'] */ js.Any
  ]
  def createInOrg(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /orgs/:org/repos']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /orgs/:org/repos']['response'] */ js.Any
  ]
  /**
    * Creates a new repository in the specified organization. The authenticated user must be a member of the organization.
    *
    * **OAuth scope requirements**
    *
    * When using [OAuth](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/), authorizations must include:
    *
    * *   `public_repo` scope or `repo` scope to create a public repository
    * *   `repo` scope to create a private repository
    */
  @JSName("createInOrg")
  var createInOrg_Original: `357`
  
  /**
    * Creates a new file or replaces an existing file in a repository.
    */
  def createOrUpdateFileContents(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /repos/:owner/:repo/contents/:path']['response'] */ js.Any
  ]
  def createOrUpdateFileContents(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /repos/:owner/:repo/contents/:path']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /repos/:owner/:repo/contents/:path']['response'] */ js.Any
  ]
  /**
    * Creates a new file or replaces an existing file in a repository.
    */
  @JSName("createOrUpdateFileContents")
  var createOrUpdateFileContents_Original: `358`
  
  /**
    * Configures a GitHub Pages site. For more information, see "[About GitHub Pages](/github/working-with-github-pages/about-github-pages)."
    */
  def createPagesSite(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/:owner/:repo/pages']['response'] */ js.Any
  ]
  def createPagesSite(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/:owner/:repo/pages']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/:owner/:repo/pages']['response'] */ js.Any
  ]
  /**
    * Configures a GitHub Pages site. For more information, see "[About GitHub Pages](/github/working-with-github-pages/about-github-pages)."
    */
  @JSName("createPagesSite")
  var createPagesSite_Original: `359`
  
  /**
    * Users with push access to the repository can create a release.
    *
    * This endpoint triggers [notifications](https://docs.github.com/articles/about-notifications/). Creating content too quickly using this endpoint may result in abuse rate limiting. See "[Abuse rate limits](https://developer.github.com/v3/#abuse-rate-limits)" and "[Dealing with abuse rate limits](https://developer.github.com/v3/guides/best-practices-for-integrators/#dealing-with-abuse-rate-limits)" for details.
    */
  def createRelease(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/:owner/:repo/releases']['response'] */ js.Any
  ]
  def createRelease(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/:owner/:repo/releases']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/:owner/:repo/releases']['response'] */ js.Any
  ]
  /**
    * Users with push access to the repository can create a release.
    *
    * This endpoint triggers [notifications](https://docs.github.com/articles/about-notifications/). Creating content too quickly using this endpoint may result in abuse rate limiting. See "[Abuse rate limits](https://developer.github.com/v3/#abuse-rate-limits)" and "[Dealing with abuse rate limits](https://developer.github.com/v3/guides/best-practices-for-integrators/#dealing-with-abuse-rate-limits)" for details.
    */
  @JSName("createRelease")
  var createRelease_Original: `360`
  
  /**
    * Creates a new repository using a repository template. Use the `template_owner` and `template_repo` route parameters to specify the repository to use as the template. The authenticated user must own or be a member of an organization that owns the repository. To check if a repository is available to use as a template, get the repository's information using the [Get a repository](https://developer.github.com/v3/repos/#get-a-repository) endpoint and check that the `is_template` key is `true`.
    *
    * **OAuth scope requirements**
    *
    * When using [OAuth](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/), authorizations must include:
    *
    * *   `public_repo` scope or `repo` scope to create a public repository
    * *   `repo` scope to create a private repository
    */
  def createUsingTemplate(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/:template_owner/:template_repo/generate']['response'] */ js.Any
  ]
  def createUsingTemplate(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/:template_owner/:template_repo/generate']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/:template_owner/:template_repo/generate']['response'] */ js.Any
  ]
  /**
    * Creates a new repository using a repository template. Use the `template_owner` and `template_repo` route parameters to specify the repository to use as the template. The authenticated user must own or be a member of an organization that owns the repository. To check if a repository is available to use as a template, get the repository's information using the [Get a repository](https://developer.github.com/v3/repos/#get-a-repository) endpoint and check that the `is_template` key is `true`.
    *
    * **OAuth scope requirements**
    *
    * When using [OAuth](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/), authorizations must include:
    *
    * *   `public_repo` scope or `repo` scope to create a public repository
    * *   `repo` scope to create a private repository
    */
  @JSName("createUsingTemplate")
  var createUsingTemplate_Original: `361`
  
  /**
    * Repositories can have multiple webhooks installed. Each webhook should have a unique `config`. Multiple webhooks can
    * share the same `config` as long as those webhooks do not have any `events` that overlap.
    */
  def createWebhook(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/:owner/:repo/hooks']['response'] */ js.Any
  ]
  def createWebhook(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/:owner/:repo/hooks']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/:owner/:repo/hooks']['response'] */ js.Any
  ]
  /**
    * Repositories can have multiple webhooks installed. Each webhook should have a unique `config`. Multiple webhooks can
    * share the same `config` as long as those webhooks do not have any `events` that overlap.
    */
  @JSName("createWebhook")
  var createWebhook_Original: `362`
  
  def declineInvitation(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /user/repository_invitations/:invitation_id']['response'] */ js.Any
  ]
  def declineInvitation(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /user/repository_invitations/:invitation_id']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /user/repository_invitations/:invitation_id']['response'] */ js.Any
  ]
  @JSName("declineInvitation")
  var declineInvitation_Original: `363`
  
  /**
    * Deleting a repository requires admin access. If OAuth is used, the `delete_repo` scope is required.
    *
    * If an organization owner has configured the organization to prevent members from deleting organization-owned
    * repositories, you will get a `403 Forbidden` response.
    */
  def delete(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/:owner/:repo']['response'] */ js.Any
  ]
  def delete(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/:owner/:repo']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/:owner/:repo']['response'] */ js.Any
  ]
  
  /**
    * Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    *
    * Disables the ability to restrict who can push to this branch.
    */
  def deleteAccessRestrictions(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/:owner/:repo/branches/:branch/protection/restrictions']['response'] */ js.Any
  ]
  def deleteAccessRestrictions(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/:owner/:repo/branches/:branch/protection/restrictions']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/:owner/:repo/branches/:branch/protection/restrictions']['response'] */ js.Any
  ]
  /**
    * Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    *
    * Disables the ability to restrict who can push to this branch.
    */
  @JSName("deleteAccessRestrictions")
  var deleteAccessRestrictions_Original: `365`
  
  /**
    * Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    *
    * Removing admin enforcement requires admin or owner permissions to the repository and branch protection to be enabled.
    */
  def deleteAdminBranchProtection(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/:owner/:repo/branches/:branch/protection/enforce_admins']['response'] */ js.Any
  ]
  def deleteAdminBranchProtection(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/:owner/:repo/branches/:branch/protection/enforce_admins']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/:owner/:repo/branches/:branch/protection/enforce_admins']['response'] */ js.Any
  ]
  /**
    * Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    *
    * Removing admin enforcement requires admin or owner permissions to the repository and branch protection to be enabled.
    */
  @JSName("deleteAdminBranchProtection")
  var deleteAdminBranchProtection_Original: `366`
  
  /**
    * Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    */
  def deleteBranchProtection(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/:owner/:repo/branches/:branch/protection']['response'] */ js.Any
  ]
  def deleteBranchProtection(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/:owner/:repo/branches/:branch/protection']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/:owner/:repo/branches/:branch/protection']['response'] */ js.Any
  ]
  /**
    * Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    */
  @JSName("deleteBranchProtection")
  var deleteBranchProtection_Original: `367`
  
  def deleteCommitComment(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/:owner/:repo/comments/:comment_id']['response'] */ js.Any
  ]
  def deleteCommitComment(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/:owner/:repo/comments/:comment_id']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/:owner/:repo/comments/:comment_id']['response'] */ js.Any
  ]
  @JSName("deleteCommitComment")
  var deleteCommitComment_Original: `368`
  
  /**
    * Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    *
    * When authenticated with admin or owner permissions to the repository, you can use this endpoint to disable required signed commits on a branch. You must enable branch protection to require signed commits.
    */
  def deleteCommitSignatureProtection(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/:owner/:repo/branches/:branch/protection/required_signatures']['response'] */ js.Any
  ]
  def deleteCommitSignatureProtection(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/:owner/:repo/branches/:branch/protection/required_signatures']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/:owner/:repo/branches/:branch/protection/required_signatures']['response'] */ js.Any
  ]
  /**
    * Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    *
    * When authenticated with admin or owner permissions to the repository, you can use this endpoint to disable required signed commits on a branch. You must enable branch protection to require signed commits.
    */
  @JSName("deleteCommitSignatureProtection")
  var deleteCommitSignatureProtection_Original: `369`
  
  /**
    * Deploy keys are immutable. If you need to update a key, remove the key and create a new one instead.
    */
  def deleteDeployKey(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/:owner/:repo/keys/:key_id']['response'] */ js.Any
  ]
  def deleteDeployKey(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/:owner/:repo/keys/:key_id']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/:owner/:repo/keys/:key_id']['response'] */ js.Any
  ]
  /**
    * Deploy keys are immutable. If you need to update a key, remove the key and create a new one instead.
    */
  @JSName("deleteDeployKey")
  var deleteDeployKey_Original: `370`
  
  /**
    * To ensure there can always be an active deployment, you can only delete an _inactive_ deployment. Anyone with `repo` or `repo_deployment` scopes can delete an inactive deployment.
    *
    * To set a deployment as inactive, you must:
    *
    * *   Create a new deployment that is active so that the system has a record of the current state, then delete the previously active deployment.
    * *   Mark the active deployment as inactive by adding any non-successful deployment status.
    *
    * For more information, see "[Create a deployment](https://developer.github.com/v3/repos/deployments/#create-a-deployment)" and "[Create a deployment status](https://developer.github.com/v3/repos/deployments/#create-a-deployment-status)."
    */
  def deleteDeployment(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/:owner/:repo/deployments/:deployment_id']['response'] */ js.Any
  ]
  def deleteDeployment(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/:owner/:repo/deployments/:deployment_id']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/:owner/:repo/deployments/:deployment_id']['response'] */ js.Any
  ]
  /**
    * To ensure there can always be an active deployment, you can only delete an _inactive_ deployment. Anyone with `repo` or `repo_deployment` scopes can delete an inactive deployment.
    *
    * To set a deployment as inactive, you must:
    *
    * *   Create a new deployment that is active so that the system has a record of the current state, then delete the previously active deployment.
    * *   Mark the active deployment as inactive by adding any non-successful deployment status.
    *
    * For more information, see "[Create a deployment](https://developer.github.com/v3/repos/deployments/#create-a-deployment)" and "[Create a deployment status](https://developer.github.com/v3/repos/deployments/#create-a-deployment-status)."
    */
  @JSName("deleteDeployment")
  var deleteDeployment_Original: `371`
  
  /**
    * Deletes a file in a repository.
    *
    * You can provide an additional `committer` parameter, which is an object containing information about the committer. Or, you can provide an `author` parameter, which is an object containing information about the author.
    *
    * The `author` section is optional and is filled in with the `committer` information if omitted. If the `committer` information is omitted, the authenticated user's information is used.
    *
    * You must provide values for both `name` and `email`, whether you choose to use `author` or `committer`. Otherwise, you'll receive a `422` status code.
    */
  def deleteFile(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/:owner/:repo/contents/:path']['response'] */ js.Any
  ]
  def deleteFile(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/:owner/:repo/contents/:path']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/:owner/:repo/contents/:path']['response'] */ js.Any
  ]
  /**
    * Deletes a file in a repository.
    *
    * You can provide an additional `committer` parameter, which is an object containing information about the committer. Or, you can provide an `author` parameter, which is an object containing information about the author.
    *
    * The `author` section is optional and is filled in with the `committer` information if omitted. If the `committer` information is omitted, the authenticated user's information is used.
    *
    * You must provide values for both `name` and `email`, whether you choose to use `author` or `committer`. Otherwise, you'll receive a `422` status code.
    */
  @JSName("deleteFile")
  var deleteFile_Original: `372`
  
  def deleteInvitation(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/:owner/:repo/invitations/:invitation_id']['response'] */ js.Any
  ]
  def deleteInvitation(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/:owner/:repo/invitations/:invitation_id']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/:owner/:repo/invitations/:invitation_id']['response'] */ js.Any
  ]
  @JSName("deleteInvitation")
  var deleteInvitation_Original: `373`
  
  def deletePagesSite(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/:owner/:repo/pages']['response'] */ js.Any
  ]
  def deletePagesSite(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/:owner/:repo/pages']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/:owner/:repo/pages']['response'] */ js.Any
  ]
  @JSName("deletePagesSite")
  var deletePagesSite_Original: `374`
  
  /**
    * Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    */
  def deletePullRequestReviewProtection(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/:owner/:repo/branches/:branch/protection/required_pull_request_reviews']['response'] */ js.Any
  ]
  def deletePullRequestReviewProtection(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/:owner/:repo/branches/:branch/protection/required_pull_request_reviews']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/:owner/:repo/branches/:branch/protection/required_pull_request_reviews']['response'] */ js.Any
  ]
  /**
    * Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    */
  @JSName("deletePullRequestReviewProtection")
  var deletePullRequestReviewProtection_Original: `375`
  
  /**
    * Users with push access to the repository can delete a release.
    */
  def deleteRelease(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/:owner/:repo/releases/:release_id']['response'] */ js.Any
  ]
  def deleteRelease(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/:owner/:repo/releases/:release_id']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/:owner/:repo/releases/:release_id']['response'] */ js.Any
  ]
  
  def deleteReleaseAsset(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/:owner/:repo/releases/assets/:asset_id']['response'] */ js.Any
  ]
  def deleteReleaseAsset(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/:owner/:repo/releases/assets/:asset_id']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/:owner/:repo/releases/assets/:asset_id']['response'] */ js.Any
  ]
  @JSName("deleteReleaseAsset")
  var deleteReleaseAsset_Original: `377`
  
  /**
    * Users with push access to the repository can delete a release.
    */
  @JSName("deleteRelease")
  var deleteRelease_Original: `376`
  
  def deleteWebhook(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/:owner/:repo/hooks/:hook_id']['response'] */ js.Any
  ]
  def deleteWebhook(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/:owner/:repo/hooks/:hook_id']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/:owner/:repo/hooks/:hook_id']['response'] */ js.Any
  ]
  @JSName("deleteWebhook")
  var deleteWebhook_Original: `378`
  
  /**
    * Deleting a repository requires admin access. If OAuth is used, the `delete_repo` scope is required.
    *
    * If an organization owner has configured the organization to prevent members from deleting organization-owned
    * repositories, you will get a `403 Forbidden` response.
    */
  @JSName("delete")
  var delete_Original: `364`
  
  /**
    * Disables automated security fixes for a repository. The authenticated user must have admin access to the repository. For more information, see "[Configuring automated security fixes](https://docs.github.com/en/articles/configuring-automated-security-fixes)".
    */
  def disableAutomatedSecurityFixes(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/:owner/:repo/automated-security-fixes']['response'] */ js.Any
  ]
  def disableAutomatedSecurityFixes(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/:owner/:repo/automated-security-fixes']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/:owner/:repo/automated-security-fixes']['response'] */ js.Any
  ]
  /**
    * Disables automated security fixes for a repository. The authenticated user must have admin access to the repository. For more information, see "[Configuring automated security fixes](https://docs.github.com/en/articles/configuring-automated-security-fixes)".
    */
  @JSName("disableAutomatedSecurityFixes")
  var disableAutomatedSecurityFixes_Original: `379`
  
  /**
    * Disables dependency alerts and the dependency graph for a repository. The authenticated user must have admin access to the repository. For more information, see "[About security alerts for vulnerable dependencies](https://docs.github.com/en/articles/about-security-alerts-for-vulnerable-dependencies)".
    */
  def disableVulnerabilityAlerts(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/:owner/:repo/vulnerability-alerts']['response'] */ js.Any
  ]
  def disableVulnerabilityAlerts(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/:owner/:repo/vulnerability-alerts']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/:owner/:repo/vulnerability-alerts']['response'] */ js.Any
  ]
  /**
    * Disables dependency alerts and the dependency graph for a repository. The authenticated user must have admin access to the repository. For more information, see "[About security alerts for vulnerable dependencies](https://docs.github.com/en/articles/about-security-alerts-for-vulnerable-dependencies)".
    */
  @JSName("disableVulnerabilityAlerts")
  var disableVulnerabilityAlerts_Original: `380`
  
  /**
    * Gets a redirect URL to download an archive for a repository. The `:archive_format` can be either `tarball` or
    * `zipball`. The `:ref` must be a valid Git reference. If you omit `:ref`, the repository’s default branch (usually
    * `master`) will be used. Please make sure your HTTP framework is configured to follow redirects or you will need to use
    * the `Location` header to make a second `GET` request.
    *
    * **Note**: For private repositories, these links are temporary and expire after five minutes.
    */
  def downloadArchive(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/:archive_format/:ref']['response'] */ js.Any
  ]
  def downloadArchive(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/:archive_format/:ref']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/:archive_format/:ref']['response'] */ js.Any
  ]
  /**
    * Gets a redirect URL to download an archive for a repository. The `:archive_format` can be either `tarball` or
    * `zipball`. The `:ref` must be a valid Git reference. If you omit `:ref`, the repository’s default branch (usually
    * `master`) will be used. Please make sure your HTTP framework is configured to follow redirects or you will need to use
    * the `Location` header to make a second `GET` request.
    *
    * **Note**: For private repositories, these links are temporary and expire after five minutes.
    */
  @JSName("downloadArchive")
  var downloadArchive_Original: `381`
  
  /**
    * Enables automated security fixes for a repository. The authenticated user must have admin access to the repository. For more information, see "[Configuring automated security fixes](https://docs.github.com/en/articles/configuring-automated-security-fixes)".
    */
  def enableAutomatedSecurityFixes(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /repos/:owner/:repo/automated-security-fixes']['response'] */ js.Any
  ]
  def enableAutomatedSecurityFixes(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /repos/:owner/:repo/automated-security-fixes']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /repos/:owner/:repo/automated-security-fixes']['response'] */ js.Any
  ]
  /**
    * Enables automated security fixes for a repository. The authenticated user must have admin access to the repository. For more information, see "[Configuring automated security fixes](https://docs.github.com/en/articles/configuring-automated-security-fixes)".
    */
  @JSName("enableAutomatedSecurityFixes")
  var enableAutomatedSecurityFixes_Original: `382`
  
  /**
    * Enables dependency alerts and the dependency graph for a repository. The authenticated user must have admin access to the repository. For more information, see "[About security alerts for vulnerable dependencies](https://docs.github.com/en/articles/about-security-alerts-for-vulnerable-dependencies)".
    */
  def enableVulnerabilityAlerts(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /repos/:owner/:repo/vulnerability-alerts']['response'] */ js.Any
  ]
  def enableVulnerabilityAlerts(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /repos/:owner/:repo/vulnerability-alerts']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /repos/:owner/:repo/vulnerability-alerts']['response'] */ js.Any
  ]
  /**
    * Enables dependency alerts and the dependency graph for a repository. The authenticated user must have admin access to the repository. For more information, see "[About security alerts for vulnerable dependencies](https://docs.github.com/en/articles/about-security-alerts-for-vulnerable-dependencies)".
    */
  @JSName("enableVulnerabilityAlerts")
  var enableVulnerabilityAlerts_Original: `383`
  
  /**
    * When you pass the `scarlet-witch-preview` media type, requests to get a repository will also return the repository's code of conduct if it can be detected from the repository's code of conduct file.
    *
    * The `parent` and `source` objects are present when the repository is a fork. `parent` is the repository this repository was forked from, `source` is the ultimate source for the network.
    */
  def get(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo']['response'] */ js.Any
  ]
  def get(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo']['response'] */ js.Any
  ]
  
  /**
    * Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    *
    * Lists who has access to this protected branch.
    *
    * **Note**: Users, apps, and teams `restrictions` are only available for organization-owned repositories.
    */
  def getAccessRestrictions(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/branches/:branch/protection/restrictions']['response'] */ js.Any
  ]
  def getAccessRestrictions(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/branches/:branch/protection/restrictions']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/branches/:branch/protection/restrictions']['response'] */ js.Any
  ]
  /**
    * Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    *
    * Lists who has access to this protected branch.
    *
    * **Note**: Users, apps, and teams `restrictions` are only available for organization-owned repositories.
    */
  @JSName("getAccessRestrictions")
  var getAccessRestrictions_Original: `385`
  
  /**
    * Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    */
  def getAdminBranchProtection(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/branches/:branch/protection/enforce_admins']['response'] */ js.Any
  ]
  def getAdminBranchProtection(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/branches/:branch/protection/enforce_admins']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/branches/:branch/protection/enforce_admins']['response'] */ js.Any
  ]
  /**
    * Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    */
  @JSName("getAdminBranchProtection")
  var getAdminBranchProtection_Original: `386`
  
  /**
    * Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    */
  def getAllStatusCheckContexts(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/branches/:branch/protection/required_status_checks/contexts']['response'] */ js.Any
  ]
  def getAllStatusCheckContexts(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/branches/:branch/protection/required_status_checks/contexts']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/branches/:branch/protection/required_status_checks/contexts']['response'] */ js.Any
  ]
  /**
    * Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    */
  @JSName("getAllStatusCheckContexts")
  var getAllStatusCheckContexts_Original: `387`
  
  def getAllTopics(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/topics']['response'] */ js.Any
  ]
  def getAllTopics(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/topics']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/topics']['response'] */ js.Any
  ]
  @JSName("getAllTopics")
  var getAllTopics_Original: `388`
  
  /**
    * Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    *
    * Lists the GitHub Apps that have push access to this branch. Only installed GitHub Apps with `write` access to the `contents` permission can be added as authorized actors on a protected branch.
    */
  def getAppsWithAccessToProtectedBranch(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/branches/:branch/protection/restrictions/apps']['response'] */ js.Any
  ]
  def getAppsWithAccessToProtectedBranch(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/branches/:branch/protection/restrictions/apps']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/branches/:branch/protection/restrictions/apps']['response'] */ js.Any
  ]
  /**
    * Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    *
    * Lists the GitHub Apps that have push access to this branch. Only installed GitHub Apps with `write` access to the `contents` permission can be added as authorized actors on a protected branch.
    */
  @JSName("getAppsWithAccessToProtectedBranch")
  var getAppsWithAccessToProtectedBranch_Original: `389`
  
  def getBranch(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/branches/:branch']['response'] */ js.Any
  ]
  def getBranch(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/branches/:branch']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/branches/:branch']['response'] */ js.Any
  ]
  
  /**
    * Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    */
  def getBranchProtection(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/branches/:branch/protection']['response'] */ js.Any
  ]
  def getBranchProtection(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/branches/:branch/protection']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/branches/:branch/protection']['response'] */ js.Any
  ]
  /**
    * Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    */
  @JSName("getBranchProtection")
  var getBranchProtection_Original: `391`
  
  @JSName("getBranch")
  var getBranch_Original: `390`
  
  /**
    * Get the total number of clones and breakdown per day or week for the last 14 days. Timestamps are aligned to UTC midnight of the beginning of the day or week. Week begins on Monday.
    */
  def getClones(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/traffic/clones']['response'] */ js.Any
  ]
  def getClones(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/traffic/clones']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/traffic/clones']['response'] */ js.Any
  ]
  /**
    * Get the total number of clones and breakdown per day or week for the last 14 days. Timestamps are aligned to UTC midnight of the beginning of the day or week. Week begins on Monday.
    */
  @JSName("getClones")
  var getClones_Original: `392`
  
  /**
    * Returns a weekly aggregate of the number of additions and deletions pushed to a repository.
    */
  def getCodeFrequencyStats(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/stats/code_frequency']['response'] */ js.Any
  ]
  def getCodeFrequencyStats(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/stats/code_frequency']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/stats/code_frequency']['response'] */ js.Any
  ]
  /**
    * Returns a weekly aggregate of the number of additions and deletions pushed to a repository.
    */
  @JSName("getCodeFrequencyStats")
  var getCodeFrequencyStats_Original: `393`
  
  /**
    * Checks the repository permission of a collaborator. The possible repository permissions are `admin`, `write`, `read`, and `none`.
    */
  def getCollaboratorPermissionLevel(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/collaborators/:username/permission']['response'] */ js.Any
  ]
  def getCollaboratorPermissionLevel(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/collaborators/:username/permission']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/collaborators/:username/permission']['response'] */ js.Any
  ]
  /**
    * Checks the repository permission of a collaborator. The possible repository permissions are `admin`, `write`, `read`, and `none`.
    */
  @JSName("getCollaboratorPermissionLevel")
  var getCollaboratorPermissionLevel_Original: `394`
  
  /**
    * Users with pull access in a repository can access a combined view of commit statuses for a given ref. The ref can be a SHA, a branch name, or a tag name.
    *
    * The most recent status for each context is returned, up to 100. This field [paginates](https://developer.github.com/v3/#pagination) if there are over 100 contexts.
    *
    * Additionally, a combined `state` is returned. The `state` is one of:
    *
    * *   **failure** if any of the contexts report as `error` or `failure`
    * *   **pending** if there are no statuses or a context is `pending`
    * *   **success** if the latest status for all contexts is `success`
    */
  def getCombinedStatusForRef(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/commits/:ref/status']['response'] */ js.Any
  ]
  def getCombinedStatusForRef(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/commits/:ref/status']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/commits/:ref/status']['response'] */ js.Any
  ]
  /**
    * Users with pull access in a repository can access a combined view of commit statuses for a given ref. The ref can be a SHA, a branch name, or a tag name.
    *
    * The most recent status for each context is returned, up to 100. This field [paginates](https://developer.github.com/v3/#pagination) if there are over 100 contexts.
    *
    * Additionally, a combined `state` is returned. The `state` is one of:
    *
    * *   **failure** if any of the contexts report as `error` or `failure`
    * *   **pending** if there are no statuses or a context is `pending`
    * *   **success** if the latest status for all contexts is `success`
    */
  @JSName("getCombinedStatusForRef")
  var getCombinedStatusForRef_Original: `395`
  
  /**
    * Returns the contents of a single commit reference. You must have `read` access for the repository to use this endpoint.
    *
    * **Note:** If there are more than 300 files in the commit diff, the response will include pagination link headers for the remaining files, up to a limit of 3000 files. Each page contains the static commit information, and the only changes are to the file listing.
    *
    * You can pass the appropriate [media type](https://developer.github.com/v3/media/#commits-commit-comparison-and-pull-requests) to  fetch `diff` and `patch` formats. Diffs with binary data will have no `patch` property.
    *
    * To return only the SHA-1 hash of the commit reference, you can provide the `sha` custom [media type](https://developer.github.com/v3/media/#commits-commit-comparison-and-pull-requests) in the `Accept` header. You can use this endpoint to check if a remote reference's SHA-1 hash is the same as your local reference's SHA-1 hash by providing the local SHA-1 reference as the ETag.
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
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/commits/:ref']['response'] */ js.Any
  ]
  def getCommit(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/commits/:ref']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/commits/:ref']['response'] */ js.Any
  ]
  
  /**
    * Returns the last year of commit activity grouped by week. The `days` array is a group of commits per day, starting on `Sunday`.
    */
  def getCommitActivityStats(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/stats/commit_activity']['response'] */ js.Any
  ]
  def getCommitActivityStats(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/stats/commit_activity']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/stats/commit_activity']['response'] */ js.Any
  ]
  /**
    * Returns the last year of commit activity grouped by week. The `days` array is a group of commits per day, starting on `Sunday`.
    */
  @JSName("getCommitActivityStats")
  var getCommitActivityStats_Original: `397`
  
  def getCommitComment(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/comments/:comment_id']['response'] */ js.Any
  ]
  def getCommitComment(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/comments/:comment_id']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/comments/:comment_id']['response'] */ js.Any
  ]
  @JSName("getCommitComment")
  var getCommitComment_Original: `398`
  
  /**
    * Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    *
    * When authenticated with admin or owner permissions to the repository, you can use this endpoint to check whether a branch requires signed commits. An enabled status of `true` indicates you must sign commits on this branch. For more information, see [Signing commits with GPG](https://docs.github.com/articles/signing-commits-with-gpg) in GitHub Help.
    *
    * **Note**: You must enable branch protection to require signed commits.
    */
  def getCommitSignatureProtection(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/branches/:branch/protection/required_signatures']['response'] */ js.Any
  ]
  def getCommitSignatureProtection(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/branches/:branch/protection/required_signatures']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/branches/:branch/protection/required_signatures']['response'] */ js.Any
  ]
  /**
    * Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    *
    * When authenticated with admin or owner permissions to the repository, you can use this endpoint to check whether a branch requires signed commits. An enabled status of `true` indicates you must sign commits on this branch. For more information, see [Signing commits with GPG](https://docs.github.com/articles/signing-commits-with-gpg) in GitHub Help.
    *
    * **Note**: You must enable branch protection to require signed commits.
    */
  @JSName("getCommitSignatureProtection")
  var getCommitSignatureProtection_Original: `399`
  
  /**
    * Returns the contents of a single commit reference. You must have `read` access for the repository to use this endpoint.
    *
    * **Note:** If there are more than 300 files in the commit diff, the response will include pagination link headers for the remaining files, up to a limit of 3000 files. Each page contains the static commit information, and the only changes are to the file listing.
    *
    * You can pass the appropriate [media type](https://developer.github.com/v3/media/#commits-commit-comparison-and-pull-requests) to  fetch `diff` and `patch` formats. Diffs with binary data will have no `patch` property.
    *
    * To return only the SHA-1 hash of the commit reference, you can provide the `sha` custom [media type](https://developer.github.com/v3/media/#commits-commit-comparison-and-pull-requests) in the `Accept` header. You can use this endpoint to check if a remote reference's SHA-1 hash is the same as your local reference's SHA-1 hash by providing the local SHA-1 reference as the ETag.
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
  var getCommit_Original: `396`
  
  /**
    * This endpoint will return all community profile metrics, including an overall health score, repository description, the presence of documentation, detected code of conduct, detected license, and the presence of ISSUE\_TEMPLATE, PULL\_REQUEST\_TEMPLATE, README, and CONTRIBUTING files.
    */
  def getCommunityProfileMetrics(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/community/profile']['response'] */ js.Any
  ]
  def getCommunityProfileMetrics(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/community/profile']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/community/profile']['response'] */ js.Any
  ]
  /**
    * This endpoint will return all community profile metrics, including an overall health score, repository description, the presence of documentation, detected code of conduct, detected license, and the presence of ISSUE\_TEMPLATE, PULL\_REQUEST\_TEMPLATE, README, and CONTRIBUTING files.
    */
  @JSName("getCommunityProfileMetrics")
  var getCommunityProfileMetrics_Original: `400`
  
  /**
    * Gets the contents of a file or directory in a repository. Specify the file path or directory in `:path`. If you omit
    * `:path`, you will receive the contents of all files in the repository.
    *
    * Files and symlinks support [a custom media type](https://developer.github.com/v3/repos/contents/#custom-media-types) for
    * retrieving the raw content or rendered HTML (when supported). All content types support [a custom media
    * type](https://developer.github.com/v3/repos/contents/#custom-media-types) to ensure the content is returned in a consistent
    * object format.
    *
    * **Note**:
    * *   To get a repository's contents recursively, you can [recursively get the tree](https://developer.github.com/v3/git/trees/).
    * *   This API has an upper limit of 1,000 files for a directory. If you need to retrieve more files, use the [Git Trees
    * API](https://developer.github.com/v3/git/trees/#get-a-tree).
    * *   This API supports files up to 1 megabyte in size.
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
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/contents/:path']['response'] */ js.Any
  ]
  def getContent(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/contents/:path']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/contents/:path']['response'] */ js.Any
  ]
  /**
    * Gets the contents of a file or directory in a repository. Specify the file path or directory in `:path`. If you omit
    * `:path`, you will receive the contents of all files in the repository.
    *
    * Files and symlinks support [a custom media type](https://developer.github.com/v3/repos/contents/#custom-media-types) for
    * retrieving the raw content or rendered HTML (when supported). All content types support [a custom media
    * type](https://developer.github.com/v3/repos/contents/#custom-media-types) to ensure the content is returned in a consistent
    * object format.
    *
    * **Note**:
    * *   To get a repository's contents recursively, you can [recursively get the tree](https://developer.github.com/v3/git/trees/).
    * *   This API has an upper limit of 1,000 files for a directory. If you need to retrieve more files, use the [Git Trees
    * API](https://developer.github.com/v3/git/trees/#get-a-tree).
    * *   This API supports files up to 1 megabyte in size.
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
  var getContent_Original: `401`
  
  /**
    * Returns the `total` number of commits authored by the contributor. In addition, the response includes a Weekly Hash (`weeks` array) with the following information:
    *
    * *   `w` - Start of the week, given as a [Unix timestamp](http://en.wikipedia.org/wiki/Unix_time).
    * *   `a` - Number of additions
    * *   `d` - Number of deletions
    * *   `c` - Number of commits
    */
  def getContributorsStats(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/stats/contributors']['response'] */ js.Any
  ]
  def getContributorsStats(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/stats/contributors']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/stats/contributors']['response'] */ js.Any
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
  var getContributorsStats_Original: `402`
  
  def getDeployKey(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/keys/:key_id']['response'] */ js.Any
  ]
  def getDeployKey(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/keys/:key_id']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/keys/:key_id']['response'] */ js.Any
  ]
  @JSName("getDeployKey")
  var getDeployKey_Original: `403`
  
  def getDeployment(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/deployments/:deployment_id']['response'] */ js.Any
  ]
  def getDeployment(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/deployments/:deployment_id']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/deployments/:deployment_id']['response'] */ js.Any
  ]
  
  /**
    * Users with pull access can view a deployment status for a deployment:
    */
  def getDeploymentStatus(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/deployments/:deployment_id/statuses/:status_id']['response'] */ js.Any
  ]
  def getDeploymentStatus(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/deployments/:deployment_id/statuses/:status_id']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/deployments/:deployment_id/statuses/:status_id']['response'] */ js.Any
  ]
  /**
    * Users with pull access can view a deployment status for a deployment:
    */
  @JSName("getDeploymentStatus")
  var getDeploymentStatus_Original: `405`
  
  @JSName("getDeployment")
  var getDeployment_Original: `404`
  
  def getLatestPagesBuild(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/pages/builds/latest']['response'] */ js.Any
  ]
  def getLatestPagesBuild(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/pages/builds/latest']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/pages/builds/latest']['response'] */ js.Any
  ]
  @JSName("getLatestPagesBuild")
  var getLatestPagesBuild_Original: `406`
  
  /**
    * View the latest published full release for the repository.
    *
    * The latest release is the most recent non-prerelease, non-draft release, sorted by the `created_at` attribute. The `created_at` attribute is the date of the commit used for the release, and not the date when the release was drafted or published.
    */
  def getLatestRelease(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/releases/latest']['response'] */ js.Any
  ]
  def getLatestRelease(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/releases/latest']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/releases/latest']['response'] */ js.Any
  ]
  /**
    * View the latest published full release for the repository.
    *
    * The latest release is the most recent non-prerelease, non-draft release, sorted by the `created_at` attribute. The `created_at` attribute is the date of the commit used for the release, and not the date when the release was drafted or published.
    */
  @JSName("getLatestRelease")
  var getLatestRelease_Original: `407`
  
  def getPages(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/pages']['response'] */ js.Any
  ]
  def getPages(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/pages']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/pages']['response'] */ js.Any
  ]
  
  def getPagesBuild(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/pages/builds/:build_id']['response'] */ js.Any
  ]
  def getPagesBuild(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/pages/builds/:build_id']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/pages/builds/:build_id']['response'] */ js.Any
  ]
  @JSName("getPagesBuild")
  var getPagesBuild_Original: `409`
  
  @JSName("getPages")
  var getPages_Original: `408`
  
  /**
    * Returns the total commit counts for the `owner` and total commit counts in `all`. `all` is everyone combined, including the `owner` in the last 52 weeks. If you'd like to get the commit counts for non-owners, you can subtract `owner` from `all`.
    *
    * The array order is oldest week (index 0) to most recent week.
    */
  def getParticipationStats(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/stats/participation']['response'] */ js.Any
  ]
  def getParticipationStats(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/stats/participation']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/stats/participation']['response'] */ js.Any
  ]
  /**
    * Returns the total commit counts for the `owner` and total commit counts in `all`. `all` is everyone combined, including the `owner` in the last 52 weeks. If you'd like to get the commit counts for non-owners, you can subtract `owner` from `all`.
    *
    * The array order is oldest week (index 0) to most recent week.
    */
  @JSName("getParticipationStats")
  var getParticipationStats_Original: `410`
  
  /**
    * Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    */
  def getPullRequestReviewProtection(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/branches/:branch/protection/required_pull_request_reviews']['response'] */ js.Any
  ]
  def getPullRequestReviewProtection(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/branches/:branch/protection/required_pull_request_reviews']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/branches/:branch/protection/required_pull_request_reviews']['response'] */ js.Any
  ]
  /**
    * Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    */
  @JSName("getPullRequestReviewProtection")
  var getPullRequestReviewProtection_Original: `411`
  
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
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/stats/punch_card']['response'] */ js.Any
  ]
  def getPunchCardStats(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/stats/punch_card']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/stats/punch_card']['response'] */ js.Any
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
  var getPunchCardStats_Original: `412`
  
  /**
    * Gets the preferred README for a repository.
    *
    * READMEs support [custom media types](https://developer.github.com/v3/repos/contents/#custom-media-types) for retrieving the raw content or rendered HTML.
    */
  def getReadme(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/readme']['response'] */ js.Any
  ]
  def getReadme(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/readme']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/readme']['response'] */ js.Any
  ]
  /**
    * Gets the preferred README for a repository.
    *
    * READMEs support [custom media types](https://developer.github.com/v3/repos/contents/#custom-media-types) for retrieving the raw content or rendered HTML.
    */
  @JSName("getReadme")
  var getReadme_Original: `413`
  
  /**
    * **Note:** This returns an `upload_url` key corresponding to the endpoint for uploading release assets. This key is a [hypermedia resource](https://developer.github.com/v3/#hypermedia).
    */
  def getRelease(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/releases/:release_id']['response'] */ js.Any
  ]
  def getRelease(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/releases/:release_id']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/releases/:release_id']['response'] */ js.Any
  ]
  
  /**
    * To download the asset's binary content, set the `Accept` header of the request to [`application/octet-stream`](https://developer.github.com/v3/media/#media-types). The API will either redirect the client to the location, or stream it directly if possible. API clients should handle both a `200` or `302` response.
    */
  def getReleaseAsset(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/releases/assets/:asset_id']['response'] */ js.Any
  ]
  def getReleaseAsset(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/releases/assets/:asset_id']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/releases/assets/:asset_id']['response'] */ js.Any
  ]
  /**
    * To download the asset's binary content, set the `Accept` header of the request to [`application/octet-stream`](https://developer.github.com/v3/media/#media-types). The API will either redirect the client to the location, or stream it directly if possible. API clients should handle both a `200` or `302` response.
    */
  @JSName("getReleaseAsset")
  var getReleaseAsset_Original: `415`
  
  /**
    * Get a published release with the specified tag.
    */
  def getReleaseByTag(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/releases/tags/:tag']['response'] */ js.Any
  ]
  def getReleaseByTag(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/releases/tags/:tag']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/releases/tags/:tag']['response'] */ js.Any
  ]
  /**
    * Get a published release with the specified tag.
    */
  @JSName("getReleaseByTag")
  var getReleaseByTag_Original: `416`
  
  /**
    * **Note:** This returns an `upload_url` key corresponding to the endpoint for uploading release assets. This key is a [hypermedia resource](https://developer.github.com/v3/#hypermedia).
    */
  @JSName("getRelease")
  var getRelease_Original: `414`
  
  /**
    * Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    */
  def getStatusChecksProtection(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/branches/:branch/protection/required_status_checks']['response'] */ js.Any
  ]
  def getStatusChecksProtection(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/branches/:branch/protection/required_status_checks']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/branches/:branch/protection/required_status_checks']['response'] */ js.Any
  ]
  /**
    * Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    */
  @JSName("getStatusChecksProtection")
  var getStatusChecksProtection_Original: `417`
  
  /**
    * Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    *
    * Lists the teams who have push access to this branch. The list includes child teams.
    */
  def getTeamsWithAccessToProtectedBranch(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/branches/:branch/protection/restrictions/teams']['response'] */ js.Any
  ]
  def getTeamsWithAccessToProtectedBranch(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/branches/:branch/protection/restrictions/teams']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/branches/:branch/protection/restrictions/teams']['response'] */ js.Any
  ]
  /**
    * Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    *
    * Lists the teams who have push access to this branch. The list includes child teams.
    */
  @JSName("getTeamsWithAccessToProtectedBranch")
  var getTeamsWithAccessToProtectedBranch_Original: `418`
  
  /**
    * Get the top 10 popular contents over the last 14 days.
    */
  def getTopPaths(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/traffic/popular/paths']['response'] */ js.Any
  ]
  def getTopPaths(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/traffic/popular/paths']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/traffic/popular/paths']['response'] */ js.Any
  ]
  /**
    * Get the top 10 popular contents over the last 14 days.
    */
  @JSName("getTopPaths")
  var getTopPaths_Original: `419`
  
  /**
    * Get the top 10 referrers over the last 14 days.
    */
  def getTopReferrers(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/traffic/popular/referrers']['response'] */ js.Any
  ]
  def getTopReferrers(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/traffic/popular/referrers']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/traffic/popular/referrers']['response'] */ js.Any
  ]
  /**
    * Get the top 10 referrers over the last 14 days.
    */
  @JSName("getTopReferrers")
  var getTopReferrers_Original: `420`
  
  /**
    * Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    *
    * Lists the people who have push access to this branch.
    */
  def getUsersWithAccessToProtectedBranch(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/branches/:branch/protection/restrictions/users']['response'] */ js.Any
  ]
  def getUsersWithAccessToProtectedBranch(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/branches/:branch/protection/restrictions/users']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/branches/:branch/protection/restrictions/users']['response'] */ js.Any
  ]
  /**
    * Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    *
    * Lists the people who have push access to this branch.
    */
  @JSName("getUsersWithAccessToProtectedBranch")
  var getUsersWithAccessToProtectedBranch_Original: `421`
  
  /**
    * Get the total number of views and breakdown per day or week for the last 14 days. Timestamps are aligned to UTC midnight of the beginning of the day or week. Week begins on Monday.
    */
  def getViews(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/traffic/views']['response'] */ js.Any
  ]
  def getViews(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/traffic/views']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/traffic/views']['response'] */ js.Any
  ]
  /**
    * Get the total number of views and breakdown per day or week for the last 14 days. Timestamps are aligned to UTC midnight of the beginning of the day or week. Week begins on Monday.
    */
  @JSName("getViews")
  var getViews_Original: `422`
  
  def getWebhook(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/hooks/:hook_id']['response'] */ js.Any
  ]
  def getWebhook(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/hooks/:hook_id']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/hooks/:hook_id']['response'] */ js.Any
  ]
  @JSName("getWebhook")
  var getWebhook_Original: `423`
  
  /**
    * When you pass the `scarlet-witch-preview` media type, requests to get a repository will also return the repository's code of conduct if it can be detected from the repository's code of conduct file.
    *
    * The `parent` and `source` objects are present when the repository is a fork. `parent` is the repository this repository was forked from, `source` is the ultimate source for the network.
    */
  @JSName("get")
  var get_Original: `384`
  
  def listBranches(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/branches']['response'] */ js.Any
  ]
  def listBranches(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/branches']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/branches']['response'] */ js.Any
  ]
  
  /**
    * Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    *
    * Returns all branches where the given commit SHA is the HEAD, or latest commit for the branch.
    */
  def listBranchesForHeadCommit(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/commits/:commit_sha/branches-where-head']['response'] */ js.Any
  ]
  def listBranchesForHeadCommit(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/commits/:commit_sha/branches-where-head']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/commits/:commit_sha/branches-where-head']['response'] */ js.Any
  ]
  /**
    * Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    *
    * Returns all branches where the given commit SHA is the HEAD, or latest commit for the branch.
    */
  @JSName("listBranchesForHeadCommit")
  var listBranchesForHeadCommit_Original: `425`
  
  @JSName("listBranches")
  var listBranches_Original: `424`
  
  /**
    * For organization-owned repositories, the list of collaborators includes outside collaborators, organization members that are direct collaborators, organization members with access through team memberships, organization members with access through default organization permissions, and organization owners.
    *
    * Team members will include the members of child teams.
    */
  def listCollaborators(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/collaborators']['response'] */ js.Any
  ]
  def listCollaborators(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/collaborators']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/collaborators']['response'] */ js.Any
  ]
  /**
    * For organization-owned repositories, the list of collaborators includes outside collaborators, organization members that are direct collaborators, organization members with access through team memberships, organization members with access through default organization permissions, and organization owners.
    *
    * Team members will include the members of child teams.
    */
  @JSName("listCollaborators")
  var listCollaborators_Original: `426`
  
  /**
    * Use the `:commit_sha` to specify the commit that will have its comments listed.
    */
  def listCommentsForCommit(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/commits/:commit_sha/comments']['response'] */ js.Any
  ]
  def listCommentsForCommit(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/commits/:commit_sha/comments']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/commits/:commit_sha/comments']['response'] */ js.Any
  ]
  /**
    * Use the `:commit_sha` to specify the commit that will have its comments listed.
    */
  @JSName("listCommentsForCommit")
  var listCommentsForCommit_Original: `427`
  
  /**
    * Commit Comments use [these custom media types](https://developer.github.com/v3/repos/comments/#custom-media-types). You can read more about the use of media types in the API [here](https://developer.github.com/v3/media/).
    *
    * Comments are ordered by ascending ID.
    */
  def listCommitCommentsForRepo(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/comments']['response'] */ js.Any
  ]
  def listCommitCommentsForRepo(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/comments']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/comments']['response'] */ js.Any
  ]
  /**
    * Commit Comments use [these custom media types](https://developer.github.com/v3/repos/comments/#custom-media-types). You can read more about the use of media types in the API [here](https://developer.github.com/v3/media/).
    *
    * Comments are ordered by ascending ID.
    */
  @JSName("listCommitCommentsForRepo")
  var listCommitCommentsForRepo_Original: `428`
  
  /**
    * Users with pull access in a repository can view commit statuses for a given ref. The ref can be a SHA, a branch name, or a tag name. Statuses are returned in reverse chronological order. The first status in the list will be the latest one.
    *
    * This resource is also available via a legacy route: `GET /repos/:owner/:repo/statuses/:ref`.
    */
  def listCommitStatusesForRef(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/commits/:ref/statuses']['response'] */ js.Any
  ]
  def listCommitStatusesForRef(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/commits/:ref/statuses']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/commits/:ref/statuses']['response'] */ js.Any
  ]
  /**
    * Users with pull access in a repository can view commit statuses for a given ref. The ref can be a SHA, a branch name, or a tag name. Statuses are returned in reverse chronological order. The first status in the list will be the latest one.
    *
    * This resource is also available via a legacy route: `GET /repos/:owner/:repo/statuses/:ref`.
    */
  @JSName("listCommitStatusesForRef")
  var listCommitStatusesForRef_Original: `429`
  
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
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/commits']['response'] */ js.Any
  ]
  def listCommits(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/commits']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/commits']['response'] */ js.Any
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
  var listCommits_Original: `430`
  
  /**
    * Lists contributors to the specified repository and sorts them by the number of commits per contributor in descending order. This endpoint may return information that is a few hours old because the GitHub REST API v3 caches contributor data to improve performance.
    *
    * GitHub identifies contributors by author email address. This endpoint groups contribution counts by GitHub user, which includes all associated email addresses. To improve performance, only the first 500 author email addresses in the repository link to GitHub users. The rest will appear as anonymous contributors without associated GitHub user information.
    */
  def listContributors(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/contributors']['response'] */ js.Any
  ]
  def listContributors(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/contributors']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/contributors']['response'] */ js.Any
  ]
  /**
    * Lists contributors to the specified repository and sorts them by the number of commits per contributor in descending order. This endpoint may return information that is a few hours old because the GitHub REST API v3 caches contributor data to improve performance.
    *
    * GitHub identifies contributors by author email address. This endpoint groups contribution counts by GitHub user, which includes all associated email addresses. To improve performance, only the first 500 author email addresses in the repository link to GitHub users. The rest will appear as anonymous contributors without associated GitHub user information.
    */
  @JSName("listContributors")
  var listContributors_Original: `431`
  
  def listDeployKeys(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/keys']['response'] */ js.Any
  ]
  def listDeployKeys(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/keys']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/keys']['response'] */ js.Any
  ]
  @JSName("listDeployKeys")
  var listDeployKeys_Original: `432`
  
  /**
    * Users with pull access can view deployment statuses for a deployment:
    */
  def listDeploymentStatuses(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/deployments/:deployment_id/statuses']['response'] */ js.Any
  ]
  def listDeploymentStatuses(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/deployments/:deployment_id/statuses']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/deployments/:deployment_id/statuses']['response'] */ js.Any
  ]
  /**
    * Users with pull access can view deployment statuses for a deployment:
    */
  @JSName("listDeploymentStatuses")
  var listDeploymentStatuses_Original: `433`
  
  /**
    * Simple filtering of deployments is available via query parameters:
    */
  def listDeployments(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/deployments']['response'] */ js.Any
  ]
  def listDeployments(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/deployments']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/deployments']['response'] */ js.Any
  ]
  /**
    * Simple filtering of deployments is available via query parameters:
    */
  @JSName("listDeployments")
  var listDeployments_Original: `434`
  
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
  var listForAuthenticatedUser_Original: `435`
  
  /**
    * Lists repositories for the specified organization.
    */
  def listForOrg(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/:org/repos']['response'] */ js.Any
  ]
  def listForOrg(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/:org/repos']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/:org/repos']['response'] */ js.Any
  ]
  /**
    * Lists repositories for the specified organization.
    */
  @JSName("listForOrg")
  var listForOrg_Original: `436`
  
  /**
    * Lists public repositories for the specified user.
    */
  def listForUser(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /users/:username/repos']['response'] */ js.Any
  ]
  def listForUser(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /users/:username/repos']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /users/:username/repos']['response'] */ js.Any
  ]
  /**
    * Lists public repositories for the specified user.
    */
  @JSName("listForUser")
  var listForUser_Original: `437`
  
  def listForks(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/forks']['response'] */ js.Any
  ]
  def listForks(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/forks']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/forks']['response'] */ js.Any
  ]
  @JSName("listForks")
  var listForks_Original: `438`
  
  /**
    * When authenticating as a user with admin rights to a repository, this endpoint will list all currently open repository invitations.
    */
  def listInvitations(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/invitations']['response'] */ js.Any
  ]
  def listInvitations(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/invitations']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/invitations']['response'] */ js.Any
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
  var listInvitationsForAuthenticatedUser_Original: `440`
  
  /**
    * When authenticating as a user with admin rights to a repository, this endpoint will list all currently open repository invitations.
    */
  @JSName("listInvitations")
  var listInvitations_Original: `439`
  
  /**
    * Lists languages for the specified repository. The value shown for each language is the number of bytes of code written in that language.
    */
  def listLanguages(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/languages']['response'] */ js.Any
  ]
  def listLanguages(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/languages']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/languages']['response'] */ js.Any
  ]
  /**
    * Lists languages for the specified repository. The value shown for each language is the number of bytes of code written in that language.
    */
  @JSName("listLanguages")
  var listLanguages_Original: `441`
  
  def listPagesBuilds(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/pages/builds']['response'] */ js.Any
  ]
  def listPagesBuilds(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/pages/builds']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/pages/builds']['response'] */ js.Any
  ]
  @JSName("listPagesBuilds")
  var listPagesBuilds_Original: `442`
  
  /**
    * Lists all public repositories in the order that they were created.
    *
    * Note: Pagination is powered exclusively by the `since` parameter. Use the [Link header](https://developer.github.com/v3/#link-header) to get the URL for the next page of repositories.
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
    * Note: Pagination is powered exclusively by the `since` parameter. Use the [Link header](https://developer.github.com/v3/#link-header) to get the URL for the next page of repositories.
    */
  @JSName("listPublic")
  var listPublic_Original: `443`
  
  /**
    * Lists all pull requests containing the provided commit SHA, which can be from any point in the commit history. The results will include open and closed pull requests. Additional preview headers may be required to see certain details for associated pull requests, such as whether a pull request is in a draft state. For more information about previews that might affect this endpoint, see the [List pull requests](https://developer.github.com/v3/pulls/#list-pull-requests) endpoint.
    */
  def listPullRequestsAssociatedWithCommit(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/commits/:commit_sha/pulls']['response'] */ js.Any
  ]
  def listPullRequestsAssociatedWithCommit(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/commits/:commit_sha/pulls']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/commits/:commit_sha/pulls']['response'] */ js.Any
  ]
  /**
    * Lists all pull requests containing the provided commit SHA, which can be from any point in the commit history. The results will include open and closed pull requests. Additional preview headers may be required to see certain details for associated pull requests, such as whether a pull request is in a draft state. For more information about previews that might affect this endpoint, see the [List pull requests](https://developer.github.com/v3/pulls/#list-pull-requests) endpoint.
    */
  @JSName("listPullRequestsAssociatedWithCommit")
  var listPullRequestsAssociatedWithCommit_Original: `444`
  
  def listReleaseAssets(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/releases/:release_id/assets']['response'] */ js.Any
  ]
  def listReleaseAssets(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/releases/:release_id/assets']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/releases/:release_id/assets']['response'] */ js.Any
  ]
  @JSName("listReleaseAssets")
  var listReleaseAssets_Original: `445`
  
  /**
    * This returns a list of releases, which does not include regular Git tags that have not been associated with a release. To get a list of Git tags, use the [Repository Tags API](https://developer.github.com/v3/repos/#list-repository-tags).
    *
    * Information about published releases are available to everyone. Only users with push access will receive listings for draft releases.
    */
  def listReleases(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/releases']['response'] */ js.Any
  ]
  def listReleases(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/releases']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/releases']['response'] */ js.Any
  ]
  /**
    * This returns a list of releases, which does not include regular Git tags that have not been associated with a release. To get a list of Git tags, use the [Repository Tags API](https://developer.github.com/v3/repos/#list-repository-tags).
    *
    * Information about published releases are available to everyone. Only users with push access will receive listings for draft releases.
    */
  @JSName("listReleases")
  var listReleases_Original: `446`
  
  def listTags(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/tags']['response'] */ js.Any
  ]
  def listTags(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/tags']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/tags']['response'] */ js.Any
  ]
  @JSName("listTags")
  var listTags_Original: `447`
  
  def listTeams(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/teams']['response'] */ js.Any
  ]
  def listTeams(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/teams']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/teams']['response'] */ js.Any
  ]
  @JSName("listTeams")
  var listTeams_Original: `448`
  
  def listWebhooks(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/hooks']['response'] */ js.Any
  ]
  def listWebhooks(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/hooks']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/hooks']['response'] */ js.Any
  ]
  @JSName("listWebhooks")
  var listWebhooks_Original: `449`
  
  def merge(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/:owner/:repo/merges']['response'] */ js.Any
  ]
  def merge(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/:owner/:repo/merges']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/:owner/:repo/merges']['response'] */ js.Any
  ]
  @JSName("merge")
  var merge_Original: `450`
  
  /**
    * This will trigger a [ping event](https://developer.github.com/webhooks/#ping-event) to be sent to the hook.
    */
  def pingWebhook(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/:owner/:repo/hooks/:hook_id/pings']['response'] */ js.Any
  ]
  def pingWebhook(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/:owner/:repo/hooks/:hook_id/pings']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/:owner/:repo/hooks/:hook_id/pings']['response'] */ js.Any
  ]
  /**
    * This will trigger a [ping event](https://developer.github.com/webhooks/#ping-event) to be sent to the hook.
    */
  @JSName("pingWebhook")
  var pingWebhook_Original: `451`
  
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
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/:owner/:repo/branches/:branch/protection/restrictions/apps']['response'] */ js.Any
  ]
  def removeAppAccessRestrictions(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/:owner/:repo/branches/:branch/protection/restrictions/apps']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/:owner/:repo/branches/:branch/protection/restrictions/apps']['response'] */ js.Any
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
  var removeAppAccessRestrictions_Original: `452`
  
  def removeCollaborator(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/:owner/:repo/collaborators/:username']['response'] */ js.Any
  ]
  def removeCollaborator(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/:owner/:repo/collaborators/:username']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/:owner/:repo/collaborators/:username']['response'] */ js.Any
  ]
  @JSName("removeCollaborator")
  var removeCollaborator_Original: `453`
  
  /**
    * Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    */
  def removeStatusCheckContexts(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/:owner/:repo/branches/:branch/protection/required_status_checks/contexts']['response'] */ js.Any
  ]
  def removeStatusCheckContexts(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/:owner/:repo/branches/:branch/protection/required_status_checks/contexts']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/:owner/:repo/branches/:branch/protection/required_status_checks/contexts']['response'] */ js.Any
  ]
  /**
    * Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    */
  @JSName("removeStatusCheckContexts")
  var removeStatusCheckContexts_Original: `454`
  
  /**
    * Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    */
  def removeStatusCheckProtection(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/:owner/:repo/branches/:branch/protection/required_status_checks']['response'] */ js.Any
  ]
  def removeStatusCheckProtection(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/:owner/:repo/branches/:branch/protection/required_status_checks']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/:owner/:repo/branches/:branch/protection/required_status_checks']['response'] */ js.Any
  ]
  /**
    * Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    */
  @JSName("removeStatusCheckProtection")
  var removeStatusCheckProtection_Original: `455`
  
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
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/:owner/:repo/branches/:branch/protection/restrictions/teams']['response'] */ js.Any
  ]
  def removeTeamAccessRestrictions(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/:owner/:repo/branches/:branch/protection/restrictions/teams']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/:owner/:repo/branches/:branch/protection/restrictions/teams']['response'] */ js.Any
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
  var removeTeamAccessRestrictions_Original: `456`
  
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
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/:owner/:repo/branches/:branch/protection/restrictions/users']['response'] */ js.Any
  ]
  def removeUserAccessRestrictions(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/:owner/:repo/branches/:branch/protection/restrictions/users']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/:owner/:repo/branches/:branch/protection/restrictions/users']['response'] */ js.Any
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
  var removeUserAccessRestrictions_Original: `457`
  
  def replaceAllTopics(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /repos/:owner/:repo/topics']['response'] */ js.Any
  ]
  def replaceAllTopics(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /repos/:owner/:repo/topics']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /repos/:owner/:repo/topics']['response'] */ js.Any
  ]
  @JSName("replaceAllTopics")
  var replaceAllTopics_Original: `458`
  
  /**
    * You can request that your site be built from the latest revision on the default branch. This has the same effect as pushing a commit to your default branch, but does not require an additional commit. Manually triggering page builds can be helpful when diagnosing build warnings and failures.
    *
    * Build requests are limited to one concurrent build per repository and one concurrent build per requester. If you request a build while another is still in progress, the second request will be queued until the first completes.
    */
  def requestPagesBuild(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/:owner/:repo/pages/builds']['response'] */ js.Any
  ]
  def requestPagesBuild(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/:owner/:repo/pages/builds']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/:owner/:repo/pages/builds']['response'] */ js.Any
  ]
  /**
    * You can request that your site be built from the latest revision on the default branch. This has the same effect as pushing a commit to your default branch, but does not require an additional commit. Manually triggering page builds can be helpful when diagnosing build warnings and failures.
    *
    * Build requests are limited to one concurrent build per repository and one concurrent build per requester. If you request a build while another is still in progress, the second request will be queued until the first completes.
    */
  @JSName("requestPagesBuild")
  var requestPagesBuild_Original: `459`
  
  /**
    * Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    *
    * Adding admin enforcement requires admin or owner permissions to the repository and branch protection to be enabled.
    */
  def setAdminBranchProtection(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/:owner/:repo/branches/:branch/protection/enforce_admins']['response'] */ js.Any
  ]
  def setAdminBranchProtection(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/:owner/:repo/branches/:branch/protection/enforce_admins']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/:owner/:repo/branches/:branch/protection/enforce_admins']['response'] */ js.Any
  ]
  /**
    * Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    *
    * Adding admin enforcement requires admin or owner permissions to the repository and branch protection to be enabled.
    */
  @JSName("setAdminBranchProtection")
  var setAdminBranchProtection_Original: `460`
  
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
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /repos/:owner/:repo/branches/:branch/protection/restrictions/apps']['response'] */ js.Any
  ]
  def setAppAccessRestrictions(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /repos/:owner/:repo/branches/:branch/protection/restrictions/apps']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /repos/:owner/:repo/branches/:branch/protection/restrictions/apps']['response'] */ js.Any
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
  var setAppAccessRestrictions_Original: `461`
  
  /**
    * Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    */
  def setStatusCheckContexts(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /repos/:owner/:repo/branches/:branch/protection/required_status_checks/contexts']['response'] */ js.Any
  ]
  def setStatusCheckContexts(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /repos/:owner/:repo/branches/:branch/protection/required_status_checks/contexts']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /repos/:owner/:repo/branches/:branch/protection/required_status_checks/contexts']['response'] */ js.Any
  ]
  /**
    * Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    */
  @JSName("setStatusCheckContexts")
  var setStatusCheckContexts_Original: `462`
  
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
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /repos/:owner/:repo/branches/:branch/protection/restrictions/teams']['response'] */ js.Any
  ]
  def setTeamAccessRestrictions(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /repos/:owner/:repo/branches/:branch/protection/restrictions/teams']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /repos/:owner/:repo/branches/:branch/protection/restrictions/teams']['response'] */ js.Any
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
  var setTeamAccessRestrictions_Original: `463`
  
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
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /repos/:owner/:repo/branches/:branch/protection/restrictions/users']['response'] */ js.Any
  ]
  def setUserAccessRestrictions(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /repos/:owner/:repo/branches/:branch/protection/restrictions/users']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /repos/:owner/:repo/branches/:branch/protection/restrictions/users']['response'] */ js.Any
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
  var setUserAccessRestrictions_Original: `464`
  
  /**
    * This will trigger the hook with the latest push to the current repository if the hook is subscribed to `push` events. If the hook is not subscribed to `push` events, the server will respond with 204 but no test POST will be generated.
    *
    * **Note**: Previously `/repos/:owner/:repo/hooks/:hook_id/test`
    */
  def testPushWebhook(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/:owner/:repo/hooks/:hook_id/tests']['response'] */ js.Any
  ]
  def testPushWebhook(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/:owner/:repo/hooks/:hook_id/tests']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/:owner/:repo/hooks/:hook_id/tests']['response'] */ js.Any
  ]
  /**
    * This will trigger the hook with the latest push to the current repository if the hook is subscribed to `push` events. If the hook is not subscribed to `push` events, the server will respond with 204 but no test POST will be generated.
    *
    * **Note**: Previously `/repos/:owner/:repo/hooks/:hook_id/test`
    */
  @JSName("testPushWebhook")
  var testPushWebhook_Original: `465`
  
  /**
    * A transfer request will need to be accepted by the new owner when transferring a personal repository to another user. The response will contain the original `owner`, and the transfer will continue asynchronously. For more details on the requirements to transfer personal and organization-owned repositories, see [about repository transfers](https://docs.github.com/articles/about-repository-transfers/).
    */
  def transfer(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/:owner/:repo/transfer']['response'] */ js.Any
  ]
  def transfer(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/:owner/:repo/transfer']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/:owner/:repo/transfer']['response'] */ js.Any
  ]
  /**
    * A transfer request will need to be accepted by the new owner when transferring a personal repository to another user. The response will contain the original `owner`, and the transfer will continue asynchronously. For more details on the requirements to transfer personal and organization-owned repositories, see [about repository transfers](https://docs.github.com/articles/about-repository-transfers/).
    */
  @JSName("transfer")
  var transfer_Original: `466`
  
  /**
    * **Note**: To edit a repository's topics, use the [Replace all repository topics](https://developer.github.com/v3/repos/#replace-all-repository-topics) endpoint.
    */
  def update(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PATCH /repos/:owner/:repo']['response'] */ js.Any
  ]
  def update(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PATCH /repos/:owner/:repo']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PATCH /repos/:owner/:repo']['response'] */ js.Any
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
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /repos/:owner/:repo/branches/:branch/protection']['response'] */ js.Any
  ]
  def updateBranchProtection(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /repos/:owner/:repo/branches/:branch/protection']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /repos/:owner/:repo/branches/:branch/protection']['response'] */ js.Any
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
  var updateBranchProtection_Original: `468`
  
  def updateCommitComment(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PATCH /repos/:owner/:repo/comments/:comment_id']['response'] */ js.Any
  ]
  def updateCommitComment(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PATCH /repos/:owner/:repo/comments/:comment_id']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PATCH /repos/:owner/:repo/comments/:comment_id']['response'] */ js.Any
  ]
  @JSName("updateCommitComment")
  var updateCommitComment_Original: `469`
  
  /**
    * Updates information for a GitHub Pages site. For more information, see "[About GitHub Pages](/github/working-with-github-pages/about-github-pages).
    */
  def updateInformationAboutPagesSite(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /repos/:owner/:repo/pages']['response'] */ js.Any
  ]
  def updateInformationAboutPagesSite(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /repos/:owner/:repo/pages']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /repos/:owner/:repo/pages']['response'] */ js.Any
  ]
  /**
    * Updates information for a GitHub Pages site. For more information, see "[About GitHub Pages](/github/working-with-github-pages/about-github-pages).
    */
  @JSName("updateInformationAboutPagesSite")
  var updateInformationAboutPagesSite_Original: `470`
  
  def updateInvitation(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PATCH /repos/:owner/:repo/invitations/:invitation_id']['response'] */ js.Any
  ]
  def updateInvitation(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PATCH /repos/:owner/:repo/invitations/:invitation_id']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PATCH /repos/:owner/:repo/invitations/:invitation_id']['response'] */ js.Any
  ]
  @JSName("updateInvitation")
  var updateInvitation_Original: `471`
  
  /**
    * Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    *
    * Updating pull request review enforcement requires admin or owner permissions to the repository and branch protection to be enabled.
    *
    * **Note**: Passing new arrays of `users` and `teams` replaces their previous values.
    */
  def updatePullRequestReviewProtection(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PATCH /repos/:owner/:repo/branches/:branch/protection/required_pull_request_reviews']['response'] */ js.Any
  ]
  def updatePullRequestReviewProtection(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PATCH /repos/:owner/:repo/branches/:branch/protection/required_pull_request_reviews']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PATCH /repos/:owner/:repo/branches/:branch/protection/required_pull_request_reviews']['response'] */ js.Any
  ]
  /**
    * Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    *
    * Updating pull request review enforcement requires admin or owner permissions to the repository and branch protection to be enabled.
    *
    * **Note**: Passing new arrays of `users` and `teams` replaces their previous values.
    */
  @JSName("updatePullRequestReviewProtection")
  var updatePullRequestReviewProtection_Original: `472`
  
  /**
    * Users with push access to the repository can edit a release.
    */
  def updateRelease(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PATCH /repos/:owner/:repo/releases/:release_id']['response'] */ js.Any
  ]
  def updateRelease(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PATCH /repos/:owner/:repo/releases/:release_id']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PATCH /repos/:owner/:repo/releases/:release_id']['response'] */ js.Any
  ]
  
  /**
    * Users with push access to the repository can edit a release asset.
    */
  def updateReleaseAsset(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PATCH /repos/:owner/:repo/releases/assets/:asset_id']['response'] */ js.Any
  ]
  def updateReleaseAsset(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PATCH /repos/:owner/:repo/releases/assets/:asset_id']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PATCH /repos/:owner/:repo/releases/assets/:asset_id']['response'] */ js.Any
  ]
  /**
    * Users with push access to the repository can edit a release asset.
    */
  @JSName("updateReleaseAsset")
  var updateReleaseAsset_Original: `474`
  
  /**
    * Users with push access to the repository can edit a release.
    */
  @JSName("updateRelease")
  var updateRelease_Original: `473`
  
  /**
    * Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    *
    * Updating required status checks requires admin or owner permissions to the repository and branch protection to be enabled.
    */
  def updateStatusCheckPotection(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PATCH /repos/:owner/:repo/branches/:branch/protection/required_status_checks']['response'] */ js.Any
  ]
  def updateStatusCheckPotection(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PATCH /repos/:owner/:repo/branches/:branch/protection/required_status_checks']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PATCH /repos/:owner/:repo/branches/:branch/protection/required_status_checks']['response'] */ js.Any
  ]
  /**
    * Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    *
    * Updating required status checks requires admin or owner permissions to the repository and branch protection to be enabled.
    */
  @JSName("updateStatusCheckPotection")
  var updateStatusCheckPotection_Original: `475`
  
  def updateWebhook(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PATCH /repos/:owner/:repo/hooks/:hook_id']['response'] */ js.Any
  ]
  def updateWebhook(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PATCH /repos/:owner/:repo/hooks/:hook_id']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PATCH /repos/:owner/:repo/hooks/:hook_id']['response'] */ js.Any
  ]
  @JSName("updateWebhook")
  var updateWebhook_Original: `476`
  
  /**
    * **Note**: To edit a repository's topics, use the [Replace all repository topics](https://developer.github.com/v3/repos/#replace-all-repository-topics) endpoint.
    */
  @JSName("update")
  var update_Original: `467`
  
  /**
    * This endpoint makes use of [a Hypermedia relation](https://developer.github.com/v3/#hypermedia) to determine which URL to access. The endpoint you call to upload release assets is specific to your release. Use the `upload_url` returned in
    * the response of the [Create a release endpoint](https://developer.github.com/v3/repos/releases/#create-a-release) to upload a release asset.
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
    * *   GitHub renames asset filenames that have special characters, non-alphanumeric characters, and leading or trailing periods. The "[List assets for a release](https://developer.github.com/v3/repos/releases/#list-assets-for-a-release)"
    * endpoint lists the renamed filenames. For more information and help, contact [GitHub Support](https://github.com/contact).
    * *   If you upload an asset with the same filename as another uploaded asset, you'll receive an error and must delete the old file before you can re-upload the new asset.
    */
  def uploadReleaseAsset(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/:owner/:repo/releases/:release_id/assets{?name,label}']['response'] */ js.Any
  ]
  def uploadReleaseAsset(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/:owner/:repo/releases/:release_id/assets{?name,label}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/:owner/:repo/releases/:release_id/assets{?name,label}']['response'] */ js.Any
  ]
  /**
    * This endpoint makes use of [a Hypermedia relation](https://developer.github.com/v3/#hypermedia) to determine which URL to access. The endpoint you call to upload release assets is specific to your release. Use the `upload_url` returned in
    * the response of the [Create a release endpoint](https://developer.github.com/v3/repos/releases/#create-a-release) to upload a release asset.
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
    * *   GitHub renames asset filenames that have special characters, non-alphanumeric characters, and leading or trailing periods. The "[List assets for a release](https://developer.github.com/v3/repos/releases/#list-assets-for-a-release)"
    * endpoint lists the renamed filenames. For more information and help, contact [GitHub Support](https://github.com/contact).
    * *   If you upload an asset with the same filename as another uploaded asset, you'll receive an error and must delete the old file before you can re-upload the new asset.
    */
  @JSName("uploadReleaseAsset")
  var uploadReleaseAsset_Original: `477`
}
object AcceptInvitation {
  
  @scala.inline
  def apply(
    acceptInvitation: `339`,
    addAppAccessRestrictions: `340`,
    addCollaborator: `341`,
    addStatusCheckContexts: `342`,
    addTeamAccessRestrictions: `343`,
    addUserAccessRestrictions: `344`,
    checkCollaborator: `345`,
    checkVulnerabilityAlerts: `346`,
    compareCommits: `347`,
    createCommitComment: `348`,
    createCommitSignatureProtection: `349`,
    createCommitStatus: `350`,
    createDeployKey: `351`,
    createDeployment: `352`,
    createDeploymentStatus: `353`,
    createDispatchEvent: `354`,
    createForAuthenticatedUser: `355`,
    createFork: `356`,
    createInOrg: `357`,
    createOrUpdateFileContents: `358`,
    createPagesSite: `359`,
    createRelease: `360`,
    createUsingTemplate: `361`,
    createWebhook: `362`,
    declineInvitation: `363`,
    delete: `364`,
    deleteAccessRestrictions: `365`,
    deleteAdminBranchProtection: `366`,
    deleteBranchProtection: `367`,
    deleteCommitComment: `368`,
    deleteCommitSignatureProtection: `369`,
    deleteDeployKey: `370`,
    deleteDeployment: `371`,
    deleteFile: `372`,
    deleteInvitation: `373`,
    deletePagesSite: `374`,
    deletePullRequestReviewProtection: `375`,
    deleteRelease: `376`,
    deleteReleaseAsset: `377`,
    deleteWebhook: `378`,
    disableAutomatedSecurityFixes: `379`,
    disableVulnerabilityAlerts: `380`,
    downloadArchive: `381`,
    enableAutomatedSecurityFixes: `382`,
    enableVulnerabilityAlerts: `383`,
    get: `384`,
    getAccessRestrictions: `385`,
    getAdminBranchProtection: `386`,
    getAllStatusCheckContexts: `387`,
    getAllTopics: `388`,
    getAppsWithAccessToProtectedBranch: `389`,
    getBranch: `390`,
    getBranchProtection: `391`,
    getClones: `392`,
    getCodeFrequencyStats: `393`,
    getCollaboratorPermissionLevel: `394`,
    getCombinedStatusForRef: `395`,
    getCommit: `396`,
    getCommitActivityStats: `397`,
    getCommitComment: `398`,
    getCommitSignatureProtection: `399`,
    getCommunityProfileMetrics: `400`,
    getContent: `401`,
    getContributorsStats: `402`,
    getDeployKey: `403`,
    getDeployment: `404`,
    getDeploymentStatus: `405`,
    getLatestPagesBuild: `406`,
    getLatestRelease: `407`,
    getPages: `408`,
    getPagesBuild: `409`,
    getParticipationStats: `410`,
    getPullRequestReviewProtection: `411`,
    getPunchCardStats: `412`,
    getReadme: `413`,
    getRelease: `414`,
    getReleaseAsset: `415`,
    getReleaseByTag: `416`,
    getStatusChecksProtection: `417`,
    getTeamsWithAccessToProtectedBranch: `418`,
    getTopPaths: `419`,
    getTopReferrers: `420`,
    getUsersWithAccessToProtectedBranch: `421`,
    getViews: `422`,
    getWebhook: `423`,
    listBranches: `424`,
    listBranchesForHeadCommit: `425`,
    listCollaborators: `426`,
    listCommentsForCommit: `427`,
    listCommitCommentsForRepo: `428`,
    listCommitStatusesForRef: `429`,
    listCommits: `430`,
    listContributors: `431`,
    listDeployKeys: `432`,
    listDeploymentStatuses: `433`,
    listDeployments: `434`,
    listForAuthenticatedUser: `435`,
    listForOrg: `436`,
    listForUser: `437`,
    listForks: `438`,
    listInvitations: `439`,
    listInvitationsForAuthenticatedUser: `440`,
    listLanguages: `441`,
    listPagesBuilds: `442`,
    listPublic: `443`,
    listPullRequestsAssociatedWithCommit: `444`,
    listReleaseAssets: `445`,
    listReleases: `446`,
    listTags: `447`,
    listTeams: `448`,
    listWebhooks: `449`,
    merge: `450`,
    pingWebhook: `451`,
    removeAppAccessRestrictions: `452`,
    removeCollaborator: `453`,
    removeStatusCheckContexts: `454`,
    removeStatusCheckProtection: `455`,
    removeTeamAccessRestrictions: `456`,
    removeUserAccessRestrictions: `457`,
    replaceAllTopics: `458`,
    requestPagesBuild: `459`,
    setAdminBranchProtection: `460`,
    setAppAccessRestrictions: `461`,
    setStatusCheckContexts: `462`,
    setTeamAccessRestrictions: `463`,
    setUserAccessRestrictions: `464`,
    testPushWebhook: `465`,
    transfer: `466`,
    update: `467`,
    updateBranchProtection: `468`,
    updateCommitComment: `469`,
    updateInformationAboutPagesSite: `470`,
    updateInvitation: `471`,
    updatePullRequestReviewProtection: `472`,
    updateRelease: `473`,
    updateReleaseAsset: `474`,
    updateStatusCheckPotection: `475`,
    updateWebhook: `476`,
    uploadReleaseAsset: `477`
  ): AcceptInvitation = {
    val __obj = js.Dynamic.literal(acceptInvitation = acceptInvitation.asInstanceOf[js.Any], addAppAccessRestrictions = addAppAccessRestrictions.asInstanceOf[js.Any], addCollaborator = addCollaborator.asInstanceOf[js.Any], addStatusCheckContexts = addStatusCheckContexts.asInstanceOf[js.Any], addTeamAccessRestrictions = addTeamAccessRestrictions.asInstanceOf[js.Any], addUserAccessRestrictions = addUserAccessRestrictions.asInstanceOf[js.Any], checkCollaborator = checkCollaborator.asInstanceOf[js.Any], checkVulnerabilityAlerts = checkVulnerabilityAlerts.asInstanceOf[js.Any], compareCommits = compareCommits.asInstanceOf[js.Any], createCommitComment = createCommitComment.asInstanceOf[js.Any], createCommitSignatureProtection = createCommitSignatureProtection.asInstanceOf[js.Any], createCommitStatus = createCommitStatus.asInstanceOf[js.Any], createDeployKey = createDeployKey.asInstanceOf[js.Any], createDeployment = createDeployment.asInstanceOf[js.Any], createDeploymentStatus = createDeploymentStatus.asInstanceOf[js.Any], createDispatchEvent = createDispatchEvent.asInstanceOf[js.Any], createForAuthenticatedUser = createForAuthenticatedUser.asInstanceOf[js.Any], createFork = createFork.asInstanceOf[js.Any], createInOrg = createInOrg.asInstanceOf[js.Any], createOrUpdateFileContents = createOrUpdateFileContents.asInstanceOf[js.Any], createPagesSite = createPagesSite.asInstanceOf[js.Any], createRelease = createRelease.asInstanceOf[js.Any], createUsingTemplate = createUsingTemplate.asInstanceOf[js.Any], createWebhook = createWebhook.asInstanceOf[js.Any], declineInvitation = declineInvitation.asInstanceOf[js.Any], delete = delete.asInstanceOf[js.Any], deleteAccessRestrictions = deleteAccessRestrictions.asInstanceOf[js.Any], deleteAdminBranchProtection = deleteAdminBranchProtection.asInstanceOf[js.Any], deleteBranchProtection = deleteBranchProtection.asInstanceOf[js.Any], deleteCommitComment = deleteCommitComment.asInstanceOf[js.Any], deleteCommitSignatureProtection = deleteCommitSignatureProtection.asInstanceOf[js.Any], deleteDeployKey = deleteDeployKey.asInstanceOf[js.Any], deleteDeployment = deleteDeployment.asInstanceOf[js.Any], deleteFile = deleteFile.asInstanceOf[js.Any], deleteInvitation = deleteInvitation.asInstanceOf[js.Any], deletePagesSite = deletePagesSite.asInstanceOf[js.Any], deletePullRequestReviewProtection = deletePullRequestReviewProtection.asInstanceOf[js.Any], deleteRelease = deleteRelease.asInstanceOf[js.Any], deleteReleaseAsset = deleteReleaseAsset.asInstanceOf[js.Any], deleteWebhook = deleteWebhook.asInstanceOf[js.Any], disableAutomatedSecurityFixes = disableAutomatedSecurityFixes.asInstanceOf[js.Any], disableVulnerabilityAlerts = disableVulnerabilityAlerts.asInstanceOf[js.Any], downloadArchive = downloadArchive.asInstanceOf[js.Any], enableAutomatedSecurityFixes = enableAutomatedSecurityFixes.asInstanceOf[js.Any], enableVulnerabilityAlerts = enableVulnerabilityAlerts.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], getAccessRestrictions = getAccessRestrictions.asInstanceOf[js.Any], getAdminBranchProtection = getAdminBranchProtection.asInstanceOf[js.Any], getAllStatusCheckContexts = getAllStatusCheckContexts.asInstanceOf[js.Any], getAllTopics = getAllTopics.asInstanceOf[js.Any], getAppsWithAccessToProtectedBranch = getAppsWithAccessToProtectedBranch.asInstanceOf[js.Any], getBranch = getBranch.asInstanceOf[js.Any], getBranchProtection = getBranchProtection.asInstanceOf[js.Any], getClones = getClones.asInstanceOf[js.Any], getCodeFrequencyStats = getCodeFrequencyStats.asInstanceOf[js.Any], getCollaboratorPermissionLevel = getCollaboratorPermissionLevel.asInstanceOf[js.Any], getCombinedStatusForRef = getCombinedStatusForRef.asInstanceOf[js.Any], getCommit = getCommit.asInstanceOf[js.Any], getCommitActivityStats = getCommitActivityStats.asInstanceOf[js.Any], getCommitComment = getCommitComment.asInstanceOf[js.Any], getCommitSignatureProtection = getCommitSignatureProtection.asInstanceOf[js.Any], getCommunityProfileMetrics = getCommunityProfileMetrics.asInstanceOf[js.Any], getContent = getContent.asInstanceOf[js.Any], getContributorsStats = getContributorsStats.asInstanceOf[js.Any], getDeployKey = getDeployKey.asInstanceOf[js.Any], getDeployment = getDeployment.asInstanceOf[js.Any], getDeploymentStatus = getDeploymentStatus.asInstanceOf[js.Any], getLatestPagesBuild = getLatestPagesBuild.asInstanceOf[js.Any], getLatestRelease = getLatestRelease.asInstanceOf[js.Any], getPages = getPages.asInstanceOf[js.Any], getPagesBuild = getPagesBuild.asInstanceOf[js.Any], getParticipationStats = getParticipationStats.asInstanceOf[js.Any], getPullRequestReviewProtection = getPullRequestReviewProtection.asInstanceOf[js.Any], getPunchCardStats = getPunchCardStats.asInstanceOf[js.Any], getReadme = getReadme.asInstanceOf[js.Any], getRelease = getRelease.asInstanceOf[js.Any], getReleaseAsset = getReleaseAsset.asInstanceOf[js.Any], getReleaseByTag = getReleaseByTag.asInstanceOf[js.Any], getStatusChecksProtection = getStatusChecksProtection.asInstanceOf[js.Any], getTeamsWithAccessToProtectedBranch = getTeamsWithAccessToProtectedBranch.asInstanceOf[js.Any], getTopPaths = getTopPaths.asInstanceOf[js.Any], getTopReferrers = getTopReferrers.asInstanceOf[js.Any], getUsersWithAccessToProtectedBranch = getUsersWithAccessToProtectedBranch.asInstanceOf[js.Any], getViews = getViews.asInstanceOf[js.Any], getWebhook = getWebhook.asInstanceOf[js.Any], listBranches = listBranches.asInstanceOf[js.Any], listBranchesForHeadCommit = listBranchesForHeadCommit.asInstanceOf[js.Any], listCollaborators = listCollaborators.asInstanceOf[js.Any], listCommentsForCommit = listCommentsForCommit.asInstanceOf[js.Any], listCommitCommentsForRepo = listCommitCommentsForRepo.asInstanceOf[js.Any], listCommitStatusesForRef = listCommitStatusesForRef.asInstanceOf[js.Any], listCommits = listCommits.asInstanceOf[js.Any], listContributors = listContributors.asInstanceOf[js.Any], listDeployKeys = listDeployKeys.asInstanceOf[js.Any], listDeploymentStatuses = listDeploymentStatuses.asInstanceOf[js.Any], listDeployments = listDeployments.asInstanceOf[js.Any], listForAuthenticatedUser = listForAuthenticatedUser.asInstanceOf[js.Any], listForOrg = listForOrg.asInstanceOf[js.Any], listForUser = listForUser.asInstanceOf[js.Any], listForks = listForks.asInstanceOf[js.Any], listInvitations = listInvitations.asInstanceOf[js.Any], listInvitationsForAuthenticatedUser = listInvitationsForAuthenticatedUser.asInstanceOf[js.Any], listLanguages = listLanguages.asInstanceOf[js.Any], listPagesBuilds = listPagesBuilds.asInstanceOf[js.Any], listPublic = listPublic.asInstanceOf[js.Any], listPullRequestsAssociatedWithCommit = listPullRequestsAssociatedWithCommit.asInstanceOf[js.Any], listReleaseAssets = listReleaseAssets.asInstanceOf[js.Any], listReleases = listReleases.asInstanceOf[js.Any], listTags = listTags.asInstanceOf[js.Any], listTeams = listTeams.asInstanceOf[js.Any], listWebhooks = listWebhooks.asInstanceOf[js.Any], merge = merge.asInstanceOf[js.Any], pingWebhook = pingWebhook.asInstanceOf[js.Any], removeAppAccessRestrictions = removeAppAccessRestrictions.asInstanceOf[js.Any], removeCollaborator = removeCollaborator.asInstanceOf[js.Any], removeStatusCheckContexts = removeStatusCheckContexts.asInstanceOf[js.Any], removeStatusCheckProtection = removeStatusCheckProtection.asInstanceOf[js.Any], removeTeamAccessRestrictions = removeTeamAccessRestrictions.asInstanceOf[js.Any], removeUserAccessRestrictions = removeUserAccessRestrictions.asInstanceOf[js.Any], replaceAllTopics = replaceAllTopics.asInstanceOf[js.Any], requestPagesBuild = requestPagesBuild.asInstanceOf[js.Any], setAdminBranchProtection = setAdminBranchProtection.asInstanceOf[js.Any], setAppAccessRestrictions = setAppAccessRestrictions.asInstanceOf[js.Any], setStatusCheckContexts = setStatusCheckContexts.asInstanceOf[js.Any], setTeamAccessRestrictions = setTeamAccessRestrictions.asInstanceOf[js.Any], setUserAccessRestrictions = setUserAccessRestrictions.asInstanceOf[js.Any], testPushWebhook = testPushWebhook.asInstanceOf[js.Any], transfer = transfer.asInstanceOf[js.Any], update = update.asInstanceOf[js.Any], updateBranchProtection = updateBranchProtection.asInstanceOf[js.Any], updateCommitComment = updateCommitComment.asInstanceOf[js.Any], updateInformationAboutPagesSite = updateInformationAboutPagesSite.asInstanceOf[js.Any], updateInvitation = updateInvitation.asInstanceOf[js.Any], updatePullRequestReviewProtection = updatePullRequestReviewProtection.asInstanceOf[js.Any], updateRelease = updateRelease.asInstanceOf[js.Any], updateReleaseAsset = updateReleaseAsset.asInstanceOf[js.Any], updateStatusCheckPotection = updateStatusCheckPotection.asInstanceOf[js.Any], updateWebhook = updateWebhook.asInstanceOf[js.Any], uploadReleaseAsset = uploadReleaseAsset.asInstanceOf[js.Any])
    __obj.asInstanceOf[AcceptInvitation]
  }
  
  @scala.inline
  implicit class AcceptInvitationMutableBuilder[Self <: AcceptInvitation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAcceptInvitation(value: `339`): Self = StObject.set(x, "acceptInvitation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddAppAccessRestrictions(value: `340`): Self = StObject.set(x, "addAppAccessRestrictions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddCollaborator(value: `341`): Self = StObject.set(x, "addCollaborator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddStatusCheckContexts(value: `342`): Self = StObject.set(x, "addStatusCheckContexts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddTeamAccessRestrictions(value: `343`): Self = StObject.set(x, "addTeamAccessRestrictions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddUserAccessRestrictions(value: `344`): Self = StObject.set(x, "addUserAccessRestrictions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckCollaborator(value: `345`): Self = StObject.set(x, "checkCollaborator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckVulnerabilityAlerts(value: `346`): Self = StObject.set(x, "checkVulnerabilityAlerts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompareCommits(value: `347`): Self = StObject.set(x, "compareCommits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateCommitComment(value: `348`): Self = StObject.set(x, "createCommitComment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateCommitSignatureProtection(value: `349`): Self = StObject.set(x, "createCommitSignatureProtection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateCommitStatus(value: `350`): Self = StObject.set(x, "createCommitStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateDeployKey(value: `351`): Self = StObject.set(x, "createDeployKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateDeployment(value: `352`): Self = StObject.set(x, "createDeployment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateDeploymentStatus(value: `353`): Self = StObject.set(x, "createDeploymentStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateDispatchEvent(value: `354`): Self = StObject.set(x, "createDispatchEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateForAuthenticatedUser(value: `355`): Self = StObject.set(x, "createForAuthenticatedUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateFork(value: `356`): Self = StObject.set(x, "createFork", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateInOrg(value: `357`): Self = StObject.set(x, "createInOrg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateOrUpdateFileContents(value: `358`): Self = StObject.set(x, "createOrUpdateFileContents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatePagesSite(value: `359`): Self = StObject.set(x, "createPagesSite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateRelease(value: `360`): Self = StObject.set(x, "createRelease", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateUsingTemplate(value: `361`): Self = StObject.set(x, "createUsingTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateWebhook(value: `362`): Self = StObject.set(x, "createWebhook", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeclineInvitation(value: `363`): Self = StObject.set(x, "declineInvitation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelete(value: `364`): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteAccessRestrictions(value: `365`): Self = StObject.set(x, "deleteAccessRestrictions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteAdminBranchProtection(value: `366`): Self = StObject.set(x, "deleteAdminBranchProtection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteBranchProtection(value: `367`): Self = StObject.set(x, "deleteBranchProtection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteCommitComment(value: `368`): Self = StObject.set(x, "deleteCommitComment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteCommitSignatureProtection(value: `369`): Self = StObject.set(x, "deleteCommitSignatureProtection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteDeployKey(value: `370`): Self = StObject.set(x, "deleteDeployKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteDeployment(value: `371`): Self = StObject.set(x, "deleteDeployment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteFile(value: `372`): Self = StObject.set(x, "deleteFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteInvitation(value: `373`): Self = StObject.set(x, "deleteInvitation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeletePagesSite(value: `374`): Self = StObject.set(x, "deletePagesSite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeletePullRequestReviewProtection(value: `375`): Self = StObject.set(x, "deletePullRequestReviewProtection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteRelease(value: `376`): Self = StObject.set(x, "deleteRelease", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteReleaseAsset(value: `377`): Self = StObject.set(x, "deleteReleaseAsset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteWebhook(value: `378`): Self = StObject.set(x, "deleteWebhook", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableAutomatedSecurityFixes(value: `379`): Self = StObject.set(x, "disableAutomatedSecurityFixes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableVulnerabilityAlerts(value: `380`): Self = StObject.set(x, "disableVulnerabilityAlerts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDownloadArchive(value: `381`): Self = StObject.set(x, "downloadArchive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableAutomatedSecurityFixes(value: `382`): Self = StObject.set(x, "enableAutomatedSecurityFixes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableVulnerabilityAlerts(value: `383`): Self = StObject.set(x, "enableVulnerabilityAlerts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGet(value: `384`): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetAccessRestrictions(value: `385`): Self = StObject.set(x, "getAccessRestrictions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetAdminBranchProtection(value: `386`): Self = StObject.set(x, "getAdminBranchProtection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetAllStatusCheckContexts(value: `387`): Self = StObject.set(x, "getAllStatusCheckContexts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetAllTopics(value: `388`): Self = StObject.set(x, "getAllTopics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetAppsWithAccessToProtectedBranch(value: `389`): Self = StObject.set(x, "getAppsWithAccessToProtectedBranch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetBranch(value: `390`): Self = StObject.set(x, "getBranch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetBranchProtection(value: `391`): Self = StObject.set(x, "getBranchProtection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetClones(value: `392`): Self = StObject.set(x, "getClones", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetCodeFrequencyStats(value: `393`): Self = StObject.set(x, "getCodeFrequencyStats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetCollaboratorPermissionLevel(value: `394`): Self = StObject.set(x, "getCollaboratorPermissionLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetCombinedStatusForRef(value: `395`): Self = StObject.set(x, "getCombinedStatusForRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetCommit(value: `396`): Self = StObject.set(x, "getCommit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetCommitActivityStats(value: `397`): Self = StObject.set(x, "getCommitActivityStats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetCommitComment(value: `398`): Self = StObject.set(x, "getCommitComment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetCommitSignatureProtection(value: `399`): Self = StObject.set(x, "getCommitSignatureProtection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetCommunityProfileMetrics(value: `400`): Self = StObject.set(x, "getCommunityProfileMetrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetContent(value: `401`): Self = StObject.set(x, "getContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetContributorsStats(value: `402`): Self = StObject.set(x, "getContributorsStats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetDeployKey(value: `403`): Self = StObject.set(x, "getDeployKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetDeployment(value: `404`): Self = StObject.set(x, "getDeployment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetDeploymentStatus(value: `405`): Self = StObject.set(x, "getDeploymentStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetLatestPagesBuild(value: `406`): Self = StObject.set(x, "getLatestPagesBuild", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetLatestRelease(value: `407`): Self = StObject.set(x, "getLatestRelease", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetPages(value: `408`): Self = StObject.set(x, "getPages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetPagesBuild(value: `409`): Self = StObject.set(x, "getPagesBuild", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetParticipationStats(value: `410`): Self = StObject.set(x, "getParticipationStats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetPullRequestReviewProtection(value: `411`): Self = StObject.set(x, "getPullRequestReviewProtection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetPunchCardStats(value: `412`): Self = StObject.set(x, "getPunchCardStats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetReadme(value: `413`): Self = StObject.set(x, "getReadme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetRelease(value: `414`): Self = StObject.set(x, "getRelease", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetReleaseAsset(value: `415`): Self = StObject.set(x, "getReleaseAsset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetReleaseByTag(value: `416`): Self = StObject.set(x, "getReleaseByTag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetStatusChecksProtection(value: `417`): Self = StObject.set(x, "getStatusChecksProtection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetTeamsWithAccessToProtectedBranch(value: `418`): Self = StObject.set(x, "getTeamsWithAccessToProtectedBranch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetTopPaths(value: `419`): Self = StObject.set(x, "getTopPaths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetTopReferrers(value: `420`): Self = StObject.set(x, "getTopReferrers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetUsersWithAccessToProtectedBranch(value: `421`): Self = StObject.set(x, "getUsersWithAccessToProtectedBranch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetViews(value: `422`): Self = StObject.set(x, "getViews", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetWebhook(value: `423`): Self = StObject.set(x, "getWebhook", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListBranches(value: `424`): Self = StObject.set(x, "listBranches", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListBranchesForHeadCommit(value: `425`): Self = StObject.set(x, "listBranchesForHeadCommit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListCollaborators(value: `426`): Self = StObject.set(x, "listCollaborators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListCommentsForCommit(value: `427`): Self = StObject.set(x, "listCommentsForCommit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListCommitCommentsForRepo(value: `428`): Self = StObject.set(x, "listCommitCommentsForRepo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListCommitStatusesForRef(value: `429`): Self = StObject.set(x, "listCommitStatusesForRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListCommits(value: `430`): Self = StObject.set(x, "listCommits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListContributors(value: `431`): Self = StObject.set(x, "listContributors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListDeployKeys(value: `432`): Self = StObject.set(x, "listDeployKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListDeploymentStatuses(value: `433`): Self = StObject.set(x, "listDeploymentStatuses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListDeployments(value: `434`): Self = StObject.set(x, "listDeployments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListForAuthenticatedUser(value: `435`): Self = StObject.set(x, "listForAuthenticatedUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListForOrg(value: `436`): Self = StObject.set(x, "listForOrg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListForUser(value: `437`): Self = StObject.set(x, "listForUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListForks(value: `438`): Self = StObject.set(x, "listForks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListInvitations(value: `439`): Self = StObject.set(x, "listInvitations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListInvitationsForAuthenticatedUser(value: `440`): Self = StObject.set(x, "listInvitationsForAuthenticatedUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListLanguages(value: `441`): Self = StObject.set(x, "listLanguages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListPagesBuilds(value: `442`): Self = StObject.set(x, "listPagesBuilds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListPublic(value: `443`): Self = StObject.set(x, "listPublic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListPullRequestsAssociatedWithCommit(value: `444`): Self = StObject.set(x, "listPullRequestsAssociatedWithCommit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListReleaseAssets(value: `445`): Self = StObject.set(x, "listReleaseAssets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListReleases(value: `446`): Self = StObject.set(x, "listReleases", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListTags(value: `447`): Self = StObject.set(x, "listTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListTeams(value: `448`): Self = StObject.set(x, "listTeams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListWebhooks(value: `449`): Self = StObject.set(x, "listWebhooks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMerge(value: `450`): Self = StObject.set(x, "merge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPingWebhook(value: `451`): Self = StObject.set(x, "pingWebhook", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveAppAccessRestrictions(value: `452`): Self = StObject.set(x, "removeAppAccessRestrictions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveCollaborator(value: `453`): Self = StObject.set(x, "removeCollaborator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveStatusCheckContexts(value: `454`): Self = StObject.set(x, "removeStatusCheckContexts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveStatusCheckProtection(value: `455`): Self = StObject.set(x, "removeStatusCheckProtection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveTeamAccessRestrictions(value: `456`): Self = StObject.set(x, "removeTeamAccessRestrictions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveUserAccessRestrictions(value: `457`): Self = StObject.set(x, "removeUserAccessRestrictions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplaceAllTopics(value: `458`): Self = StObject.set(x, "replaceAllTopics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestPagesBuild(value: `459`): Self = StObject.set(x, "requestPagesBuild", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetAdminBranchProtection(value: `460`): Self = StObject.set(x, "setAdminBranchProtection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetAppAccessRestrictions(value: `461`): Self = StObject.set(x, "setAppAccessRestrictions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetStatusCheckContexts(value: `462`): Self = StObject.set(x, "setStatusCheckContexts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetTeamAccessRestrictions(value: `463`): Self = StObject.set(x, "setTeamAccessRestrictions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetUserAccessRestrictions(value: `464`): Self = StObject.set(x, "setUserAccessRestrictions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestPushWebhook(value: `465`): Self = StObject.set(x, "testPushWebhook", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransfer(value: `466`): Self = StObject.set(x, "transfer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdate(value: `467`): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateBranchProtection(value: `468`): Self = StObject.set(x, "updateBranchProtection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateCommitComment(value: `469`): Self = StObject.set(x, "updateCommitComment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateInformationAboutPagesSite(value: `470`): Self = StObject.set(x, "updateInformationAboutPagesSite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateInvitation(value: `471`): Self = StObject.set(x, "updateInvitation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatePullRequestReviewProtection(value: `472`): Self = StObject.set(x, "updatePullRequestReviewProtection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateRelease(value: `473`): Self = StObject.set(x, "updateRelease", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateReleaseAsset(value: `474`): Self = StObject.set(x, "updateReleaseAsset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateStatusCheckPotection(value: `475`): Self = StObject.set(x, "updateStatusCheckPotection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateWebhook(value: `476`): Self = StObject.set(x, "updateWebhook", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUploadReleaseAsset(value: `477`): Self = StObject.set(x, "uploadReleaseAsset", value.asInstanceOf[js.Any])
  }
}
