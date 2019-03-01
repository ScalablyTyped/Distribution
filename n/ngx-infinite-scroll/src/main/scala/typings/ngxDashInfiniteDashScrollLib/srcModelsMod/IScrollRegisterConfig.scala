package typings
package ngxDashInfiniteDashScrollLib.srcModelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IScrollRegisterConfig extends js.Object {
  var container: ContainerRef
  var throttle: scala.Double
}

object IScrollRegisterConfig {
  @scala.inline
  def apply(container: ContainerRef, throttle: scala.Double): IScrollRegisterConfig = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    __obj.updateDynamic("throttle")(throttle)
    __obj.asInstanceOf[IScrollRegisterConfig]
  }
}

