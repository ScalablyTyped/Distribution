package typings.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MaxCount extends js.Object {
  var fetchSize: Double
  var maxCount: Double
}

object MaxCount {
  @scala.inline
  def apply(fetchSize: Double, maxCount: Double): MaxCount = {
    val __obj = js.Dynamic.literal(fetchSize = fetchSize.asInstanceOf[js.Any], maxCount = maxCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaxCount]
  }
}

