package typings.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageSummary extends js.Object {
  var messageDetail: js.UndefOr[String] = js.undefined
  var messageSummary: js.UndefOr[String] = js.undefined
}

object MessageSummary {
  @scala.inline
  def apply(messageDetail: String = null, messageSummary: String = null): MessageSummary = {
    val __obj = js.Dynamic.literal()
    if (messageDetail != null) __obj.updateDynamic("messageDetail")(messageDetail.asInstanceOf[js.Any])
    if (messageSummary != null) __obj.updateDynamic("messageSummary")(messageSummary.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageSummary]
  }
}

