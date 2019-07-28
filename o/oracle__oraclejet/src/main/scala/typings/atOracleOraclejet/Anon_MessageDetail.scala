package typings.atOracleOraclejet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MessageDetail extends js.Object {
  var messageDetail: js.UndefOr[String] = js.undefined
  var messageSummary: js.UndefOr[String] = js.undefined
}

object Anon_MessageDetail {
  @scala.inline
  def apply(messageDetail: String = null, messageSummary: String = null): Anon_MessageDetail = {
    val __obj = js.Dynamic.literal()
    if (messageDetail != null) __obj.updateDynamic("messageDetail")(messageDetail)
    if (messageSummary != null) __obj.updateDynamic("messageSummary")(messageSummary)
    __obj.asInstanceOf[Anon_MessageDetail]
  }
}

