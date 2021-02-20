package typings.memwatchNext

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("memwatch-next", "HeapDiff")
  @js.native
  class HeapDiff () extends StObject {
    
    /**
      * Compute the diff.
      */
    def end(): Unit = js.native
  }
  
  @JSImport("memwatch-next", "on")
  @js.native
  def on(eventName: String, callback: EventCallback): Unit = js.native
  
  type EventCallback = js.Function1[/* data */ LeakInformation | StatsInformation | js.Object, Unit]
  
  @js.native
  trait LeakInformation extends StObject {
    
    /**
      * End date.
      * @type {Date}
      */
    var end: Date = js.native
    
    /**
      * Growth.
      * @type {number}
      */
    var growth: Double = js.native
    
    /**
      * Reason leak.
      * @type {string}
      */
    var reason: String = js.native
    
    /**
      * Start date.
      * @type {Date}
      */
    var start: Date = js.native
  }
  object LeakInformation {
    
    @scala.inline
    def apply(end: Date, growth: Double, reason: String, start: Date): LeakInformation = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], growth = growth.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[LeakInformation]
    }
    
    @scala.inline
    implicit class LeakInformationMutableBuilder[Self <: LeakInformation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnd(value: Date): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGrowth(value: Double): Self = StObject.set(x, "growth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStart(value: Date): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait StatsInformation extends StObject {
    
    var current_base: Double = js.native
    
    var estimated_base: Double = js.native
    
    var heap_compactions: Double = js.native
    
    var max: Double = js.native
    
    var min: Double = js.native
    
    var num_full_gc: Double = js.native
    
    var num_inc_gc: Double = js.native
    
    var usage_trend: Double = js.native
  }
  object StatsInformation {
    
    @scala.inline
    def apply(
      current_base: Double,
      estimated_base: Double,
      heap_compactions: Double,
      max: Double,
      min: Double,
      num_full_gc: Double,
      num_inc_gc: Double,
      usage_trend: Double
    ): StatsInformation = {
      val __obj = js.Dynamic.literal(current_base = current_base.asInstanceOf[js.Any], estimated_base = estimated_base.asInstanceOf[js.Any], heap_compactions = heap_compactions.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], num_full_gc = num_full_gc.asInstanceOf[js.Any], num_inc_gc = num_inc_gc.asInstanceOf[js.Any], usage_trend = usage_trend.asInstanceOf[js.Any])
      __obj.asInstanceOf[StatsInformation]
    }
    
    @scala.inline
    implicit class StatsInformationMutableBuilder[Self <: StatsInformation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCurrent_base(value: Double): Self = StObject.set(x, "current_base", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEstimated_base(value: Double): Self = StObject.set(x, "estimated_base", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeap_compactions(value: Double): Self = StObject.set(x, "heap_compactions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNum_full_gc(value: Double): Self = StObject.set(x, "num_full_gc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNum_inc_gc(value: Double): Self = StObject.set(x, "num_inc_gc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsage_trend(value: Double): Self = StObject.set(x, "usage_trend", value.asInstanceOf[js.Any])
    }
  }
}
