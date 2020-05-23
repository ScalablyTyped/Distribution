package typings.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait High extends js.Object {
  var high: Double
  var low: Double
  var value: Double
  var x: Double | String
}

object High {
  @scala.inline
  def apply(high: Double, low: Double, value: Double, x: Double | String): High = {
    val __obj = js.Dynamic.literal(high = high.asInstanceOf[js.Any], low = low.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any])
    __obj.asInstanceOf[High]
  }
}

