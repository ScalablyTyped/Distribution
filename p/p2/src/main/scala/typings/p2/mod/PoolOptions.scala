package typings.p2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PoolOptions extends js.Object {
  var size: js.UndefOr[Double] = js.undefined
}

object PoolOptions {
  @scala.inline
  def apply(size: js.UndefOr[Double] = js.undefined): PoolOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(size)) __obj.updateDynamic("size")(size.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PoolOptions]
  }
}

