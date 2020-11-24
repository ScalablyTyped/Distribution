package typings.maximMazurokGapiClientFirebaserules.gapi.client.firebaserules

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientFirebaserules.anon.Accesstoken
import typings.maximMazurokGapiClientFirebaserules.anon.Alt
import typings.maximMazurokGapiClientFirebaserules.anon.Callback
import typings.maximMazurokGapiClientFirebaserules.anon.Fields
import typings.maximMazurokGapiClientFirebaserules.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReleasesResource extends js.Object {
  
  /**
    * Create a `Release`. Release names should reflect the developer's deployment practices. For example, the release name may include the environment name, application name, application
    * version, or any other name meaningful to the developer. Once a `Release` refers to a `Ruleset`, the rules can be enforced by Firebase Rules-enabled services. More than one `Release`
    * may be 'live' concurrently. Consider the following three `Release` names for `projects/foo` and the `Ruleset` to which they refer. Release Name | Ruleset Name
    * --------------------------------|------------- projects/foo/releases/prod | projects/foo/rulesets/uuid123 projects/foo/releases/prod/beta | projects/foo/rulesets/uuid123
    * projects/foo/releases/prod/v23 | projects/foo/rulesets/uuid456 The table reflects the `Ruleset` rollout in progress. The `prod` and `prod/beta` releases refer to the same `Ruleset`.
    * However, `prod/v23` refers to a new `Ruleset`. The `Ruleset` reference for a `Release` may be updated using the UpdateRelease method.
    */
  def create(request: Accesstoken): Request[Release] = js.native
  def create(request: Alt, body: Release): Request[Release] = js.native
  
  /** Delete a `Release` by resource name. */
  def delete(): Request[js.Object] = js.native
  def delete(request: Alt): Request[js.Object] = js.native
  
  /** Get a `Release` by name. */
  def get(): Request[Release] = js.native
  def get(request: Alt): Request[Release] = js.native
  
  /** Get the `Release` executable to use when enforcing rules. */
  def getExecutable(): Request[GetReleaseExecutableResponse] = js.native
  def getExecutable(request: Callback): Request[GetReleaseExecutableResponse] = js.native
  
  /** List the `Release` values for a project. This list may optionally be filtered by `Release` name, `Ruleset` name, `TestSuite` name, or any combination thereof. */
  def list(): Request[ListReleasesResponse] = js.native
  def list(request: Fields): Request[ListReleasesResponse] = js.native
  
  def patch(request: Alt, body: UpdateReleaseRequest): Request[Release] = js.native
  /**
    * Update a `Release` via PATCH. Only updates to the `ruleset_name` and `test_suite_name` fields will be honored. `Release` rename is not supported. To create a `Release` use the
    * CreateRelease method.
    */
  def patch(request: Key): Request[Release] = js.native
}
