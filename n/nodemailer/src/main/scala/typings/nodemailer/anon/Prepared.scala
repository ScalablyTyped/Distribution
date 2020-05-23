package typings.nodemailer.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Prepared extends js.Object {
  var prepared: Boolean
  var value: String
}

object Prepared {
  @scala.inline
  def apply(prepared: Boolean, value: String): Prepared = {
    val __obj = js.Dynamic.literal(prepared = prepared.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Prepared]
  }
}

