package typings.mongoose

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonJ extends js.Object {
  var j: js.UndefOr[Boolean] = js.undefined
  var w: js.UndefOr[Double | String] = js.undefined
  var wtimeout: js.UndefOr[Double] = js.undefined
}

object AnonJ {
  @scala.inline
  def apply(j: js.UndefOr[Boolean] = js.undefined, w: Double | String = null, wtimeout: Int | Double = null): AnonJ = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(j)) __obj.updateDynamic("j")(j.asInstanceOf[js.Any])
    if (w != null) __obj.updateDynamic("w")(w.asInstanceOf[js.Any])
    if (wtimeout != null) __obj.updateDynamic("wtimeout")(wtimeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonJ]
  }
}

