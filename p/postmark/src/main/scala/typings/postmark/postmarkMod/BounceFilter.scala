package typings.postmark.postmarkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BounceFilter extends BaseFilter {
  var emailFilter: js.UndefOr[String] = js.undefined
  var inactive: js.UndefOr[Boolean] = js.undefined
  var messageID: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object BounceFilter {
  @scala.inline
  def apply(
    count: Int | Double = null,
    emailFilter: String = null,
    fromdate: String = null,
    inactive: js.UndefOr[Boolean] = js.undefined,
    messageID: String = null,
    offset: Int | Double = null,
    tag: String = null,
    todate: String = null,
    `type`: String = null
  ): BounceFilter = {
    val __obj = js.Dynamic.literal()
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (emailFilter != null) __obj.updateDynamic("emailFilter")(emailFilter)
    if (fromdate != null) __obj.updateDynamic("fromdate")(fromdate)
    if (!js.isUndefined(inactive)) __obj.updateDynamic("inactive")(inactive)
    if (messageID != null) __obj.updateDynamic("messageID")(messageID)
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (tag != null) __obj.updateDynamic("tag")(tag)
    if (todate != null) __obj.updateDynamic("todate")(todate)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[BounceFilter]
  }
}

