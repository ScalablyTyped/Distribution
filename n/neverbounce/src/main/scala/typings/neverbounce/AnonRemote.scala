package typings.neverbounce

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRemote extends js.Object {
  var remote: String
  var supplied: String
}

object AnonRemote {
  @scala.inline
  def apply(remote: String, supplied: String): AnonRemote = {
    val __obj = js.Dynamic.literal(remote = remote.asInstanceOf[js.Any], supplied = supplied.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRemote]
  }
}

