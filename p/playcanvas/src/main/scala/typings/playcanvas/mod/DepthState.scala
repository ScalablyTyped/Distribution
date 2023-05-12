package typings.playcanvas.mod

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
@JSImport("playcanvas", "DepthState")
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
open class DepthState () extends StObject {
  def this(func: Double) = this()
  def this(func: Double, write: Boolean) = this()
  def this(func: Unit, write: Boolean) = this()
  
  /**
    * Copies the contents of a source depth state to this depth state.
    *
    * @param {DepthState} rhs - A depth state to copy from.
    * @returns {DepthState} Self for chaining.
    */
  def copy(rhs: DepthState): DepthState = js.native
  
  /**
    * Bitfield representing the depth state.
    *
    * @private
    */
  /* private */ var data: Any = js.native
  
  /**
    * Reports whether two DepthStates are equal.
    *
    * @param {DepthState} rhs - The depth state to compare to.
    * @returns {boolean} True if the depth states are equal and false otherwise.
    */
  def equals(rhs: DepthState): Boolean = js.native
  
  def func: Double = js.native
  /**
    * Controls how the depth of the fragment is compared against the current depth contained in
    * the depth buffer. Can be:
    *
    * - {@link FUNC_NEVER}: don't draw
    * - {@link FUNC_LESS}: draw if new depth < depth buffer
    * - {@link FUNC_EQUAL}: draw if new depth == depth buffer
    * - {@link FUNC_LESSEQUAL}: draw if new depth <= depth buffer
    * - {@link FUNC_GREATER}: draw if new depth > depth buffer
    * - {@link FUNC_NOTEQUAL}: draw if new depth != depth buffer
    * - {@link FUNC_GREATEREQUAL}: draw if new depth >= depth buffer
    * - {@link FUNC_ALWAYS}: always draw
    *
    * @type {number}
    */
  def func_=(arg: Double): Unit = js.native
  
  def key: Double = js.native
  
  def test: Boolean = js.native
  /**
    * If true, a shader fragment is only written to the current render target if it passes the depth
    * test. If false, it is written regardless of what is in the depth buffer. Note that when depth
    * testing is disabled, writes to the depth buffer are also disabled. Defaults to true.
    *
    * @type {boolean}
    */
  def test_=(arg: Boolean): Unit = js.native
  
  def write: Boolean = js.native
  /**
    * If true, shader write a depth value to the depth buffer of the currently active render
    * target. If false, no depth value is written.
    *
    * @type {boolean}
    */
  def write_=(arg: Boolean): Unit = js.native
}
object DepthState {
  
  /**
    * A default depth state that has the depth testing function set to {@link FUNC_LESSEQUAL} and depth writes enabled.
    *
    * @type {DepthState}
    * @readonly
    */
  /* static member */
  @JSImport("playcanvas", "DepthState.DEFAULT")
  @js.native
  val DEFAULT: DepthState = js.native
  
  /**
    * A depth state that always passes the fragment but does not write depth to the depth buffer.
    *
    * @type {DepthState}
    * @readonly
    */
  /* static member */
  @JSImport("playcanvas", "DepthState.NODEPTH")
  @js.native
  val NODEPTH: DepthState = js.native
  
  /**
    * A depth state that always passes the fragment and writes depth to the depth buffer.
    *
    * @type {DepthState}
    * @readonly
    */
  /* static member */
  @JSImport("playcanvas", "DepthState.WRITEDEPTH")
  @js.native
  val WRITEDEPTH: DepthState = js.native
}
