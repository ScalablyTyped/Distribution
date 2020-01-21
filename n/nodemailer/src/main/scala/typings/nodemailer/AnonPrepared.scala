package typings.nodemailer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPrepared extends js.Object {
  var prepared: Boolean
  var value: String
}

object AnonPrepared {
  @scala.inline
  def apply(prepared: Boolean, value: String): AnonPrepared = {
    val __obj = js.Dynamic.literal(prepared = prepared.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonPrepared]
  }
}

