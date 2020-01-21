package typings.orientjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPageSize extends js.Object {
  var pageSize: js.UndefOr[Double] = js.undefined
  var params: js.UndefOr[js.Any] = js.undefined
}

object AnonPageSize {
  @scala.inline
  def apply(pageSize: Int | Double = null, params: js.Any = null): AnonPageSize = {
    val __obj = js.Dynamic.literal()
    if (pageSize != null) __obj.updateDynamic("pageSize")(pageSize.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPageSize]
  }
}

