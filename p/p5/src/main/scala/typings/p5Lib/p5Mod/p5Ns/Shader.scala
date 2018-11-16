package typings
package p5Lib.p5Mod.p5Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Shader extends js.Object {
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
  def setUniform(uniformName: java.lang.String, data: js.Array[scala.Double]): p5Lib.p5Mod.Shader = js.native
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
  def setUniform(uniformName: java.lang.String, data: js.Object): p5Lib.p5Mod.Shader = js.native
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
  def setUniform(uniformName: java.lang.String, data: scala.Boolean): p5Lib.p5Mod.Shader = js.native
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
  def setUniform(uniformName: java.lang.String, data: scala.Double): p5Lib.p5Mod.Shader = js.native
}

