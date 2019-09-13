package typings.pixiDotJs.pixiDotJsMod

import typings.std.HTMLCanvasElement
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//////////////////////////////////////////////////////////////////////////////
///////////////////////////////SETTINGS///////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////
/**
  * User"s customizable globals for overriding the default PIXI settings, such
  * as a renderer"s default resolution, framerate, float percision, etc.
  * @example
  * // Use the native window resolution as the default resolution
  * // will support high-density displays when rendering
  * PIXI.settings.RESOLUTION = window.devicePixelRatio.
  *
  * // Disable interpolation when scaling, will make texture be pixelated
  * PIXI.settings.SCALE_MODE = PIXI.SCALE_MODES.NEAREST;
  */
@JSImport("pixi.js", "settings")
@js.native
object settingsNs extends js.Object {
  /**
    * Can we upload the same buffer in a single frame?
    */
  var CAN_UPLOAD_SAME_BUFFER: Boolean = js.native
  /**
    * Default filter resolution.
    * @default 1
    */
  var FILTER_RESOLUTION: Double = js.native
  /**
    * Default Garbage Collection maximum check count.
    * @default 600
    */
  var GC_MAX_CHECK_COUNT: Double = js.native
  /**
    * Default Garbage Collection max idle.
    * @default 3600
    */
  var GC_MAX_IDLE: Double = js.native
  /**
    * Default Garbage Collection mode.
    * @type {PIXI.GC_MODES}
    * @default PIXI.GC_MODES.AUTO
    */
  var GC_MODE: Double = js.native
  /**
    * Default Mesh `canvasPadding`.
    * @see PIXI.mesh.Mesh#canvasPadding
    */
  var MESH_CANVAS_PADDING: Double = js.native
  /**
    * If set to true WebGL will attempt make textures mimpaped by default.
    * Mipmapping will only succeed if the base texture uploaded has power of two dimensions.
    * @default true
    */
  var MIPMAP_TEXTURES: Boolean = js.native
  /**
    * @deprecated since version 4.4.0
    */
  var PRECISION: String = js.native
  /**
    * Default specify float precision in fragment shader.
    * @type {PIXI.PRECISION}
    * @default PIXI.PRECISION.MEDIUM
    */
  var PRECISION_FRAGMENT: String = js.native
  /**
    * Default specify float precision in vertex shader.
    * @type {PIXI.PRECISION}
    * @default PIXI.PRECISION.HIGH
    */
  var PRECISION_VERTEX: String = js.native
  /**
    * If set to true WebGL will attempt make textures mimpaped by default.
    * Mipmapping will only succeed if the base texture uploaded has power of two dimensions.
    * @default true
    */
  var RESOLUTION: Double = js.native
  /**
    * The prefix that denotes a URL is for a retina asset.
    * @example `@2x`
    * @default /@([0-9\.]+)x/
    */
  var RETINA_PREFIX: RegExp = js.native
  /**
    * The scale modes that are supported by pixi.
    * @type {PIXI.SCALE_MODES}
    * @default PIXI.SCALE_MODES.LINEAR
    */
  var SCALE_MODE: Double = js.native
  /**
    * The default sprite batch size.
    *
    * The default aims to balance desktop and mobile devices.
    * @default 4096
    */
  var SPRITE_BATCH_SIZE: Double = js.native
  /**
    * The maximum textures that this device supports.
    * @default 32
    */
  var SPRITE_MAX_TEXTURES: Double = js.native
  /**
    * Target frames per millisecond.
    * @default 0.06
    */
  var TARGET_FPMS: Double = js.native
  /**
    * Default transform type.
    * @type {PIXI.TRANSFORM_MODE}
    * @default PIXI.TRANSFORM_MODE.STATIC
    */
  var TRANSFORM_MODE: Double = js.native
  /**
    * Default number of uploads per frame using prepare plugin.
    * @default 4
    */
  var UPLOADS_PER_FRAME: Double = js.native
  /**
    * Default wrap modes that are supported by pixi.
    * @type {PIXI.WRAP_MODES}
    * @default PIXI.WRAP_MODES.CLAMP
    */
  var WRAP_MODE: Double = js.native
  /**
    * The default render options if none are supplied to {@link PIXI.WebGLRenderer}
    * or {@link PIXI.CanvasRenderer}.
    *
    * @static
    * @constant
    * @memberof PIXI.settings
    * @type {object}
    * @property {HTMLCanvasElement} view=null
    * @property {number} resolution=1
    * @property {boolean} antialias=false
    * @property {boolean} forceFXAA=false
    * @property {boolean} autoResize=false
    * @property {boolean} transparent=false
    * @property {number} backgroundColor=0x000000
    * @property {boolean} clearBeforeRender=true
    * @property {boolean} preserveDrawingBuffer=false
    * @property {boolean} roundPixels=false
    * @property {number} width=800
    * @property {number} height=600
    * @property {boolean} legacy=false
    */
  @js.native
  object RENDER_OPTIONS extends js.Object {
    var antialias: Boolean = js.native
    var autoResize: Boolean = js.native
    var backgroundColor: Double = js.native
    var clearBeforeRender: Boolean = js.native
    var forceFXAA: Boolean = js.native
    var height: Double = js.native
    var legacy: Boolean = js.native
    var preserveDrawingBuffer: Boolean = js.native
    var roundPixels: Boolean = js.native
    var transparent: Boolean = js.native
    var view: HTMLCanvasElement | Null = js.native
    var width: Double = js.native
  }
  
}

