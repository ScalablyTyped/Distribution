package typings.octokitPluginRestEndpointMethods.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IssuesGetResponsePullRequest extends js.Object {
  var diff_url: String
  var html_url: String
  var patch_url: String
  var url: String
}

object IssuesGetResponsePullRequest {
  @scala.inline
  def apply(diff_url: String, html_url: String, patch_url: String, url: String): IssuesGetResponsePullRequest = {
    val __obj = js.Dynamic.literal(diff_url = diff_url.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], patch_url = patch_url.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IssuesGetResponsePullRequest]
  }
}

