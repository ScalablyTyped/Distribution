package typings.nodeSlack.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Option extends js.Object {
  var proxy: String
}

object Option {
  @scala.inline
  def apply(proxy: String): Option = {
    val __obj = js.Dynamic.literal(proxy = proxy.asInstanceOf[js.Any])
    __obj.asInstanceOf[Option]
  }
}

