package typings
package postmarkLib.postmarkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateSignature extends UpdateSignature {
  var FromEmail: java.lang.String
}

object CreateSignature {
  @scala.inline
  def apply(
    FromEmail: java.lang.String,
    Name: java.lang.String,
    ReplyToEmail: java.lang.String = null,
    ReturnPathDomain: java.lang.String = null
  ): CreateSignature = {
    val __obj = js.Dynamic.literal(FromEmail = FromEmail, Name = Name)
    if (ReplyToEmail != null) __obj.updateDynamic("ReplyToEmail")(ReplyToEmail)
    if (ReturnPathDomain != null) __obj.updateDynamic("ReturnPathDomain")(ReturnPathDomain)
    __obj.asInstanceOf[CreateSignature]
  }
}

