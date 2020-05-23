package typings.nano.mod

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
  def apply(
    n: js.UndefOr[Double] = js.undefined,
    partitioned: js.UndefOr[Boolean] = js.undefined,
    q: js.UndefOr[Double] = js.undefined
  ): DatabaseCreateParams = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(n)) __obj.updateDynamic("n")(n.get.asInstanceOf[js.Any])
    if (!js.isUndefined(partitioned)) __obj.updateDynamic("partitioned")(partitioned.get.asInstanceOf[js.Any])
    if (!js.isUndefined(q)) __obj.updateDynamic("q")(q.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatabaseCreateParams]
  }
}

