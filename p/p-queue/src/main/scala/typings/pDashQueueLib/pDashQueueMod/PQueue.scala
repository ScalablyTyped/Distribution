package typings
package pDashQueueLib.pDashQueueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
Promise queue with concurrency control.
*/
@js.native
trait PQueue[EnqueueOptionsType /* <: QueueAddOptions */]
  extends nodeLib.eventsMod.EventEmitter {
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
  	Adds a sync or async task to the queue. Always returns a promise.
  	@param fn - Promise-returning/async function.
  	*/
  def add[TaskResultType](fn: Task[TaskResultType]): js.Promise[TaskResultType] = js.native
  def add[TaskResultType](fn: Task[TaskResultType], options: EnqueueOptionsType): js.Promise[TaskResultType] = js.native
  /**
  	Same as `.add()`, but accepts an array of sync or async functions.
  	@param fn - Array of Promise-returning/async functions.
  	@returns A promise that resolves when all functions are resolved.
  	*/
  def addAll[TaskResultsType](fns: js.Array[Task[TaskResultsType]]): js.Promise[js.Array[TaskResultsType]] = js.native
  def addAll[TaskResultsType](fns: js.Array[Task[TaskResultsType]], options: EnqueueOptionsType): js.Promise[js.Array[TaskResultsType]] = js.native
  @JSName("addListener")
  def addListener_active(event: pDashQueueLib.pDashQueueLibStrings.active, listener: js.Function0[scala.Unit]): this.type = js.native
  /**
  	Clear the queue.
  	*/
  def clear(): scala.Unit = js.native
  @JSName("emit")
  def emit_active(event: pDashQueueLib.pDashQueueLibStrings.active): scala.Boolean = js.native
  @JSName("listenerCount")
  def listenerCount_active(`type`: pDashQueueLib.pDashQueueLibStrings.active): scala.Double = js.native
  @JSName("listeners")
  def listeners_active(event: pDashQueueLib.pDashQueueLibStrings.active): js.Array[js.Function0[scala.Unit]] = js.native
  @JSName("off")
  def off_active(event: pDashQueueLib.pDashQueueLibStrings.active, listener: js.Function0[scala.Unit]): this.type = js.native
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
  @JSName("on")
  def on_active(event: pDashQueueLib.pDashQueueLibStrings.active, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("once")
  def once_active(event: pDashQueueLib.pDashQueueLibStrings.active, listener: js.Function0[scala.Unit]): this.type = js.native
  /**
  	Put queue execution on hold.
  	*/
  def pause(): scala.Unit = js.native
  @JSName("prependListener")
  def prependListener_active(event: pDashQueueLib.pDashQueueLibStrings.active, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_active(event: pDashQueueLib.pDashQueueLibStrings.active, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("rawListeners")
  def rawListeners_active(event: pDashQueueLib.pDashQueueLibStrings.active): js.Array[js.Function0[scala.Unit]] = js.native
  @JSName("removeAllListeners")
  def removeAllListeners_active(event: pDashQueueLib.pDashQueueLibStrings.active): this.type = js.native
  @JSName("removeListener")
  def removeListener_active(event: pDashQueueLib.pDashQueueLibStrings.active, listener: js.Function0[scala.Unit]): this.type = js.native
  /**
  	Start (or resume) executing enqueued tasks within concurrency limit. No need to call this if queue is not paused (via `options.autoStart = false` or by `.pause()` method.)
  	*/
  def start(): scala.Unit = js.native
}

