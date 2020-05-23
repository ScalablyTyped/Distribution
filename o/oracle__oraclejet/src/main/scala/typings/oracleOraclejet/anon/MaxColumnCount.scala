package typings.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MaxColumnCount extends js.Object {
  var maxColumnCount: Double
  var maxRowCount: Double
}

object MaxColumnCount {
  @scala.inline
  def apply(maxColumnCount: Double, maxRowCount: Double): MaxColumnCount = {
    val __obj = js.Dynamic.literal(maxColumnCount = maxColumnCount.asInstanceOf[js.Any], maxRowCount = maxRowCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaxColumnCount]
  }
}

