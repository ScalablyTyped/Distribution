package typings
package postmarkLib.postmarkMod.PostmarkNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InboundMessageFilter extends OutboundMessageFilter {
  var mailboxhash: js.UndefOr[java.lang.String] = js.undefined
  var subject: js.UndefOr[java.lang.String] = js.undefined
}

object InboundMessageFilter {
  @scala.inline
  def apply(
    count: scala.Int | scala.Double = null,
    fromdate: java.lang.String = null,
    fromemail: java.lang.String = null,
    mailboxhash: java.lang.String = null,
    offset: scala.Int | scala.Double = null,
    recipient: java.lang.String = null,
    status: java.lang.String = null,
    subject: java.lang.String = null,
    tag: java.lang.String = null,
    todate: java.lang.String = null
  ): InboundMessageFilter = {
    val __obj = js.Dynamic.literal()
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (fromdate != null) __obj.updateDynamic("fromdate")(fromdate)
    if (fromemail != null) __obj.updateDynamic("fromemail")(fromemail)
    if (mailboxhash != null) __obj.updateDynamic("mailboxhash")(mailboxhash)
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (recipient != null) __obj.updateDynamic("recipient")(recipient)
    if (status != null) __obj.updateDynamic("status")(status)
    if (subject != null) __obj.updateDynamic("subject")(subject)
    if (tag != null) __obj.updateDynamic("tag")(tag)
    if (todate != null) __obj.updateDynamic("todate")(todate)
    __obj.asInstanceOf[InboundMessageFilter]
  }
}

