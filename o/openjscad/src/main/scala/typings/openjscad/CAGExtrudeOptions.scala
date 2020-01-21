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
  def apply(offset: js.Array[Double] = null, twistangle: Int | Double = null, twiststeps: Int | Double = null): CAGExtrudeOptions = {
    val __obj = js.Dynamic.literal()
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (twistangle != null) __obj.updateDynamic("twistangle")(twistangle.asInstanceOf[js.Any])
    if (twiststeps != null) __obj.updateDynamic("twiststeps")(twiststeps.asInstanceOf[js.Any])
    __obj.asInstanceOf[CAGExtrudeOptions]
  }
}

