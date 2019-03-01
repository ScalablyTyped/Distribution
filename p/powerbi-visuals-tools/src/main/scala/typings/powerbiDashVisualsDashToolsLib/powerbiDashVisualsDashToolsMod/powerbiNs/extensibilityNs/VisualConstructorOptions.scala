package typings
package powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs.extensibilityNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VisualConstructorOptions extends js.Object {
  /** The loaded module, if any, defined by the IVisualPlugin.module. */
  var module: js.UndefOr[js.Any] = js.undefined
}

object VisualConstructorOptions {
  @scala.inline
  def apply(module: js.Any = null): VisualConstructorOptions = {
    val __obj = js.Dynamic.literal()
    if (module != null) __obj.updateDynamic("module")(module)
    __obj.asInstanceOf[VisualConstructorOptions]
  }
}

