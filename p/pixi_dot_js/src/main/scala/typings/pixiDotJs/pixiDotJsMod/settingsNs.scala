package typings.pixiDotJs.pixiDotJsMod

import typings.std.HTMLCanvasElement
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//////////////////////////////////////////////////////////////////////////////
///////////////////////////////SETTINGS///////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////
@JSImport("pixi.js", "settings")
@js.native
object settingsNs extends js.Object {
  var CAN_UPLOAD_SAME_BUFFER: Boolean = js.native
  var FILTER_RESOLUTION: Double = js.native
  var GC_MAX_CHECK_COUNT: Double = js.native
  var GC_MAX_IDLE: Double = js.native
  var GC_MODE: Double = js.native
  var MESH_CANVAS_PADDING: Double = js.native
  var MIPMAP_TEXTURES: Boolean = js.native
  var PRECISION: String = js.native
  var PRECISION_FRAGMENT: String = js.native
  var PRECISION_VERTEX: String = js.native
  var RESOLUTION: Double = js.native
  var RETINA_PREFIX: RegExp = js.native
  var SCALE_MODE: Double = js.native
  var SPRITE_BATCH_SIZE: Double = js.native
  var SPRITE_MAX_TEXTURES: Double = js.native
  var TARGET_FPMS: Double = js.native
  var TRANSFORM_MODE: Double = js.native
  var UPLOADS_PER_FRAME: Double = js.native
  var WRAP_MODE: Double = js.native
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

