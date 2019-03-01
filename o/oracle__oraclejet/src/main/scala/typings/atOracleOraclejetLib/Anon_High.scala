package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_High extends js.Object {
  var high: scala.Double
  var low: scala.Double
  var value: scala.Double
  var x: scala.Double | java.lang.String
}

object Anon_High {
  @scala.inline
  def apply(high: scala.Double, low: scala.Double, value: scala.Double, x: scala.Double | java.lang.String): Anon_High = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("high")(high)
    __obj.updateDynamic("low")(low)
    __obj.updateDynamic("value")(value)
    __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_High]
  }
}

