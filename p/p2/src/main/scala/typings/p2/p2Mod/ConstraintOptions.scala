package typings.p2.p2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConstraintOptions extends js.Object {
  var collideConnected: js.UndefOr[Boolean] = js.undefined
  var wakeUpBodies: js.UndefOr[Boolean] = js.undefined
}

object ConstraintOptions {
  @scala.inline
  def apply(
    collideConnected: js.UndefOr[Boolean] = js.undefined,
    wakeUpBodies: js.UndefOr[Boolean] = js.undefined
  ): ConstraintOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(collideConnected)) __obj.updateDynamic("collideConnected")(collideConnected)
    if (!js.isUndefined(wakeUpBodies)) __obj.updateDynamic("wakeUpBodies")(wakeUpBodies)
    __obj.asInstanceOf[ConstraintOptions]
  }
}

