package typings.nodemailer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Prepared extends js.Object {
  var prepared: Boolean
  var value: String
}

object Anon_Prepared {
  @scala.inline
  def apply(prepared: Boolean, value: String): Anon_Prepared = {
    val __obj = js.Dynamic.literal(prepared = prepared.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Prepared]
  }
}

