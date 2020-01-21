package typings.node

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBuffered extends js.Object {
  var buffered: js.UndefOr[Boolean] = js.undefined
  var entryTypes: js.Array[java.lang.String]
}

object AnonBuffered {
  @scala.inline
  def apply(entryTypes: js.Array[java.lang.String], buffered: js.UndefOr[Boolean] = js.undefined): AnonBuffered = {
    val __obj = js.Dynamic.literal(entryTypes = entryTypes.asInstanceOf[js.Any])
    if (!js.isUndefined(buffered)) __obj.updateDynamic("buffered")(buffered.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBuffered]
  }
}

