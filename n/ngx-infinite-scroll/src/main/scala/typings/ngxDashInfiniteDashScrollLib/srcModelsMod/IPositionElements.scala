package typings
package ngxDashInfiniteDashScrollLib.srcModelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPositionElements extends js.Object {
  var axis: js.Any
  var windowElement: ContainerRef
}

object IPositionElements {
  @scala.inline
  def apply(axis: js.Any, windowElement: ContainerRef): IPositionElements = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("axis")(axis)
    __obj.updateDynamic("windowElement")(windowElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPositionElements]
  }
}

