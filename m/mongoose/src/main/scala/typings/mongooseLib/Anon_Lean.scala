package typings
package mongooseLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Lean extends js.Object {
  /** return the raw object instead of the Mongoose Model */
  var lean: js.UndefOr[scala.Boolean] = js.undefined
  /** The maximum number of results to return */
  var limit: js.UndefOr[scala.Double] = js.undefined
  /** the maximum distance from the point near that a result can be */
  var maxDistance: scala.Double
  /** x,y point to search for */
  var near: js.Array[scala.Double]
}

object Anon_Lean {
  @scala.inline
  def apply(
    maxDistance: scala.Double,
    near: js.Array[scala.Double],
    lean: js.UndefOr[scala.Boolean] = js.undefined,
    limit: scala.Int | scala.Double = null
  ): Anon_Lean = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("maxDistance")(maxDistance)
    __obj.updateDynamic("near")(near)
    if (!js.isUndefined(lean)) __obj.updateDynamic("lean")(lean)
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Lean]
  }
}

