package typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.Plussign1
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.`-1`
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.confused
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.eyes
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.heart
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.hooray
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.laugh
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.rocket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactionsCreateForIssueParams extends js.Object {
  /**
    * The [reaction type](https://developer.github.com/v3/reactions/#reaction-types) to add to the issue.
    */
  var content: Plussign1 | `-1` | laugh | confused | heart | hooray | rocket | eyes
  var issue_number: Double
  var owner: String
  var repo: String
}

object ReactionsCreateForIssueParams {
  @scala.inline
  def apply(
    content: Plussign1 | `-1` | laugh | confused | heart | hooray | rocket | eyes,
    issue_number: Double,
    owner: String,
    repo: String
  ): ReactionsCreateForIssueParams = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], issue_number = issue_number.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReactionsCreateForIssueParams]
  }
}

