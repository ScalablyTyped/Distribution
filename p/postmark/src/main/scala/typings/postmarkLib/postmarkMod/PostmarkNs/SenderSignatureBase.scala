package typings
package postmarkLib.postmarkMod.PostmarkNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// sender signature
trait SenderSignatureBase extends js.Object {
  var Confirmed: scala.Boolean
  var Domain: java.lang.String
  var EmailAddress: java.lang.String
  var ID: scala.Double
  var Name: java.lang.String
  var ReplyToEmailAddress: java.lang.String
}

object SenderSignatureBase {
  @scala.inline
  def apply(
    Confirmed: scala.Boolean,
    Domain: java.lang.String,
    EmailAddress: java.lang.String,
    ID: scala.Double,
    Name: java.lang.String,
    ReplyToEmailAddress: java.lang.String
  ): SenderSignatureBase = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Confirmed")(Confirmed)
    __obj.updateDynamic("Domain")(Domain)
    __obj.updateDynamic("EmailAddress")(EmailAddress)
    __obj.updateDynamic("ID")(ID)
    __obj.updateDynamic("Name")(Name)
    __obj.updateDynamic("ReplyToEmailAddress")(ReplyToEmailAddress)
    __obj.asInstanceOf[SenderSignatureBase]
  }
}

