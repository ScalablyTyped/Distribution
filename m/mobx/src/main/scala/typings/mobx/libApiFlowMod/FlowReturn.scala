package typings.mobx.libApiFlowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlowReturn[T] extends js.Object {
  var `!!flowReturn`: T
}

object FlowReturn {
  @scala.inline
  def apply[T](`!!flowReturn`: T): FlowReturn[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("!!flowReturn")(`!!flowReturn`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowReturn[T]]
  }
}

