package typings.pQueue

import typings.eventemitter3.mod.^
import typings.pQueue.distOptionsMod.Options
import typings.pQueue.distOptionsMod.QueueAddOptions
import typings.pQueue.distOptionsMod.TaskOptions
import typings.pQueue.distQueueMod.Queue
import typings.pQueue.distQueueMod.RunFunction
import typings.std.Error
import typings.std.Partial
import typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("p-queue", JSImport.Default)
  @js.native
  open class default[QueueType /* <: Queue[RunFunction, EnqueueOptionsType] */, EnqueueOptionsType /* <: QueueAddOptions */] () extends PQueue[QueueType, EnqueueOptionsType] {
    def this(options: Options[QueueType, EnqueueOptionsType]) = this()
  }
  
  @JSImport("p-queue", "AbortError")
  @js.native
  open class AbortError ()
    extends StObject
       with Error {
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.pQueue.pQueueStrings.active
    - typings.pQueue.pQueueStrings.idle
    - typings.pQueue.pQueueStrings.empty
    - typings.pQueue.pQueueStrings.add
    - typings.pQueue.pQueueStrings.next
    - typings.pQueue.pQueueStrings.completed
    - typings.pQueue.pQueueStrings.error
  */
  trait EventName extends StObject
  object EventName {
    
    inline def active: typings.pQueue.pQueueStrings.active = "active".asInstanceOf[typings.pQueue.pQueueStrings.active]
    
    inline def add: typings.pQueue.pQueueStrings.add = "add".asInstanceOf[typings.pQueue.pQueueStrings.add]
    
    inline def completed: typings.pQueue.pQueueStrings.completed = "completed".asInstanceOf[typings.pQueue.pQueueStrings.completed]
    
    inline def empty: typings.pQueue.pQueueStrings.empty = "empty".asInstanceOf[typings.pQueue.pQueueStrings.empty]
    
    inline def error: typings.pQueue.pQueueStrings.error = "error".asInstanceOf[typings.pQueue.pQueueStrings.error]
    
    inline def idle: typings.pQueue.pQueueStrings.idle = "idle".asInstanceOf[typings.pQueue.pQueueStrings.idle]
    
    inline def next: typings.pQueue.pQueueStrings.next = "next".asInstanceOf[typings.pQueue.pQueueStrings.next]
  }
  
  @js.native
  trait PQueue[QueueType /* <: Queue[RunFunction, EnqueueOptionsType] */, EnqueueOptionsType /* <: QueueAddOptions */] extends ^[EventName, Any] {
    
    /**
      Adds a sync or async task to the queue. Always returns a promise.
      */
    def add[TaskResultType](fn: Task[TaskResultType]): js.Promise[TaskResultType] = js.native
    def add[TaskResultType](fn: Task[TaskResultType], options: Partial[EnqueueOptionsType]): js.Promise[TaskResultType] = js.native
    
    /**
      Same as `.add()`, but accepts an array of sync or async functions.
      @returns A promise that resolves when all functions are resolved.
      */
    def addAll[TaskResultsType](functions: js.Array[Task[TaskResultsType]]): js.Promise[js.Array[TaskResultsType]] = js.native
    def addAll[TaskResultsType](functions: js.Array[Task[TaskResultsType]], options: EnqueueOptionsType): js.Promise[js.Array[TaskResultsType]] = js.native
    
    /**
      Clear the queue.
      */
    def clear(): Unit = js.native
    
    def concurrency: Double = js.native
    def concurrency_=(newConcurrency: Double): Unit = js.native
    
    /**
      Whether the queue is currently paused.
      */
    def isPaused: Boolean = js.native
    
    /**
      Can be called multiple times. Useful if you for example add additional items at a later time.
      @returns A promise that settles when the queue becomes empty.
      */
    def onEmpty(): js.Promise[Unit] = js.native
    
    /**
      The difference with `.onEmpty` is that `.onIdle` guarantees that all work from the queue has finished. `.onEmpty` merely signals that the queue is empty, but it could mean that some promises haven't completed yet.
      @returns A promise that settles when the queue becomes empty, and all promises have completed; `queue.size === 0 && queue.pending === 0`.
      */
    def onIdle(): js.Promise[Unit] = js.native
    
    /**
      @returns A promise that settles when the queue size is less than the given limit: `queue.size < limit`.
      If you want to avoid having the queue grow beyond a certain size you can `await queue.onSizeLessThan()` before adding a new item.
      Note that this only limits the number of items waiting to start. There could still be up to `concurrency` jobs already running that this call does not include in its calculation.
      */
    def onSizeLessThan(limit: Double): js.Promise[Unit] = js.native
    
    /**
      Put queue execution on hold.
      */
    def pause(): Unit = js.native
    
    /**
      Number of running items (no longer in the queue).
      */
    def pending: Double = js.native
    
    /* private */ var `private`: Any = js.native
    
    /**
      Size of the queue, the number of queued items waiting to run.
      */
    def size: Double = js.native
    
    /**
      Size of the queue, filtered by the given options.
      For example, this can be used to find the number of items remaining in the queue with a specific priority level.
      */
    def sizeBy(options: Partial[EnqueueOptionsType]): Double = js.native
    
    /**
      Start (or resume) executing enqueued tasks within concurrency limit. No need to call this if queue is not paused (via `options.autoStart = false` or by `.pause()` method.)
      */
    def start(): this.type = js.native
    
    /**
      Per-operation timeout in milliseconds. Operations fulfill once `timeout` elapses if they haven't already.
      Applies to each future operation.
      */
    var timeout: js.UndefOr[Double] = js.native
  }
  
  type Task[TaskResultType] = js.Function1[/* options */ TaskOptions, PromiseLike[TaskResultType] | TaskResultType]
}
