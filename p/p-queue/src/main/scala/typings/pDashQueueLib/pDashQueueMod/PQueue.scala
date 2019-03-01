package typings
package pDashQueueLib.pDashQueueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Promise queue with concurrency control.
  */
@js.native
trait PQueue[TEnqueueOptions /* <: pDashQueueLib.pDashQueueMod.PQueueNs.QueueAddOptions */]
  extends nodeLib.eventsMod.EventEmitter {
  /**
    * Whether the queue is currently paused.
    */
  val isPaused: scala.Boolean = js.native
  /**
    * Number of pending promises.
    */
  val pending: scala.Double = js.native
  /**
    * Size of the queue.
    */
  val size: scala.Double = js.native
  /**
    * Adds a sync or async task to the queue. Always returns a promise.
    * @param fn Promise-returning/async function.
    * @param opts
    */
  def add[T](fn: pDashQueueLib.pDashQueueMod.PQueueNs.Task[T]): js.Promise[T] = js.native
  def add[T](fn: pDashQueueLib.pDashQueueMod.PQueueNs.Task[T], opts: TEnqueueOptions): js.Promise[T] = js.native
  /**
    * Same as `.add()`, but accepts an array of sync or async functions
    * and returns a promise that resolves when all functions are resolved.
    * @param fn Array of Promise-returning/async functions.
    */
  def addAll[TAll](fns: js.Array[pDashQueueLib.pDashQueueMod.PQueueNs.Task[TAll]]): js.Promise[js.Array[TAll]] = js.native
  def addAll[TAll](fns: js.Array[pDashQueueLib.pDashQueueMod.PQueueNs.Task[TAll]], opts: TEnqueueOptions): js.Promise[js.Array[TAll]] = js.native
  @JSName("addListener")
  def addListener_active(event: pDashQueueLib.pDashQueueLibStrings.active, listener: js.Function0[scala.Unit]): this.type = js.native
  /**
    * Clear the queue.
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
    * Returns a promise that settles when the queue becomes empty.
    *
    * Can be called multiple times. Useful if you for example add
    * additional items at a later time.
    */
  def onEmpty(): js.Promise[scala.Unit] = js.native
  /**
    * Returns a promise that settles when the queue becomes empty, and all
    * promises have completed; `queue.size === 0 && queue.pending === 0`.
    *
    * The difference with `.onEmpty` is that `.onIdle` guarantees that all work
    * from the queue has finished. `.onEmpty` merely signals that the queue is
    * empty, but it could mean that some promises haven't completed yet.
    */
  def onIdle(): js.Promise[scala.Unit] = js.native
  @JSName("on")
  def on_active(event: pDashQueueLib.pDashQueueLibStrings.active, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("once")
  def once_active(event: pDashQueueLib.pDashQueueLibStrings.active, listener: js.Function0[scala.Unit]): this.type = js.native
  /**
    * Put queue execution on hold.
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
    * Start (or resume) executing enqueued tasks within concurrency limit.
    * No need to call this if queue is not paused
    * (via `options.autoStart = false` or by `.pause()` method.)
    */
  def start(): scala.Unit = js.native
}

