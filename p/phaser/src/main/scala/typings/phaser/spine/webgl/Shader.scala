package typings.phaser.spine.webgl

import typings.phaser.spine.ArrayLike
import typings.phaser.spine.Disposable
import typings.phaser.spine.Restorable
import typings.std.WebGLProgram
import typings.std.WebGLRenderingContext
import typings.std.WebGLUniformLocation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("spine.webgl.Shader")
@js.native
class Shader protected ()
  extends Disposable
     with Restorable {
  def this(context: ManagedWebGLRenderingContext, vertexShader: String, fragmentShader: String) = this()
  def this(context: WebGLRenderingContext, vertexShader: String, fragmentShader: String) = this()
  var compile: js.Any = js.native
  var compileProgram: js.Any = js.native
  var compileShader: js.Any = js.native
  var context: js.Any = js.native
  var fragmentShader: js.Any = js.native
  var fs: js.Any = js.native
  var fsSource: js.Any = js.native
  var program: js.Any = js.native
  var tmp2x2: js.Any = js.native
  var tmp3x3: js.Any = js.native
  var tmp4x4: js.Any = js.native
  var vertexShader: js.Any = js.native
  var vs: js.Any = js.native
  var vsSource: js.Any = js.native
  def bind(): Unit = js.native
  /* CompleteClass */
  override def dispose(): Unit = js.native
  def getAttributeLocation(attribute: String): Double = js.native
  def getFragmentShader(): String = js.native
  def getFragmentSource(): String = js.native
  def getProgram(): WebGLProgram = js.native
  def getUniformLocation(uniform: String): WebGLUniformLocation = js.native
  def getVertexShader(): String = js.native
  def getVertexShaderSource(): String = js.native
  /* CompleteClass */
  override def restore(): Unit = js.native
  def setUniform2f(uniform: String, value: Double, value2: Double): Unit = js.native
  def setUniform2x2f(uniform: String, value: ArrayLike[Double]): Unit = js.native
  def setUniform3f(uniform: String, value: Double, value2: Double, value3: Double): Unit = js.native
  def setUniform3x3f(uniform: String, value: ArrayLike[Double]): Unit = js.native
  def setUniform4f(uniform: String, value: Double, value2: Double, value3: Double, value4: Double): Unit = js.native
  def setUniform4x4f(uniform: String, value: ArrayLike[Double]): Unit = js.native
  def setUniformf(uniform: String, value: Double): Unit = js.native
  def setUniformi(uniform: String, value: Double): Unit = js.native
  def unbind(): Unit = js.native
}

/* static members */
@JSGlobal("spine.webgl.Shader")
@js.native
object Shader extends js.Object {
  var COLOR: String = js.native
  var COLOR2: String = js.native
  var MVP_MATRIX: String = js.native
  var POSITION: String = js.native
  var SAMPLER: String = js.native
  var TEXCOORDS: String = js.native
  def newColored(context: ManagedWebGLRenderingContext): Shader = js.native
  def newColored(context: WebGLRenderingContext): Shader = js.native
  def newColoredTextured(context: ManagedWebGLRenderingContext): Shader = js.native
  def newColoredTextured(context: WebGLRenderingContext): Shader = js.native
  def newTwoColoredTextured(context: ManagedWebGLRenderingContext): Shader = js.native
  def newTwoColoredTextured(context: WebGLRenderingContext): Shader = js.native
}

