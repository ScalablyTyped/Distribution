package typings.numbro

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBillion extends js.Object {
  var billion: String
  var million: String
  var spaced: js.UndefOr[Boolean] = js.undefined
  var thousand: String
  var trillion: String
}

object AnonBillion {
  @scala.inline
  def apply(
    billion: String,
    million: String,
    thousand: String,
    trillion: String,
    spaced: js.UndefOr[Boolean] = js.undefined
  ): AnonBillion = {
    val __obj = js.Dynamic.literal(billion = billion.asInstanceOf[js.Any], million = million.asInstanceOf[js.Any], thousand = thousand.asInstanceOf[js.Any], trillion = trillion.asInstanceOf[js.Any])
    if (!js.isUndefined(spaced)) __obj.updateDynamic("spaced")(spaced.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBillion]
  }
}

