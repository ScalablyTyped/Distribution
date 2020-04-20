package typings.oracleOraclejet.ojmessagingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Message extends js.Object {
  var detail: String
  var severity: SEVERITY_TYPE | SEVERITY_LEVEL
  var summary: String
}

object Message {
  @scala.inline
  def apply(detail: String, severity: SEVERITY_TYPE | SEVERITY_LEVEL, summary: String): Message = {
    val __obj = js.Dynamic.literal(detail = detail.asInstanceOf[js.Any], severity = severity.asInstanceOf[js.Any], summary = summary.asInstanceOf[js.Any])
    __obj.asInstanceOf[Message]
  }
}

