package typings.pixiJs.mod

import typings.std.HTMLCanvasElement
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * User's customizable globals for overriding the default PIXI settings, such
  * as a renderer's default resolution, framerate, float precision, etc.
  * @example
  * // Use the native window resolution as the default resolution
  * // will support high-density displays when rendering
  * PIXI.settings.RESOLUTION = window.devicePixelRatio;
  *
  * // Disable interpolation when scaling, will make texture be pixelated
  * PIXI.settings.SCALE_MODE = PIXI.SCALE_MODES.NEAREST;
  * @namespace PIXI.settings
  */
object settings {
  
  @JSImport("pixi.js", "settings")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Default anisotropic filtering level of textures.
    * Usually from 0 to 16
    *
    * @static
    * @name ANISOTROPIC_LEVEL
    * @memberof PIXI.settings
    * @type {number}
    * @default 0
    */
  @JSImport("pixi.js", "settings.ANISOTROPIC_LEVEL")
  @js.native
  def ANISOTROPIC_LEVEL: Double = js.native
  inline def ANISOTROPIC_LEVEL_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ANISOTROPIC_LEVEL")(x.asInstanceOf[js.Any])
  
  /**
    * Can we upload the same buffer in a single frame?
    *
    * @static
    * @name CAN_UPLOAD_SAME_BUFFER
    * @memberof PIXI.settings
    * @type {boolean}
    */
  @JSImport("pixi.js", "settings.CAN_UPLOAD_SAME_BUFFER")
  @js.native
  def CAN_UPLOAD_SAME_BUFFER: Boolean = js.native
  inline def CAN_UPLOAD_SAME_BUFFER_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CAN_UPLOAD_SAME_BUFFER")(x.asInstanceOf[js.Any])
  
  /**
    * Enables bitmap creation before image load. This feature is experimental.
    *
    * @static
    * @name CREATE_IMAGE_BITMAP
    * @memberof PIXI.settings
    * @type {boolean}
    * @default false
    */
  @JSImport("pixi.js", "settings.CREATE_IMAGE_BITMAP")
  @js.native
  def CREATE_IMAGE_BITMAP: Boolean = js.native
  inline def CREATE_IMAGE_BITMAP_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CREATE_IMAGE_BITMAP")(x.asInstanceOf[js.Any])
  
  /**
    * Should the `failIfMajorPerformanceCaveat` flag be enabled as a context option used in the `isWebGLSupported` function.
    * For most scenarios this should be left as true, as otherwise the user may have a poor experience.
    * However, it can be useful to disable under certain scenarios, such as headless unit tests.
    *
    * @static
    * @name FAIL_IF_MAJOR_PERFORMANCE_CAVEAT
    * @memberof PIXI.settings
    * @type {boolean}
    * @default true
    */
  @JSImport("pixi.js", "settings.FAIL_IF_MAJOR_PERFORMANCE_CAVEAT")
  @js.native
  def FAIL_IF_MAJOR_PERFORMANCE_CAVEAT: Boolean = js.native
  inline def FAIL_IF_MAJOR_PERFORMANCE_CAVEAT_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FAIL_IF_MAJOR_PERFORMANCE_CAVEAT")(x.asInstanceOf[js.Any])
  
  /**
    * Default filter resolution.
    *
    * @static
    * @name FILTER_RESOLUTION
    * @memberof PIXI.settings
    * @type {number}
    * @default 1
    */
  @JSImport("pixi.js", "settings.FILTER_RESOLUTION")
  @js.native
  def FILTER_RESOLUTION: Double = js.native
  inline def FILTER_RESOLUTION_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FILTER_RESOLUTION")(x.asInstanceOf[js.Any])
  
  /**
    * Default Garbage Collection maximum check count.
    *
    * @static
    * @name GC_MAX_CHECK_COUNT
    * @memberof PIXI.settings
    * @type {number}
    * @default 600
    */
  @JSImport("pixi.js", "settings.GC_MAX_CHECK_COUNT")
  @js.native
  def GC_MAX_CHECK_COUNT: Double = js.native
  inline def GC_MAX_CHECK_COUNT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GC_MAX_CHECK_COUNT")(x.asInstanceOf[js.Any])
  
  /**
    * Default Garbage Collection max idle.
    *
    * @static
    * @name GC_MAX_IDLE
    * @memberof PIXI.settings
    * @type {number}
    * @default 3600
    */
  @JSImport("pixi.js", "settings.GC_MAX_IDLE")
  @js.native
  def GC_MAX_IDLE: Double = js.native
  inline def GC_MAX_IDLE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GC_MAX_IDLE")(x.asInstanceOf[js.Any])
  
