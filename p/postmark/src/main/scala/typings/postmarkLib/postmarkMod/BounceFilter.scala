package typings
package postmarkLib.postmarkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BounceFilter extends BaseFilter {
  var emailFilter: js.UndefOr[java.lang.String] = js.undefined
  var inactive: js.UndefOr[scala.Boolean] = js.undefined
  var messageID: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object BounceFilter {
  @scala.inline
  def apply(
    count: scala.Int | scala.Double = null,
    emailFilter: java.lang.String = null,
    fromdate: java.lang.String = null,
    inactive: js.UndefOr[scala.Boolean] = js.undefined,
    messageID: java.lang.String = null,
    offset: scala.Int | scala.Double = null,
    tag: java.lang.String = null,
    todate: java.lang.String = null,
    `type`: java.lang.String = null
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

