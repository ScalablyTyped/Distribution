package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IssuesGetEventResponseIssuePullRequest extends js.Object {
  var diff_url: java.lang.String
  var html_url: java.lang.String
  var patch_url: java.lang.String
  var url: java.lang.String
}

object IssuesGetEventResponseIssuePullRequest {
  @scala.inline
  def apply(
    diff_url: java.lang.String,
    html_url: java.lang.String,
    patch_url: java.lang.String,
    url: java.lang.String
  ): IssuesGetEventResponseIssuePullRequest = {
    val __obj = js.Dynamic.literal(diff_url = diff_url, html_url = html_url, patch_url = patch_url, url = url)
  
    __obj.asInstanceOf[IssuesGetEventResponseIssuePullRequest]
  }
}

