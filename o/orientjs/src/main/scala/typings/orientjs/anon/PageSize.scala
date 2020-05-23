package typings.orientjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PageSize extends js.Object {
  var pageSize: js.UndefOr[Double] = js.undefined
  var params: js.UndefOr[js.Any] = js.undefined
}

object PageSize {
  @scala.inline
  def apply(pageSize: js.UndefOr[Double] = js.undefined, params: js.Any = null): PageSize = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(pageSize)) __obj.updateDynamic("pageSize")(pageSize.get.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageSize]
  }
}

