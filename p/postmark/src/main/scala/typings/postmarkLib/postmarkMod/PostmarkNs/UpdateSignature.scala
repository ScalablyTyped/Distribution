package typings
package postmarkLib.postmarkMod.PostmarkNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateSignature extends js.Object {
  var Name: java.lang.String
  var ReplyToEmail: js.UndefOr[java.lang.String] = js.undefined
  var ReturnPathDomain: js.UndefOr[java.lang.String] = js.undefined
}

object UpdateSignature {
  @scala.inline
  def apply(
    Name: java.lang.String,
    ReplyToEmail: java.lang.String = null,
    ReturnPathDomain: java.lang.String = null
  ): UpdateSignature = {
    val __obj = js.Dynamic.literal(Name = Name)
    if (ReplyToEmail != null) __obj.updateDynamic("ReplyToEmail")(ReplyToEmail)
    if (ReturnPathDomain != null) __obj.updateDynamic("ReturnPathDomain")(ReturnPathDomain)
    __obj.asInstanceOf[UpdateSignature]
  }
}

