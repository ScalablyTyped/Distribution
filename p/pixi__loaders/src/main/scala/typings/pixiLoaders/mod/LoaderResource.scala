package typings.pixiLoaders.mod

import typings.pixiLoaders.anon.CrossOrigin
import typings.pixiLoaders.mod.LoaderResource.LOAD_TYPE
import typings.pixiLoaders.mod.LoaderResource.OnCompleteSignal
import typings.pixiLoaders.mod.LoaderResource.OnProgressSignal
import typings.pixiLoaders.mod.LoaderResource.OnStartSignal
import typings.pixiLoaders.mod.LoaderResource.TYPE
import typings.pixiLoaders.mod.LoaderResource.XHR_RESPONSE_TYPE
import typings.pixiUtils.mod.Dict
import typings.std.Blob
import typings.std.XMLHttpRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pixi/loaders", "LoaderResource")
@js.native
open class LoaderResource protected ()
  extends StObject
     with typings.pixiLoaders.GlobalMixins.LoaderResource
     with typings.pixiLoaders.GlobalMixins.ILoaderResource {
  /**
    * @param {string} name - The name of the resource to load.
    * @param {string|string[]} url - The url for this resource, for audio/video loads you can pass
    *      an array of sources.
    * @param {object} [options] - The options for the load.
    * @param {string|boolean} [options.crossOrigin] - Is this request cross-origin? Default is to
    *      determine automatically.
    * @param {number} [options.timeout=0] - A timeout in milliseconds for the load. If the load takes
    *      longer than this time it is cancelled and the load is considered a failure. If this value is
    *      set to `0` then there is no explicit timeout.
    * @param {PIXI.LoaderResource.LOAD_TYPE} [options.loadType=LOAD_TYPE.XHR] - How should this resource
    *      be loaded?
    * @param {PIXI.LoaderResource.XHR_RESPONSE_TYPE} [options.xhrType=XHR_RESPONSE_TYPE.DEFAULT] - How
    *      should the data being loaded be interpreted when using XHR?
    * @param {PIXI.LoaderResource.IMetadata} [options.metadata] - Extra configuration for middleware
    *      and the Resource object.
    */
  def this(name: String, url: String) = this()
  def this(name: String, url: js.Array[String]) = this()
  def this(name: String, url: String, options: CrossOrigin) = this()
  def this(name: String, url: js.Array[String], options: CrossOrigin) = this()
  
  /**
    * The `complete` function bound to this resource's context.
    * @private
    * @type {Function}
    */
  /* private */ var _boundComplete: Any = js.native
  
  /**
    * The `_onError` function bound to this resource's context.
    * @private
    * @type {Function}
    */
  /* private */ var _boundOnError: Any = js.native
  
  /**
    * The `_onProgress` function bound to this resource's context.
    * @private
    * @type {Function}
    */
  /* private */ var _boundOnProgress: Any = js.native
  
  /**
    * The `_onTimeout` function bound to this resource's context.
    * @private
    * @type {Function}
    */
  /* private */ var _boundOnTimeout: Any = js.native
  
  /* private */ var _boundXhrOnAbort: Any = js.native
  
  /* private */ var _boundXhrOnError: Any = js.native
  
  /* private */ var _boundXhrOnLoad: Any = js.native
  
  /* private */ var _boundXhrOnTimeout: Any = js.native
  
  /** Clears all the events from the underlying loading source. */
  /* private */ var _clearEvents: Any = js.native
  
  /**
    * Creates a source used in loading via an element.
    * @param type - The element type (video or audio).
    * @param url - The source URL to load from.
    * @param [mime] - The mime type of the video
    * @returns The source element.
    */
  /* private */ var _createSource: Any = js.native
  
  /**
    * The `dequeue` method that will be used a storage place for the async queue dequeue method
    * used privately by the loader.
    * @private
    * @member {Function}
    */
  var _dequeue: Any = js.native
  
  /**
    * Sets the `crossOrigin` property for this resource based on if the url
    * for this resource is cross-origin. If crossOrigin was manually set, this
    * function does nothing.
    * @private
    * @param url - The url to test.
    * @param [loc=globalThis.location] - The location object to test against.
    * @returns The crossOrigin value to use (or empty string for none).
    */
  def _determineCrossOrigin(url: String): String = js.native
  def _determineCrossOrigin(url: String, loc: Any): String = js.native
  
  /**
    * Determines the loadType of a resource based on the extension of the
    * resource being loaded.
    * @private
    * @returns {PIXI.LoaderResource.LOAD_TYPE} The loadType to use.
    */
  /* private */ var _determineLoadType: Any = js.native
  
  /**
    * Determines the responseType of an XHR request based on the extension of the
    * resource being loaded.
    * @private
    * @returns {PIXI.LoaderResource.XHR_RESPONSE_TYPE} The responseType to use.
    */
  /* private */ var _determineXhrType: Any = js.native
  
  /**
    * The timer for element loads to check if they timeout.
    * @private
    */
  /* private */ var _elementTimer: Any = js.native
  
  /** Finalizes the load. */
  /* private */ var _finish: Any = js.native
  
  /**
    * The state flags of this resource.
    * @private
    * @member {number}
    */
  /* private */ var _flags: Any = js.native
  
  /**
    * Extracts the extension (sans '.') of the file being loaded by the resource.
    * @param [url] - url to parse, `this.url` by default.
    * @returns The extension.
    */
  /* private */ var _getExtension: Any = js.native
  
  /**
    * Determines the mime type of an XHR request based on the responseType of
    * resource being loaded.
    * @param type - The type to get a mime type for.
    * @private
    * @returns The mime type to use.
    */
  def _getMimeFromXhrType(`type`: XHR_RESPONSE_TYPE): String = js.native
  
  /**
    * Checks if the flag is set.
    * @param flag - The flag to check.
    * @returns True if the flag is set.
    */
  /* private */ var _hasFlag: Any = js.native
  
  /**
    * Loads this resources using an element that has a single source,
    * like an HTMLImageElement.
    * @private
    * @param type - The type of element to use.
    */
  def _loadElement(`type`: String): Unit = js.native
  
  /**
    * Loads this resources using an element that has multiple sources,
    * like an HTMLAudioElement or HTMLVideoElement.
    * @param type - The type of element to use.
    */
  /* private */ var _loadSourceElement: Any = js.native
  
  /** Loads this resources using an XDomainRequest. This is here because we need to support IE9 (gross). */
  /* private */ var _loadXdr: Any = js.native
  
  /** Loads this resources using an XMLHttpRequest. */
  /* private */ var _loadXhr: Any = js.native
  
  /**
    * Called if a load errors out.
    * @param event - The error event from the element that emits it.
    */
  /* private */ var _onError: Any = js.native
  
  /**
    * Used a storage place for the on load binding used privately by the loader.
    * @private
    * @member {Function}
    */
  var _onLoadBinding: Any = js.native
  
  /**
    * Called if a load progress event fires for an element or xhr/xdr.
    * @param event - Progress event.
    */
  /* private */ var _onProgress: Any = js.native
  
  /** Called if a timeout event fires for an element. */
  /* private */ var _onTimeout: Any = js.native
  
  /**
    * (Un)Sets the flag.
    * @param flag - The flag to (un)set.
    * @param value - Whether to set or (un)set the flag.
    */
  /* private */ var _setFlag: Any = js.native
  
  /** Called if an abort event fires for xhr/xdr. */
  /* private */ var _xhrOnAbort: Any = js.native
  
  /** Called if an error event fires for xhr/xdr. */
  /* private */ var _xhrOnError: Any = js.native
  
  /** Called when data successfully loads from an xhr/xdr request. */
  /* private */ var _xhrOnLoad: Any = js.native
  
  /** Called if an error event fires for xhr/xdr. */
  /* private */ var _xhrOnTimeout: Any = js.native
  
  /**
    * Aborts the loading of this resource, with an optional message.
    * @param {string} message - The message to use for the error
    */
  def abort(message: String): Unit = js.native
  
  /** used by parsing middleware */
  var blob: js.UndefOr[Blob] = js.native
  
  /**
    * The child resources this resource owns.
    * @type {PIXI.LoaderResource[]}
    */
  val children: js.Array[LoaderResource] = js.native
  
  /** Marks the resource as complete. */
  def complete(): Unit = js.native
  
  /** Is this request cross-origin? If unset, determined automatically. */
  var crossOrigin: String | Boolean = js.native
  
  /** The data that was loaded by the resource. */
  var data: Any = js.native
  
  /**
    * The error that occurred while loading (if any).
    * @readonly
    * @member {Error}
    */
  var error: js.Error = js.native
  
  /**
    * The extension used to load this resource.
    * @readonly
    * @type {string}
    */
  val `extension`: String = js.native
  
  /**
    * Describes if this resource has finished loading. Is true when the resource has completely
    * loaded.
    * @readonly
    * @member {boolean}
    */
  def isComplete: Boolean = js.native
  
  /**
    * When the resource starts to load.
    * @memberof PIXI.LoaderResource
    * @callback OnStartSignal@callback OnStartSignal
    * @param {PIXI.Resource} resource - The resource that the event happened on.
    */
  /**
    * When the resource reports loading progress.
    * @memberof PIXI.LoaderResource
    * @callback OnProgressSignal@callback OnProgressSignal
    * @param {PIXI.Resource} resource - The resource that the event happened on.
    * @param {number} percentage - The progress of the load in the range [0, 1].
    */
  /**
    * When the resource finishes loading.
    * @memberof PIXI.LoaderResource
    * @callback OnCompleteSignal@callback OnCompleteSignal
    * @param {PIXI.Resource} resource - The resource that the event happened on.
    */
  /**
    * @memberof PIXI.LoaderResource
    * @typedef {object} IMetadata@typedef {object} IMetadata
    * @property {HTMLImageElement|HTMLAudioElement|HTMLVideoElement} [loadElement=null] - The
    *      element to use for loading, instead of creating one.
    * @property {boolean} [skipSource=false] - Skips adding source(s) to the load element. This
    *      is useful if you want to pass in a `loadElement` that you already added load sources to.
    * @property {string|string[]} [mimeType] - The mime type to use for the source element
    *      of a video/audio elment. If the urls are an array, you can pass this as an array as well
    *      where each index is the mime type to use for the corresponding url index.
    */
  /**
    * Stores whether or not this url is a data url.
    * @readonly
    * @member {boolean}
    */
  def isDataUrl: Boolean = js.native
  
  /**
    * Describes if this resource is currently loading. Is true when the resource starts loading,
    * and is false again when complete.
    * @readonly
    * @member {boolean}
    */
  def isLoading: Boolean = js.native
  
  /**
    * Kicks off loading of this resource. This method is asynchronous.
    * @param {PIXI.LoaderResource.OnCompleteSignal} [cb] - Optional callback to call once the resource is loaded.
    */
  def load(): Unit = js.native
  def load(cb: OnCompleteSignal): Unit = js.native
  
  /**
    * The method of loading to use for this resource.
    * @type {PIXI.LoaderResource.LOAD_TYPE}
    */
  var loadType: LOAD_TYPE = js.native
  
  /**
    * Extra info for middleware, and controlling specifics about how the resource loads.
    *
    * Note that if you pass in a `loadElement`, the Resource class takes ownership of it.
    * Meaning it will modify it as it sees fit.
    * @type {PIXI.IResourceMetadata}
    */
  var metadata: IResourceMetadata = js.native
  
  /**
    * The name of this resource.
    * @readonly
    * @type {string}
    */
  val name: String = js.native
  
  /**
    * Dispatched after this resource has had all the *after* middleware run on it.
    *
    * The callback looks like {@link LoaderResource.OnCompleteSignal}.
    * @type {PIXI.Signal}
    */
  var onAfterMiddleware: Signal[OnCompleteSignal] = js.native
  
  /**
    * Dispatched once this resource has loaded, if there was an error it will
    * be in the `error` property.
    *
    * The callback looks like {@link LoaderResource.OnCompleteSignal}.
    * @type {PIXI.Signal}
    */
  var onComplete: Signal[OnCompleteSignal] = js.native
  
  /**
    * Dispatched each time progress of this resource load updates.
    * Not all resources types and loader systems can support this event
    * so sometimes it may not be available. If the resource
    * is being loaded on a modern browser, using XHR, and the remote server
    * properly sets Content-Length headers, then this will be available.
    *
    * The callback looks like {@link LoaderResource.OnProgressSignal}.
    * @type {PIXI.Signal}
    */
  var onProgress: Signal[OnProgressSignal] = js.native
  
  /**
    * Dispatched when the resource beings to load.
    *
    * The callback looks like {@link LoaderResource.OnStartSignal}.
    * @type {PIXI.Signal}
    */
  var onStart: Signal[OnStartSignal] = js.native
  
  /**
    * The progress chunk owned by this resource.
    * @readonly
    * @member {number}
    */
  var progressChunk: Double = js.native
  
  /**
    * A timeout in milliseconds for the load. If the load takes longer than this time
    * it is cancelled and the load is considered a failure. If this value is set to `0`
    * then there is no explicit timeout.
    * @type {number}
    */
  var timeout: Double = js.native
  
  /**
    * The resource type.
    * @readonly
    * @type {PIXI.LoaderResource.TYPE}
    */
  var `type`: TYPE = js.native
  
  /**
    * The url used to load this resource.
    * @readonly
    * @type {string}
    */
  val url: String = js.native
  
  /* private */ var xdr: Any = js.native
  
  /**
    * The XHR object that was used to load this resource. This is only set
    * when `loadType` is `LoaderResource.LOAD_TYPE.XHR`.
    * @readonly
    */
  var xhr: XMLHttpRequest = js.native
  
  /**
    * The type used to load the resource via XHR. If unset, determined automatically.
    * @member {string}
    */
  var xhrType: String = js.native
}
/* static members */
object LoaderResource {
  
