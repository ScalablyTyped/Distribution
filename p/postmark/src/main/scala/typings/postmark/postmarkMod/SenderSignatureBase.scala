package typings.postmark.postmarkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// sender signature
trait SenderSignatureBase extends js.Object {
  var Confirmed: Boolean
  var Domain: String
  var EmailAddress: String
  var ID: Double
  var Name: String
  var ReplyToEmailAddress: String
}

object SenderSignatureBase {
  @scala.inline
  def apply(
    Confirmed: Boolean,
    Domain: String,
    EmailAddress: String,
    ID: Double,
    Name: String,
    ReplyToEmailAddress: String
  ): SenderSignatureBase = {
    val __obj = js.Dynamic.literal(Confirmed = Confirmed, Domain = Domain, EmailAddress = EmailAddress, ID = ID, Name = Name, ReplyToEmailAddress = ReplyToEmailAddress)
  
    __obj.asInstanceOf[SenderSignatureBase]
  }
}

