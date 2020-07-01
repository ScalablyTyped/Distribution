package typings.pixiJs.global.PIXI

import typings.std.HTMLCanvasElement
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
@JSGlobal("PIXI.settings")
@js.native
object settings extends js.Object {
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
  var ANISOTROPIC_LEVEL: Double = js.native
  /**
    * Can we upload the same buffer in a single frame?
    *
    * @static
    * @name CAN_UPLOAD_SAME_BUFFER
    * @memberof PIXI.settings
    * @type {boolean}
    */
  var CAN_UPLOAD_SAME_BUFFER: Boolean = js.native
  /**
    * Enables bitmap creation before image load. This feature is experimental.
    *
    * @static
    * @name CREATE_IMAGE_BITMAP
    * @memberof PIXI.settings
    * @type {boolean}
    * @default false
    */
  var CREATE_IMAGE_BITMAP: Boolean = js.native
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
  var FAIL_IF_MAJOR_PERFORMANCE_CAVEAT: Boolean = js.native
  /**
    * Default filter resolution.
    *
    * @static
    * @name FILTER_RESOLUTION
    * @memberof PIXI.settings
    * @type {number}
    * @default 1
    */
  var FILTER_RESOLUTION: Double = js.native
  /**
    * Default Garbage Collection maximum check count.
    *
    * @static
    * @name GC_MAX_CHECK_COUNT
    * @memberof PIXI.settings
    * @type {number}
    * @default 600
    */
  var GC_MAX_CHECK_COUNT: Double = js.native
  /**
    * Default Garbage Collection max idle.
    *
    * @static
    * @name GC_MAX_IDLE
    * @memberof PIXI.settings
    * @type {number}
    * @default 3600
    */
  var GC_MAX_IDLE: Double = js.native
  /**
    * Default Garbage Collection mode.
    *
    * @static
    * @name GC_MODE
    * @memberof PIXI.settings
    * @type {PIXI.GC_MODES}
    * @default PIXI.GC_MODES.AUTO
    */
  var GC_MODE: typings.pixiJs.PIXI.GC_MODES = js.native
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
  var MIPMAP_TEXTURES: typings.pixiJs.PIXI.MIPMAP_MODES = js.native
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
  var PRECISION_FRAGMENT: typings.pixiJs.PIXI.PRECISION = js.native
  /**
    * Default specify float precision in vertex shader.
    *
    * @static
    * @name PRECISION_VERTEX
    * @memberof PIXI.settings
    * @type {PIXI.PRECISION}
    * @default PIXI.PRECISION.HIGH
    */
  var PRECISION_VERTEX: typings.pixiJs.PIXI.PRECISION = js.native
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
  var PREFER_ENV: Double = js.native
  /**
    * Default resolution / device pixel ratio of the renderer.
    *
    * @static
    * @name RESOLUTION
    * @memberof PIXI.settings
    * @type {number}
    * @default 1
    */
  var RESOLUTION: Double = js.native
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
  var RETINA_PREFIX: RegExp = js.native
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
  var ROUND_PIXELS: Boolean = js.native
  /**
    * Default scale mode for textures.
    *
    * @static
    * @name SCALE_MODE
    * @memberof PIXI.settings
    * @type {PIXI.SCALE_MODES}
    * @default PIXI.SCALE_MODES.LINEAR
    */
  var SCALE_MODE: typings.pixiJs.PIXI.SCALE_MODES = js.native
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
  var SORTABLE_CHILDREN: Boolean = js.native
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
  var SPRITE_BATCH_SIZE: Double = js.native
  /**
    * The maximum textures that this device supports.
    *
    * @static
    * @name SPRITE_MAX_TEXTURES
    * @memberof PIXI.settings
    * @type {number}
    * @default 32
    */
  var SPRITE_MAX_TEXTURES: Double = js.native
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
  var STRICT_TEXTURE_CACHE: Boolean = js.native
  /**
    * Target frames per millisecond.
    *
    * @static
    * @name TARGET_FPMS
    * @memberof PIXI.settings
    * @type {number}
    * @default 0.06
    */
  var TARGET_FPMS: Double = js.native
  /**
    * Default number of uploads per frame using prepare plugin.
    *
    * @static
    * @memberof PIXI.settings
    * @name UPLOADS_PER_FRAME
    * @type {number}
    * @default 4
    */
  var UPLOADS_PER_FRAME: Double = js.native
  /**
    * Default wrap modes that are supported by pixi.
    *
    * @static
    * @name WRAP_MODE
    * @memberof PIXI.settings
    * @type {PIXI.WRAP_MODES}
    * @default PIXI.WRAP_MODES.CLAMP
    */
  var WRAP_MODE: typings.pixiJs.PIXI.WRAP_MODES = js.native
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
  @js.native
  object RENDER_OPTIONS extends js.Object {
    var antialias: Boolean = js.native
    var autoDensity: Boolean = js.native
    var backgroundColor: Double = js.native
    var clearBeforeRender: Boolean = js.native
    var height: Double = js.native
    var legacy: Boolean = js.native
    var preserveDrawingBuffer: Boolean = js.native
    var resolution: Double = js.native
    var transparent: Boolean = js.native
    var view: HTMLCanvasElement = js.native
    var width: Double = js.native
  }
  
}

