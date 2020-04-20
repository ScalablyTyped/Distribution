package typings.pathjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPathCore extends js.Object {
  var route: IPathRouteConstructor
}

object IPathCore {
  @scala.inline
  def apply(route: IPathRouteConstructor): IPathCore = {
    val __obj = js.Dynamic.literal(route = route.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPathCore]
  }
}