  @JSImport("@pixi/loaders", "LoaderResource")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@pixi/loaders", "LoaderResource.EMPTY_GIF")
  @js.native
  val EMPTY_GIF: /* "data:image/gif;base64,R0lGODlhAQABAIAAAP///wAAACH5BAEAAAAALAAAAAABAAEAAAICRAEAOw==" */ String = js.native
  
  @js.native
  sealed trait LOAD_TYPE extends StObject
  @JSImport("@pixi/loaders", "LoaderResource.LOAD_TYPE")
  @js.native
  object LOAD_TYPE extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[LOAD_TYPE & Double] = js.native
    
    /** Uses an `Audio` object to load the resource. */
    @js.native
    sealed trait AUDIO
      extends StObject
         with LOAD_TYPE
    /* 3 */ val AUDIO: typings.pixiLoaders.mod.LoaderResource.LOAD_TYPE.AUDIO & Double = js.native
    
    /** Uses an `Image` object to load the resource. */
    @js.native
    sealed trait IMAGE
      extends StObject
         with LOAD_TYPE
    /* 2 */ val IMAGE: typings.pixiLoaders.mod.LoaderResource.LOAD_TYPE.IMAGE & Double = js.native
    
    /** Uses a `Video` object to load the resource. */
    @js.native
    sealed trait VIDEO
      extends StObject
         with LOAD_TYPE
    /* 4 */ val VIDEO: typings.pixiLoaders.mod.LoaderResource.LOAD_TYPE.VIDEO & Double = js.native
    
