package typings.ol

import org.scalablytyped.runtime.StringDictionary
import typings.ol.eventsMod.EventsKey
import typings.ol.extentMod.Extent
import typings.ol.mapMod.FrameState
import typings.ol.objectEventTypeMod.Types
import typings.ol.objectMod.ObjectEvent
import typings.ol.observableMod.EventTypes
import typings.ol.observableMod.OnSignature
import typings.ol.olStrings.image_
import typings.ol.sourceImageMod.ImageSourceEvent
import typings.ol.sourceImageMod.ImageSourceEventTypes
import typings.std.ImageData
import typings.std.MessageEvent
import typings.std.Worker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceRasterMod {
  
  @JSImport("ol/source/Raster", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @typedef {Object} Options
    * @property {Array<import("./Source.js").default|import("../layer/Layer.js").default>} sources Input
    * sources or layers.  For vector data, use an VectorImage layer.
    * @property {Operation} [operation] Raster operation.
    * The operation will be called with data from input sources
    * and the output will be assigned to the raster source.
    * @property {Object} [lib] Functions that will be made available to operations run in a worker.
    * @property {number} [threads] By default, operations will be run in a single worker thread.
    * To avoid using workers altogether, set `threads: 0`.  For pixel operations, operations can
    * be run in multiple worker threads.  Note that there is additional overhead in
    * transferring data to multiple workers, and that depending on the user's
    * system, it may not be possible to parallelize the work.
    * @property {RasterOperationType} [operationType='pixel'] Operation type.
    * Supported values are `'pixel'` and `'image'`.  By default,
    * `'pixel'` operations are assumed, and operations will be called with an
    * array of pixels from input sources.  If set to `'image'`, operations will
    * be called with an array of ImageData objects from input sources.
    * @property {Array<number>|null} [resolutions] Resolutions. If specified, raster operations will only
    * be run at the given resolutions.  By default, the resolutions of the first source with resolutions
    * specified will be used, if any. Set to `null` to use any view resolution instead.
    */
  /***
    * @template Return
    * @typedef {import("../Observable").OnSignature<import("../Observable").EventTypes, import("../events/Event.js").default, Return> &
    *   import("../Observable").OnSignature<import("../ObjectEventType").Types, import("../Object").ObjectEvent, Return> &
    *   import("../Observable").OnSignature<import("./Image.js").ImageSourceEventTypes, import("./Image.js").ImageSourceEvent, Return> &
    *   import("../Observable").OnSignature<RasterSourceEventTypes, RasterSourceEvent, Return> &
    *   import("../Observable").CombinedOnSignature<import("../Observable").EventTypes|import("../ObjectEventType").Types
    *     |RasterSourceEventTypes, Return>} RasterSourceOnSignature
    */
  /**
    * @classdesc
    * A source that transforms data from any number of input sources using an
    * {@link module:ol/source/Raster~Operation} function to transform input pixel values into
    * output pixel values.
    *
    * @fires module:ol/source/Raster.RasterSourceEvent
    * @api
    */
  @JSImport("ol/source/Raster", JSImport.Default)
  @js.native
  open class default protected () extends RasterSource {
    /**
      * @param {Options} options Options.
      */
    def this(options: Options) = this()
  }
  
  @JSImport("ol/source/Raster", "Processor")
  @js.native
  open class Processor protected ()
    extends typings.ol.disposableMod.default {
    /**
      * @param {ProcessorOptions} config Configuration.
      */
    def this(config: ProcessorOptions) = this()
    
    /**
      * @type {Object<number, any>}
      * @private
      */
    /* private */ var _dataLookup: Any = js.native
    
    /**
      * Dispatch a job.
      */
    def _dispatch(): Unit = js.native
    
    /**
      * Add a job to the queue.
      * @param {Job} job The job.
      */
    def _enqueue(job: Job): Unit = js.native
    
    var _imageOps: Boolean = js.native
    
    /**
      * @type {Job}
      * @private
      */
    /* private */ var _job: Any = js.native
    
    var _maxQueueLength: Double = js.native
    
    /**
      * Handle messages from the worker.
      * @param {number} index The worker index.
      * @param {MessageEvent} event The message event.
      */
    def _onWorkerMessage(index: Double, event: MessageEvent[Any]): Unit = js.native
    
    /**
      * @type {Array<Job>}
      * @private
      */
    /* private */ var _queue: Any = js.native
    
    /**
      * Resolve a job.  If there are no more worker threads, the processor callback
      * will be called.
      */
    def _resolveJob(): Unit = js.native
    
    var _running: Double = js.native
    
    var _workers: js.Array[Worker] = js.native
    
    /**
      * Run operation on input data.
      * @param {Array<ImageData>} inputs Array of image data.
      * @param {Object} meta A user data object.  This is passed to all operations
      *     and must be serializable.
      * @param {function(Error, ImageData, Object): void} callback Called when work
      *     completes.  The first argument is any error.  The second is the ImageData
      *     generated by operations.  The third is the user data object.
      */
    def process(
      inputs: js.Array[ImageData],
      meta: Any,
      callback: js.Function3[/* arg0 */ js.Error, /* arg1 */ ImageData, /* arg2 */ Any, Unit]
    ): Unit = js.native
  }
  
  @JSImport("ol/source/Raster", "RasterSourceEvent")
  @js.native
  open class RasterSourceEvent protected ()
    extends typings.ol.eventsEventMod.default {
    def this(`type`: String, frameState: FrameState, data: js.Array[Any]) = this()
    /**
      * @param {string} type Type.
      * @param {import("../Map.js").FrameState} frameState The frame state.
      * @param {Object|Array<Object>} data An object made available to operations.  For "afteroperations" evenets
      * this will be an array of objects if more than one thread is used.
      */
    def this(`type`: String, frameState: FrameState, data: Any) = this()
    
    /**
      * An object made available to all operations.  This can be used by operations
      * as a storage object (e.g. for calculating statistics).
      * @type {Object}
      * @api
      */
    var data: Any = js.native
    
    /**
      * The raster extent.
      * @type {import("../extent.js").Extent}
      * @api
      */
    var extent: Extent = js.native
    
    /**
      * The pixel resolution (map units per pixel).
      * @type {number}
      * @api
      */
    var resolution: Double = js.native
  }
  
  inline def newImageData(data: js.typedarray.Uint8ClampedArray, width: Double, height: Double): ImageData = (^.asInstanceOf[js.Dynamic].applyDynamic("newImageData")(data.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[ImageData]
  
  trait FauxMessageEvent extends StObject {
    
    /**
      * Message data.
      */
    var data: Any
  }
  object FauxMessageEvent {
    
    inline def apply(data: Any): FauxMessageEvent = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[FauxMessageEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FauxMessageEvent] (val x: Self) extends AnyVal {
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    }
  }
  
  trait Job extends StObject {
    
    def callback(arg0: js.Error, arg1: ImageData, arg2: js.Array[Any]): Unit
    /**
      * Called when the job is complete.
      */
    def callback(arg0: js.Error, arg1: ImageData, arg2: Any): Unit
    /**
      * Called when the job is complete.
      */
    @JSName("callback")
    var callback_Original: JobCallback
    
    /**
      * Array of input data.
      */
    var inputs: js.Array[ImageData]
    
    /**
      * Job metadata.
      */
    var meta: Any
  }
  object Job {
    
    inline def apply(
      callback: (/* arg0 */ js.Error, /* arg1 */ ImageData, /* arg2 */ Any | js.Array[Any]) => Unit,
      inputs: js.Array[ImageData],
      meta: Any
    ): Job = {
      val __obj = js.Dynamic.literal(callback = js.Any.fromFunction3(callback), inputs = inputs.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any])
      __obj.asInstanceOf[Job]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Job] (val x: Self) extends AnyVal {
      
      inline def setCallback(value: (/* arg0 */ js.Error, /* arg1 */ ImageData, /* arg2 */ Any | js.Array[Any]) => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction3(value))
      
      inline def setInputs(value: js.Array[ImageData]): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
      
      inline def setInputsVarargs(value: ImageData*): Self = StObject.set(x, "inputs", js.Array(value*))
      
      inline def setMeta(value: Any): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    }
  }
  
  type JobCallback = js.Function3[/* arg0 */ js.Error, /* arg1 */ ImageData, /* arg2 */ Any | js.Array[Any], Unit]
  
  trait MinionData extends StObject {
    
    /**
      * Array of buffers.
      */
    var buffers: js.Array[js.typedarray.ArrayBuffer]
    
    /**
      * The height of the image.
      */
    var height: Double
    
    /**
      * The operation is an image operation.
      */
    var imageOps: Boolean
    
    /**
      * Operation metadata.
      */
    var meta: Any
    
    /**
      * The width of the image.
      */
    var width: Double
  }
  object MinionData {
    
    inline def apply(
      buffers: js.Array[js.typedarray.ArrayBuffer],
      height: Double,
      imageOps: Boolean,
      meta: Any,
      width: Double
    ): MinionData = {
      val __obj = js.Dynamic.literal(buffers = buffers.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], imageOps = imageOps.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[MinionData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MinionData] (val x: Self) extends AnyVal {
      
      inline def setBuffers(value: js.Array[js.typedarray.ArrayBuffer]): Self = StObject.set(x, "buffers", value.asInstanceOf[js.Any])
      
      inline def setBuffersVarargs(value: js.typedarray.ArrayBuffer*): Self = StObject.set(x, "buffers", js.Array(value*))
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setImageOps(value: Boolean): Self = StObject.set(x, "imageOps", value.asInstanceOf[js.Any])
      
      inline def setMeta(value: Any): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  type Operation = js.Function2[
    /* arg0 */ js.Array[js.Array[Double] | ImageData], 
    /* arg1 */ Any, 
    js.Array[Double] | ImageData
  ]
  
  trait Options extends StObject {
    
    /**
      * Functions that will be made available to operations run in a worker.
      */
    var lib: js.UndefOr[Any] = js.undefined
    
    /**
      * Raster operation.
      * The operation will be called with data from input sources
      * and the output will be assigned to the raster source.
      */
    var operation: js.UndefOr[Operation] = js.undefined
    
    /**
      * Operation type.
      * Supported values are `'pixel'` and `'image'`.  By default,
      * `'pixel'` operations are assumed, and operations will be called with an
      * array of pixels from input sources.  If set to `'image'`, operations will
      * be called with an array of ImageData objects from input sources.
      */
    var operationType: js.UndefOr[RasterOperationType] = js.undefined
    
    /**
      * Resolutions. If specified, raster operations will only
      * be run at the given resolutions.  By default, the resolutions of the first source with resolutions
      * specified will be used, if any. Set to `null` to use any view resolution instead.
      */
    var resolutions: js.UndefOr[js.Array[Double] | Null] = js.undefined
    
    /**
      * Input
      * sources or layers.  For vector data, use an VectorImage layer.
      */
    var sources: js.Array[
        typings.ol.sourceSourceMod.default | (typings.ol.layerLayerMod.default[typings.ol.sourceSourceMod.default, /* ol.ol/layer/Layer.default<any> */ Any])
      ]
    
    /**
      * By default, operations will be run in a single worker thread.
      * To avoid using workers altogether, set `threads: 0`.  For pixel operations, operations can
      * be run in multiple worker threads.  Note that there is additional overhead in
      * transferring data to multiple workers, and that depending on the user's
      * system, it may not be possible to parallelize the work.
      */
    var threads: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply(
      sources: js.Array[
          typings.ol.sourceSourceMod.default | (typings.ol.layerLayerMod.default[typings.ol.sourceSourceMod.default, /* ol.ol/layer/Layer.default<any> */ Any])
        ]
    ): Options = {
      val __obj = js.Dynamic.literal(sources = sources.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setLib(value: Any): Self = StObject.set(x, "lib", value.asInstanceOf[js.Any])
      
      inline def setLibUndefined: Self = StObject.set(x, "lib", js.undefined)
      
      inline def setOperation(
        value: (/* arg0 */ js.Array[js.Array[Double] | ImageData], /* arg1 */ Any) => js.Array[Double] | ImageData
      ): Self = StObject.set(x, "operation", js.Any.fromFunction2(value))
      
      inline def setOperationType(value: RasterOperationType): Self = StObject.set(x, "operationType", value.asInstanceOf[js.Any])
      
      inline def setOperationTypeUndefined: Self = StObject.set(x, "operationType", js.undefined)
      
      inline def setOperationUndefined: Self = StObject.set(x, "operation", js.undefined)
      
      inline def setResolutions(value: js.Array[Double]): Self = StObject.set(x, "resolutions", value.asInstanceOf[js.Any])
      
      inline def setResolutionsNull: Self = StObject.set(x, "resolutions", null)
      
      inline def setResolutionsUndefined: Self = StObject.set(x, "resolutions", js.undefined)
      
      inline def setResolutionsVarargs(value: Double*): Self = StObject.set(x, "resolutions", js.Array(value*))
      
      inline def setSources(
        value: js.Array[
              typings.ol.sourceSourceMod.default | (typings.ol.layerLayerMod.default[typings.ol.sourceSourceMod.default, /* ol.ol/layer/Layer.default<any> */ Any])
            ]
      ): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
      
      inline def setSourcesVarargs(
        value: (typings.ol.sourceSourceMod.default | (typings.ol.layerLayerMod.default[typings.ol.sourceSourceMod.default, /* ol.ol/layer/Layer.default<any> */ Any]))*
      ): Self = StObject.set(x, "sources", js.Array(value*))
      
      inline def setThreads(value: Double): Self = StObject.set(x, "threads", value.asInstanceOf[js.Any])
      
      inline def setThreadsUndefined: Self = StObject.set(x, "threads", js.undefined)
    }
  }
  
  trait ProcessorOptions extends StObject {
    
    /**
      * Pass all the image data to the operation instead of a single pixel.
      */
    var imageOps: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Functions that will be made available to operations run in a worker.
      */
    var lib: js.UndefOr[StringDictionary[js.Function]] = js.undefined
    
    /**
      * The operation.
      */
    def operation(arg0: js.Array[js.Array[Double] | ImageData], arg1: Any): js.Array[Double] | ImageData
    /**
      * The operation.
      */
    @JSName("operation")
    var operation_Original: Operation
    
    /**
      * The number of queued jobs to allow.
      */
    var queue: Double
    
    /**
      * Number of workers to spawn.
      */
    var threads: Double
  }
  object ProcessorOptions {
    
    inline def apply(
      operation: (/* arg0 */ js.Array[js.Array[Double] | ImageData], /* arg1 */ Any) => js.Array[Double] | ImageData,
      queue: Double,
      threads: Double
    ): ProcessorOptions = {
      val __obj = js.Dynamic.literal(operation = js.Any.fromFunction2(operation), queue = queue.asInstanceOf[js.Any], threads = threads.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProcessorOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ProcessorOptions] (val x: Self) extends AnyVal {
      
      inline def setImageOps(value: Boolean): Self = StObject.set(x, "imageOps", value.asInstanceOf[js.Any])
      
      inline def setImageOpsUndefined: Self = StObject.set(x, "imageOps", js.undefined)
      
      inline def setLib(value: StringDictionary[js.Function]): Self = StObject.set(x, "lib", value.asInstanceOf[js.Any])
      
      inline def setLibUndefined: Self = StObject.set(x, "lib", js.undefined)
      
      inline def setOperation(
        value: (/* arg0 */ js.Array[js.Array[Double] | ImageData], /* arg1 */ Any) => js.Array[Double] | ImageData
      ): Self = StObject.set(x, "operation", js.Any.fromFunction2(value))
      
      inline def setQueue(value: Double): Self = StObject.set(x, "queue", value.asInstanceOf[js.Any])
      
      inline def setThreads(value: Double): Self = StObject.set(x, "threads", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.ol.olStrings.pixel
    - typings.ol.olStrings.image_
  */
  trait RasterOperationType extends StObject
  object RasterOperationType {
    
    inline def image: image_ = "image".asInstanceOf[image_]
    
    inline def pixel: typings.ol.olStrings.pixel = "pixel".asInstanceOf[typings.ol.olStrings.pixel]
  }
  
  /**
    * @typedef {Object} Options
    * @property {Array<import("./Source.js").default|import("../layer/Layer.js").default>} sources Input
    * sources or layers.  For vector data, use an VectorImage layer.
    * @property {Operation} [operation] Raster operation.
    * The operation will be called with data from input sources
    * and the output will be assigned to the raster source.
    * @property {Object} [lib] Functions that will be made available to operations run in a worker.
    * @property {number} [threads] By default, operations will be run in a single worker thread.
    * To avoid using workers altogether, set `threads: 0`.  For pixel operations, operations can
    * be run in multiple worker threads.  Note that there is additional overhead in
    * transferring data to multiple workers, and that depending on the user's
    * system, it may not be possible to parallelize the work.
    * @property {RasterOperationType} [operationType='pixel'] Operation type.
    * Supported values are `'pixel'` and `'image'`.  By default,
    * `'pixel'` operations are assumed, and operations will be called with an
    * array of pixels from input sources.  If set to `'image'`, operations will
    * be called with an array of ImageData objects from input sources.
    * @property {Array<number>|null} [resolutions] Resolutions. If specified, raster operations will only
    * be run at the given resolutions.  By default, the resolutions of the first source with resolutions
    * specified will be used, if any. Set to `null` to use any view resolution instead.
    */
  /***
    * @template Return
    * @typedef {import("../Observable").OnSignature<import("../Observable").EventTypes, import("../events/Event.js").default, Return> &
    *   import("../Observable").OnSignature<import("../ObjectEventType").Types, import("../Object").ObjectEvent, Return> &
    *   import("../Observable").OnSignature<import("./Image.js").ImageSourceEventTypes, import("./Image.js").ImageSourceEvent, Return> &
    *   import("../Observable").OnSignature<RasterSourceEventTypes, RasterSourceEvent, Return> &
    *   import("../Observable").CombinedOnSignature<import("../Observable").EventTypes|import("../ObjectEventType").Types
    *     |RasterSourceEventTypes, Return>} RasterSourceOnSignature
    */
  /**
    * @classdesc
    * A source that transforms data from any number of input sources using an
    * {@link module:ol/source/Raster~Operation} function to transform input pixel values into
    * output pixel values.
    *
    * @fires module:ol/source/Raster.RasterSourceEvent
    * @api
    */
  @js.native
  trait RasterSource
    extends typings.ol.sourceImageMod.default {
    
    /**
      * Determine if all sources are ready.
      * @return {boolean} All sources are ready.
      * @private
      */
    /* private */ var allSourcesReady_ : Any = js.native
    
    /**
      * @private
      * @type {import("../Map.js").FrameState}
      */
    /* private */ var frameState_ : Any = js.native
    
    /**
      * @private
      * @type {Array<import("../layer/Layer.js").default>}
      */
    /* private */ var layers_ : Any = js.native
    
    /**
      * Called when pixel processing is complete.
      * @param {import("../Map.js").FrameState} frameState The frame state.
      * @param {Error} err Any error during processing.
      * @param {ImageData} output The output image data.
      * @param {Object|Array<Object>} data The user data (or an array if more than one thread).
      * @private
      */
    /* private */ var onWorkerComplete_ : Any = js.native
    
    /***
      * @type {RasterSourceOnSignature<import("../events").EventsKey>}
      */
    @JSName("on")
    var on_RasterSource: RasterSourceOnSignature[EventsKey] = js.native
    
    /***
      * @type {RasterSourceOnSignature<import("../events").EventsKey>}
      */
    @JSName("once")
    var once_RasterSource: RasterSourceOnSignature[EventsKey] = js.native
    
    /**
      * @private
      * @type {RasterOperationType}
      */
    /* private */ var operationType_ : Any = js.native
    
    /**
      * Start processing source data.
      * @private
      */
    /* private */ var processSources_ : Any = js.native
    
    /**
      * @private
      * @type {Processor}
      */
    /* private */ var processor_ : Any = js.native
    
    /**
      * The most recently rendered image canvas.
      * @type {import("../ImageCanvas.js").default}
      * @private
      */
    /* private */ var renderedImageCanvas_ : Any = js.native
    
    /**
      * The most recently rendered revision.
      * @type {number}
      */
    var renderedRevision_ : Double = js.native
    
    /**
      * The most recently requested frame state.
      * @type {import("../Map.js").FrameState}
      * @private
      */
    /* private */ var requestedFrameState_ : Any = js.native
    
    /**
      * Set the operation.
      * @param {Operation} operation New operation.
      * @param {Object} [lib] Functions that will be available to operations run
      *     in a worker.
      * @api
      */
    def setOperation(operation: Operation): Unit = js.native
    def setOperation(operation: Operation, lib: Any): Unit = js.native
    
    /**
      * @private
      * @type {number}
      */
    /* private */ var threads_ : Any = js.native
    
    /**
      * @private
      * @type {import("../TileQueue.js").default}
      */
    /* private */ var tileQueue_ : Any = js.native
    
    /***
      * @type {RasterSourceOnSignature<void>}
      */
    @JSName("un")
    var un_RasterSource: RasterSourceOnSignature[Unit] = js.native
    
    /**
      * Update the stored frame state.
      * @param {import("../extent.js").Extent} extent The view extent (in map units).
      * @param {number} resolution The view resolution.
      * @param {import("../proj/Projection.js").default} projection The view projection.
      * @return {import("../Map.js").FrameState} The updated frame state.
      * @private
      */
    /* private */ var updateFrameState_ : Any = js.native
    
    /** @type {boolean} */
    var useResolutions_ : Boolean = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.ol.olStrings.beforeoperations
    - typings.ol.olStrings.afteroperations
    - typings.ol.olStrings.imageloadend
    - typings.ol.olStrings.imageloaderror
    - typings.ol.olStrings.imageloadstart
  */
  trait RasterSourceEventTypes extends StObject
  object RasterSourceEventTypes {
    
    inline def afteroperations: typings.ol.olStrings.afteroperations = "afteroperations".asInstanceOf[typings.ol.olStrings.afteroperations]
    
    inline def beforeoperations: typings.ol.olStrings.beforeoperations = "beforeoperations".asInstanceOf[typings.ol.olStrings.beforeoperations]
    
    inline def imageloadend: typings.ol.olStrings.imageloadend = "imageloadend".asInstanceOf[typings.ol.olStrings.imageloadend]
    
    inline def imageloaderror: typings.ol.olStrings.imageloaderror = "imageloaderror".asInstanceOf[typings.ol.olStrings.imageloaderror]
    
    inline def imageloadstart: typings.ol.olStrings.imageloadstart = "imageloadstart".asInstanceOf[typings.ol.olStrings.imageloadstart]
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - scala.Any because Already inherited
  - scala.AnyRef because Already inherited
  - js.Any because Already inherited
  - js.Object because Already inherited
  - js.Function because Already inherited
  - typings.ol.observableMod.CombinedOnSignature because Already inherited */ @js.native
  trait RasterSourceOnSignature[Return]
    extends OnSignature[
          EventTypes | ImageSourceEventTypes | RasterSourceEventTypes | Types, 
          ImageSourceEvent | ObjectEvent | RasterSourceEvent | typings.ol.eventsEventMod.default, 
          Return
        ]
}
