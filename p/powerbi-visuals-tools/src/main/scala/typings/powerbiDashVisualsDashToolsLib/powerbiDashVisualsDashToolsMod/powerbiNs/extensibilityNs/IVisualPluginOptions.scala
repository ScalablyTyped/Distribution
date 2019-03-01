package typings
package powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs.extensibilityNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IVisualPluginOptions extends js.Object {
  var transform: js.UndefOr[IVisualDataViewTransform] = js.undefined
}

object IVisualPluginOptions {
  @scala.inline
  def apply(transform: IVisualDataViewTransform = null): IVisualPluginOptions = {
    val __obj = js.Dynamic.literal()
    if (transform != null) __obj.updateDynamic("transform")(transform)
    __obj.asInstanceOf[IVisualPluginOptions]
  }
}

