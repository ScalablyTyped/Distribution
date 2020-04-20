package typings.pouchdbCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRevString extends js.Object {
  var rev: String
}

object AnonRevString {
  @scala.inline
  def apply(rev: String): AnonRevString = {
    val __obj = js.Dynamic.literal(rev = rev.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRevString]
  }
}

