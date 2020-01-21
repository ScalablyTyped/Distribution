package typings.oracleOraclejet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHeightNumber extends js.Object {
  var height: js.UndefOr[Double] = js.undefined
}

object AnonHeightNumber {
  @scala.inline
  def apply(height: Int | Double = null): AnonHeightNumber = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHeightNumber]
  }
}

