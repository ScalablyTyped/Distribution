package typings
package powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScriptTypeDescriptor extends js.Object {
  val source: js.UndefOr[scala.Boolean] = js.undefined
}

object ScriptTypeDescriptor {
  @scala.inline
  def apply(source: js.UndefOr[scala.Boolean] = js.undefined): ScriptTypeDescriptor = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(source)) __obj.updateDynamic("source")(source)
    __obj.asInstanceOf[ScriptTypeDescriptor]
  }
}

