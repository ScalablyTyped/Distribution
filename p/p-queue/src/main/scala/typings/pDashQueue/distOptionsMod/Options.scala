package typings.pDashQueue.distOptionsMod

import org.scalablytyped.runtime.Instantiable0
import typings.pDashQueue.distQueueMod.Queue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options[QueueType /* <: Queue[QueueOptions] */, QueueOptions /* <: QueueAddOptions */] extends js.Object {
  /**
    Whether queue tasks within concurrency limit, are auto-executed as soon as they're added.
    @default true
    */
  val autoStart: js.UndefOr[Boolean] = js.undefined
  /**
    Whether the task must finish in the given interval or will be carried over into the next interval count.
    @default false
    */
  val carryoverConcurrencyCount: js.UndefOr[Boolean] = js.undefined
  /**
    Concurrency limit.
    Minimum: `1`.
    @default Infinity
    */
  val concurrency: js.UndefOr[Double] = js.undefined
  /**
    The length of time in milliseconds before the interval count resets. Must be finite.
    Minimum: `0`.
    @default 0
    */
  val interval: js.UndefOr[Double] = js.undefined
  /**
    The max number of runs in the given interval of time.
    Minimum: `1`.
    @default Infinity
    */
  val intervalCap: js.UndefOr[Double] = js.undefined
  /**
    Class with a `enqueue` and `dequeue` method, and a `size` getter. See the [Custom QueueClass](https://github.com/sindresorhus/p-queue#custom-queueclass) section.
    */
  val queueClass: js.UndefOr[Instantiable0[QueueType]] = js.undefined
  /**
    Whether or not a timeout is considered an exception.
    @default false
    */
  var throwOnTimeout: js.UndefOr[Boolean] = js.undefined
  /**
    Per-operation timeout in milliseconds. Operations fulfill once `timeout` elapses if they haven't already.
    */
  var timeout: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply[QueueType /* <: Queue[QueueOptions] */, QueueOptions /* <: QueueAddOptions */](
    autoStart: js.UndefOr[Boolean] = js.undefined,
    carryoverConcurrencyCount: js.UndefOr[Boolean] = js.undefined,
    concurrency: Int | Double = null,
    interval: Int | Double = null,
    intervalCap: Int | Double = null,
    queueClass: Instantiable0[QueueType] = null,
    throwOnTimeout: js.UndefOr[Boolean] = js.undefined,
    timeout: Int | Double = null
  ): Options[QueueType, QueueOptions] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoStart)) __obj.updateDynamic("autoStart")(autoStart.asInstanceOf[js.Any])
    if (!js.isUndefined(carryoverConcurrencyCount)) __obj.updateDynamic("carryoverConcurrencyCount")(carryoverConcurrencyCount.asInstanceOf[js.Any])
    if (concurrency != null) __obj.updateDynamic("concurrency")(concurrency.asInstanceOf[js.Any])
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    if (intervalCap != null) __obj.updateDynamic("intervalCap")(intervalCap.asInstanceOf[js.Any])
    if (queueClass != null) __obj.updateDynamic("queueClass")(queueClass.asInstanceOf[js.Any])
    if (!js.isUndefined(throwOnTimeout)) __obj.updateDynamic("throwOnTimeout")(throwOnTimeout.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options[QueueType, QueueOptions]]
  }
}

