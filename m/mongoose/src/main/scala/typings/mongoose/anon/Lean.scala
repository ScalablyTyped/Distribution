package typings.mongoose.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Lean extends js.Object {
  /** return the raw object instead of the Mongoose Model */
  var lean: js.UndefOr[Boolean] = js.undefined
  /** The maximum number of results to return */
  var limit: js.UndefOr[Double] = js.undefined
  /** the maximum distance from the point near that a result can be */
  var maxDistance: Double
  /** x,y point to search for */
  var near: js.Array[Double]
}

object Lean {
  @scala.inline
  def apply(
    maxDistance: Double,
    near: js.Array[Double],
    lean: js.UndefOr[Boolean] = js.undefined,
    limit: js.UndefOr[Double] = js.undefined
  ): Lean = {
    val __obj = js.Dynamic.literal(maxDistance = maxDistance.asInstanceOf[js.Any], near = near.asInstanceOf[js.Any])
    if (!js.isUndefined(lean)) __obj.updateDynamic("lean")(lean.get.asInstanceOf[js.Any])
    if (!js.isUndefined(limit)) __obj.updateDynamic("limit")(limit.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Lean]
  }
}

