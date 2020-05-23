package typings.openjscad

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CAGExtrudeOptions extends js.Object {
  var offset: js.UndefOr[js.Array[Double]] = js.undefined
  var twistangle: js.UndefOr[Double] = js.undefined
  var twiststeps: js.UndefOr[Double] = js.undefined
}

object CAGExtrudeOptions {
  @scala.inline
  def apply(
    offset: js.Array[Double] = null,
    twistangle: js.UndefOr[Double] = js.undefined,
    twiststeps: js.UndefOr[Double] = js.undefined
  ): CAGExtrudeOptions = {
    val __obj = js.Dynamic.literal()
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (!js.isUndefined(twistangle)) __obj.updateDynamic("twistangle")(twistangle.get.asInstanceOf[js.Any])
    if (!js.isUndefined(twiststeps)) __obj.updateDynamic("twiststeps")(twiststeps.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CAGExtrudeOptions]
  }
}