  /**
    * Default Garbage Collection mode.
    *
    * @static
    * @name GC_MODE
    * @memberof PIXI.settings
    * @type {PIXI.GC_MODES}
    * @default PIXI.GC_MODES.AUTO
    */
  @JSImport("pixi.js", "settings.GC_MODE")
  @js.native
  def GC_MODE: typings.pixiJs.PIXI.GC_MODES = js.native
  inline def GC_MODE_=(x: typings.pixiJs.PIXI.GC_MODES): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GC_MODE")(x.asInstanceOf[js.Any])
  
  /**
    * If set to true WebGL will attempt make textures mimpaped by default.
    * Mipmapping will only succeed if the base texture uploaded has power of two dimensions.
    *
    * @static
    * @name MIPMAP_TEXTURES
    * @memberof PIXI.settings
    * @type {PIXI.MIPMAP_MODES}
    * @default PIXI.MIPMAP_MODES.POW2
    */
  @JSImport("pixi.js", "settings.MIPMAP_TEXTURES")
  @js.native
  def MIPMAP_TEXTURES: typings.pixiJs.PIXI.MIPMAP_MODES = js.native
  inline def MIPMAP_TEXTURES_=(x: typings.pixiJs.PIXI.MIPMAP_MODES): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MIPMAP_TEXTURES")(x.asInstanceOf[js.Any])
  
  /**
    * Default specify float precision in fragment shader.
    * iOS is best set at highp due to https://github.com/pixijs/pixi.js/issues/3742
    *
    * @static
    * @name PRECISION_FRAGMENT
    * @memberof PIXI.settings
    * @type {PIXI.PRECISION}
    * @default PIXI.PRECISION.MEDIUM
    */
  @JSImport("pixi.js", "settings.PRECISION_FRAGMENT")
  @js.native
  def PRECISION_FRAGMENT: typings.pixiJs.PIXI.PRECISION = js.native
  inline def PRECISION_FRAGMENT_=(x: typings.pixiJs.PIXI.PRECISION): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PRECISION_FRAGMENT")(x.asInstanceOf[js.Any])
  
  /**
    * Default specify float precision in vertex shader.
    *
    * @static
    * @name PRECISION_VERTEX
    * @memberof PIXI.settings
    * @type {PIXI.PRECISION}
    * @default PIXI.PRECISION.HIGH
    */
  @JSImport("pixi.js", "settings.PRECISION_VERTEX")
  @js.native
  def PRECISION_VERTEX: typings.pixiJs.PIXI.PRECISION = js.native
  inline def PRECISION_VERTEX_=(x: typings.pixiJs.PIXI.PRECISION): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PRECISION_VERTEX")(x.asInstanceOf[js.Any])
  
  /**
    * The maximum support for using WebGL. If a device does not
    * support WebGL version, for instance WebGL 2, it will still
    * attempt to fallback support to WebGL 1. If you want to
    * explicitly remove feature support to target a more stable
    * baseline, prefer a lower environment.
    *
    * Due to {@link https://bugs.chromium.org/p/chromium/issues/detail?id=934823|bug in chromium}
    * we disable webgl2 by default for all non-apple mobile devices.
    *
    * @static
    * @name PREFER_ENV
    * @memberof PIXI.settings
    * @type {number}
    * @default PIXI.ENV.WEBGL2
    */
  @JSImport("pixi.js", "settings.PREFER_ENV")
  @js.native
  def PREFER_ENV: Double = js.native
  inline def PREFER_ENV_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PREFER_ENV")(x.asInstanceOf[js.Any])
  
  /**
    * The default render options if none are supplied to {@link PIXI.Renderer}
    * or {@link PIXI.CanvasRenderer}.
    *
    * @static
    * @name RENDER_OPTIONS
    * @memberof PIXI.settings
    * @type {object}
    * @property {HTMLCanvasElement} view=null
    * @property {number} resolution=1
    * @property {boolean} antialias=false
    * @property {boolean} autoDensity=false
    * @property {boolean} transparent=false
    * @property {number} backgroundColor=0x000000
    * @property {boolean} clearBeforeRender=true
    * @property {boolean} preserveDrawingBuffer=false
    * @property {number} width=800
    * @property {number} height=600
    * @property {boolean} legacy=false
    */
  object RENDER_OPTIONS {
    
    @JSImport("pixi.js", "settings.RENDER_OPTIONS")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("pixi.js", "settings.RENDER_OPTIONS.antialias")
    @js.native
    def antialias: Boolean = js.native
    inline def antialias_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("antialias")(x.asInstanceOf[js.Any])
    
