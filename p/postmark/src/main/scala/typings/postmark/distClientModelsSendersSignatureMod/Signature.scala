package typings.postmark.distClientModelsSendersSignatureMod

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
    val __obj = js.Dynamic.literal(Confirmed = Confirmed, Domain = Domain, EmailAddress = EmailAddress, ID = ID, Name = Name, ReplyToEmailAddress = ReplyToEmailAddress)
  
    __obj.asInstanceOf[Signature]
  }
}

