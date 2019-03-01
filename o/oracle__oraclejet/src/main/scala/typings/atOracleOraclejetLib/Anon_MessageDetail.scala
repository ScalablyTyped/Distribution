package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MessageDetail extends js.Object {
  var messageDetail: js.UndefOr[java.lang.String] = js.undefined
  var messageSummary: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_MessageDetail {
  @scala.inline
  def apply(messageDetail: java.lang.String = null, messageSummary: java.lang.String = null): Anon_MessageDetail = {
    val __obj = js.Dynamic.literal()
    if (messageDetail != null) __obj.updateDynamic("messageDetail")(messageDetail)
    if (messageSummary != null) __obj.updateDynamic("messageSummary")(messageSummary)
    __obj.asInstanceOf[Anon_MessageDetail]
  }
}

