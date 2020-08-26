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
@js.native
trait State extends js.Object {
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

object State {
  @scala.inline
  def apply(
    blend: Boolean,
    blendMode: Double,
    clockwiseFrontFace: Boolean,
    culling: Boolean,
    depthTest: Boolean,
    offsets: Boolean,
    polygonOffset: Double
  ): State = {
    val __obj = js.Dynamic.literal(blend = blend.asInstanceOf[js.Any], blendMode = blendMode.asInstanceOf[js.Any], clockwiseFrontFace = clockwiseFrontFace.asInstanceOf[js.Any], culling = culling.asInstanceOf[js.Any], depthTest = depthTest.asInstanceOf[js.Any], offsets = offsets.asInstanceOf[js.Any], polygonOffset = polygonOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[State]
  }
  @scala.inline
  implicit class StateOps[Self <: State] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBlend(value: Boolean): Self = this.set("blend", value.asInstanceOf[js.Any])
    @scala.inline
    def setBlendMode(value: Double): Self = this.set("blendMode", value.asInstanceOf[js.Any])
    @scala.inline
    def setClockwiseFrontFace(value: Boolean): Self = this.set("clockwiseFrontFace", value.asInstanceOf[js.Any])
    @scala.inline
    def setCulling(value: Boolean): Self = this.set("culling", value.asInstanceOf[js.Any])
    @scala.inline
    def setDepthTest(value: Boolean): Self = this.set("depthTest", value.asInstanceOf[js.Any])
    @scala.inline
    def setOffsets(value: Boolean): Self = this.set("offsets", value.asInstanceOf[js.Any])
    @scala.inline
    def setPolygonOffset(value: Double): Self = this.set("polygonOffset", value.asInstanceOf[js.Any])
  }
  
}

