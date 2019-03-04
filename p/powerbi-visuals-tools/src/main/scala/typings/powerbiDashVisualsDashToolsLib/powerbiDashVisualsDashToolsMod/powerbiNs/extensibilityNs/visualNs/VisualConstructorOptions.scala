package typings
package powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs.extensibilityNs.visualNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VisualConstructorOptions
  extends powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs.extensibilityNs.VisualConstructorOptions {
  var element: stdLib.HTMLElement
  var host: IVisualHost
}

object VisualConstructorOptions {
  @scala.inline
  def apply(element: stdLib.HTMLElement, host: IVisualHost, module: js.Any = null): VisualConstructorOptions = {
    val __obj = js.Dynamic.literal(element = element, host = host)
    if (module != null) __obj.updateDynamic("module")(module)
    __obj.asInstanceOf[VisualConstructorOptions]
  }
}

