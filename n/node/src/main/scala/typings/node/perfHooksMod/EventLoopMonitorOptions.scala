package typings.node.perfHooksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventLoopMonitorOptions extends js.Object {
  /**
    * The sampling rate in milliseconds.
    * Must be greater than zero.
    * @default 10
    */
  var resolution: js.UndefOr[Double] = js.undefined
}

object EventLoopMonitorOptions {
  @scala.inline
  def apply(resolution: Int | Double = null): EventLoopMonitorOptions = {
    val __obj = js.Dynamic.literal()
    if (resolution != null) __obj.updateDynamic("resolution")(resolution.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventLoopMonitorOptions]
  }
}

