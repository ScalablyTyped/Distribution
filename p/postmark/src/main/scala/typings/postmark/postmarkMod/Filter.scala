package typings.postmark.postmarkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Filter extends js.Object {
  var count: js.UndefOr[Double] = js.undefined
  var offset: js.UndefOr[Double] = js.undefined
}

object Filter {
  @scala.inline
  def apply(count: Int | Double = null, offset: Int | Double = null): Filter = {
    val __obj = js.Dynamic.literal()
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[Filter]
  }
}

