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
  val DATA_URI: RegExp | String = js.native
  val DEG_TO_RAD: Double = js.native
  val PI_2: Double = js.native
  val RAD_TO_DEG: Double = js.native
  val SVG_SIZE: RegExp | String = js.native
  val TARGET_FPMS: Double = js.native
  val URL_FILE_EXTENSION: RegExp | String = js.native
  val VERSION: String = js.native
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
  
  @js.native
  object GC_MODES extends js.Object {
    var AUTO: Double = js.native
    var MANUAL: Double = js.native
  }
  
  @js.native
  object PRECISION extends js.Object {
    var HIGH: String = js.native
    var LOW: String = js.native
    var MEDIUM: String = js.native
  }
  
  @js.native
  object RENDERER_TYPE extends js.Object {
    var CANVAS: Double = js.native
    var UNKNOWN: Double = js.native
    var WEBGL: Double = js.native
  }
  
  @js.native
  object SCALE_MODES extends js.Object {
    var LINEAR: Double = js.native
    var NEAREST: Double = js.native
  }
  
  @js.native
  object SHAPES extends js.Object {
    var CIRC: Double = js.native
    var ELIP: Double = js.native
    var POLY: Double = js.native
    var RECT: Double = js.native
    var RREC: Double = js.native
  }
  
  @js.native
  object TEXT_GRADIENT extends js.Object {
    var LINEAR_HORIZONTAL: Double = js.native
    var LINEAR_VERTICAL: Double = js.native
  }
  
  @js.native
  object TRANSFORM_MODE extends js.Object {
    var DEFAULT: Double = js.native
    var DYNAMIC: Double = js.native
    var STATIC: Double = js.native
  }
  
  @js.native
  object UPDATE_PRIORITY extends js.Object {
    var HIGH: Double = js.native
    var INTERACTION: Double = js.native
    var LOW: Double = js.native
    var NORMAL: Double = js.native
    var UTILITY: Double = js.native
  }
  
  @js.native
  object WRAP_MODES extends js.Object {
    var CLAMP: Double = js.native
    var MIRRORED_REPEAT: Double = js.native
    var REPEAT: Double = js.native
  }
  
}

