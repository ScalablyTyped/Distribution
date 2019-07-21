package typings
package atOctokitRestLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Create extends js.Object {
  /**
    * **Note:** The Checks API only looks for pushes in the repository where the check suite or check run were created. Pushes to a branch in a forked repository are not detected and return an empty `pull_requests` array and a `null` value for `head_branch`.
    *
    * By default, check suites are automatically created when you create a [check run](https://developer.github.com/v3/checks/runs/). You only need to use this endpoint for manually creating check suites when you've disabled automatic creation using "[Set preferences for check suites on a repository](https://developer.github.com/v3/checks/suites/#set-preferences-for-check-suites-on-a-repository)". Your GitHub App must have the `checks:write` permission to create check suites.
    */
  @JSName("createSuite")
  var createSuite_Original: Anon_EndpointParamsChecksCreateSuiteParams = js.native
  /**
    * **Note:** The Checks API only looks for pushes in the repository where the check suite or check run were created. Pushes to a branch in a forked repository are not detected and return an empty `pull_requests` array.
    *
    * Creates a new check run for a specific commit in a repository. Your GitHub App must have the `checks:write` permission to create check runs.
    *
    * #### [](https://developer.github.com/v3/checks/runs/#actions-object)`actions` object
    */
  @JSName("create")
  var create_Original: Anon_EndpointParamsChecksCreateParams = js.native
  /**
    * **Note:** The Checks API only looks for pushes in the repository where the check suite or check run were created. Pushes to a branch in a forked repository are not detected and return an empty `pull_requests` array and a `null` value for `head_branch`.
    *
    * Gets a single check suite using its `id`. GitHub Apps must have the `checks:read` permission on a private repository or pull access to a public repository to get check suites. OAuth Apps and authenticated users must have the `repo` scope to get check suites in a private repository.
    */
  @JSName("getSuite")
  var getSuite_Original: Anon_EndpointParamsChecksGetSuiteParams = js.native
  /**
    * **Note:** The Checks API only looks for pushes in the repository where the check suite or check run were created. Pushes to a branch in a forked repository are not detected and return an empty `pull_requests` array.
    *
    * Gets a single check run using its `id`. GitHub Apps must have the `checks:read` permission on a private repository or pull access to a public repository to get check runs. OAuth Apps and authenticated users must have the `repo` scope to get check runs in a private repository.
    */
  @JSName("get")
  var get_Original: Anon_EndpointParamsChecksGetParams = js.native
  /**
    * Lists annotations for a check run using the annotation `id`. GitHub Apps must have the `checks:read` permission on a private repository or pull access to a public repository to get annotations for a check run. OAuth Apps and authenticated users must have the `repo` scope to get annotations for a check run in a private repository.
    */
  @JSName("listAnnotations")
  var listAnnotations_Original: Anon_EndpointParamsChecksListAnnotationsParams = js.native
  /**
    * **Note:** The Checks API only looks for pushes in the repository where the check suite or check run were created. Pushes to a branch in a forked repository are not detected and return an empty `pull_requests` array.
    *
    * Lists check runs for a commit ref. The `ref` can be a SHA, branch name, or a tag name. GitHub Apps must have the `checks:read` permission on a private repository or pull access to a public repository to get check runs. OAuth Apps and authenticated users must have the `repo` scope to get check runs in a private repository.
    */
  @JSName("listForRef")
  var listForRef_Original: Anon_EndpointParamsChecksListForRefParams = js.native
  /**
    * **Note:** The Checks API only looks for pushes in the repository where the check suite or check run were created. Pushes to a branch in a forked repository are not detected and return an empty `pull_requests` array.
    *
    * Lists check runs for a check suite using its `id`. GitHub Apps must have the `checks:read` permission on a private repository or pull access to a public repository to get check runs. OAuth Apps and authenticated users must have the `repo` scope to get check runs in a private repository.
    */
  @JSName("listForSuite")
  var listForSuite_Original: Anon_EndpointParamsChecksListForSuiteParams = js.native
  /**
    * **Note:** The Checks API only looks for pushes in the repository where the check suite or check run were created. Pushes to a branch in a forked repository are not detected and return an empty `pull_requests` array and a `null` value for `head_branch`.
    *
    * Lists check suites for a commit `ref`. The `ref` can be a SHA, branch name, or a tag name. GitHub Apps must have the `checks:read` permission on a private repository or pull access to a public repository to list check suites. OAuth Apps and authenticated users must have the `repo` scope to get check suites in a private repository.
    */
  @JSName("listSuitesForRef")
  var listSuitesForRef_Original: Anon_EndpointParamsChecksListSuitesForRefParams = js.native
  /**
    * Triggers GitHub to rerequest an existing check suite, without pushing new code to a repository. This endpoint will trigger the [`check_suite` webhook](https://developer.github.com/v3/activity/events/types/#checksuiteevent) event with the action `rerequested`. When a check suite is `rerequested`, its `status` is reset to `queued` and the `conclusion` is cleared.
    *
    * To rerequest a check suite, your GitHub App must have the `checks:read` permission on a private repository or pull access to a public repository.
    */
  @JSName("rerequestSuite")
  var rerequestSuite_Original: Anon_EndpointParamsChecksRerequestSuiteParams = js.native
  /**
    * Changes the default automatic flow when creating check suites. By default, the CheckSuiteEvent is automatically created each time code is pushed to a repository. When you disable the automatic creation of check suites, you can manually [Create a check suite](https://developer.github.com/v3/checks/suites/#create-a-check-suite). You must have admin permissions in the repository to set preferences for check suites.
    */
  @JSName("setSuitesPreferences")
  var setSuitesPreferences_Original: Anon_EndpointParamsChecksSetSuitesPreferencesParams = js.native
  /**
    * **Note:** The Checks API only looks for pushes in the repository where the check suite or check run were created. Pushes to a branch in a forked repository are not detected and return an empty `pull_requests` array.
    *
    * Updates a check run for a specific commit in a repository. Your GitHub App must have the `checks:write` permission to edit check runs.
    *
    * #### [](https://developer.github.com/v3/checks/runs/#actions-object-1)`actions` object
    */
  @JSName("update")
  var update_Original: Anon_EndpointParamsChecksUpdateParams = js.native
  /**
    * **Note:** The Checks API only looks for pushes in the repository where the check suite or check run were created. Pushes to a branch in a forked repository are not detected and return an empty `pull_requests` array.
    *
    * Creates a new check run for a specific commit in a repository. Your GitHub App must have the `checks:write` permission to create check runs.
    *
    * #### [](https://developer.github.com/v3/checks/runs/#actions-object)`actions` object
    */
  def create(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ChecksCreateResponse]
  ] = js.native
  def create(params: atOctokitRestLib.atOctokitRestMod.ChecksCreateParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ChecksCreateResponse]
  ] = js.native
  /**
    * **Note:** The Checks API only looks for pushes in the repository where the check suite or check run were created. Pushes to a branch in a forked repository are not detected and return an empty `pull_requests` array and a `null` value for `head_branch`.
    *
    * By default, check suites are automatically created when you create a [check run](https://developer.github.com/v3/checks/runs/). You only need to use this endpoint for manually creating check suites when you've disabled automatic creation using "[Set preferences for check suites on a repository](https://developer.github.com/v3/checks/suites/#set-preferences-for-check-suites-on-a-repository)". Your GitHub App must have the `checks:write` permission to create check suites.
    */
  def createSuite(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ChecksCreateSuiteResponse]
  ] = js.native
  def createSuite(params: atOctokitRestLib.atOctokitRestMod.ChecksCreateSuiteParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ChecksCreateSuiteResponse]
  ] = js.native
  /**
    * **Note:** The Checks API only looks for pushes in the repository where the check suite or check run were created. Pushes to a branch in a forked repository are not detected and return an empty `pull_requests` array.
    *
    * Gets a single check run using its `id`. GitHub Apps must have the `checks:read` permission on a private repository or pull access to a public repository to get check runs. OAuth Apps and authenticated users must have the `repo` scope to get check runs in a private repository.
    */
  def get(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ChecksGetResponse]
  ] = js.native
  def get(params: atOctokitRestLib.atOctokitRestMod.ChecksGetParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ChecksGetResponse]
  ] = js.native
  /**
    * **Note:** The Checks API only looks for pushes in the repository where the check suite or check run were created. Pushes to a branch in a forked repository are not detected and return an empty `pull_requests` array and a `null` value for `head_branch`.
    *
    * Gets a single check suite using its `id`. GitHub Apps must have the `checks:read` permission on a private repository or pull access to a public repository to get check suites. OAuth Apps and authenticated users must have the `repo` scope to get check suites in a private repository.
    */
  def getSuite(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ChecksGetSuiteResponse]
  ] = js.native
  def getSuite(params: atOctokitRestLib.atOctokitRestMod.ChecksGetSuiteParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ChecksGetSuiteResponse]
  ] = js.native
  /**
    * Lists annotations for a check run using the annotation `id`. GitHub Apps must have the `checks:read` permission on a private repository or pull access to a public repository to get annotations for a check run. OAuth Apps and authenticated users must have the `repo` scope to get annotations for a check run in a private repository.
    */
  def listAnnotations(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ChecksListAnnotationsResponse]
  ] = js.native
  def listAnnotations(params: atOctokitRestLib.atOctokitRestMod.ChecksListAnnotationsParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ChecksListAnnotationsResponse]
  ] = js.native
  /**
    * **Note:** The Checks API only looks for pushes in the repository where the check suite or check run were created. Pushes to a branch in a forked repository are not detected and return an empty `pull_requests` array.
    *
    * Lists check runs for a commit ref. The `ref` can be a SHA, branch name, or a tag name. GitHub Apps must have the `checks:read` permission on a private repository or pull access to a public repository to get check runs. OAuth Apps and authenticated users must have the `repo` scope to get check runs in a private repository.
    */
  def listForRef(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ChecksListForRefResponse]
  ] = js.native
  def listForRef(params: atOctokitRestLib.atOctokitRestMod.ChecksListForRefParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ChecksListForRefResponse]
  ] = js.native
  /**
    * **Note:** The Checks API only looks for pushes in the repository where the check suite or check run were created. Pushes to a branch in a forked repository are not detected and return an empty `pull_requests` array.
    *
    * Lists check runs for a check suite using its `id`. GitHub Apps must have the `checks:read` permission on a private repository or pull access to a public repository to get check runs. OAuth Apps and authenticated users must have the `repo` scope to get check runs in a private repository.
    */
  def listForSuite(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ChecksListForSuiteResponse]
  ] = js.native
  def listForSuite(params: atOctokitRestLib.atOctokitRestMod.ChecksListForSuiteParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ChecksListForSuiteResponse]
  ] = js.native
  /**
    * **Note:** The Checks API only looks for pushes in the repository where the check suite or check run were created. Pushes to a branch in a forked repository are not detected and return an empty `pull_requests` array and a `null` value for `head_branch`.
    *
    * Lists check suites for a commit `ref`. The `ref` can be a SHA, branch name, or a tag name. GitHub Apps must have the `checks:read` permission on a private repository or pull access to a public repository to list check suites. OAuth Apps and authenticated users must have the `repo` scope to get check suites in a private repository.
    */
  def listSuitesForRef(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ChecksListSuitesForRefResponse]
  ] = js.native
  def listSuitesForRef(params: atOctokitRestLib.atOctokitRestMod.ChecksListSuitesForRefParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ChecksListSuitesForRefResponse]
  ] = js.native
  /**
    * Triggers GitHub to rerequest an existing check suite, without pushing new code to a repository. This endpoint will trigger the [`check_suite` webhook](https://developer.github.com/v3/activity/events/types/#checksuiteevent) event with the action `rerequested`. When a check suite is `rerequested`, its `status` is reset to `queued` and the `conclusion` is cleared.
    *
    * To rerequest a check suite, your GitHub App must have the `checks:read` permission on a private repository or pull access to a public repository.
    */
  def rerequestSuite(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ChecksRerequestSuiteResponse]
  ] = js.native
  def rerequestSuite(params: atOctokitRestLib.atOctokitRestMod.ChecksRerequestSuiteParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ChecksRerequestSuiteResponse]
  ] = js.native
  /**
    * Changes the default automatic flow when creating check suites. By default, the CheckSuiteEvent is automatically created each time code is pushed to a repository. When you disable the automatic creation of check suites, you can manually [Create a check suite](https://developer.github.com/v3/checks/suites/#create-a-check-suite). You must have admin permissions in the repository to set preferences for check suites.
    */
  def setSuitesPreferences(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ChecksSetSuitesPreferencesResponse]
  ] = js.native
  def setSuitesPreferences(params: atOctokitRestLib.atOctokitRestMod.ChecksSetSuitesPreferencesParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ChecksSetSuitesPreferencesResponse]
  ] = js.native
  /**
    * **Note:** The Checks API only looks for pushes in the repository where the check suite or check run were created. Pushes to a branch in a forked repository are not detected and return an empty `pull_requests` array.
    *
    * Updates a check run for a specific commit in a repository. Your GitHub App must have the `checks:write` permission to edit check runs.
    *
    * #### [](https://developer.github.com/v3/checks/runs/#actions-object-1)`actions` object
    */
  def update(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ChecksUpdateResponse]
  ] = js.native
  def update(params: atOctokitRestLib.atOctokitRestMod.ChecksUpdateParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ChecksUpdateResponse]
  ] = js.native
}

