package typings.octokitTypes.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Self extends js.Object {
  var git: String
  var html: String
  var self: String
}

object Self {
  @scala.inline
  def apply(git: String, html: String, self: String): Self = {
    val __obj = js.Dynamic.literal(git = git.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], self = self.asInstanceOf[js.Any])
    __obj.asInstanceOf[Self]
  }
}

