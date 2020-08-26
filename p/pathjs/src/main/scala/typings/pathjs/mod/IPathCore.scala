package typings.pathjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPathCore extends js.Object {
  var route: IPathRouteConstructor = js.native
}

object IPathCore {
  @scala.inline
  def apply(route: IPathRouteConstructor): IPathCore = {
    val __obj = js.Dynamic.literal(route = route.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPathCore]
  }
  @scala.inline
  implicit class IPathCoreOps[Self <: IPathCore] (val x: Self) extends AnyVal {
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
    def setRoute(value: IPathRouteConstructor): Self = this.set("route", value.asInstanceOf[js.Any])
  }
  
}

