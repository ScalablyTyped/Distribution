package typings.oracleOraclejet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMessageDetail extends js.Object {
  var messageDetail: js.UndefOr[String] = js.undefined
  var messageSummary: js.UndefOr[String] = js.undefined
}

object AnonMessageDetail {
  @scala.inline
  def apply(messageDetail: String = null, messageSummary: String = null): AnonMessageDetail = {
    val __obj = js.Dynamic.literal()
    if (messageDetail != null) __obj.updateDynamic("messageDetail")(messageDetail.asInstanceOf[js.Any])
    if (messageSummary != null) __obj.updateDynamic("messageSummary")(messageSummary.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMessageDetail]
  }
}

