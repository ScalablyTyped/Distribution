package typings.ngxInfiniteScroll.modelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IScrollRegisterConfig extends js.Object {
  var container: ContainerRef
  var throttle: Double
}

object IScrollRegisterConfig {
  @scala.inline
  def apply(container: ContainerRef, throttle: Double): IScrollRegisterConfig = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], throttle = throttle.asInstanceOf[js.Any])
    __obj.asInstanceOf[IScrollRegisterConfig]
  }
}

