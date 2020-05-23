package typings.mongoose.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait J extends js.Object {
  var j: js.UndefOr[Boolean] = js.undefined
  var w: js.UndefOr[Double | String] = js.undefined
  var wtimeout: js.UndefOr[Double] = js.undefined
}

object J {
  @scala.inline
  def apply(
    j: js.UndefOr[Boolean] = js.undefined,
    w: Double | String = null,
    wtimeout: js.UndefOr[Double] = js.undefined
  ): J = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(j)) __obj.updateDynamic("j")(j.get.asInstanceOf[js.Any])
    if (w != null) __obj.updateDynamic("w")(w.asInstanceOf[js.Any])
    if (!js.isUndefined(wtimeout)) __obj.updateDynamic("wtimeout")(wtimeout.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[J]
  }
}

