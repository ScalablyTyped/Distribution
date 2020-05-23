package typings.nano.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Rev extends js.Object {
  var rev: String
}

object Rev {
  @scala.inline
  def apply(rev: String): Rev = {
    val __obj = js.Dynamic.literal(rev = rev.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rev]
  }
}

