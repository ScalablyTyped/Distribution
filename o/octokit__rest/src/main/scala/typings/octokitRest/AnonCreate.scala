package typings.octokitRest

import typings.octokitRest.mod.Octokit.AnyResponse
import typings.octokitRest.mod.Octokit.ChecksCreateParams
import typings.octokitRest.mod.Octokit.ChecksCreateResponse
import typings.octokitRest.mod.Octokit.ChecksCreateSuiteParams
import typings.octokitRest.mod.Octokit.ChecksCreateSuiteResponse
import typings.octokitRest.mod.Octokit.ChecksGetParams
import typings.octokitRest.mod.Octokit.ChecksGetResponse
import typings.octokitRest.mod.Octokit.ChecksGetSuiteParams
import typings.octokitRest.mod.Octokit.ChecksGetSuiteResponse
import typings.octokitRest.mod.Octokit.ChecksListAnnotationsParams
import typings.octokitRest.mod.Octokit.ChecksListAnnotationsResponse
import typings.octokitRest.mod.Octokit.ChecksListForRefParams
import typings.octokitRest.mod.Octokit.ChecksListForRefResponse
import typings.octokitRest.mod.Octokit.ChecksListForSuiteParams
import typings.octokitRest.mod.Octokit.ChecksListForSuiteResponse
import typings.octokitRest.mod.Octokit.ChecksListSuitesForRefParams
import typings.octokitRest.mod.Octokit.ChecksListSuitesForRefResponse
import typings.octokitRest.mod.Octokit.ChecksRerequestSuiteParams
import typings.octokitRest.mod.Octokit.ChecksSetSuitesPreferencesParams
import typings.octokitRest.mod.Octokit.ChecksSetSuitesPreferencesResponse
import typings.octokitRest.mod.Octokit.ChecksUpdateParams
import typings.octokitRest.mod.Octokit.ChecksUpdateResponse
import typings.octokitRest.mod.Octokit.RequestOptions
import typings.octokitRest.mod.Octokit.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCreate extends js.Object {
  /**
    * **Note:** The Checks API only looks for pushes in the repository where the check suite or check run were created. Pushes to a branch in a forked repository are not detected and return an empty `pull_requests` array and a `null` value for `head_branch`.
    *
    * By default, check suites are automatically created when you create a [check run](https://developer.github.com/v3/checks/runs/). You only need to use this endpoint for manually creating check suites when you've disabled automatic creation using "[Set preferences for check suites on a repository](https://developer.github.com/v3/checks/suites/#set-preferences-for-check-suites-on-a-repository)". Your GitHub App must have the `checks:write` permission to create check suites.
    */
  @JSName("createSuite")
  var createSuite_Original: AnonEndpointParamsChecksCreateSuiteParams = js.native
  /**
    * **Note:** The Checks API only looks for pushes in the repository where the check suite or check run were created. Pushes to a branch in a forked repository are not detected and return an empty `pull_requests` array.
    *
    * Creates a new check run for a specific commit in a repository. Your GitHub App must have the `checks:write` permission to create check runs.
    */
  @JSName("create")
  var create_Original: AnonEndpointParamsChecksCreateParams = js.native
  /**
    * **Note:** The Checks API only looks for pushes in the repository where the check suite or check run were created. Pushes to a branch in a forked repository are not detected and return an empty `pull_requests` array and a `null` value for `head_branch`.
    *
    * Gets a single check suite using its `id`. GitHub Apps must have the `checks:read` permission on a private repository or pull access to a public repository to get check suites. OAuth Apps and authenticated users must have the `repo` scope to get check suites in a private repository.
    */
  @JSName("getSuite")
  var getSuite_Original: AnonEndpointParamsChecksGetSuiteParams = js.native
  /**
    * **Note:** The Checks API only looks for pushes in the repository where the check suite or check run were created. Pushes to a branch in a forked repository are not detected and return an empty `pull_requests` array.
    *
    * Gets a single check run using its `id`. GitHub Apps must have the `checks:read` permission on a private repository or pull access to a public repository to get check runs. OAuth Apps and authenticated users must have the `repo` scope to get check runs in a private repository.
    */
  @JSName("get")
  var get_Original: AnonEndpointParamsChecksGetParams = js.native
  /**
    * Lists annotations for a check run using the annotation `id`. GitHub Apps must have the `checks:read` permission on a private repository or pull access to a public repository to get annotations for a check run. OAuth Apps and authenticated users must have the `repo` scope to get annotations for a check run in a private repository.
    */
  @JSName("listAnnotations")
  var listAnnotations_Original: AnonEndpointParamsChecksListAnnotationsParams = js.native
  /**
    * **Note:** The Checks API only looks for pushes in the repository where the check suite or check run were created. Pushes to a branch in a forked repository are not detected and return an empty `pull_requests` array.
    *
    * Lists check runs for a commit ref. The `ref` can be a SHA, branch name, or a tag name. GitHub Apps must have the `checks:read` permission on a private repository or pull access to a public repository to get check runs. OAuth Apps and authenticated users must have the `repo` scope to get check runs in a private repository.
    */
  @JSName("listForRef")
  var listForRef_Original: AnonEndpointParamsChecksListForRefParams = js.native
  /**
    * **Note:** The Checks API only looks for pushes in the repository where the check suite or check run were created. Pushes to a branch in a forked repository are not detected and return an empty `pull_requests` array.
    *
    * Lists check runs for a check suite using its `id`. GitHub Apps must have the `checks:read` permission on a private repository or pull access to a public repository to get check runs. OAuth Apps and authenticated users must have the `repo` scope to get check runs in a private repository.
    */
  @JSName("listForSuite")
  var listForSuite_Original: AnonEndpointParamsChecksListForSuiteParams = js.native
  /**
    * **Note:** The Checks API only looks for pushes in the repository where the check suite or check run were created. Pushes to a branch in a forked repository are not detected and return an empty `pull_requests` array and a `null` value for `head_branch`.
    *
    * Lists check suites for a commit `ref`. The `ref` can be a SHA, branch name, or a tag name. GitHub Apps must have the `checks:read` permission on a private repository or pull access to a public repository to list check suites. OAuth Apps and authenticated users must have the `repo` scope to get check suites in a private repository.
    */
  @JSName("listSuitesForRef")
  var listSuitesForRef_Original: AnonEndpointParamsChecksListSuitesForRefParams = js.native
  /**
    * Triggers GitHub to rerequest an existing check suite, without pushing new code to a repository. This endpoint will trigger the [`check_suite` webhook](https://developer.github.com/v3/activity/events/types/#checksuiteevent) event with the action `rerequested`. When a check suite is `rerequested`, its `status` is reset to `queued` and the `conclusion` is cleared.
    *
    * To rerequest a check suite, your GitHub App must have the `checks:read` permission on a private repository or pull access to a public repository.
    */
  @JSName("rerequestSuite")
  var rerequestSuite_Original: AnonEndpointParamsAnyResponseChecksRerequestSuiteParams = js.native
  /**
    * Changes the default automatic flow when creating check suites. By default, the CheckSuiteEvent is automatically created each time code is pushed to a repository. When you disable the automatic creation of check suites, you can manually [Create a check suite](https://developer.github.com/v3/checks/suites/#create-a-check-suite). You must have admin permissions in the repository to set preferences for check suites.
    */
  @JSName("setSuitesPreferences")
  var setSuitesPreferences_Original: AnonEndpointParamsChecksSetSuitesPreferencesParams = js.native
  /**
    * **Note:** The Checks API only looks for pushes in the repository where the check suite or check run were created. Pushes to a branch in a forked repository are not detected and return an empty `pull_requests` array.
    *
    * Updates a check run for a specific commit in a repository. Your GitHub App must have the `checks:write` permission to edit check runs.
    */
  @JSName("update")
  var update_Original: AnonEndpointParamsChecksUpdateParams = js.native
  /**
    * **Note:** The Checks API only looks for pushes in the repository where the check suite or check run were created. Pushes to a branch in a forked repository are not detected and return an empty `pull_requests` array.
    *
    * Creates a new check run for a specific commit in a repository. Your GitHub App must have the `checks:write` permission to create check runs.
    */
  def create(): js.Promise[Response[ChecksCreateResponse]] = js.native
  def create(params: RequestOptions with ChecksCreateParams): js.Promise[Response[ChecksCreateResponse]] = js.native
  /**
    * **Note:** The Checks API only looks for pushes in the repository where the check suite or check run were created. Pushes to a branch in a forked repository are not detected and return an empty `pull_requests` array and a `null` value for `head_branch`.
    *
    * By default, check suites are automatically created when you create a [check run](https://developer.github.com/v3/checks/runs/). You only need to use this endpoint for manually creating check suites when you've disabled automatic creation using "[Set preferences for check suites on a repository](https://developer.github.com/v3/checks/suites/#set-preferences-for-check-suites-on-a-repository)". Your GitHub App must have the `checks:write` permission to create check suites.
    */
  def createSuite(): js.Promise[Response[ChecksCreateSuiteResponse]] = js.native
  def createSuite(params: RequestOptions with ChecksCreateSuiteParams): js.Promise[Response[ChecksCreateSuiteResponse]] = js.native
  /**
    * **Note:** The Checks API only looks for pushes in the repository where the check suite or check run were created. Pushes to a branch in a forked repository are not detected and return an empty `pull_requests` array.
    *
    * Gets a single check run using its `id`. GitHub Apps must have the `checks:read` permission on a private repository or pull access to a public repository to get check runs. OAuth Apps and authenticated users must have the `repo` scope to get check runs in a private repository.
    */
  def get(): js.Promise[Response[ChecksGetResponse]] = js.native
  def get(params: RequestOptions with ChecksGetParams): js.Promise[Response[ChecksGetResponse]] = js.native
  /**
    * **Note:** The Checks API only looks for pushes in the repository where the check suite or check run were created. Pushes to a branch in a forked repository are not detected and return an empty `pull_requests` array and a `null` value for `head_branch`.
    *
    * Gets a single check suite using its `id`. GitHub Apps must have the `checks:read` permission on a private repository or pull access to a public repository to get check suites. OAuth Apps and authenticated users must have the `repo` scope to get check suites in a private repository.
    */
  def getSuite(): js.Promise[Response[ChecksGetSuiteResponse]] = js.native
  def getSuite(params: RequestOptions with ChecksGetSuiteParams): js.Promise[Response[ChecksGetSuiteResponse]] = js.native
  /**
    * Lists annotations for a check run using the annotation `id`. GitHub Apps must have the `checks:read` permission on a private repository or pull access to a public repository to get annotations for a check run. OAuth Apps and authenticated users must have the `repo` scope to get annotations for a check run in a private repository.
    */
  def listAnnotations(): js.Promise[Response[ChecksListAnnotationsResponse]] = js.native
  def listAnnotations(params: RequestOptions with ChecksListAnnotationsParams): js.Promise[Response[ChecksListAnnotationsResponse]] = js.native
  /**
    * **Note:** The Checks API only looks for pushes in the repository where the check suite or check run were created. Pushes to a branch in a forked repository are not detected and return an empty `pull_requests` array.
    *
    * Lists check runs for a commit ref. The `ref` can be a SHA, branch name, or a tag name. GitHub Apps must have the `checks:read` permission on a private repository or pull access to a public repository to get check runs. OAuth Apps and authenticated users must have the `repo` scope to get check runs in a private repository.
    */
  def listForRef(): js.Promise[Response[ChecksListForRefResponse]] = js.native
  def listForRef(params: RequestOptions with ChecksListForRefParams): js.Promise[Response[ChecksListForRefResponse]] = js.native
  /**
    * **Note:** The Checks API only looks for pushes in the repository where the check suite or check run were created. Pushes to a branch in a forked repository are not detected and return an empty `pull_requests` array.
    *
    * Lists check runs for a check suite using its `id`. GitHub Apps must have the `checks:read` permission on a private repository or pull access to a public repository to get check runs. OAuth Apps and authenticated users must have the `repo` scope to get check runs in a private repository.
    */
  def listForSuite(): js.Promise[Response[ChecksListForSuiteResponse]] = js.native
  def listForSuite(params: RequestOptions with ChecksListForSuiteParams): js.Promise[Response[ChecksListForSuiteResponse]] = js.native
  /**
    * **Note:** The Checks API only looks for pushes in the repository where the check suite or check run were created. Pushes to a branch in a forked repository are not detected and return an empty `pull_requests` array and a `null` value for `head_branch`.
    *
    * Lists check suites for a commit `ref`. The `ref` can be a SHA, branch name, or a tag name. GitHub Apps must have the `checks:read` permission on a private repository or pull access to a public repository to list check suites. OAuth Apps and authenticated users must have the `repo` scope to get check suites in a private repository.
    */
  def listSuitesForRef(): js.Promise[Response[ChecksListSuitesForRefResponse]] = js.native
  def listSuitesForRef(params: RequestOptions with ChecksListSuitesForRefParams): js.Promise[Response[ChecksListSuitesForRefResponse]] = js.native
  /**
    * Triggers GitHub to rerequest an existing check suite, without pushing new code to a repository. This endpoint will trigger the [`check_suite` webhook](https://developer.github.com/v3/activity/events/types/#checksuiteevent) event with the action `rerequested`. When a check suite is `rerequested`, its `status` is reset to `queued` and the `conclusion` is cleared.
    *
    * To rerequest a check suite, your GitHub App must have the `checks:read` permission on a private repository or pull access to a public repository.
    */
  def rerequestSuite(): js.Promise[AnyResponse] = js.native
  def rerequestSuite(params: RequestOptions with ChecksRerequestSuiteParams): js.Promise[AnyResponse] = js.native
  /**
    * Changes the default automatic flow when creating check suites. By default, the CheckSuiteEvent is automatically created each time code is pushed to a repository. When you disable the automatic creation of check suites, you can manually [Create a check suite](https://developer.github.com/v3/checks/suites/#create-a-check-suite). You must have admin permissions in the repository to set preferences for check suites.
    */
  def setSuitesPreferences(): js.Promise[Response[ChecksSetSuitesPreferencesResponse]] = js.native
  def setSuitesPreferences(params: RequestOptions with ChecksSetSuitesPreferencesParams): js.Promise[Response[ChecksSetSuitesPreferencesResponse]] = js.native
  /**
    * **Note:** The Checks API only looks for pushes in the repository where the check suite or check run were created. Pushes to a branch in a forked repository are not detected and return an empty `pull_requests` array.
    *
    * Updates a check run for a specific commit in a repository. Your GitHub App must have the `checks:write` permission to edit check runs.
    */
  def update(): js.Promise[Response[ChecksUpdateResponse]] = js.native
  def update(params: RequestOptions with ChecksUpdateParams): js.Promise[Response[ChecksUpdateResponse]] = js.native
}

