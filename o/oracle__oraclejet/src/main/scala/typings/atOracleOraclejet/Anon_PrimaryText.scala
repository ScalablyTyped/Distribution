package typings.atOracleOraclejet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_PrimaryText extends js.Object {
  var primaryText: js.UndefOr[String] = js.undefined
  var secondaryText: js.UndefOr[String] = js.undefined
  var threshold: js.UndefOr[Double] = js.undefined
}

object Anon_PrimaryText {
  @scala.inline
  def apply(primaryText: String = null, secondaryText: String = null, threshold: Int | Double = null): Anon_PrimaryText = {
    val __obj = js.Dynamic.literal()
    if (primaryText != null) __obj.updateDynamic("primaryText")(primaryText.asInstanceOf[js.Any])
    if (secondaryText != null) __obj.updateDynamic("secondaryText")(secondaryText.asInstanceOf[js.Any])
    if (threshold != null) __obj.updateDynamic("threshold")(threshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_PrimaryText]
  }
}

