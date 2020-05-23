package typings.phaser.spine.webgl

import typings.phaser.spine.ArrayLike
import typings.phaser.spine.Disposable
import typings.phaser.spine.Restorable
import typings.std.WebGLProgram
import typings.std.WebGLUniformLocation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Shader
  extends Disposable
     with Restorable {
  var compile: js.Any
  var compileProgram: js.Any
  var compileShader: js.Any
  var context: js.Any
  var fragmentShader: js.Any
  var fs: js.Any
  var fsSource: js.Any
  var program: js.Any
  var tmp2x2: js.Any
  var tmp3x3: js.Any
  var tmp4x4: js.Any
  var vertexShader: js.Any
  var vs: js.Any
  var vsSource: js.Any
  def bind(): Unit
  def getAttributeLocation(attribute: String): Double
  def getFragmentShader(): String
  def getFragmentSource(): String
  def getProgram(): WebGLProgram
  def getUniformLocation(uniform: String): WebGLUniformLocation
  def getVertexShader(): String
  def getVertexShaderSource(): String
  def setUniform2f(uniform: String, value: Double, value2: Double): Unit
  def setUniform2x2f(uniform: String, value: ArrayLike[Double]): Unit
  def setUniform3f(uniform: String, value: Double, value2: Double, value3: Double): Unit
  def setUniform3x3f(uniform: String, value: ArrayLike[Double]): Unit
  def setUniform4f(uniform: String, value: Double, value2: Double, value3: Double, value4: Double): Unit
  def setUniform4x4f(uniform: String, value: ArrayLike[Double]): Unit
  def setUniformf(uniform: String, value: Double): Unit
  def setUniformi(uniform: String, value: Double): Unit
  def unbind(): Unit
}

object Shader {
  @scala.inline
  def apply(
    bind: () => Unit,
    compile: js.Any,
    compileProgram: js.Any,
    compileShader: js.Any,
    context: js.Any,
    dispose: () => Unit,
    fragmentShader: js.Any,
    fs: js.Any,
    fsSource: js.Any,
    getAttributeLocation: String => Double,
    getFragmentShader: () => String,
    getFragmentSource: () => String,
    getProgram: () => WebGLProgram,
    getUniformLocation: String => WebGLUniformLocation,
    getVertexShader: () => String,
    getVertexShaderSource: () => String,
    program: js.Any,
    restore: () => Unit,
    setUniform2f: (String, Double, Double) => Unit,
    setUniform2x2f: (String, ArrayLike[Double]) => Unit,
    setUniform3f: (String, Double, Double, Double) => Unit,
    setUniform3x3f: (String, ArrayLike[Double]) => Unit,
    setUniform4f: (String, Double, Double, Double, Double) => Unit,
    setUniform4x4f: (String, ArrayLike[Double]) => Unit,
    setUniformf: (String, Double) => Unit,
    setUniformi: (String, Double) => Unit,
    tmp2x2: js.Any,
    tmp3x3: js.Any,
    tmp4x4: js.Any,
    unbind: () => Unit,
    vertexShader: js.Any,
    vs: js.Any,
    vsSource: js.Any
  ): Shader = {
    val __obj = js.Dynamic.literal(bind = js.Any.fromFunction0(bind), compile = compile.asInstanceOf[js.Any], compileProgram = compileProgram.asInstanceOf[js.Any], compileShader = compileShader.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), fragmentShader = fragmentShader.asInstanceOf[js.Any], fs = fs.asInstanceOf[js.Any], fsSource = fsSource.asInstanceOf[js.Any], getAttributeLocation = js.Any.fromFunction1(getAttributeLocation), getFragmentShader = js.Any.fromFunction0(getFragmentShader), getFragmentSource = js.Any.fromFunction0(getFragmentSource), getProgram = js.Any.fromFunction0(getProgram), getUniformLocation = js.Any.fromFunction1(getUniformLocation), getVertexShader = js.Any.fromFunction0(getVertexShader), getVertexShaderSource = js.Any.fromFunction0(getVertexShaderSource), program = program.asInstanceOf[js.Any], restore = js.Any.fromFunction0(restore), setUniform2f = js.Any.fromFunction3(setUniform2f), setUniform2x2f = js.Any.fromFunction2(setUniform2x2f), setUniform3f = js.Any.fromFunction4(setUniform3f), setUniform3x3f = js.Any.fromFunction2(setUniform3x3f), setUniform4f = js.Any.fromFunction5(setUniform4f), setUniform4x4f = js.Any.fromFunction2(setUniform4x4f), setUniformf = js.Any.fromFunction2(setUniformf), setUniformi = js.Any.fromFunction2(setUniformi), tmp2x2 = tmp2x2.asInstanceOf[js.Any], tmp3x3 = tmp3x3.asInstanceOf[js.Any], tmp4x4 = tmp4x4.asInstanceOf[js.Any], unbind = js.Any.fromFunction0(unbind), vertexShader = vertexShader.asInstanceOf[js.Any], vs = vs.asInstanceOf[js.Any], vsSource = vsSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[Shader]
  }
}

