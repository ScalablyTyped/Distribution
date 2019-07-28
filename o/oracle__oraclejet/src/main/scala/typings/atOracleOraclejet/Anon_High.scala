package typings.atOracleOraclejet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_High extends js.Object {
  var high: Double
  var low: Double
  var value: Double
  var x: Double | String
}

object Anon_High {
  @scala.inline
  def apply(high: Double, low: Double, value: Double, x: Double | String): Anon_High = {
    val __obj = js.Dynamic.literal(high = high, low = low, value = value, x = x.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_High]
  }
}

