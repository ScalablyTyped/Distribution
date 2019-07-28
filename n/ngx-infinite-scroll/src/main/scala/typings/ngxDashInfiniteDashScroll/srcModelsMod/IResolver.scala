package typings.ngxDashInfiniteDashScroll.srcModelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IResolver extends js.Object {
  var axis: js.Any
  var container: ContainerRef
  var isWindow: Boolean
}

object IResolver {
  @scala.inline
  def apply(axis: js.Any, container: ContainerRef, isWindow: Boolean): IResolver = {
    val __obj = js.Dynamic.literal(axis = axis, container = container.asInstanceOf[js.Any], isWindow = isWindow)
  
    __obj.asInstanceOf[IResolver]
  }
}

