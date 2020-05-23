package typings.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeightNumber extends js.Object {
  var height: js.UndefOr[Double] = js.undefined
}

object HeightNumber {
  @scala.inline
  def apply(height: js.UndefOr[Double] = js.undefined): HeightNumber = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeightNumber]
  }
}

