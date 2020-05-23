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
    N: js.UndefOr[Double] = js.undefined,
    maxmem: js.UndefOr[Double] = js.undefined,
    p: js.UndefOr[Double] = js.undefined,
    r: js.UndefOr[Double] = js.undefined
  ): ScryptOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(N)) __obj.updateDynamic("N")(N.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxmem)) __obj.updateDynamic("maxmem")(maxmem.get.asInstanceOf[js.Any])
    if (!js.isUndefined(p)) __obj.updateDynamic("p")(p.get.asInstanceOf[js.Any])
    if (!js.isUndefined(r)) __obj.updateDynamic("r")(r.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScryptOptions]
  }
}

