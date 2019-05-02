package typings
package nanoLib.nanoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatabaseCreateParams extends js.Object {
  var n: js.UndefOr[scala.Double] = js.undefined
  var partitioned: js.UndefOr[scala.Boolean] = js.undefined
  var q: js.UndefOr[scala.Double] = js.undefined
}

object DatabaseCreateParams {
  @scala.inline
  def apply(
    n: scala.Int | scala.Double = null,
    partitioned: js.UndefOr[scala.Boolean] = js.undefined,
    q: scala.Int | scala.Double = null
  ): DatabaseCreateParams = {
    val __obj = js.Dynamic.literal()
    if (n != null) __obj.updateDynamic("n")(n.asInstanceOf[js.Any])
    if (!js.isUndefined(partitioned)) __obj.updateDynamic("partitioned")(partitioned)
    if (q != null) __obj.updateDynamic("q")(q.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatabaseCreateParams]
  }
}

