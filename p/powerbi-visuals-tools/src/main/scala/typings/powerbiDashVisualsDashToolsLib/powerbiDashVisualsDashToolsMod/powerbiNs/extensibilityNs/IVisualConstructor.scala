package typings
package powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs.extensibilityNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IVisualConstructor extends js.Object {
  var `__transform__`: js.UndefOr[IVisualDataViewTransform] = js.undefined
}

object IVisualConstructor {
  @scala.inline
  def apply(`__transform__`: IVisualDataViewTransform = null): IVisualConstructor = {
    val __obj = js.Dynamic.literal()
    if (`__transform__` != null) __obj.updateDynamic("__transform__")(`__transform__`)
    __obj.asInstanceOf[IVisualConstructor]
  }
}

