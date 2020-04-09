package typings.node.vmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MeasureMemoryOptions extends js.Object {
  var context: js.UndefOr[Context] = js.undefined
  /**
    * @default 'summary'
    */
  var mode: js.UndefOr[MeasureMemoryMode] = js.undefined
}

object MeasureMemoryOptions {
  @scala.inline
  def apply(context: Context = null, mode: MeasureMemoryMode = null): MeasureMemoryOptions = {
    val __obj = js.Dynamic.literal()
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[MeasureMemoryOptions]
  }
}

