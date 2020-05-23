package typings.octokitTypes.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Read extends js.Object {
  var admin: Boolean
  var read: Boolean
  var write: Boolean
}

object Read {
  @scala.inline
  def apply(admin: Boolean, read: Boolean, write: Boolean): Read = {
    val __obj = js.Dynamic.literal(admin = admin.asInstanceOf[js.Any], read = read.asInstanceOf[js.Any], write = write.asInstanceOf[js.Any])
    __obj.asInstanceOf[Read]
  }
}

