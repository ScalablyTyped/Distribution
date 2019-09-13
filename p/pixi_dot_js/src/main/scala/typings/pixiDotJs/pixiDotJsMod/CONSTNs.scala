package typings.pixiDotJs.pixiDotJsMod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//////////////////////////////////////////////////////////////////////////////
////////////////////////////////CORE//////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////
// const
@JSImport("pixi.js", "CONST")
@js.native
object CONSTNs extends js.Object {
  /**
    * Regexp for data URI.
    * Based on: {@link https://github.com/ragingwind/data-uri-regex}
    *
    * @example data:image/png;base64
    */
  val DATA_URI: RegExp | String = js.native
  /** Conversion factor for converting degrees to radians. */
  val DEG_TO_RAD: Double = js.native
  /** Two Pi. */
  val PI_2: Double = js.native
  /** Conversion factor for converting radians to degrees. */
  val RAD_TO_DEG: Double = js.native
  /**
    * Regexp for SVG size.
    *
    * @example <svg width="100" height="100"></svg>;
    */
  val SVG_SIZE: RegExp | String = js.native
  val TARGET_FPMS: Double = js.native
  /**
    * Regexp for image type by extension.
    *
    * @example `image.png`
    */
  val URL_FILE_EXTENSION: RegExp | String = js.native
  /** String of the current PIXI version. */
  val VERSION: String = js.native
  /**
    * Various blend modes supported by PIXI.
    *
    * IMPORTANT - The WebGL renderer only supports the NORMAL, ADD, MULTIPLY and SCREEN blend modes.
    * Anything else will silently act like NORMAL.
    */
  @js.native
  object BLEND_MODES extends js.Object {
    var ADD: Double = js.native
    var ADD_NPM: Double = js.native
    var COLOR: Double = js.native
    var COLOR_BURN: Double = js.native
    var COLOR_DODGE: Double = js.native
    var DARKEN: Double = js.native
    var DIFFERENCE: Double = js.native
    var EXCLUSION: Double = js.native
    var HARD_LIGHT: Double = js.native
    var HUE: Double = js.native
    var LIGHTEN: Double = js.native
    var LUMINOSITY: Double = js.native
    var MULTIPLY: Double = js.native
    var NORMAL: Double = js.native
    var NORMAL_NPM: Double = js.native
    var OVERLAY: Double = js.native
    var SATURATION: Double = js.native
    var SCREEN: Double = js.native
    var SCREEN_NPM: Double = js.native
    var SOFT_LIGHT: Double = js.native
  }
  
  /**
    * Various webgl draw modes. These can be used to specify which GL drawMode to use
    * under certain situations and renderers.
    */
  @js.native
  object DRAW_MODES extends js.Object {
    var LINES: Double = js.native
    var LINE_LOOP: Double = js.native
    var LINE_STRIP: Double = js.native
    var POINTS: Double = js.native
    var TRIANGLES: Double = js.native
    var TRIANGLE_FAN: Double = js.native
    var TRIANGLE_STRIP: Double = js.native
  }
  
  /**
    * The gc modes that are supported by pixi.
    *
    * The {@link PIXI.settings.GC_MODE} Garbage Collection mode for PixiJS textures is AUTO
    * If set to GC_MODE, the renderer will occasionally check textures usage. If they are not
    * used for a specified period of time they will be removed from the GPU. They will of course
    * be uploaded again when they are required. This is a silent behind the scenes process that
    * should ensure that the GPU does not  get filled up.
    *
    * Handy for mobile devices!
    * This property only affects WebGL.
    */
  @js.native
  object GC_MODES extends js.Object {
    /** Garbage collection will happen periodically automatically */
    var AUTO: Double = js.native
    /** Garbage collection will need to be called manually */
    var MANUAL: Double = js.native
  }
  
  /**
    * Constants that specify float precision in shaders.
    */
  @js.native
  object PRECISION extends js.Object {
    /** "highp" */
    var HIGH: String = js.native
    /** "lowp" */
    var LOW: String = js.native
    /** "mediump" */
    var MEDIUM: String = js.native
  }
  
  /** Constant to identify the Renderer Type. */
  @js.native
  object RENDERER_TYPE extends js.Object {
    /** Canvas render type. */
    var CANVAS: Double = js.native
    /** Unknown render type. */
    var UNKNOWN: Double = js.native
    /** WebGL render type. */
    var WEBGL: Double = js.native
  }
  
  /**
    * The scale modes that are supported by pixi.
    *
    * The {@link PIXI.settings.SCALE_MODE} scale mode affects the default scaling mode of future operations.
    * It can be re-assigned to either LINEAR or NEAREST, depending upon suitability.
    */
  @js.native
  object SCALE_MODES extends js.Object {
    var LINEAR: Double = js.native
    var NEAREST: Double = js.native
  }
  
  /**
    * Constants that identify shapes, mainly to prevent `instanceof` calls.
    */
  @js.native
  object SHAPES extends js.Object {
    /** Circle */
    var CIRC: Double = js.native
    /** Ellipse */
    var ELIP: Double = js.native
    /** Polygon */
    var POLY: Double = js.native
    /** Rectangle */
    var RECT: Double = js.native
    /** Rounded Rectangle */
    var RREC: Double = js.native
  }
  
  /**
    * Constants that define the type of gradient on text.
    */
  @js.native
  object TEXT_GRADIENT extends js.Object {
    /** Linear gradient */
    var LINEAR_HORIZONTAL: Double = js.native
    /** Vertical gradient */
    var LINEAR_VERTICAL: Double = js.native
  }
  
  /**
    * Constants that specify the transform type.
    */
  @js.native
  object TRANSFORM_MODE extends js.Object {
    var DEFAULT: Double = js.native
    var DYNAMIC: Double = js.native
    var STATIC: Double = js.native
  }
  
  /**
    * Represents the update priorities used by internal PIXI classes when registered with
    * the {@link PIXI.ticker.Ticker} object. Higher priority items are updated first and lower
    * priority items, such as render, should go later.
    */
  @js.native
  object UPDATE_PRIORITY extends js.Object {
    /** HIGH=25 High priority updating, {@link PIXI.VideoBaseTexture} and {@link PIXI.extras.AnimatedSprite} */
    var HIGH: Double = js.native
    /** INTERACTION=50 Highest priority, used for {@link PIXI.interaction.InteractionManager} */
    var INTERACTION: Double = js.native
    /** LOW=-25 Low priority used for {@link PIXI.Application} rendering. */
    var LOW: Double = js.native
    /** NORMAL=0 Default priority for ticker events, see {@link PIXI.ticker.Ticker#add}. */
    var NORMAL: Double = js.native
    /** UTILITY=-50 Lowest priority used for {@link PIXI.prepare.BasePrepare} utility. */
    var UTILITY: Double = js.native
  }
  
  @js.native
  object WRAP_MODES extends js.Object {
    /** The textures uvs are clamped */
    var CLAMP: Double = js.native
    /** The texture uvs tile and repeat */
    var MIRRORED_REPEAT: Double = js.native
    /** The texture uvs tile and repeat with mirroring */
    var REPEAT: Double = js.native
  }
  
}