    @JSImport("pixi.js", "settings.RENDER_OPTIONS.autoDensity")
    @js.native
    def autoDensity: Boolean = js.native
    inline def autoDensity_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("autoDensity")(x.asInstanceOf[js.Any])
    
    @JSImport("pixi.js", "settings.RENDER_OPTIONS.backgroundColor")
    @js.native
    def backgroundColor: Double = js.native
    inline def backgroundColor_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(x.asInstanceOf[js.Any])
    
    @JSImport("pixi.js", "settings.RENDER_OPTIONS.clearBeforeRender")
    @js.native
    def clearBeforeRender: Boolean = js.native
    inline def clearBeforeRender_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("clearBeforeRender")(x.asInstanceOf[js.Any])
    
    @JSImport("pixi.js", "settings.RENDER_OPTIONS.height")
    @js.native
    def height: Double = js.native
    inline def height_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("height")(x.asInstanceOf[js.Any])
    
    @JSImport("pixi.js", "settings.RENDER_OPTIONS.legacy")
    @js.native
    def legacy: Boolean = js.native
    inline def legacy_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("legacy")(x.asInstanceOf[js.Any])
    
    @JSImport("pixi.js", "settings.RENDER_OPTIONS.preserveDrawingBuffer")
    @js.native
    def preserveDrawingBuffer: Boolean = js.native
    inline def preserveDrawingBuffer_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("preserveDrawingBuffer")(x.asInstanceOf[js.Any])
    
    @JSImport("pixi.js", "settings.RENDER_OPTIONS.resolution")
    @js.native
    def resolution: Double = js.native
    inline def resolution_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("resolution")(x.asInstanceOf[js.Any])
    
    @JSImport("pixi.js", "settings.RENDER_OPTIONS.transparent")
    @js.native
    def transparent: Boolean = js.native
    inline def transparent_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("transparent")(x.asInstanceOf[js.Any])
    
    @JSImport("pixi.js", "settings.RENDER_OPTIONS.view")
    @js.native
    def view: HTMLCanvasElement = js.native
    inline def view_=(x: HTMLCanvasElement): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("view")(x.asInstanceOf[js.Any])
    
    @JSImport("pixi.js", "settings.RENDER_OPTIONS.width")
    @js.native
    def width: Double = js.native
    inline def width_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("width")(x.asInstanceOf[js.Any])
  }
  
  /**
    * Default resolution / device pixel ratio of the renderer.
    *
    * @static
    * @name RESOLUTION
    * @memberof PIXI.settings
    * @type {number}
    * @default 1
    */
  @JSImport("pixi.js", "settings.RESOLUTION")
  @js.native
  def RESOLUTION: Double = js.native
  inline def RESOLUTION_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RESOLUTION")(x.asInstanceOf[js.Any])
  
