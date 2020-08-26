package typings.ngxInfiniteScroll.modelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IScrollRegisterConfig extends js.Object {
  var container: ContainerRef = js.native
  var throttle: Double = js.native
}

object IScrollRegisterConfig {
  @scala.inline
  def apply(container: ContainerRef, throttle: Double): IScrollRegisterConfig = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], throttle = throttle.asInstanceOf[js.Any])
    __obj.asInstanceOf[IScrollRegisterConfig]
  }
  @scala.inline
  implicit class IScrollRegisterConfigOps[Self <: IScrollRegisterConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setContainer(value: ContainerRef): Self = this.set("container", value.asInstanceOf[js.Any])
    @scala.inline
    def setThrottle(value: Double): Self = this.set("throttle", value.asInstanceOf[js.Any])
  }
  
}

