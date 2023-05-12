package typings.playcanvas.global.pc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * BlendState is a descriptor that defines how output of fragment shader is written and blended
  * into render target. A blend state can be set on a material using {@link Material#blendState},
  * or in some cases on the graphics device using {@link GraphicsDevice#setBlendState}.
  *
  * For the best performance, do not modify blend state after it has been created, but create
  * multiple blend states and assign them to the material or graphics device as needed.
  */
@JSGlobal("pc.BlendState")
@js.native
open class BlendState protected ()
  extends typings.playcanvas.mod.BlendState {
  /**
    * Create a new BlendState instance.
    *
    * All factor parameters can take the following values:
    *
    * - {@link BLENDMODE_ZERO}
    * - {@link BLENDMODE_ONE}
    * - {@link BLENDMODE_SRC_COLOR}
    * - {@link BLENDMODE_ONE_MINUS_SRC_COLOR}
    * - {@link BLENDMODE_DST_COLOR}
    * - {@link BLENDMODE_ONE_MINUS_DST_COLOR}
    * - {@link BLENDMODE_SRC_ALPHA}
    * - {@link BLENDMODE_SRC_ALPHA_SATURATE}
    * - {@link BLENDMODE_ONE_MINUS_SRC_ALPHA}
    * - {@link BLENDMODE_DST_ALPHA}
    * - {@link BLENDMODE_ONE_MINUS_DST_ALPHA}
    * - {@link BLENDMODE_CONSTANT}
    * - {@link BLENDMODE_ONE_MINUS_CONSTANT}
    *
    * All op parameters can take the following values:
    *
    * - {@link BLENDEQUATION_ADD}
    * - {@link BLENDEQUATION_SUBTRACT}
    * - {@link BLENDEQUATION_REVERSE_SUBTRACT}
    * - {@link BLENDEQUATION_MIN}
    * - {@link BLENDEQUATION_MAX}
    *
    * Note that MIN and MAX operations on WebGL platform require either EXT_blend_minmax or WebGL2
    * to work (check device.extBlendMinmax).
    *
    * @param {boolean} [blend] - Enables or disables blending. Defaults to false.
    * @param {number} [colorOp] - Configures color blending operation. Defaults to
    * {@link BLENDEQUATION_ADD}.
    * @param {number} [colorSrcFactor] - Configures source color blending factor. Defaults to
    * {@link BLENDMODE_ONE}.
    * @param {number} [colorDstFactor] - Configures destination color blending factor. Defaults to
    * {@link BLENDMODE_ZERO}.
    * @param {number} [alphaOp] - Configures alpha blending operation. Defaults to
    * {@link BLENDEQUATION_ADD}.
    * @param {number} [alphaSrcFactor] - Configures source alpha blending factor. Defaults to
    * {@link BLENDMODE_ONE}.
    * @param {number} [alphaDstFactor] - Configures destination alpha blending factor. Defaults to
    * {@link BLENDMODE_ZERO}.
    * @param {boolean} [redWrite] - True to enable writing of the red channel and false otherwise.
    * Defaults to true.
    * @param {boolean} [greenWrite] - True to enable writing of the green channel and false
    * otherwise. Defaults to true.
    * @param {boolean} [blueWrite] - True to enable writing of the blue channel and false otherwise.
    * Defaults to true.
    * @param {boolean} [alphaWrite] - True to enable writing of the alpha channel and false
    * otherwise. Defaults to true.
    */
  def this(
    blend: js.UndefOr[Boolean],
    colorOp: js.UndefOr[Double],
    colorSrcFactor: js.UndefOr[Double],
    colorDstFactor: js.UndefOr[Double],
    alphaOp: js.UndefOr[Double],
    alphaSrcFactor: js.UndefOr[Double],
    alphaDstFactor: js.UndefOr[Double],
    redWrite: js.UndefOr[Boolean],
    greenWrite: js.UndefOr[Boolean],
    blueWrite: js.UndefOr[Boolean],
    alphaWrite: js.UndefOr[Boolean]
  ) = this()
}
object BlendState {
  
  /**
    * A default blend state that has blending disabled and writes to all color channels.
    *
    * @type {BlendState}
    * @readonly
    */
  /* static member */
  @JSGlobal("pc.BlendState.DEFAULT")
  @js.native
  val DEFAULT: typings.playcanvas.mod.BlendState = js.native
  
  /**
    * A blend state that does not write to color channels.
    *
    * @type {BlendState}
    * @readonly
    */
  /* static member */
  @JSGlobal("pc.BlendState.NOWRITE")
  @js.native
  val NOWRITE: typings.playcanvas.mod.BlendState = js.native
}
