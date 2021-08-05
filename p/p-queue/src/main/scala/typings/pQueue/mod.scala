package typings.pQueue

import typings.eventemitter3.mod.^
import typings.pQueue.optionsMod.Options
import typings.pQueue.optionsMod.QueueAddOptions
import typings.pQueue.pQueueStrings.active
import typings.pQueue.pQueueStrings.add
import typings.pQueue.pQueueStrings.idle
import typings.pQueue.pQueueStrings.next
import typings.pQueue.queueMod.Queue
import typings.pQueue.queueMod.RunFunction
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("p-queue", JSImport.Default)
  @js.native
  class default[QueueType /* <: Queue[RunFunction, EnqueueOptionsType] */, EnqueueOptionsType /* <: QueueAddOptions */] () extends PQueue[QueueType, EnqueueOptionsType] {
    def this(options: Options[QueueType, EnqueueOptionsType]) = this()
  }
  
  @js.native
  trait PQueue[QueueType /* <: Queue[RunFunction, EnqueueOptionsType] */, EnqueueOptionsType /* <: QueueAddOptions */]
    extends ^[active | idle | add | next, js.Any] {
    
    /* private */ val _carryoverConcurrencyCount: js.Any = js.native
    
    /* private */ var _concurrency: js.Any = js.native
    
    /* private */ def _doesConcurrentAllowAnother: js.Any = js.native
    
    /* private */ def _doesIntervalAllowAnother: js.Any = js.native
    
    /* private */ var _initializeIntervalIfNeeded: js.Any = js.native
    
    /* private */ val _interval: js.Any = js.native
    
    /* private */ val _intervalCap: js.Any = js.native
    
    /* private */ var _intervalCount: js.Any = js.native
    
    /* private */ var _intervalEnd: js.Any = js.native
    
    /* private */ var _intervalId: js.Any = js.native
    
    /* private */ val _isIntervalIgnored: js.Any = js.native
    
    /* private */ var _isIntervalPaused: js.Any = js.native
    
    /* private */ var _isPaused: js.Any = js.native
    
    /* private */ var _next: js.Any = js.native
    
    /* private */ var _onInterval: js.Any = js.native
    
    /* private */ var _onResumeInterval: js.Any = js.native
    
    /* private */ var _pendingCount: js.Any = js.native
    
    /**
      Executes all queued functions until it reaches the limit.
      */
    /* private */ var _processQueue: js.Any = js.native
    
    /* private */ var _queue: js.Any = js.native
    
    /* private */ val _queueClass: js.Any = js.native
    
    /* private */ var _resolveEmpty: js.Any = js.native
    
    /* private */ var _resolveIdle: js.Any = js.native
    
    /* private */ var _resolvePromises: js.Any = js.native
    
    /* private */ val _throwOnTimeout: js.Any = js.native
    
    /* private */ var _timeout: js.Any = js.native
    
    /* private */ var _timeoutId: js.Any = js.native
    
    /* private */ var _tryToStartAnother: js.Any = js.native
    
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
      Put queue execution on hold.
      */
    def pause(): Unit = js.native
    
    /**
      Number of pending promises.
      */
    def pending: Double = js.native
    
    /**
      Size of the queue.
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
    
    def timeout: js.UndefOr[Double] = js.native
    /**
      Set the timeout for future operations.
      */
    def timeout_=(milliseconds: js.UndefOr[Double]): Unit = js.native
  }
  
  type Task[TaskResultType] = js.Function0[TaskResultType | js.Thenable[TaskResultType]]
}
