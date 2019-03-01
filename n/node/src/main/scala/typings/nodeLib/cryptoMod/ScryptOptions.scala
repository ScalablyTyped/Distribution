package typings
package nodeLib.cryptoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScryptOptions extends js.Object {
  var N: js.UndefOr[scala.Double] = js.undefined
  var maxmem: js.UndefOr[scala.Double] = js.undefined
  var p: js.UndefOr[scala.Double] = js.undefined
  var r: js.UndefOr[scala.Double] = js.undefined
}

object ScryptOptions {
  @scala.inline
  def apply(
    N: scala.Int | scala.Double = null,
    maxmem: scala.Int | scala.Double = null,
    p: scala.Int | scala.Double = null,
    r: scala.Int | scala.Double = null
  ): ScryptOptions = {
    val __obj = js.Dynamic.literal()
    if (N != null) __obj.updateDynamic("N")(N.asInstanceOf[js.Any])
    if (maxmem != null) __obj.updateDynamic("maxmem")(maxmem.asInstanceOf[js.Any])
    if (p != null) __obj.updateDynamic("p")(p.asInstanceOf[js.Any])
    if (r != null) __obj.updateDynamic("r")(r.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScryptOptions]
  }
}

