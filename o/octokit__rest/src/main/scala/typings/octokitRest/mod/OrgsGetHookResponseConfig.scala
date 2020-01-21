package typings.octokitRest.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrgsGetHookResponseConfig extends js.Object {
  var content_type: String
  var url: String
}

object OrgsGetHookResponseConfig {
  @scala.inline
  def apply(content_type: String, url: String): OrgsGetHookResponseConfig = {
    val __obj = js.Dynamic.literal(content_type = content_type.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OrgsGetHookResponseConfig]
  }
}

