package typings.postmark.postmarkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OutboundMessageFilter extends BaseFilter {
  var fromemail: js.UndefOr[String] = js.undefined
  var recipient: js.UndefOr[String] = js.undefined
  var status: js.UndefOr[String] = js.undefined
}

object OutboundMessageFilter {
  @scala.inline
  def apply(
    count: Int | Double = null,
    fromdate: String = null,
    fromemail: String = null,
    offset: Int | Double = null,
    recipient: String = null,
    status: String = null,
    tag: String = null,
    todate: String = null
  ): OutboundMessageFilter = {
    val __obj = js.Dynamic.literal()
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (fromdate != null) __obj.updateDynamic("fromdate")(fromdate)
    if (fromemail != null) __obj.updateDynamic("fromemail")(fromemail)
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (recipient != null) __obj.updateDynamic("recipient")(recipient)
    if (status != null) __obj.updateDynamic("status")(status)
    if (tag != null) __obj.updateDynamic("tag")(tag)
    if (todate != null) __obj.updateDynamic("todate")(todate)
    __obj.asInstanceOf[OutboundMessageFilter]
  }
}

