package typings.octokitTypes.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnabledUrl extends js.Object {
  var enabled: Boolean
  var url: String
}

object EnabledUrl {
  @scala.inline
  def apply(enabled: Boolean, url: String): EnabledUrl = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnabledUrl]
  }
}

