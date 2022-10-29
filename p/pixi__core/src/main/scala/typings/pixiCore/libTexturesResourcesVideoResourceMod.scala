package typings.pixiCore

import typings.pixiCore.libTexturesResourcesAutoDetectResourceMod._IAutoDetectOptions
import typings.pixiCore.libTexturesResourcesBaseImageResourceMod.BaseImageResource
import typings.pixiUtils.libTypesMod.Dict
import typings.std.HTMLVideoElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTexturesResourcesVideoResourceMod {
  
  @JSImport("@pixi/core/lib/textures/resources/VideoResource", "VideoResource")
  @js.native
  /**
    * @param {HTMLVideoElement|object|string|Array<string|object>} source - Video element to use.
    * @param {object} [options] - Options to use
    * @param {boolean} [options.autoLoad=true] - Start loading the video immediately
    * @param {boolean} [options.autoPlay=true] - Start playing video immediately
    * @param {number} [options.updateFPS=0] - How many times a second to update the texture from the video.
    * Leave at 0 to update at every render.
    * @param {boolean} [options.crossorigin=true] - Load image using cross origin
    */
  open class VideoResource () extends BaseImageResource {
    def this(source: String) = this()
    def this(source: js.Array[String | IVideoResourceOptionsElement]) = this()
    def this(source: HTMLVideoElement) = this()
    def this(source: String, options: IVideoResourceOptions) = this()
    def this(source: js.Array[String | IVideoResourceOptionsElement], options: IVideoResourceOptions) = this()
    def this(source: Unit, options: IVideoResourceOptions) = this()
    def this(source: HTMLVideoElement, options: IVideoResourceOptions) = this()
    
    /**
      * `true` to use PIXI.Ticker.shared to auto update the base texture.
      * @default true
      */
    /* protected */ var _autoUpdate: Boolean = js.native
    
    /**
      * `true` if the instance is currently connected to PIXI.Ticker.shared to auto update the base texture.
      * @default false
      */
    /* protected */ var _isConnectedToTicker: Boolean = js.native
    
    /**
      * Returns true if the underlying source is playing.
      * @returns - True if playing.
      */
    /* private */ var _isSourcePlaying: Any = js.native
    
    /**
      * Returns true if the underlying source is ready for playing.
      * @returns - True if ready.
      */
    /* private */ var _isSourceReady: Any = js.native
    
    /**
      * Promise when loading.
      * @default null
      */
    /* private */ var _load: Any = js.native
    
    /* protected */ var _msToNextUpdate: Double = js.native
    
    /** Fired when the video is loaded and ready to play. */
    /* private */ var _onCanPlay: Any = js.native
    
    /**
      * Handle video error events.
      * @param event
      */
    /* private */ var _onError: Any = js.native
    
    /** Runs the update loop when the video is ready to play. */
    /* private */ var _onPlayStart: Any = js.native
    
    /** Fired when a pause event is triggered, stops the update loop. */
    /* private */ var _onPlayStop: Any = js.native
    
    /** Callback when completed with load. */
    /* private */ var _resolve: Any = js.native
    
    /* protected */ var _updateFPS: Double = js.native
    
    /**
      * When set to true will automatically play videos used by this texture once
      * they are loaded. If false, it will not modify the playing state.
      * @default true
      */
    /* protected */ var autoPlay: Boolean = js.native
    
    /** Should the base texture automatically update itself, set to true by default. */
    def autoUpdate: Boolean = js.native
    def autoUpdate_=(value: Boolean): Unit = js.native
    
    /** Override the source to be the video element. */
    @JSName("source")
    var source_VideoResource: HTMLVideoElement = js.native
    
    def update(_deltaTime: Double): Unit = js.native
    
    /**
      * How many times a second to update the texture from the video. Leave at 0 to update at every render.
      * A lower fps can help performance, as updating the texture at 60fps on a 30ps video may not be efficient.
      */
    def updateFPS: Double = js.native
    def updateFPS_=(value: Double): Unit = js.native
  }
  /* static members */
  object VideoResource {
    
    @JSImport("@pixi/core/lib/textures/resources/VideoResource", "VideoResource")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Map of video MIME types that can't be directly derived from file extensions.
      * @readonly
      */
    @JSImport("@pixi/core/lib/textures/resources/VideoResource", "VideoResource.MIME_TYPES")
    @js.native
    def MIME_TYPES: Dict[String] = js.native
    inline def MIME_TYPES_=(x: Dict[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MIME_TYPES")(x.asInstanceOf[js.Any])
    
    /**
      * List of common video file extensions supported by VideoResource.
      * @readonly
      */
    @JSImport("@pixi/core/lib/textures/resources/VideoResource", "VideoResource.TYPES")
    @js.native
    def TYPES: js.Array[String] = js.native
    inline def TYPES_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TYPES")(x.asInstanceOf[js.Any])
    
    /**
      * Used to auto-detect the type of resource.
      * @param {*} source - The source object
      * @param {string} extension - The extension of source, if set
      * @returns {boolean} `true` if video source
      */
    inline def test(source: Any): /* is std.HTMLVideoElement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("test")(source.asInstanceOf[js.Any]).asInstanceOf[/* is std.HTMLVideoElement */ Boolean]
    inline def test(source: Any, `extension`: String): /* is std.HTMLVideoElement */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("test")(source.asInstanceOf[js.Any], `extension`.asInstanceOf[js.Any])).asInstanceOf[/* is std.HTMLVideoElement */ Boolean]
  }
  
  trait IVideoResourceOptions
    extends StObject
       with _IAutoDetectOptions {
    
    var autoLoad: js.UndefOr[Boolean] = js.undefined
    
    var autoPlay: js.UndefOr[Boolean] = js.undefined
    
    var crossorigin: js.UndefOr[Boolean | String] = js.undefined
    
    var updateFPS: js.UndefOr[Double] = js.undefined
  }
  object IVideoResourceOptions {
    
    inline def apply(): IVideoResourceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IVideoResourceOptions]
    }
    
    extension [Self <: IVideoResourceOptions](x: Self) {
      
      inline def setAutoLoad(value: Boolean): Self = StObject.set(x, "autoLoad", value.asInstanceOf[js.Any])
      
      inline def setAutoLoadUndefined: Self = StObject.set(x, "autoLoad", js.undefined)
      
      inline def setAutoPlay(value: Boolean): Self = StObject.set(x, "autoPlay", value.asInstanceOf[js.Any])
      
      inline def setAutoPlayUndefined: Self = StObject.set(x, "autoPlay", js.undefined)
      
      inline def setCrossorigin(value: Boolean | String): Self = StObject.set(x, "crossorigin", value.asInstanceOf[js.Any])
      
      inline def setCrossoriginUndefined: Self = StObject.set(x, "crossorigin", js.undefined)
      
      inline def setUpdateFPS(value: Double): Self = StObject.set(x, "updateFPS", value.asInstanceOf[js.Any])
      
      inline def setUpdateFPSUndefined: Self = StObject.set(x, "updateFPS", js.undefined)
    }
  }
  
  trait IVideoResourceOptionsElement extends StObject {
    
    var mime: String
    
    var src: String
  }
  object IVideoResourceOptionsElement {
    
    inline def apply(mime: String, src: String): IVideoResourceOptionsElement = {
      val __obj = js.Dynamic.literal(mime = mime.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any])
      __obj.asInstanceOf[IVideoResourceOptionsElement]
    }
    
    extension [Self <: IVideoResourceOptionsElement](x: Self) {
      
      inline def setMime(value: String): Self = StObject.set(x, "mime", value.asInstanceOf[js.Any])
      
      inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    }
  }
}
