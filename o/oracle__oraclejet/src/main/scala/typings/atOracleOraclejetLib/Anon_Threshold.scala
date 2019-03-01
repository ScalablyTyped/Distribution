package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Threshold extends js.Object {
  var threshold: js.UndefOr[scala.Double] = js.undefined
}

object Anon_Threshold {
  @scala.inline
  def apply(threshold: scala.Int | scala.Double = null): Anon_Threshold = {
    val __obj = js.Dynamic.literal()
    if (threshold != null) __obj.updateDynamic("threshold")(threshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Threshold]
  }
}

