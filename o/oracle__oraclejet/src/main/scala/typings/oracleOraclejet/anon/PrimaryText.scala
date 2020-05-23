package typings.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrimaryText extends js.Object {
  var primaryText: js.UndefOr[String] = js.undefined
  var secondaryText: js.UndefOr[String] = js.undefined
  var threshold: js.UndefOr[Double] = js.undefined
}

object PrimaryText {
  @scala.inline
  def apply(
    primaryText: String = null,
    secondaryText: String = null,
    threshold: js.UndefOr[Double] = js.undefined
  ): PrimaryText = {
    val __obj = js.Dynamic.literal()
    if (primaryText != null) __obj.updateDynamic("primaryText")(primaryText.asInstanceOf[js.Any])
    if (secondaryText != null) __obj.updateDynamic("secondaryText")(secondaryText.asInstanceOf[js.Any])
    if (!js.isUndefined(threshold)) __obj.updateDynamic("threshold")(threshold.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrimaryText]
  }
}

