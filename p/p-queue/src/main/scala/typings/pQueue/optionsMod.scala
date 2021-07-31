package typings.pQueue

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StringDictionary
import typings.pQueue.queueMod.Queue
import typings.pQueue.queueMod.RunFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object optionsMod {
  
  trait DefaultAddOptions
    extends StObject
       with QueueAddOptions {
    
    /**
      Priority of operation. Operations with greater priority will be scheduled first.
      @default 0
      */
    val priority: js.UndefOr[Double] = js.undefined
  }
  object DefaultAddOptions {
    
    @scala.inline
    def apply(): DefaultAddOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DefaultAddOptions]
    }
    
    @scala.inline
    implicit class DefaultAddOptionsMutableBuilder[Self <: DefaultAddOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    }
  }
  
  trait Options[QueueType /* <: Queue[RunFunction, QueueOptions] */, QueueOptions /* <: QueueAddOptions */] extends StObject {
    
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
    def apply[QueueType /* <: Queue[RunFunction, QueueOptions] */, QueueOptions /* <: QueueAddOptions */](): Options[QueueType, QueueOptions] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options[QueueType, QueueOptions]]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options[?, ?], QueueType /* <: Queue[RunFunction, QueueOptions] */, QueueOptions /* <: QueueAddOptions */] (val x: Self & (Options[QueueType, QueueOptions])) extends AnyVal {
      
      @scala.inline
      def setAutoStart(value: Boolean): Self = StObject.set(x, "autoStart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoStartUndefined: Self = StObject.set(x, "autoStart", js.undefined)
      
      @scala.inline
      def setCarryoverConcurrencyCount(value: Boolean): Self = StObject.set(x, "carryoverConcurrencyCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCarryoverConcurrencyCountUndefined: Self = StObject.set(x, "carryoverConcurrencyCount", js.undefined)
      
      @scala.inline
      def setConcurrency(value: Double): Self = StObject.set(x, "concurrency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConcurrencyUndefined: Self = StObject.set(x, "concurrency", js.undefined)
      
      @scala.inline
      def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIntervalCap(value: Double): Self = StObject.set(x, "intervalCap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIntervalCapUndefined: Self = StObject.set(x, "intervalCap", js.undefined)
      
      @scala.inline
      def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
      
      @scala.inline
      def setQueueClass(value: Instantiable0[QueueType]): Self = StObject.set(x, "queueClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueueClassUndefined: Self = StObject.set(x, "queueClass", js.undefined)
      
      @scala.inline
      def setThrowOnTimeout(value: Boolean): Self = StObject.set(x, "throwOnTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThrowOnTimeoutUndefined: Self = StObject.set(x, "throwOnTimeout", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  type QueueAddOptions = StringDictionary[js.Any]
}
