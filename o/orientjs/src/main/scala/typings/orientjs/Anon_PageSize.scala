package typings.orientjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_PageSize extends js.Object {
  var pageSize: js.UndefOr[Double] = js.undefined
  var params: js.UndefOr[js.Any] = js.undefined
}

object Anon_PageSize {
  @scala.inline
  def apply(pageSize: Int | Double = null, params: js.Any = null): Anon_PageSize = {
    val __obj = js.Dynamic.literal()
    if (pageSize != null) __obj.updateDynamic("pageSize")(pageSize.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params)
    __obj.asInstanceOf[Anon_PageSize]
  }
}