    /** Uses XMLHttpRequest to load the resource. */
    @js.native
    sealed trait XHR
      extends StObject
         with LOAD_TYPE
    /* 1 */ val XHR: typings.pixiLoaders.mod.LoaderResource.LOAD_TYPE.XHR & Double = js.native
  }
  
  @js.native
  sealed trait STATUS_FLAGS extends StObject
  @JSImport("@pixi/loaders", "LoaderResource.STATUS_FLAGS")
  @js.native
  object STATUS_FLAGS extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[STATUS_FLAGS & Double] = js.native
    
    /** Complete */
    @js.native
    sealed trait COMPLETE
      extends StObject
         with STATUS_FLAGS
    /* 2 */ val COMPLETE: typings.pixiLoaders.mod.LoaderResource.STATUS_FLAGS.COMPLETE & Double = js.native
    
    /** Data URL */
    @js.native
    sealed trait DATA_URL
      extends StObject
         with STATUS_FLAGS
    /* 1 */ val DATA_URL: typings.pixiLoaders.mod.LoaderResource.STATUS_FLAGS.DATA_URL & Double = js.native
    
    /** Loading */
    @js.native
    sealed trait LOADING
      extends StObject
         with STATUS_FLAGS
    /* 4 */ val LOADING: typings.pixiLoaders.mod.LoaderResource.STATUS_FLAGS.LOADING & Double = js.native
    
    /** None */
    @js.native
    sealed trait NONE
      extends StObject
         with STATUS_FLAGS
    /* 0 */ val NONE: typings.pixiLoaders.mod.LoaderResource.STATUS_FLAGS.NONE & Double = js.native
  }
  
  @js.native
  sealed trait TYPE extends StObject
  @JSImport("@pixi/loaders", "LoaderResource.TYPE")
  @js.native
  object TYPE extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[TYPE & Double] = js.native
    
    /** Audio */
    @js.native
    sealed trait AUDIO
      extends StObject
         with TYPE
    /* 4 */ val AUDIO: typings.pixiLoaders.mod.LoaderResource.TYPE.AUDIO & Double = js.native
    
    /** Image */
    @js.native
    sealed trait IMAGE
      extends StObject
         with TYPE
    /* 3 */ val IMAGE: typings.pixiLoaders.mod.LoaderResource.TYPE.IMAGE & Double = js.native
    
    /** JSON */
    @js.native
    sealed trait JSON
      extends StObject
         with TYPE
    /* 1 */ val JSON: typings.pixiLoaders.mod.LoaderResource.TYPE.JSON & Double = js.native
    
    /** Plain text */
    @js.native
    sealed trait TEXT
      extends StObject
         with TYPE
    /* 6 */ val TEXT: typings.pixiLoaders.mod.LoaderResource.TYPE.TEXT & Double = js.native
    
    /** Unknown */
    @js.native
    sealed trait UNKNOWN
      extends StObject
         with TYPE
    /* 0 */ val UNKNOWN: typings.pixiLoaders.mod.LoaderResource.TYPE.UNKNOWN & Double = js.native
    
    /** Video */
    @js.native
    sealed trait VIDEO
      extends StObject
         with TYPE
    /* 5 */ val VIDEO: typings.pixiLoaders.mod.LoaderResource.TYPE.VIDEO & Double = js.native
    
    /** XML */
    @js.native
    sealed trait XML
      extends StObject
         with TYPE
    /* 2 */ val XML: typings.pixiLoaders.mod.LoaderResource.TYPE.XML & Double = js.native
  }
  
  @js.native
  sealed trait XHR_RESPONSE_TYPE extends StObject
  @JSImport("@pixi/loaders", "LoaderResource.XHR_RESPONSE_TYPE")
  @js.native
  object XHR_RESPONSE_TYPE extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[XHR_RESPONSE_TYPE & String] = js.native
    
    /** Blob */
    @js.native
    sealed trait BLOB
      extends StObject
         with XHR_RESPONSE_TYPE
    /* "blob" */ val BLOB: typings.pixiLoaders.mod.LoaderResource.XHR_RESPONSE_TYPE.BLOB & String = js.native
    
    /** ArrayBuffer */
    @js.native
    sealed trait BUFFER
      extends StObject
         with XHR_RESPONSE_TYPE
    /* "arraybuffer" */ val BUFFER: typings.pixiLoaders.mod.LoaderResource.XHR_RESPONSE_TYPE.BUFFER & String = js.native
    
    /** string */
    @js.native
    sealed trait DEFAULT
      extends StObject
         with XHR_RESPONSE_TYPE
    /* "text" */ val DEFAULT: typings.pixiLoaders.mod.LoaderResource.XHR_RESPONSE_TYPE.DEFAULT & String = js.native
    
    /** Document */
    @js.native
    sealed trait DOCUMENT
      extends StObject
         with XHR_RESPONSE_TYPE
    /* "document" */ val DOCUMENT: typings.pixiLoaders.mod.LoaderResource.XHR_RESPONSE_TYPE.DOCUMENT & String = js.native
    
    /** Object */
    @js.native
    sealed trait JSON
      extends StObject
         with XHR_RESPONSE_TYPE
    /* "json" */ val JSON: typings.pixiLoaders.mod.LoaderResource.XHR_RESPONSE_TYPE.JSON & String = js.native
    
    /** String */
    @js.native
    sealed trait TEXT
      extends StObject
         with XHR_RESPONSE_TYPE
    /* "text" */ val TEXT: typings.pixiLoaders.mod.LoaderResource.XHR_RESPONSE_TYPE.TEXT & String = js.native
  }
  
  @JSImport("@pixi/loaders", "LoaderResource._loadTypeMap")
  @js.native
  val loadTypeMap: Dict[Double] = js.native
  
  /**
    * Sets the load type to be used for a specific extension.
    * @static
    * @param {string} extname - The extension to set the type for, e.g. "png" or "fnt"
    * @param {PIXI.LoaderResource.LOAD_TYPE} loadType - The load type to set it to.
    */
  inline def setExtensionLoadType(extname: String, loadType: LOAD_TYPE): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setExtensionLoadType")(extname.asInstanceOf[js.Any], loadType.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Sets the load type to be used for a specific extension.
    * @static
    * @param {string} extname - The extension to set the type for, e.g. "png" or "fnt"
    * @param {PIXI.LoaderResource.XHR_RESPONSE_TYPE} xhrType - The xhr type to set it to.
    */
  inline def setExtensionXhrType(extname: String, xhrType: XHR_RESPONSE_TYPE): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setExtensionXhrType")(extname.asInstanceOf[js.Any], xhrType.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("@pixi/loaders", "LoaderResource._xhrTypeMap")
  @js.native
  val xhrTypeMap: Dict[XHR_RESPONSE_TYPE] = js.native
  
  type OnCompleteSignal = js.Function1[/* resource */ LoaderResource, Unit]
  
  type OnProgressSignal = js.Function2[/* resource */ LoaderResource, /* percentage */ Double, Unit]
  
  type OnStartSignal = js.Function1[/* resource */ LoaderResource, Unit]
}
