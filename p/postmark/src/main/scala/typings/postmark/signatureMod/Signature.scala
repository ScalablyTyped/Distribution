package typings.postmark.signatureMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Signature extends js.Object {
  var Confirmed: Boolean
  var Domain: String
  var EmailAddress: String
  var ID: Double
  var Name: String
  var ReplyToEmailAddress: String
}

object Signature {
  @scala.inline
  def apply(
    Confirmed: Boolean,
    Domain: String,
    EmailAddress: String,
    ID: Double,
    Name: String,
    ReplyToEmailAddress: String
  ): Signature = {
    val __obj = js.Dynamic.literal(Confirmed = Confirmed.asInstanceOf[js.Any], Domain = Domain.asInstanceOf[js.Any], EmailAddress = EmailAddress.asInstanceOf[js.Any], ID = ID.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], ReplyToEmailAddress = ReplyToEmailAddress.asInstanceOf[js.Any])
    __obj.asInstanceOf[Signature]
  }
}

