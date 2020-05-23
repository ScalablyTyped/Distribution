package typings.octokitTypes.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Pull extends js.Object {
  var admin: Boolean
  var pull: Boolean
  var push: Boolean
}

object Pull {
  @scala.inline
  def apply(admin: Boolean, pull: Boolean, push: Boolean): Pull = {
    val __obj = js.Dynamic.literal(admin = admin.asInstanceOf[js.Any], pull = pull.asInstanceOf[js.Any], push = push.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pull]
  }
}

