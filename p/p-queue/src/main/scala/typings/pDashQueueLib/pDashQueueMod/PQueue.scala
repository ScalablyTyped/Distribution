package typings
package pDashQueueLib.pDashQueueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PQueue[QueueType /* <: pDashQueueLib.distQueueMod.Queue[EnqueueOptionsType] */, EnqueueOptionsType /* <: pDashQueueLib.distOptionsMod.QueueAddOptions */]
  extends eventemitter3Lib.eventemitter3Mod.^[pDashQueueLib.pDashQueueLibStrings.active] {
  val _carryoverConcurrencyCount: js.Any = js.native
  var _concurrency: js.Any = js.native
  val _doesConcurrentAllowAnother: js.Any = js.native
  val _doesIntervalAllowAnother: js.Any = js.native
  var _initializeIntervalIfNeeded: js.Any = js.native
  val _interval: js.Any = js.native
  val _intervalCap: js.Any = js.native
  var _intervalCount: js.Any = js.native
  var _intervalEnd: js.Any = js.native
  var _intervalId: js.UndefOr[js.Any] = js.native
  val _isIntervalIgnored: js.Any = js.native
  var _isIntervalPaused: js.Any = js.native
  var _isPaused: js.Any = js.native
  var _next: js.Any = js.native
  var _onInterval: js.Any = js.native
  var _onResumeInterval: js.Any = js.native
  var _pendingCount: js.Any = js.native
  /**
    Executes all queued functions until it reaches the limit.
    */
  var _processQueue: js.Any = js.native
  var _queue: js.Any = js.native
  val _queueClass: js.Any = js.native
  var _resolveEmpty: js.Any = js.native
  var _resolveIdle: js.Any = js.native
  var _resolvePromises: js.Any = js.native
  val _throwOnTimeout: js.Any = js.native
  var _timeout: js.UndefOr[js.Any] = js.native
  var _timeoutId: js.UndefOr[js.Any] = js.native
  var _tryToStartAnother: js.Any = js.native
  var concurrency: scala.Double = js.native
  /**
    Whether the queue is currently paused.
    */
  val isPaused: scala.Boolean = js.native
  /**
    Number of pending promises.
    */
  val pending: scala.Double = js.native
  /**
    Size of the queue.
    */
  val size: scala.Double = js.native
  /**
    Set the timeout for future operations.
    */
  var timeout: js.UndefOr[scala.Double] = js.native
  /**
    Adds a sync or async task to the queue. Always returns a promise.
    */
  def add[TaskResultType](fn: Task[TaskResultType]): js.Promise[TaskResultType] = js.native
  def add[TaskResultType](fn: Task[TaskResultType], options: stdLib.Partial[EnqueueOptionsType]): js.Promise[TaskResultType] = js.native
  /**
    Same as `.add()`, but accepts an array of sync or async functions.
    @returns A promise that resolves when all functions are resolved.
    */
  def addAll[TaskResultsType](functions: js.Array[Task[TaskResultsType]]): js.Promise[js.Array[TaskResultsType]] = js.native
  def addAll[TaskResultsType](functions: js.Array[Task[TaskResultsType]], options: EnqueueOptionsType): js.Promise[js.Array[TaskResultsType]] = js.native
  /**
    Clear the queue.
    */
  def clear(): scala.Unit = js.native
  /**
    Can be called multiple times. Useful if you for example add additional items at a later time.
    @returns A promise that settles when the queue becomes empty.
    */
  def onEmpty(): js.Promise[scala.Unit] = js.native
  /**
    The difference with `.onEmpty` is that `.onIdle` guarantees that all work from the queue has finished. `.onEmpty` merely signals that the queue is empty, but it could mean that some promises haven't completed yet.
    @returns A promise that settles when the queue becomes empty, and all promises have completed; `queue.size === 0 && queue.pending === 0`.
    */
  def onIdle(): js.Promise[scala.Unit] = js.native
  /**
    Put queue execution on hold.
    */
  def pause(): scala.Unit = js.native
  /**
    Start (or resume) executing enqueued tasks within concurrency limit. No need to call this if queue is not paused (via `options.autoStart = false` or by `.pause()` method.)
    */
  def start(): this.type = js.native
}

