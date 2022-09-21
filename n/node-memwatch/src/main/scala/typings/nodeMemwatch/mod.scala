package typings.nodeMemwatch

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Shortcut
import typings.node.eventsMod.EventEmitter
import typings.nodeMemwatch.nodeMemwatchStrings.leak
import typings.nodeMemwatch.nodeMemwatchStrings.stats
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("node-memwatch", JSImport.Namespace)
  @js.native
  val ^ : MemWatch = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("node-memwatch", "HeapDiff")
  @js.native
  open class HeapDiffCls ()
    extends StObject
       with HeapDiff {
    
    /**
      * Compute the diff.
      */
    /* CompleteClass */
    override def end(): HeapDiffInformation = js.native
  }
  
  /**
    * Compare the state of your heap between two points in time, telling you what has been allocated, and what has been released.
    */
  trait HeapDiff extends StObject {
    
    /**
      * Compute the diff.
      */
    def end(): HeapDiffInformation
  }
  object HeapDiff {
    
    inline def apply(end: () => HeapDiffInformation): HeapDiff = {
      val __obj = js.Dynamic.literal(end = js.Any.fromFunction0(end))
      __obj.asInstanceOf[HeapDiff]
    }
    
    extension [Self <: HeapDiff](x: Self) {
      
      inline def setEnd(value: () => HeapDiffInformation): Self = StObject.set(x, "end", js.Any.fromFunction0(value))
    }
  }
  
  trait HeapDiffChange extends StObject {
    
    var allocated_nodes: Double
    
    var details: js.Array[HeapDiffDetail]
    
    var freed_nodes: Double
    
    var size: String
    
    var size_bytes: Double
  }
  object HeapDiffChange {
    
    inline def apply(
      allocated_nodes: Double,
      details: js.Array[HeapDiffDetail],
      freed_nodes: Double,
      size: String,
      size_bytes: Double
    ): HeapDiffChange = {
      val __obj = js.Dynamic.literal(allocated_nodes = allocated_nodes.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], freed_nodes = freed_nodes.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], size_bytes = size_bytes.asInstanceOf[js.Any])
      __obj.asInstanceOf[HeapDiffChange]
    }
    
    extension [Self <: HeapDiffChange](x: Self) {
      
      inline def setAllocated_nodes(value: Double): Self = StObject.set(x, "allocated_nodes", value.asInstanceOf[js.Any])
      
      inline def setDetails(value: js.Array[HeapDiffDetail]): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
      
      inline def setDetailsVarargs(value: HeapDiffDetail*): Self = StObject.set(x, "details", js.Array(value*))
      
      inline def setFreed_nodes(value: Double): Self = StObject.set(x, "freed_nodes", value.asInstanceOf[js.Any])
      
      inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSize_bytes(value: Double): Self = StObject.set(x, "size_bytes", value.asInstanceOf[js.Any])
    }
  }
  
  trait HeapDiffDetail extends StObject {
    
    @JSName("+")
    var Plussign: Double
    
    @JSName("-")
    var _dash: Double
    
    var size: String
    
    var size_bytes: Double
    
    var what: String
  }
  object HeapDiffDetail {
    
    inline def apply(Plussign: Double, _dash: Double, size: String, size_bytes: Double, what: String): HeapDiffDetail = {
      val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any], size_bytes = size_bytes.asInstanceOf[js.Any], what = what.asInstanceOf[js.Any])
      __obj.updateDynamic("+")(Plussign.asInstanceOf[js.Any])
      __obj.updateDynamic("-")(_dash.asInstanceOf[js.Any])
      __obj.asInstanceOf[HeapDiffDetail]
    }
    
    extension [Self <: HeapDiffDetail](x: Self) {
      
      inline def setPlussign(value: Double): Self = StObject.set(x, "+", value.asInstanceOf[js.Any])
      
      inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSize_bytes(value: Double): Self = StObject.set(x, "size_bytes", value.asInstanceOf[js.Any])
      
      inline def setWhat(value: String): Self = StObject.set(x, "what", value.asInstanceOf[js.Any])
      
      inline def set_dash(value: Double): Self = StObject.set(x, "-", value.asInstanceOf[js.Any])
    }
  }
  
  trait HeapDiffInformation extends StObject {
    
    var after: HeapDiffSnapshot
    
    var before: HeapDiffSnapshot
    
    var change: HeapDiffChange
  }
  object HeapDiffInformation {
    
    inline def apply(after: HeapDiffSnapshot, before: HeapDiffSnapshot, change: HeapDiffChange): HeapDiffInformation = {
      val __obj = js.Dynamic.literal(after = after.asInstanceOf[js.Any], before = before.asInstanceOf[js.Any], change = change.asInstanceOf[js.Any])
      __obj.asInstanceOf[HeapDiffInformation]
    }
    
    extension [Self <: HeapDiffInformation](x: Self) {
      
      inline def setAfter(value: HeapDiffSnapshot): Self = StObject.set(x, "after", value.asInstanceOf[js.Any])
      
      inline def setBefore(value: HeapDiffSnapshot): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
      
      inline def setChange(value: HeapDiffChange): Self = StObject.set(x, "change", value.asInstanceOf[js.Any])
    }
  }
  
  trait HeapDiffSnapshot extends StObject {
    
    var nodes: Double
    
    var size: String
    
    var size_bytes: Double
  }
  object HeapDiffSnapshot {
    
    inline def apply(nodes: Double, size: String, size_bytes: Double): HeapDiffSnapshot = {
      val __obj = js.Dynamic.literal(nodes = nodes.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], size_bytes = size_bytes.asInstanceOf[js.Any])
      __obj.asInstanceOf[HeapDiffSnapshot]
    }
    
    extension [Self <: HeapDiffSnapshot](x: Self) {
      
      inline def setNodes(value: Double): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
      
      inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSize_bytes(value: Double): Self = StObject.set(x, "size_bytes", value.asInstanceOf[js.Any])
    }
  }
  
  trait LeakInformation extends StObject {
    
    /**
      * Amount of heap growth in bytes.
      */
    var growth: Double
    
    /**
      * Human-readable description.
      */
    var reason: String
  }
  object LeakInformation {
    
    inline def apply(growth: Double, reason: String): LeakInformation = {
      val __obj = js.Dynamic.literal(growth = growth.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any])
      __obj.asInstanceOf[LeakInformation]
    }
    
    extension [Self <: LeakInformation](x: Self) {
      
      inline def setGrowth(value: Double): Self = StObject.set(x, "growth", value.asInstanceOf[js.Any])
      
      inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MemWatch extends EventEmitter {
    
    var HeapDiff: Instantiable0[typings.nodeMemwatch.mod.HeapDiff] = js.native
    
    /**
      * Force V8 to do a full GC and heap compaction.
      *
      * It's intended to be used for debugging. Calling it in production is highly discouraged.
      */
    def gc(): Unit = js.native
    
    @JSName("on")
    def on_leak(eventName: leak, callback: js.Function1[/* event */ LeakInformation, Unit]): this.type = js.native
    @JSName("on")
    def on_stats(eventName: stats, callback: js.Function1[/* event */ StatsInformation, Unit]): this.type = js.native
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
    
    extension [Self <: StatsInformation](x: Self) {
      
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
  
  type _To = MemWatch
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: MemWatch = ^
}
