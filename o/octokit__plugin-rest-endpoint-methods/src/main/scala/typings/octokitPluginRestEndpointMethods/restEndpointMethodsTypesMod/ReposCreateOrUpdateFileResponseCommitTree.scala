package typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposCreateOrUpdateFileResponseCommitTree extends js.Object {
  var sha: String
  var url: String
}

object ReposCreateOrUpdateFileResponseCommitTree {
  @scala.inline
  def apply(sha: String, url: String): ReposCreateOrUpdateFileResponseCommitTree = {
    val __obj = js.Dynamic.literal(sha = sha.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReposCreateOrUpdateFileResponseCommitTree]
  }
}

