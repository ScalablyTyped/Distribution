package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGistidSha extends js.Object {
  var gist_id: AnonRequired
  var sha: AnonRequired
}

object AnonGistidSha {
  @scala.inline
  def apply(gist_id: AnonRequired, sha: AnonRequired): AnonGistidSha = {
    val __obj = js.Dynamic.literal(gist_id = gist_id.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonGistidSha]
  }
}

