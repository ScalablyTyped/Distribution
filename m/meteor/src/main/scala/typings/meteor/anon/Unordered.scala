package typings.meteor.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Unordered extends js.Object {
  var unordered: js.UndefOr[Boolean] = js.undefined
  var weak: js.UndefOr[Boolean] = js.undefined
}

object Unordered {
  @scala.inline
  def apply(unordered: js.UndefOr[Boolean] = js.undefined, weak: js.UndefOr[Boolean] = js.undefined): Unordered = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(unordered)) __obj.updateDynamic("unordered")(unordered.get.asInstanceOf[js.Any])
    if (!js.isUndefined(weak)) __obj.updateDynamic("weak")(weak.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Unordered]
  }
}

