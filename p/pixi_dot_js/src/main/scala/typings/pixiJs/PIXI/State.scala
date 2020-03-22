package typings.pixiJs.PIXI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a WebGL state, and is is passed The WebGL StateManager.
  *
  * Each mesh rendered may require WebGL to be in a different state.
  * For example you may want different blend mode or to enable polygon offsets
  *
  * @class
  * @memberof PIXI
  */
@JSGlobal("PIXI.State")
@js.native
class State () extends js.Object {
  /**
    * Activates blending of the computed fragment color values
    *
    * @member {boolean}
    */
  var blend: Boolean = js.native
  /**
    * The blend mode to be applied when this state is set. Apply a value of `PIXI.BLEND_MODES.NORMAL` to reset the blend mode.
    * Setting this mode to anything other than NO_BLEND will automatically switch blending on.
    *
    * @member {number}
    * @default PIXI.BLEND_MODES.NORMAL
    * @see PIXI.BLEND_MODES
    */
  var blendMode: Double = js.native
  /**
    * Specifies whether or not front or back-facing polygons can be culled.
    * @member {boolean}
    * @default false
    */
  var clockwiseFrontFace: Boolean = js.native
  /**
    * Activates culling of polygons.
    *
    * @member {boolean}
    * @default false
    */
  var culling: Boolean = js.native
  /**
    * Activates depth comparisons and updates to the depth buffer.
    *
    * @member {boolean}
    * @default false
    */
  var depthTest: Boolean = js.native
  /**
    * Activates adding an offset to depth values of polygon's fragments
    *
    * @member {boolean}
    * @default false
    */
  var offsets: Boolean = js.native
  /**
    * The polygon offset. Setting this property to anything other than 0 will automatically enable polygon offset fill.
    *
    * @member {number}
    * @default 0
    */
  var polygonOffset: Double = js.native
}

