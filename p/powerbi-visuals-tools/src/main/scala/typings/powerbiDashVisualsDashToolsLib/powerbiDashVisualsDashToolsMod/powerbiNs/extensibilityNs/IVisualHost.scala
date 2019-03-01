package typings
package powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs.extensibilityNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IVisualHost extends js.Object {
  var instanceId: java.lang.String
}

object IVisualHost {
  @scala.inline
  def apply(instanceId: java.lang.String): IVisualHost = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("instanceId")(instanceId)
    __obj.asInstanceOf[IVisualHost]
  }
}

