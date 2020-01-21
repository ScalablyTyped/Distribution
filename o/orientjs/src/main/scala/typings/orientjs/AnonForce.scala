package typings.orientjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonForce extends js.Object {
  var force: js.UndefOr[Boolean] = js.undefined
  var ifexist: js.UndefOr[Boolean] = js.undefined
}

object AnonForce {
  @scala.inline
  def apply(force: js.UndefOr[Boolean] = js.undefined, ifexist: js.UndefOr[Boolean] = js.undefined): AnonForce = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(force)) __obj.updateDynamic("force")(force.asInstanceOf[js.Any])
    if (!js.isUndefined(ifexist)) __obj.updateDynamic("ifexist")(ifexist.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonForce]
  }
}

