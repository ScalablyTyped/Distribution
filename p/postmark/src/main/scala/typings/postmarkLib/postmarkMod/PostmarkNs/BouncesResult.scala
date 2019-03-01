package typings
package postmarkLib.postmarkMod.PostmarkNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BouncesResult extends PaginatedResult {
  var Bounces: js.Array[Bounce]
}

object BouncesResult {
  @scala.inline
  def apply(Bounces: js.Array[Bounce], TotalCount: scala.Double): BouncesResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Bounces")(Bounces)
    __obj.updateDynamic("TotalCount")(TotalCount)
    __obj.asInstanceOf[BouncesResult]
  }
}

