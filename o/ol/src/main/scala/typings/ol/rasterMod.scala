package typings.ol

import typings.ol.eventsMod.EventsKey
import typings.ol.extentMod.Extent
import typings.ol.olStrings.afteroperations
import typings.ol.olStrings.beforeoperations
import typings.ol.pluggableMapMod.FrameState
import typings.std.Error
import typings.std.ImageData
import typings.std.MessageEvent
import typings.std.Uint8ClampedArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rasterMod {
  
  @JSImport("ol/source/Raster", JSImport.Default)
  @js.native
  class default protected () extends RasterSource {
    def this(options: Options) = this()
  }
  
  @JSImport("ol/source/Raster", "Processor")
  @js.native
  class Processor protected ()
    extends typings.ol.disposableMod.default {
    def this(config: ProcessorOptions) = this()
    
    /**
      * Dispatch a job.
      */
    def _dispatch(): Unit = js.native
    
    /**
      * Add a job to the queue.
      */
    def _enqueue(job: js.Any): Unit = js.native
    
    /**
      * Handle messages from the worker.
      */
    def _onWorkerMessage(index: Double, event: MessageEvent[_]): Unit = js.native
    
    /**
      * Resolve a job.  If there are no more worker threads, the processor callback
      * will be called.
      */
    def _resolveJob(): Unit = js.native
    
    /**
      * Run operation on input data.
      */
    def process(
      inputs: js.Array[js.Array[_] | ImageData],
      meta: js.Any,
      callback: js.Function3[/* p0 */ Error, /* p1 */ ImageData, /* p2 */ js.Object, Unit]
    ): Unit = js.native
  }
  
  @js.native
  sealed trait RasterOperationType extends StObject
  /**
    * Raster operation type. Supported values are 'pixel' and 'image'.
    */
  @JSImport("ol/source/Raster", "RasterOperationType")
  @js.native
  object RasterOperationType extends StObject {
    
    @js.native
    sealed trait IMAGE extends RasterOperationType
    
    @js.native
    sealed trait PIXEL extends RasterOperationType
  }
  
  @JSImport("ol/source/Raster", "RasterSourceEvent")
  @js.native
  class RasterSourceEvent protected ()
    extends typings.ol.eventMod.default {
    def this(`type`: String, frameState: FrameState, data: js.Any) = this()
    
    /**
      * An object made available to all operations.  This can be used by operations
      * as a storage object (e.g. for calculating statistics).
      */
    var data: js.Any = js.native
    
    /**
      * The raster extent.
      */
    var extent: Extent = js.native
    
    /**
      * The pixel resolution (map units per pixel).
      */
    var resolution: Double = js.native
  }
  
  @JSImport("ol/source/Raster", "newImageData")
  @js.native
  def newImageData(data: Uint8ClampedArray, width: Double, height: Double): ImageData = js.native
  
  @js.native
  trait FauxMessageEvent extends StObject {
    
    var data: js.Any = js.native
  }
  object FauxMessageEvent {
    
    @scala.inline
    def apply(data: js.Any): FauxMessageEvent = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[FauxMessageEvent]
    }
    
    @scala.inline
    implicit class FauxMessageEventMutableBuilder[Self <: FauxMessageEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    }
  }
  
  type Operation = js.Function2[
    /* p0 */ js.Array[js.Array[Double] | ImageData], 
    /* p1 */ js.Object, 
    js.Array[Double] | ImageData
  ]
  
  @js.native
  trait Options extends StObject {
    
    var lib: js.UndefOr[js.Any] = js.native
    
    var operation: js.UndefOr[Operation] = js.native
    
    var operationType: js.UndefOr[RasterOperationType] = js.native
    
    var sources: js.Array[
        typings.ol.sourceSourceMod.default | typings.ol.layerLayerMod.default[typings.ol.sourceSourceMod.default]
      ] = js.native
    
    var threads: js.UndefOr[Double] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(
      sources: js.Array[
          typings.ol.sourceSourceMod.default | typings.ol.layerLayerMod.default[typings.ol.sourceSourceMod.default]
        ]
    ): Options = {
      val __obj = js.Dynamic.literal(sources = sources.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLib(value: js.Any): Self = StObject.set(x, "lib", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLibUndefined: Self = StObject.set(x, "lib", js.undefined)
      
      @scala.inline
      def setOperation(
        value: (/* p0 */ js.Array[js.Array[Double] | ImageData], /* p1 */ js.Object) => js.Array[Double] | ImageData
      ): Self = StObject.set(x, "operation", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOperationType(value: RasterOperationType): Self = StObject.set(x, "operationType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOperationTypeUndefined: Self = StObject.set(x, "operationType", js.undefined)
      
      @scala.inline
      def setOperationUndefined: Self = StObject.set(x, "operation", js.undefined)
      
      @scala.inline
      def setSources(
        value: js.Array[
              typings.ol.sourceSourceMod.default | typings.ol.layerLayerMod.default[typings.ol.sourceSourceMod.default]
            ]
      ): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourcesVarargs(
        value: (typings.ol.sourceSourceMod.default | typings.ol.layerLayerMod.default[typings.ol.sourceSourceMod.default])*
      ): Self = StObject.set(x, "sources", js.Array(value :_*))
      
      @scala.inline
      def setThreads(value: Double): Self = StObject.set(x, "threads", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThreadsUndefined: Self = StObject.set(x, "threads", js.undefined)
    }
  }
  
  @js.native
  trait ProcessorOptions extends StObject {
    
    var imageOps: js.UndefOr[Boolean] = js.native
    
    var lib: js.UndefOr[js.Any] = js.native
    
    def operation(p0: js.Array[_], p1: js.Object): js.Any = js.native
    
    var queue: Double = js.native
    
    var threads: Double = js.native
  }
  object ProcessorOptions {
    
    @scala.inline
    def apply(operation: (js.Array[_], js.Object) => js.Any, queue: Double, threads: Double): ProcessorOptions = {
      val __obj = js.Dynamic.literal(operation = js.Any.fromFunction2(operation), queue = queue.asInstanceOf[js.Any], threads = threads.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProcessorOptions]
    }
    
    @scala.inline
    implicit class ProcessorOptionsMutableBuilder[Self <: ProcessorOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setImageOps(value: Boolean): Self = StObject.set(x, "imageOps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageOpsUndefined: Self = StObject.set(x, "imageOps", js.undefined)
      
      @scala.inline
      def setLib(value: js.Any): Self = StObject.set(x, "lib", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLibUndefined: Self = StObject.set(x, "lib", js.undefined)
      
      @scala.inline
      def setOperation(value: (js.Array[_], js.Object) => js.Any): Self = StObject.set(x, "operation", js.Any.fromFunction2(value))
      
      @scala.inline
      def setQueue(value: Double): Self = StObject.set(x, "queue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThreads(value: Double): Self = StObject.set(x, "threads", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RasterSource
    extends typings.ol.sourceImageMod.default {
    
    @JSName("on")
    def on_afteroperations(`type`: afteroperations, listener: js.Function1[/* evt */ RasterSourceEvent, Unit]): EventsKey = js.native
    @JSName("on")
    def on_beforeoperations(`type`: beforeoperations, listener: js.Function1[/* evt */ RasterSourceEvent, Unit]): EventsKey = js.native
    
    @JSName("once")
    def once_afteroperations(`type`: afteroperations, listener: js.Function1[/* evt */ RasterSourceEvent, Unit]): EventsKey = js.native
    @JSName("once")
    def once_beforeoperations(`type`: beforeoperations, listener: js.Function1[/* evt */ RasterSourceEvent, Unit]): EventsKey = js.native
    
    /**
      * Set the operation.
      */
    def setOperation(operation: Operation): Unit = js.native
    def setOperation(operation: Operation, opt_lib: js.Any): Unit = js.native
    
    @JSName("un")
    def un_afteroperations(`type`: afteroperations, listener: js.Function1[/* evt */ RasterSourceEvent, Unit]): Unit = js.native
    @JSName("un")
    def un_beforeoperations(`type`: beforeoperations, listener: js.Function1[/* evt */ RasterSourceEvent, Unit]): Unit = js.native
  }
}
