package typings.nodeDashForge

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Detached extends js.Object {
  var detached: js.UndefOr[Boolean] = js.undefined
}

object Anon_Detached {
  @scala.inline
  def apply(detached: js.UndefOr[Boolean] = js.undefined): Anon_Detached = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(detached)) __obj.updateDynamic("detached")(detached.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Detached]
  }
}

