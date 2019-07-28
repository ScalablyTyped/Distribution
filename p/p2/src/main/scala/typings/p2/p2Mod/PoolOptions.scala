package typings.p2.p2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PoolOptions extends js.Object {
  var size: js.UndefOr[Double] = js.undefined
}

object PoolOptions {
  @scala.inline
  def apply(size: Int | Double = null): PoolOptions = {
    val __obj = js.Dynamic.literal()
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[PoolOptions]
  }
}

