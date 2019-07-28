package typings.node.cryptoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScryptOptions extends js.Object {
  var N: js.UndefOr[Double] = js.undefined
  var maxmem: js.UndefOr[Double] = js.undefined
  var p: js.UndefOr[Double] = js.undefined
  var r: js.UndefOr[Double] = js.undefined
}

object ScryptOptions {
  @scala.inline
  def apply(
    N: Int | Double = null,
    maxmem: Int | Double = null,
    p: Int | Double = null,
    r: Int | Double = null
  ): ScryptOptions = {
    val __obj = js.Dynamic.literal()
    if (N != null) __obj.updateDynamic("N")(N.asInstanceOf[js.Any])
    if (maxmem != null) __obj.updateDynamic("maxmem")(maxmem.asInstanceOf[js.Any])
    if (p != null) __obj.updateDynamic("p")(p.asInstanceOf[js.Any])
    if (r != null) __obj.updateDynamic("r")(r.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScryptOptions]
  }
}

