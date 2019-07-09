package typings
package pDashQueueLib.distOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options[QueueType /* <: pDashQueueLib.distQueueMod.Queue[QueueOptions] */, QueueOptions /* <: QueueAddOptions */] extends js.Object {
  /**
    Whether queue tasks within concurrency limit, are auto-executed as soon as they're added.
    @default true
    */
  val autoStart: js.UndefOr[scala.Boolean] = js.undefined
  /**
    Whether the task must finish in the given interval or will be carried over into the next interval count.
    @default false
    */
  val carryoverConcurrencyCount: js.UndefOr[scala.Boolean] = js.undefined
  /**
    Concurrency limit.
    Minimum: `1`.
    @default Infinity
    */
  val concurrency: js.UndefOr[scala.Double] = js.undefined
  /**
    The length of time in milliseconds before the interval count resets. Must be finite.
    Minimum: `0`.
    @default 0
    */
  val interval: js.UndefOr[scala.Double] = js.undefined
  /**
    The max number of runs in the given interval of time.
    Minimum: `1`.
    @default Infinity
    */
  val intervalCap: js.UndefOr[scala.Double] = js.undefined
  /**
    Class with a `enqueue` and `dequeue` method, and a `size` getter. See the [Custom QueueClass](https://github.com/sindresorhus/p-queue#custom-queueclass) section.
    */
  val queueClass: js.UndefOr[org.scalablytyped.runtime.Instantiable0[QueueType]] = js.undefined
  /**
    Whether or not a timeout is considered an exception.
    @default true
    */
  var throwOnTimeout: js.UndefOr[scala.Boolean] = js.undefined
  /**
    Per-operation timeout in milliseconds. Operations fulfill once `timeout` elapses if they haven't already.
    */
  var timeout: js.UndefOr[scala.Double] = js.undefined
}

object Options {
  @scala.inline
  def apply[QueueType /* <: pDashQueueLib.distQueueMod.Queue[QueueOptions] */, QueueOptions /* <: QueueAddOptions */](
    autoStart: js.UndefOr[scala.Boolean] = js.undefined,
    carryoverConcurrencyCount: js.UndefOr[scala.Boolean] = js.undefined,
    concurrency: scala.Int | scala.Double = null,
    interval: scala.Int | scala.Double = null,
    intervalCap: scala.Int | scala.Double = null,
    queueClass: org.scalablytyped.runtime.Instantiable0[QueueType] = null,
    throwOnTimeout: js.UndefOr[scala.Boolean] = js.undefined,
    timeout: scala.Int | scala.Double = null
  ): Options[QueueType, QueueOptions] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoStart)) __obj.updateDynamic("autoStart")(autoStart)
    if (!js.isUndefined(carryoverConcurrencyCount)) __obj.updateDynamic("carryoverConcurrencyCount")(carryoverConcurrencyCount)
    if (concurrency != null) __obj.updateDynamic("concurrency")(concurrency.asInstanceOf[js.Any])
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    if (intervalCap != null) __obj.updateDynamic("intervalCap")(intervalCap.asInstanceOf[js.Any])
    if (queueClass != null) __obj.updateDynamic("queueClass")(queueClass)
    if (!js.isUndefined(throwOnTimeout)) __obj.updateDynamic("throwOnTimeout")(throwOnTimeout)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options[QueueType, QueueOptions]]
  }
}

