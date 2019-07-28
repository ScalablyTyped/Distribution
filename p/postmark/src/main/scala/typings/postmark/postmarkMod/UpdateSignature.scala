package typings.postmark.postmarkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateSignature extends js.Object {
  var Name: String
  var ReplyToEmail: js.UndefOr[String] = js.undefined
  var ReturnPathDomain: js.UndefOr[String] = js.undefined
}

object UpdateSignature {
  @scala.inline
  def apply(Name: String, ReplyToEmail: String = null, ReturnPathDomain: String = null): UpdateSignature = {
    val __obj = js.Dynamic.literal(Name = Name)
    if (ReplyToEmail != null) __obj.updateDynamic("ReplyToEmail")(ReplyToEmail)
    if (ReturnPathDomain != null) __obj.updateDynamic("ReturnPathDomain")(ReturnPathDomain)
    __obj.asInstanceOf[UpdateSignature]
  }
}

