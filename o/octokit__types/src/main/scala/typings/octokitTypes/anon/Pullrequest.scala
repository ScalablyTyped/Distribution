package typings.octokitTypes.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Pullrequest extends js.Object {
  var html: HrefString
  var pull_request: HrefString
  var self: HrefString
}

object Pullrequest {
  @scala.inline
  def apply(html: HrefString, pull_request: HrefString, self: HrefString): Pullrequest = {
    val __obj = js.Dynamic.literal(html = html.asInstanceOf[js.Any], pull_request = pull_request.asInstanceOf[js.Any], self = self.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pullrequest]
  }
}

