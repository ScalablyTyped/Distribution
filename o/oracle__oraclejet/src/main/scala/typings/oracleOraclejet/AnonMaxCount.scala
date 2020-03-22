package typings.oracleOraclejet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMaxCount extends js.Object {
  var fetchSize: Double
  var maxCount: Double
}

object AnonMaxCount {
  @scala.inline
  def apply(fetchSize: Double, maxCount: Double): AnonMaxCount = {
    val __obj = js.Dynamic.literal(fetchSize = fetchSize.asInstanceOf[js.Any], maxCount = maxCount.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonMaxCount]
  }
}

