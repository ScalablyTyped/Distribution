package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IssuesUpdateResponsePullRequest extends js.Object {
  var diff_url: String
  var html_url: String
  var patch_url: String
  var url: String
}

object IssuesUpdateResponsePullRequest {
  @scala.inline
  def apply(diff_url: String, html_url: String, patch_url: String, url: String): IssuesUpdateResponsePullRequest = {
    val __obj = js.Dynamic.literal(diff_url = diff_url, html_url = html_url, patch_url = patch_url, url = url)
  
    __obj.asInstanceOf[IssuesUpdateResponsePullRequest]
  }
}

