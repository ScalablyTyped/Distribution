package typings
package pDashQueueLib.pDashQueueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PQueue[O /* <: pDashQueueLib.pDashQueueMod.PQueueNs.QueueAddOptions */] extends js.Object {
  /**
       * Whether the queue is currently paused.
       */
  var isPaused: scala.Boolean = js.native
  /**
       * Number of pending promises.
       */
  var pending: scala.Double = js.native
  /**
       * Size of the queue.
       */
  var size: scala.Double = js.native
  /**
       * Returns the promise returned by calling fn.
       * @param fn Promise-returning/async function.
       */
  def add[T](fn: pDashQueueLib.pDashQueueMod.PQueueNs.Task[T]): js.Promise[T] = js.native
  /**
       * Returns the promise returned by calling fn.
       * @param fn Promise-returning/async function.
       */
  def add[T](fn: pDashQueueLib.pDashQueueMod.PQueueNs.Task[T], opts: O): js.Promise[T] = js.native
  /**
       * Same as .add(), but accepts an array of async functions and
       * returns a promise that resolves when all async functions are resolved.
       * @param fn Array of Promise-returning/async functions.
       */
  def addAll[TAll](fns: js.Array[pDashQueueLib.pDashQueueMod.PQueueNs.Task[TAll]]): js.Promise[js.Array[TAll]] = js.native
  /**
       * Same as .add(), but accepts an array of async functions and
       * returns a promise that resolves when all async functions are resolved.
       * @param fn Array of Promise-returning/async functions.
       */
  def addAll[TAll](fns: js.Array[pDashQueueLib.pDashQueueMod.PQueueNs.Task[TAll]], opts: O): js.Promise[js.Array[TAll]] = js.native
  /**
       * Clear the queue.
       */
  def clear(): scala.Unit = js.native
  /**
       * Returns a promise that settles when the queue becomes empty.
       * Can be called multiple times. Useful if you for example add
       * additional items at a later time.
       */
  def onEmpty(): js.Promise[scala.Unit] = js.native
  /**
       * Returns a promise that settles when the queue becomes empty, and all
       * promises have completed; queue.size === 0 && queue.pending === 0.
       * The difference with .onEmpty is that .onIdle guarantees that all work
       * from the queue has finished. .onEmpty merely signals that the queue is
       * empty, but it could mean that some promises haven't completed yet.
       */
  def onIdle(): js.Promise[scala.Unit] = js.native
  /**
       * Put queue execution on hold.
       */
  def pause(): scala.Unit = js.native
  /**
       * Start (or resume) executing enqueued tasks within concurrency limit.
       * No need to call this if queue is not paused (via options.autoStart = false
       * or by .pause() method.)
       */
  def start(): scala.Unit = js.native
}

