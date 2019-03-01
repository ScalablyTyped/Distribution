package typings
package p2Lib.p2Mod.p2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PoolOptions extends js.Object {
  var size: js.UndefOr[scala.Double] = js.undefined
}

object PoolOptions {
  @scala.inline
  def apply(size: scala.Int | scala.Double = null): PoolOptions = {
    val __obj = js.Dynamic.literal()
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[PoolOptions]
  }
}

