package typings.oracleOraclejet

import typings.oracleOraclejet.oracleOraclejetStrings.`oj-table-footer`
import typings.oracleOraclejet.oracleOraclejetStrings.`oj-table-header`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIndexSubId extends js.Object {
  var index: Double
  var subId: `oj-table-footer` | `oj-table-header`
}

object AnonIndexSubId {
  @scala.inline
  def apply(index: Double, subId: `oj-table-footer` | `oj-table-header`): AnonIndexSubId = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], subId = subId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIndexSubId]
  }
}

