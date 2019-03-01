package typings
package ngxDashInfiniteDashScrollLib.srcModelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IResolver extends js.Object {
  var axis: js.Any
  var container: ContainerRef
  var isWindow: scala.Boolean
}

object IResolver {
  @scala.inline
  def apply(axis: js.Any, container: ContainerRef, isWindow: scala.Boolean): IResolver = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("axis")(axis)
    __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    __obj.updateDynamic("isWindow")(isWindow)
    __obj.asInstanceOf[IResolver]
  }
}

