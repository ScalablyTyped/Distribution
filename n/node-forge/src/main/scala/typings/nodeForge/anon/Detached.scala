package typings.nodeForge.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Detached extends js.Object {
  var detached: js.UndefOr[Boolean] = js.undefined
}

object Detached {
  @scala.inline
  def apply(detached: js.UndefOr[Boolean] = js.undefined): Detached = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(detached)) __obj.updateDynamic("detached")(detached.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Detached]
  }
}

