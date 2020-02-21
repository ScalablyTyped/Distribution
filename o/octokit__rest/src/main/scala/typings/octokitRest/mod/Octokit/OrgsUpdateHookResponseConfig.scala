package typings.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrgsUpdateHookResponseConfig extends js.Object {
  var content_type: String
  var url: String
}

object OrgsUpdateHookResponseConfig {
  @scala.inline
  def apply(content_type: String, url: String): OrgsUpdateHookResponseConfig = {
    val __obj = js.Dynamic.literal(content_type = content_type.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OrgsUpdateHookResponseConfig]
  }
}

