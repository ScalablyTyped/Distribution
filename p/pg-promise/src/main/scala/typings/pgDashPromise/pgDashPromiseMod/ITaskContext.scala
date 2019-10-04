package typings.pgDashPromise.pgDashPromiseMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Event context extension for tasks + transactions;
// See: http://vitaly-t.github.io/pg-promise/global.html#TaskContext
trait ITaskContext extends js.Object {
  val connected: Boolean
  // these are set in the beginning of each task/transaction:
  val context: js.Any
  val dc: js.Any
  val duration: js.UndefOr[Double] = js.undefined
  // these are set at the end of each task/transaction:
  val finish: js.UndefOr[Date] = js.undefined
  val inTransaction: Boolean
  val isTX: Boolean
  val level: Double
  val parent: ITaskContext | Null
  val result: js.UndefOr[js.Any] = js.undefined
  val start: Date
  val success: js.UndefOr[Boolean] = js.undefined
  val tag: js.Any
  // this exists only inside transactions (isTX = true):
  val txLevel: js.UndefOr[Double] = js.undefined
  val useCount: Double
}

object ITaskContext {
  @scala.inline
  def apply(
    connected: Boolean,
    context: js.Any,
    dc: js.Any,
    inTransaction: Boolean,
    isTX: Boolean,
    level: Double,
    start: Date,
    tag: js.Any,
    useCount: Double,
    duration: Int | Double = null,
    finish: Date = null,
    parent: ITaskContext = null,
    result: js.Any = null,
    success: js.UndefOr[Boolean] = js.undefined,
    txLevel: Int | Double = null
  ): ITaskContext = {
    val __obj = js.Dynamic.literal(connected = connected, context = context, dc = dc, inTransaction = inTransaction, isTX = isTX, level = level, start = start, tag = tag, useCount = useCount)
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (finish != null) __obj.updateDynamic("finish")(finish)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    if (result != null) __obj.updateDynamic("result")(result)
    if (!js.isUndefined(success)) __obj.updateDynamic("success")(success)
    if (txLevel != null) __obj.updateDynamic("txLevel")(txLevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITaskContext]
  }
}

