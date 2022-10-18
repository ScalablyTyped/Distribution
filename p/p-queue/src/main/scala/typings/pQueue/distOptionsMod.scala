package typings.pQueue

import org.scalablytyped.runtime.Instantiable0
import typings.pQueue.distQueueMod.Queue
import typings.pQueue.distQueueMod.RunFunction
import typings.std.AbortSignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distOptionsMod {
  
  trait Options[QueueType /* <: Queue[RunFunction, QueueOptions] */, QueueOptions /* <: QueueAddOptions */]
    extends StObject
       with TimeoutOptions {
    
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
  }
  object Options {
    
    inline def apply[QueueType /* <: Queue[RunFunction, QueueOptions] */, QueueOptions /* <: QueueAddOptions */](): Options[QueueType, QueueOptions] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options[QueueType, QueueOptions]]
    }
    
    extension [Self <: Options[?, ?], QueueType /* <: Queue[RunFunction, QueueOptions] */, QueueOptions /* <: QueueAddOptions */](x: Self & (Options[QueueType, QueueOptions])) {
      
      inline def setAutoStart(value: Boolean): Self = StObject.set(x, "autoStart", value.asInstanceOf[js.Any])
      
      inline def setAutoStartUndefined: Self = StObject.set(x, "autoStart", js.undefined)
      
      inline def setCarryoverConcurrencyCount(value: Boolean): Self = StObject.set(x, "carryoverConcurrencyCount", value.asInstanceOf[js.Any])
      
      inline def setCarryoverConcurrencyCountUndefined: Self = StObject.set(x, "carryoverConcurrencyCount", js.undefined)
      
      inline def setConcurrency(value: Double): Self = StObject.set(x, "concurrency", value.asInstanceOf[js.Any])
      
      inline def setConcurrencyUndefined: Self = StObject.set(x, "concurrency", js.undefined)
      
      inline def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
      
      inline def setIntervalCap(value: Double): Self = StObject.set(x, "intervalCap", value.asInstanceOf[js.Any])
      
      inline def setIntervalCapUndefined: Self = StObject.set(x, "intervalCap", js.undefined)
      
      inline def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
      
      inline def setQueueClass(value: Instantiable0[QueueType]): Self = StObject.set(x, "queueClass", value.asInstanceOf[js.Any])
      
      inline def setQueueClassUndefined: Self = StObject.set(x, "queueClass", js.undefined)
    }
  }
  
  trait QueueAddOptions
    extends StObject
       with TaskOptions
       with TimeoutOptions {
    
    /**
      Priority of operation. Operations with greater priority will be scheduled first.
      @default 0
      */
    val priority: js.UndefOr[Double] = js.undefined
  }
  object QueueAddOptions {
    
    inline def apply(): QueueAddOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[QueueAddOptions]
    }
    
    extension [Self <: QueueAddOptions](x: Self) {
      
      inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    }
  }
  
  trait TaskOptions extends StObject {
    
    /**
      [`AbortSignal`](https://developer.mozilla.org/en-US/docs/Web/API/AbortSignal) for cancellation of the operation. When aborted, it will be removed from the queue and the `queue.add()` call will reject with an `AbortError`. If the operation is already running, the signal will need to be handled by the operation itself.
      @example
      ```
      import PQueue, {AbortError} from 'p-queue';
      import got, {CancelError} from 'got';
      const queue = new PQueue();
      const controller = new AbortController();
      try {
      await queue.add(({signal}) => {
      const request = got('https://sindresorhus.com');
      signal.addEventListener('abort', () => {
      request.cancel();
      });
      try {
      return await request;
      } catch (error) {
      if (!(error instanceof CancelError)) {
      throw error;
      }
      }
      }, {signal: controller.signal});
      } catch (error) {
      if (!(error instanceof AbortError)) {
      throw error;
      }
      }
      ```
      */
    val signal: js.UndefOr[AbortSignal] = js.undefined
  }
  object TaskOptions {
    
    inline def apply(): TaskOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TaskOptions]
    }
    
    extension [Self <: TaskOptions](x: Self) {
      
      inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
      
      inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
    }
  }
  
  trait TimeoutOptions extends StObject {
    
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
  object TimeoutOptions {
    
    inline def apply(): TimeoutOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TimeoutOptions]
    }
    
    extension [Self <: TimeoutOptions](x: Self) {
      
      inline def setThrowOnTimeout(value: Boolean): Self = StObject.set(x, "throwOnTimeout", value.asInstanceOf[js.Any])
      
      inline def setThrowOnTimeoutUndefined: Self = StObject.set(x, "throwOnTimeout", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
}
