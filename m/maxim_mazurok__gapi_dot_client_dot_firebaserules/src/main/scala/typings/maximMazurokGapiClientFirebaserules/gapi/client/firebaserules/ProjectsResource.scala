package typings.maximMazurokGapiClientFirebaserules.gapi.client.firebaserules

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientFirebaserules.anon.Alt
import typings.maximMazurokGapiClientFirebaserules.anon.Oauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProjectsResource extends js.Object {
  
  var releases: ReleasesResource = js.native
  
  var rulesets: RulesetsResource = js.native
  
  def test(request: Alt, body: TestRulesetRequest): Request[TestRulesetResponse] = js.native
  /**
    * Test `Source` for syntactic and semantic correctness. Issues present, if any, will be returned to the caller with a description, severity, and source location. The test method may
    * be executed with `Source` or a `Ruleset` name. Passing `Source` is useful for unit testing new rules. Passing a `Ruleset` name is useful for regression testing an existing rule. The
    * following is an example of `Source` that permits users to upload images to a bucket bearing their user id and matching the correct metadata: _*Example*_ // Users are allowed to
    * subscribe and unsubscribe to the blog. service firebase.storage { match /users/{userId}/images/{imageName} { allow write: if userId == request.auth.uid &&
    * (imageName.matches('*.png$') || imageName.matches('*.jpg$')) && resource.mimeType.matches('^image/') } }
    */
  def test(request: Oauthtoken): Request[TestRulesetResponse] = js.native
}
