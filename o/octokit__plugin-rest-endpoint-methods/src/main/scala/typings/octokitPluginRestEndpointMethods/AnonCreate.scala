package typings.octokitPluginRestEndpointMethods

import typings.octokitPluginRestEndpointMethods.typesMod.AnyResponse
import typings.octokitPluginRestEndpointMethods.typesMod.ChecksCreateParams
import typings.octokitPluginRestEndpointMethods.typesMod.ChecksCreateSuiteParams
import typings.octokitPluginRestEndpointMethods.typesMod.ChecksGetParams
import typings.octokitPluginRestEndpointMethods.typesMod.ChecksGetSuiteParams
import typings.octokitPluginRestEndpointMethods.typesMod.ChecksListAnnotationsParams
import typings.octokitPluginRestEndpointMethods.typesMod.ChecksListForRefParams
import typings.octokitPluginRestEndpointMethods.typesMod.ChecksListForSuiteParams
import typings.octokitPluginRestEndpointMethods.typesMod.ChecksListSuitesForRefParams
import typings.octokitPluginRestEndpointMethods.typesMod.ChecksRerequestSuiteParams
import typings.octokitPluginRestEndpointMethods.typesMod.ChecksSetSuitesPreferencesParams
import typings.octokitPluginRestEndpointMethods.typesMod.ChecksUpdateParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCreate extends js.Object {
  /**
    * **Note:** The Checks API only looks for pushes in the repository where the check suite or check run were created. Pushes to a branch in a forked repository are not detected and return an empty `pull_requests` array and a `null` value for `head_branch`.
    *
    * By default, check suites are automatically created when you create a [check run](https://developer.github.com/v3/checks/runs/). You only need to use this endpoint for manually creating check suites when you've disabled automatic creation using "[Update repository preferences for check suites](https://developer.github.com/v3/checks/suites/#update-repository-preferences-for-check-suites)". Your GitHub App must have the `checks:write` permission to create check suites.
    */
  @JSName("createSuite")
  var createSuite_Original: Anon98 = js.native
  /**
    * **Note:** The Checks API only looks for pushes in the repository where the check suite or check run were created. Pushes to a branch in a forked repository are not detected and return an empty `pull_requests` array.
    *
    * Creates a new check run for a specific commit in a repository. Your GitHub App must have the `checks:write` permission to create check runs.
    */
  @JSName("create")
  var create_Original: Anon97 = js.native
  /**
    * **Note:** The Checks API only looks for pushes in the repository where the check suite or check run were created. Pushes to a branch in a forked repository are not detected and return an empty `pull_requests` array and a `null` value for `head_branch`.
    *
    * Gets a single check suite using its `id`. GitHub Apps must have the `checks:read` permission on a private repository or pull access to a public repository to get check suites. OAuth Apps and authenticated users must have the `repo` scope to get check suites in a private repository.
    */
  @JSName("getSuite")
  var getSuite_Original: Anon100 = js.native
  /**
    * **Note:** The Checks API only looks for pushes in the repository where the check suite or check run were created. Pushes to a branch in a forked repository are not detected and return an empty `pull_requests` array.
    *
    * Gets a single check run using its `id`. GitHub Apps must have the `checks:read` permission on a private repository or pull access to a public repository to get check runs. OAuth Apps and authenticated users must have the `repo` scope to get check runs in a private repository.
    */
  @JSName("get")
  var get_Original: Anon99 = js.native
  /**
    * Lists annotations for a check run using the annotation `id`. GitHub Apps must have the `checks:read` permission on a private repository or pull access to a public repository to get annotations for a check run. OAuth Apps and authenticated users must have the `repo` scope to get annotations for a check run in a private repository.
    */
  @JSName("listAnnotations")
  var listAnnotations_Original: Anon101 = js.native
  /**
    * **Note:** The Checks API only looks for pushes in the repository where the check suite or check run were created. Pushes to a branch in a forked repository are not detected and return an empty `pull_requests` array.
    *
    * Lists check runs for a commit ref. The `ref` can be a SHA, branch name, or a tag name. GitHub Apps must have the `checks:read` permission on a private repository or pull access to a public repository to get check runs. OAuth Apps and authenticated users must have the `repo` scope to get check runs in a private repository.
    */
  @JSName("listForRef")
  var listForRef_Original: Anon102 = js.native
  /**
    * **Note:** The Checks API only looks for pushes in the repository where the check suite or check run were created. Pushes to a branch in a forked repository are not detected and return an empty `pull_requests` array.
    *
    * Lists check runs for a check suite using its `id`. GitHub Apps must have the `checks:read` permission on a private repository or pull access to a public repository to get check runs. OAuth Apps and authenticated users must have the `repo` scope to get check runs in a private repository.
    */
  @JSName("listForSuite")
  var listForSuite_Original: Anon103 = js.native
  /**
    * **Note:** The Checks API only looks for pushes in the repository where the check suite or check run were created. Pushes to a branch in a forked repository are not detected and return an empty `pull_requests` array and a `null` value for `head_branch`.
    *
    * Lists check suites for a commit `ref`. The `ref` can be a SHA, branch name, or a tag name. GitHub Apps must have the `checks:read` permission on a private repository or pull access to a public repository to list check suites. OAuth Apps and authenticated users must have the `repo` scope to get check suites in a private repository.
    */
  @JSName("listSuitesForRef")
  var listSuitesForRef_Original: Anon104 = js.native
  /**
    * Triggers GitHub to rerequest an existing check suite, without pushing new code to a repository. This endpoint will trigger the [`check_suite` webhook](https://developer.github.com/v3/activity/events/types/#checksuiteevent) event with the action `rerequested`. When a check suite is `rerequested`, its `status` is reset to `queued` and the `conclusion` is cleared.
    *
    * To rerequest a check suite, your GitHub App must have the `checks:read` permission on a private repository or pull access to a public repository.
    */
  @JSName("rerequestSuite")
  var rerequestSuite_Original: Anon105 = js.native
  /**
    * Changes the default automatic flow when creating check suites. By default, the CheckSuiteEvent is automatically created each time code is pushed to a repository. When you disable the automatic creation of check suites, you can manually [Create a check suite](https://developer.github.com/v3/checks/suites/#create-a-check-suite). You must have admin permissions in the repository to set preferences for check suites.
    */
  @JSName("setSuitesPreferences")
  var setSuitesPreferences_Original: Anon106 = js.native
  /**
    * **Note:** The Checks API only looks for pushes in the repository where the check suite or check run were created. Pushes to a branch in a forked repository are not detected and return an empty `pull_requests` array.
    *
    * Updates a check run for a specific commit in a repository. Your GitHub App must have the `checks:write` permission to edit check runs.
    */
  @JSName("update")
  var update_Original: Anon107 = js.native
  /**
    * **Note:** The Checks API only looks for pushes in the repository where the check suite or check run were created. Pushes to a branch in a forked repository are not detected and return an empty `pull_requests` array.
    *
    * Creates a new check run for a specific commit in a repository. Your GitHub App must have the `checks:write` permission to create check runs.
    */
  def create(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<ChecksCreateResponse> */ _
  ] = js.native
  def create(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with ChecksCreateParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<ChecksCreateResponse> */ _
  ] = js.native
  /**
    * **Note:** The Checks API only looks for pushes in the repository where the check suite or check run were created. Pushes to a branch in a forked repository are not detected and return an empty `pull_requests` array and a `null` value for `head_branch`.
    *
    * By default, check suites are automatically created when you create a [check run](https://developer.github.com/v3/checks/runs/). You only need to use this endpoint for manually creating check suites when you've disabled automatic creation using "[Update repository preferences for check suites](https://developer.github.com/v3/checks/suites/#update-repository-preferences-for-check-suites)". Your GitHub App must have the `checks:write` permission to create check suites.
    */
  def createSuite(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<ChecksCreateSuiteResponse> */ _
  ] = js.native
  def createSuite(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with ChecksCreateSuiteParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<ChecksCreateSuiteResponse> */ _
  ] = js.native
  /**
    * **Note:** The Checks API only looks for pushes in the repository where the check suite or check run were created. Pushes to a branch in a forked repository are not detected and return an empty `pull_requests` array.
    *
    * Gets a single check run using its `id`. GitHub Apps must have the `checks:read` permission on a private repository or pull access to a public repository to get check runs. OAuth Apps and authenticated users must have the `repo` scope to get check runs in a private repository.
    */
  def get(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<ChecksGetResponse> */ _
  ] = js.native
  def get(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with ChecksGetParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<ChecksGetResponse> */ _
  ] = js.native
  /**
    * **Note:** The Checks API only looks for pushes in the repository where the check suite or check run were created. Pushes to a branch in a forked repository are not detected and return an empty `pull_requests` array and a `null` value for `head_branch`.
    *
    * Gets a single check suite using its `id`. GitHub Apps must have the `checks:read` permission on a private repository or pull access to a public repository to get check suites. OAuth Apps and authenticated users must have the `repo` scope to get check suites in a private repository.
    */
  def getSuite(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<ChecksGetSuiteResponse> */ _
  ] = js.native
  def getSuite(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with ChecksGetSuiteParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<ChecksGetSuiteResponse> */ _
  ] = js.native
  /**
    * Lists annotations for a check run using the annotation `id`. GitHub Apps must have the `checks:read` permission on a private repository or pull access to a public repository to get annotations for a check run. OAuth Apps and authenticated users must have the `repo` scope to get annotations for a check run in a private repository.
    */
  def listAnnotations(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<ChecksListAnnotationsResponse> */ _
  ] = js.native
  def listAnnotations(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with ChecksListAnnotationsParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<ChecksListAnnotationsResponse> */ _
  ] = js.native
  /**
    * **Note:** The Checks API only looks for pushes in the repository where the check suite or check run were created. Pushes to a branch in a forked repository are not detected and return an empty `pull_requests` array.
    *
    * Lists check runs for a commit ref. The `ref` can be a SHA, branch name, or a tag name. GitHub Apps must have the `checks:read` permission on a private repository or pull access to a public repository to get check runs. OAuth Apps and authenticated users must have the `repo` scope to get check runs in a private repository.
    */
  def listForRef(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<ChecksListForRefResponse> */ _
  ] = js.native
  def listForRef(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with ChecksListForRefParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<ChecksListForRefResponse> */ _
  ] = js.native
  /**
    * **Note:** The Checks API only looks for pushes in the repository where the check suite or check run were created. Pushes to a branch in a forked repository are not detected and return an empty `pull_requests` array.
    *
    * Lists check runs for a check suite using its `id`. GitHub Apps must have the `checks:read` permission on a private repository or pull access to a public repository to get check runs. OAuth Apps and authenticated users must have the `repo` scope to get check runs in a private repository.
    */
  def listForSuite(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<ChecksListForSuiteResponse> */ _
  ] = js.native
  def listForSuite(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with ChecksListForSuiteParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<ChecksListForSuiteResponse> */ _
  ] = js.native
  /**
    * **Note:** The Checks API only looks for pushes in the repository where the check suite or check run were created. Pushes to a branch in a forked repository are not detected and return an empty `pull_requests` array and a `null` value for `head_branch`.
    *
    * Lists check suites for a commit `ref`. The `ref` can be a SHA, branch name, or a tag name. GitHub Apps must have the `checks:read` permission on a private repository or pull access to a public repository to list check suites. OAuth Apps and authenticated users must have the `repo` scope to get check suites in a private repository.
    */
  def listSuitesForRef(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<ChecksListSuitesForRefResponse> */ _
  ] = js.native
  def listSuitesForRef(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with ChecksListSuitesForRefParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<ChecksListSuitesForRefResponse> */ _
  ] = js.native
  /**
    * Triggers GitHub to rerequest an existing check suite, without pushing new code to a repository. This endpoint will trigger the [`check_suite` webhook](https://developer.github.com/v3/activity/events/types/#checksuiteevent) event with the action `rerequested`. When a check suite is `rerequested`, its `status` is reset to `queued` and the `conclusion` is cleared.
    *
    * To rerequest a check suite, your GitHub App must have the `checks:read` permission on a private repository or pull access to a public repository.
    */
  def rerequestSuite(): js.Promise[AnyResponse] = js.native
  def rerequestSuite(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with ChecksRerequestSuiteParams
  ): js.Promise[AnyResponse] = js.native
  /**
    * Changes the default automatic flow when creating check suites. By default, the CheckSuiteEvent is automatically created each time code is pushed to a repository. When you disable the automatic creation of check suites, you can manually [Create a check suite](https://developer.github.com/v3/checks/suites/#create-a-check-suite). You must have admin permissions in the repository to set preferences for check suites.
    */
  def setSuitesPreferences(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<ChecksSetSuitesPreferencesResponse> */ _
  ] = js.native
  def setSuitesPreferences(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with ChecksSetSuitesPreferencesParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<ChecksSetSuitesPreferencesResponse> */ _
  ] = js.native
  /**
    * **Note:** The Checks API only looks for pushes in the repository where the check suite or check run were created. Pushes to a branch in a forked repository are not detected and return an empty `pull_requests` array.
    *
    * Updates a check run for a specific commit in a repository. Your GitHub App must have the `checks:write` permission to edit check runs.
    */
  def update(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<ChecksUpdateResponse> */ _
  ] = js.native
  def update(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with ChecksUpdateParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<ChecksUpdateResponse> */ _
  ] = js.native
}

