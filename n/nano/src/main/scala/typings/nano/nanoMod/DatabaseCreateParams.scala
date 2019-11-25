package typings.nano.nanoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatabaseCreateParams extends js.Object {
  var n: js.UndefOr[Double] = js.undefined
  var partitioned: js.UndefOr[Boolean] = js.undefined
  var q: js.UndefOr[Double] = js.undefined
}

object DatabaseCreateParams {
  @scala.inline
  def apply(n: Int | Double = null, partitioned: js.UndefOr[Boolean] = js.undefined, q: Int | Double = null): DatabaseCreateParams = {
    val __obj = js.Dynamic.literal()
    if (n != null) __obj.updateDynamic("n")(n.asInstanceOf[js.Any])
    if (!js.isUndefined(partitioned)) __obj.updateDynamic("partitioned")(partitioned.asInstanceOf[js.Any])
    if (q != null) __obj.updateDynamic("q")(q.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatabaseCreateParams]
  }
}

