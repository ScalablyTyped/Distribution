package typings.neverbounce.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Remote extends js.Object {
  var remote: String
  var supplied: String
}

object Remote {
  @scala.inline
  def apply(remote: String, supplied: String): Remote = {
    val __obj = js.Dynamic.literal(remote = remote.asInstanceOf[js.Any], supplied = supplied.asInstanceOf[js.Any])
    __obj.asInstanceOf[Remote]
  }
}

