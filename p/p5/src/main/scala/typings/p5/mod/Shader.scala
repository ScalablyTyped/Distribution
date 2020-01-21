package typings.p5.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Shader extends js.Object {
  def setUniform(uniformName: String, data: js.Array[Double]): Shader = js.native
  /**
    *   Wrapper around gl.uniform functions. As we store
    *   uniform info in the shader we can use that to do
    *   type checking on the supplied data and call the
    *   appropriate function.
    *   @param uniformName the name of the uniform in the
    *   shader program
    *   @param data the data to be associated with that
    *   uniform; type varies (could be a single numerical
    *   value, array, matrix, or texture / sampler
    *   reference)
    *   @chainable
    */
  def setUniform(uniformName: String, data: js.Object): Shader = js.native
  def setUniform(uniformName: String, data: Boolean): Shader = js.native
  def setUniform(uniformName: String, data: Double): Shader = js.native
}

