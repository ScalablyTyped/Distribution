package typings.pouchdbCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RevString extends js.Object {
  var rev: String
}

object RevString {
  @scala.inline
  def apply(rev: String): RevString = {
    val __obj = js.Dynamic.literal(rev = rev.asInstanceOf[js.Any])
    __obj.asInstanceOf[RevString]
  }
}

