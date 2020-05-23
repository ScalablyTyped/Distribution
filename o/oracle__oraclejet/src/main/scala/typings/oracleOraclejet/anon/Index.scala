package typings.oracleOraclejet.anon

import typings.oracleOraclejet.oracleOraclejetStrings.`oj-gantt-row-label`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Index extends js.Object {
  var index: Double
  var subId: `oj-gantt-row-label`
}

object Index {
  @scala.inline
  def apply(index: Double, subId: `oj-gantt-row-label`): Index = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], subId = subId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Index]
  }
}

