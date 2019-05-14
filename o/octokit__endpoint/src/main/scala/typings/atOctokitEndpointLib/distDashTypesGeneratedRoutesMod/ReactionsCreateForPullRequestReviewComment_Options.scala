package typings
package atOctokitEndpointLib.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactionsCreateForPullRequestReviewComment_Options extends js.Object {
  var comment_id: scala.Double
  var content: java.lang.String
  var owner: java.lang.String
  var repo: java.lang.String
}

object ReactionsCreateForPullRequestReviewComment_Options {
  @scala.inline
  def apply(
    comment_id: scala.Double,
    content: java.lang.String,
    owner: java.lang.String,
    repo: java.lang.String
  ): ReactionsCreateForPullRequestReviewComment_Options = {
    val __obj = js.Dynamic.literal(comment_id = comment_id, content = content, owner = owner, repo = repo)
  
    __obj.asInstanceOf[ReactionsCreateForPullRequestReviewComment_Options]
  }
}

