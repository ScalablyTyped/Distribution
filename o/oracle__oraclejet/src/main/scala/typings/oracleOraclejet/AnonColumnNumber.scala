package typings.oracleOraclejet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonColumnNumber extends js.Object {
  var column: js.UndefOr[Double] = js.undefined
  var row: Double
}

object AnonColumnNumber {
  @scala.inline
  def apply(row: Double, column: Int | Double = null): AnonColumnNumber = {
    val __obj = js.Dynamic.literal(row = row.asInstanceOf[js.Any])
    if (column != null) __obj.updateDynamic("column")(column.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonColumnNumber]
  }
}

