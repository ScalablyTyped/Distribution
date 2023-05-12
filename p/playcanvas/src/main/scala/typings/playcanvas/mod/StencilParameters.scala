package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Holds stencil test settings.
  */
@JSImport("playcanvas", "StencilParameters")
@js.native
/**
  * Create a new StencilParameters instance.
  *
  * @param {object} [options] - Options object to configure the stencil parameters.
  */
open class StencilParameters () extends StObject {
  def this(options: js.Object) = this()
  
  /**
    * Copies the contents of a source stencil parameters to this stencil parameters.
    *
    * @param {StencilParameters} rhs - A stencil parameters to copy from.
    * @returns {StencilParameters} Self for chaining.
    */
  def copy(rhs: StencilParameters): StencilParameters = js.native
  
  /**
    * Operation to perform if stencil test is failed. Can be:
    *
    * - {@link STENCILOP_KEEP}: don't change the stencil buffer value
    * - {@link STENCILOP_ZERO}: set value to zero
    * - {@link STENCILOP_REPLACE}: replace value with the reference value.
    * - {@link STENCILOP_INCREMENT}: increment the value
    * - {@link STENCILOP_INCREMENTWRAP}: increment the value, but wrap it to zero when it's larger
    * than a maximum representable value
    * - {@link STENCILOP_DECREMENT}: decrement the value
    * - {@link STENCILOP_DECREMENTWRAP}: decrement the value, but wrap it to a maximum
    * representable value, if the current value is 0
    * - {@link STENCILOP_INVERT}: invert the value bitwise
    *
    * @type {number}
    */
  var fail: Double = js.native
  
  /**
    * A comparison function that decides if the pixel should be written, based on the current
    * stencil buffer value, reference value, and mask value. Can be:
    *
    * - {@link FUNC_NEVER}: never pass
    * - {@link FUNC_LESS}: pass if (ref & mask) < (stencil & mask)
    * - {@link FUNC_EQUAL}: pass if (ref & mask) == (stencil & mask)
    * - {@link FUNC_LESSEQUAL}: pass if (ref & mask) <= (stencil & mask)
    * - {@link FUNC_GREATER}: pass if (ref & mask) > (stencil & mask)
    * - {@link FUNC_NOTEQUAL}: pass if (ref & mask) != (stencil & mask)
    * - {@link FUNC_GREATEREQUAL}: pass if (ref & mask) >= (stencil & mask)
    * - {@link FUNC_ALWAYS}: always pass
    *
    * @type {number}
    */
  var func: Double = js.native
  
  def key: String = js.native
  
  /**
    * Mask applied to stencil buffer value and reference value before comparison.
    *
    * @type {number}
    */
  var readMask: Double = js.native
  
  /**
    * Sets stencil test reference value used in comparisons.
    *
    * @type {number}
    */
  var ref: Double = js.native
  
  /**
    * A bit mask applied to the stencil value, when written.
    *
    * @type {number}
    */
  var writeMask: Double = js.native
  
  /**
    * Operation to perform if depth test is failed. Accepts the same values as `fail`.
    *
    * @type {number}
    */
  var zfail: Double = js.native
  
  /**
    * Operation to perform if both stencil and depth test are passed. Accepts the same values as
    * `fail`.
    *
    * @type {number}
    */
  var zpass: Double = js.native
}
object StencilParameters {
  
  /**
    * A default stencil state.
    *
    * @type {StencilParameters}
    * @readonly
    */
  /* static member */
  @JSImport("playcanvas", "StencilParameters.DEFAULT")
  @js.native
  val DEFAULT: StencilParameters = js.native
}
