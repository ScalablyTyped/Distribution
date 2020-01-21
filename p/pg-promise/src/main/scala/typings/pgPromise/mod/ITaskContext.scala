package typings.pgPromise.mod

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
    val __obj = js.Dynamic.literal(connected = connected.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], dc = dc.asInstanceOf[js.Any], inTransaction = inTransaction.asInstanceOf[js.Any], isTX = isTX.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any], useCount = useCount.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (finish != null) __obj.updateDynamic("finish")(finish.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (result != null) __obj.updateDynamic("result")(result.asInstanceOf[js.Any])
    if (!js.isUndefined(success)) __obj.updateDynamic("success")(success.asInstanceOf[js.Any])
    if (txLevel != null) __obj.updateDynamic("txLevel")(txLevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITaskContext]
  }
}

