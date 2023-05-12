package typings.memwatchNext

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("memwatch-next", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("memwatch-next", "HeapDiff")
  @js.native
  open class HeapDiff () extends StObject {
    
    /**
      * Compute the diff.
      */
    def end(): Unit = js.native
  }
  
  inline def on(eventName: String, callback: EventCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  type EventCallback = js.Function1[/* data */ LeakInformation | StatsInformation | js.Object, Unit]
  
  trait LeakInformation extends StObject {
    
    /**
      * End date.
      */
    var end: js.Date
    
    /**
      * Growth.
      */
    var growth: Double
    
    /**
      * Reason leak.
      */
    var reason: String
    
    /**
      * Start date.
      */
    var start: js.Date
  }
  object LeakInformation {
    
    inline def apply(end: js.Date, growth: Double, reason: String, start: js.Date): LeakInformation = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], growth = growth.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[LeakInformation]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LeakInformation] (val x: Self) extends AnyVal {
      
      inline def setEnd(value: js.Date): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setGrowth(value: Double): Self = StObject.set(x, "growth", value.asInstanceOf[js.Any])
      
      inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
      
      inline def setStart(value: js.Date): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
  
  trait StatsInformation extends StObject {
    
    var current_base: Double
    
    var estimated_base: Double
    
    var heap_compactions: Double
    
    var max: Double
    
    var min: Double
    
    var num_full_gc: Double
    
    var num_inc_gc: Double
    
    var usage_trend: Double
  }
  object StatsInformation {
    
    inline def apply(
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
    implicit open class MutableBuilder[Self <: StatsInformation] (val x: Self) extends AnyVal {
      
      inline def setCurrent_base(value: Double): Self = StObject.set(x, "current_base", value.asInstanceOf[js.Any])
      
      inline def setEstimated_base(value: Double): Self = StObject.set(x, "estimated_base", value.asInstanceOf[js.Any])
      
      inline def setHeap_compactions(value: Double): Self = StObject.set(x, "heap_compactions", value.asInstanceOf[js.Any])
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setNum_full_gc(value: Double): Self = StObject.set(x, "num_full_gc", value.asInstanceOf[js.Any])
      
      inline def setNum_inc_gc(value: Double): Self = StObject.set(x, "num_inc_gc", value.asInstanceOf[js.Any])
      
      inline def setUsage_trend(value: Double): Self = StObject.set(x, "usage_trend", value.asInstanceOf[js.Any])
    }
  }
}
