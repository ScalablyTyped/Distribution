package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_PrimaryText extends js.Object {
  var primaryText: js.UndefOr[java.lang.String] = js.undefined
  var secondaryText: js.UndefOr[java.lang.String] = js.undefined
  var threshold: js.UndefOr[scala.Double] = js.undefined
}

object Anon_PrimaryText {
  @scala.inline
  def apply(
    primaryText: java.lang.String = null,
    secondaryText: java.lang.String = null,
    threshold: scala.Int | scala.Double = null
  ): Anon_PrimaryText = {
    val __obj = js.Dynamic.literal()
    if (primaryText != null) __obj.updateDynamic("primaryText")(primaryText)
    if (secondaryText != null) __obj.updateDynamic("secondaryText")(secondaryText)
    if (threshold != null) __obj.updateDynamic("threshold")(threshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_PrimaryText]
  }
}

