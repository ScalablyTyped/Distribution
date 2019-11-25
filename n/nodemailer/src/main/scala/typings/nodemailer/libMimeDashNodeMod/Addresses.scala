package typings.nodemailer.libMimeDashNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Addresses extends js.Object {
  var bcc: js.UndefOr[js.Array[String]] = js.undefined
  var cc: js.UndefOr[js.Array[String]] = js.undefined
  var from: js.UndefOr[js.Array[String]] = js.undefined
  var `reply-to`: js.UndefOr[js.Array[String]] = js.undefined
  var sender: js.UndefOr[js.Array[String]] = js.undefined
  var to: js.UndefOr[js.Array[String]] = js.undefined
}

object Addresses {
  @scala.inline
  def apply(
    bcc: js.Array[String] = null,
    cc: js.Array[String] = null,
    from: js.Array[String] = null,
    `reply-to`: js.Array[String] = null,
    sender: js.Array[String] = null,
    to: js.Array[String] = null
  ): Addresses = {
    val __obj = js.Dynamic.literal()
    if (bcc != null) __obj.updateDynamic("bcc")(bcc.asInstanceOf[js.Any])
    if (cc != null) __obj.updateDynamic("cc")(cc.asInstanceOf[js.Any])
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (`reply-to` != null) __obj.updateDynamic("reply-to")(`reply-to`.asInstanceOf[js.Any])
    if (sender != null) __obj.updateDynamic("sender")(sender.asInstanceOf[js.Any])
    if (to != null) __obj.updateDynamic("to")(to.asInstanceOf[js.Any])
    __obj.asInstanceOf[Addresses]
  }
}

