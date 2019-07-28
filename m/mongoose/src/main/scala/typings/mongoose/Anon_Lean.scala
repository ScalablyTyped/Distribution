package typings.mongoose

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Lean extends js.Object {
  /** return the raw object instead of the Mongoose Model */
  var lean: js.UndefOr[Boolean] = js.undefined
  /** The maximum number of results to return */
  var limit: js.UndefOr[Double] = js.undefined
  /** the maximum distance from the point near that a result can be */
  var maxDistance: Double
  /** x,y point to search for */
  var near: js.Array[Double]
}

object Anon_Lean {
  @scala.inline
  def apply(
    maxDistance: Double,
    near: js.Array[Double],
    lean: js.UndefOr[Boolean] = js.undefined,
    limit: Int | Double = null
  ): Anon_Lean = {
    val __obj = js.Dynamic.literal(maxDistance = maxDistance, near = near)
    if (!js.isUndefined(lean)) __obj.updateDynamic("lean")(lean)
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Lean]
  }
}

