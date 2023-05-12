package typings.playcanvas.global.pc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * DepthState is a descriptor that defines how the depth value of the fragment is used by the
  * rendering pipeline. A depth state can be set on a material using {@link Material#depthState},
  * or in some cases on the graphics device using {@link GraphicsDevice#setDepthState}.
  *
  * For the best performance, do not modify depth state after it has been created, but create
  * multiple depth states and assign them to the material or graphics device as needed.
  */
@JSGlobal("pc.DepthState")
@js.native
/**
  * Create a new Depth State instance.
  *
  * @param {number} func - Controls how the depth of the fragment is compared against the
  * current depth contained in the depth buffer. See {@link DepthState#func} for details.
  * Defaults to {@link FUNC_LESSEQUAL}.
  * @param {boolean} write - If true, depth values are written to the depth buffer of the
  * currently active render target. Defaults to true.
  */
open class DepthState ()
  extends typings.playcanvas.mod.DepthState {
  def this(func: Double) = this()
  def this(func: Double, write: Boolean) = this()
  def this(func: Unit, write: Boolean) = this()
}
object DepthState {
  
  /**
    * A default depth state that has the depth testing function set to {@link FUNC_LESSEQUAL} and depth writes enabled.
    *
    * @type {DepthState}
    * @readonly
    */
  /* static member */
  @JSGlobal("pc.DepthState.DEFAULT")
  @js.native
  val DEFAULT: typings.playcanvas.mod.DepthState = js.native
  
  /**
    * A depth state that always passes the fragment but does not write depth to the depth buffer.
    *
    * @type {DepthState}
    * @readonly
    */
  /* static member */
  @JSGlobal("pc.DepthState.NODEPTH")
  @js.native
  val NODEPTH: typings.playcanvas.mod.DepthState = js.native
  
  /**
    * A depth state that always passes the fragment and writes depth to the depth buffer.
    *
    * @type {DepthState}
    * @readonly
    */
  /* static member */
  @JSGlobal("pc.DepthState.WRITEDEPTH")
  @js.native
  val WRITEDEPTH: typings.playcanvas.mod.DepthState = js.native
}
