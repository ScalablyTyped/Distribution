package typings.postmark.postmarkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateSignature extends UpdateSignature {
  var FromEmail: String
}

object CreateSignature {
  @scala.inline
  def apply(FromEmail: String, Name: String, ReplyToEmail: String = null, ReturnPathDomain: String = null): CreateSignature = {
    val __obj = js.Dynamic.literal(FromEmail = FromEmail, Name = Name)
    if (ReplyToEmail != null) __obj.updateDynamic("ReplyToEmail")(ReplyToEmail)
    if (ReturnPathDomain != null) __obj.updateDynamic("ReturnPathDomain")(ReturnPathDomain)
    __obj.asInstanceOf[CreateSignature]
  }
}