  /**
    * The prefix that denotes a URL is for a retina asset.
    *
    * @static
    * @name RETINA_PREFIX
    * @memberof PIXI.settings
    * @type {RegExp}
    * @default /@([0-9\.]+)x/
    * @example `@2x`
    */
  @JSImport("pixi.js", "settings.RETINA_PREFIX")
  @js.native
  def RETINA_PREFIX: RegExp = js.native
  inline def RETINA_PREFIX_=(x: RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RETINA_PREFIX")(x.asInstanceOf[js.Any])
  
  /**
    * If true PixiJS will Math.floor() x/y values when rendering, stopping pixel interpolation.
    * Advantages can include sharper image quality (like text) and faster rendering on canvas.
    * The main disadvantage is movement of objects may appear less smooth.
    *
    * @static
    * @constant
    * @memberof PIXI.settings
    * @type {boolean}
    * @default false
    */
  @JSImport("pixi.js", "settings.ROUND_PIXELS")
  @js.native
  def ROUND_PIXELS: Boolean = js.native
  inline def ROUND_PIXELS_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ROUND_PIXELS")(x.asInstanceOf[js.Any])
  
  /**
    * Default scale mode for textures.
    *
    * @static
    * @name SCALE_MODE
    * @memberof PIXI.settings
    * @type {PIXI.SCALE_MODES}
    * @default PIXI.SCALE_MODES.LINEAR
    */
  @JSImport("pixi.js", "settings.SCALE_MODE")
  @js.native
  def SCALE_MODE: typings.pixiJs.PIXI.SCALE_MODES = js.native
  inline def SCALE_MODE_=(x: typings.pixiJs.PIXI.SCALE_MODES): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SCALE_MODE")(x.asInstanceOf[js.Any])
  
  /**
    * Sets the default value for the container property 'sortableChildren'.
    * If set to true, the container will sort its children by zIndex value
    * when updateTransform() is called, or manually if sortChildren() is called.
    *
    * This actually changes the order of elements in the array, so should be treated
    * as a basic solution that is not performant compared to other solutions,
    * such as @link https://github.com/pixijs/pixi-display
    *
    * Also be aware of that this may not work nicely with the addChildAt() function,
    * as the zIndex sorting may cause the child to automatically sorted to another position.
    *
    * @static
    * @constant
    * @name SORTABLE_CHILDREN
    * @memberof PIXI.settings
    * @type {boolean}
    * @default false
    */
  @JSImport("pixi.js", "settings.SORTABLE_CHILDREN")
  @js.native
  def SORTABLE_CHILDREN: Boolean = js.native
  inline def SORTABLE_CHILDREN_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SORTABLE_CHILDREN")(x.asInstanceOf[js.Any])
  
  /**
    * The default sprite batch size.
    *
    * The default aims to balance desktop and mobile devices.
    *
    * @static
    * @name SPRITE_BATCH_SIZE
    * @memberof PIXI.settings
    * @type {number}
    * @default 4096
    */
  @JSImport("pixi.js", "settings.SPRITE_BATCH_SIZE")
  @js.native
  def SPRITE_BATCH_SIZE: Double = js.native
  inline def SPRITE_BATCH_SIZE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SPRITE_BATCH_SIZE")(x.asInstanceOf[js.Any])
  
  /**
    * The maximum textures that this device supports.
    *
    * @static
    * @name SPRITE_MAX_TEXTURES
    * @memberof PIXI.settings
    * @type {number}
    * @default 32
    */
  @JSImport("pixi.js", "settings.SPRITE_MAX_TEXTURES")
  @js.native
  def SPRITE_MAX_TEXTURES: Double = js.native
  inline def SPRITE_MAX_TEXTURES_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SPRITE_MAX_TEXTURES")(x.asInstanceOf[js.Any])
  
  /**
    * If set to `true`, *only* Textures and BaseTexture objects stored
    * in the caches ({@link PIXI.utils.TextureCache TextureCache} and
    * {@link PIXI.utils.BaseTextureCache BaseTextureCache}) can be
    * used when calling {@link PIXI.Texture.from Texture.from} or
    * {@link PIXI.BaseTexture.from BaseTexture.from}.
    * Otherwise, these `from` calls throw an exception. Using this property
    * can be useful if you want to enforce preloading all assets with
    * {@link PIXI.Loader Loader}.
    *
    * @static
    * @name STRICT_TEXTURE_CACHE
    * @memberof PIXI.settings
    * @type {boolean}
    * @default false
    */
  @JSImport("pixi.js", "settings.STRICT_TEXTURE_CACHE")
  @js.native
  def STRICT_TEXTURE_CACHE: Boolean = js.native
  inline def STRICT_TEXTURE_CACHE_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("STRICT_TEXTURE_CACHE")(x.asInstanceOf[js.Any])
  
  /**
    * Target frames per millisecond.
    *
    * @static
    * @name TARGET_FPMS
    * @memberof PIXI.settings
    * @type {number}
    * @default 0.06
    */
  @JSImport("pixi.js", "settings.TARGET_FPMS")
  @js.native
  def TARGET_FPMS: Double = js.native
  inline def TARGET_FPMS_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TARGET_FPMS")(x.asInstanceOf[js.Any])
  
  /**
    * Default number of uploads per frame using prepare plugin.
    *
    * @static
    * @memberof PIXI.settings
    * @name UPLOADS_PER_FRAME
    * @type {number}
    * @default 4
    */
  @JSImport("pixi.js", "settings.UPLOADS_PER_FRAME")
  @js.native
  def UPLOADS_PER_FRAME: Double = js.native
  inline def UPLOADS_PER_FRAME_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UPLOADS_PER_FRAME")(x.asInstanceOf[js.Any])
  
  /**
    * Default wrap modes that are supported by pixi.
    *
    * @static
    * @name WRAP_MODE
    * @memberof PIXI.settings
    * @type {PIXI.WRAP_MODES}
    * @default PIXI.WRAP_MODES.CLAMP
    */
  @JSImport("pixi.js", "settings.WRAP_MODE")
  @js.native
  def WRAP_MODE: typings.pixiJs.PIXI.WRAP_MODES = js.native
  inline def WRAP_MODE_=(x: typings.pixiJs.PIXI.WRAP_MODES): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WRAP_MODE")(x.asInstanceOf[js.Any])
}
