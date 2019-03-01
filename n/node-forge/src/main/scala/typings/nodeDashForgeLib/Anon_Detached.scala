package typings
package nodeDashForgeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Detached extends js.Object {
  var detached: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_Detached {
  @scala.inline
  def apply(detached: js.UndefOr[scala.Boolean] = js.undefined): Anon_Detached = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(detached)) __obj.updateDynamic("detached")(detached)
    __obj.asInstanceOf[Anon_Detached]
  }
}

