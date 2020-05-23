package typings.pixiJs.mod

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
@JSImport("pixi.js", "State")
@js.native
class State ()
  extends typings.pixiJs.PIXI.State {
  /**
    * Activates blending of the computed fragment color values
    *
    * @member {boolean}
    */
  /* CompleteClass */
  override var blend: Boolean = js.native
  /**
    * The blend mode to be applied when this state is set. Apply a value of `PIXI.BLEND_MODES.NORMAL` to reset the blend mode.
    * Setting this mode to anything other than NO_BLEND will automatically switch blending on.
    *
    * @member {number}
    * @default PIXI.BLEND_MODES.NORMAL
    * @see PIXI.BLEND_MODES
    */
  /* CompleteClass */
  override var blendMode: Double = js.native
  /**
    * Specifies whether or not front or back-facing polygons can be culled.
    * @member {boolean}
    * @default false
    */
  /* CompleteClass */
  override var clockwiseFrontFace: Boolean = js.native
  /**
    * Activates culling of polygons.
    *
    * @member {boolean}
    * @default false
    */
  /* CompleteClass */
  override var culling: Boolean = js.native
  /**
    * Activates depth comparisons and updates to the depth buffer.
    *
    * @member {boolean}
    * @default false
    */
  /* CompleteClass */
  override var depthTest: Boolean = js.native
  /**
    * Activates adding an offset to depth values of polygon's fragments
    *
    * @member {boolean}
    * @default false
    */
  /* CompleteClass */
  override var offsets: Boolean = js.native
  /**
    * The polygon offset. Setting this property to anything other than 0 will automatically enable polygon offset fill.
    *
    * @member {number}
    * @default 0
    */
  /* CompleteClass */
  override var polygonOffset: Double = js.native
}

