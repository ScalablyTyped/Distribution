package typings
package phaserLib.spineNs.webglNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("spine.webgl.Shader")
@js.native
class Shader protected ()
  extends phaserLib.spineNs.Disposable
     with phaserLib.spineNs.Restorable {
  def this(context: ManagedWebGLRenderingContext, vertexShader: java.lang.String, fragmentShader: java.lang.String) = this()
  def this(context: stdLib.WebGLRenderingContext, vertexShader: java.lang.String, fragmentShader: java.lang.String) = this()
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
  def bind(): scala.Unit = js.native
  /* private */ def compile(): js.Any = js.native
  /* private */ def compileProgram(vs: js.Any, fs: js.Any): js.Any = js.native
  /* private */ def compileShader(`type`: js.Any, source: js.Any): js.Any = js.native
  /* CompleteClass */
  override def dispose(): scala.Unit = js.native
  def getAttributeLocation(attribute: java.lang.String): scala.Double = js.native
  def getFragmentShader(): java.lang.String = js.native
  def getFragmentSource(): java.lang.String = js.native
  def getProgram(): stdLib.WebGLProgram = js.native
  def getUniformLocation(uniform: java.lang.String): stdLib.WebGLUniformLocation = js.native
  def getVertexShader(): java.lang.String = js.native
  def getVertexShaderSource(): java.lang.String = js.native
  /* CompleteClass */
  override def restore(): scala.Unit = js.native
  def setUniform2f(uniform: java.lang.String, value: scala.Double, value2: scala.Double): scala.Unit = js.native
  def setUniform2x2f(uniform: java.lang.String, value: phaserLib.spineNs.ArrayLike[scala.Double]): scala.Unit = js.native
  def setUniform3f(uniform: java.lang.String, value: scala.Double, value2: scala.Double, value3: scala.Double): scala.Unit = js.native
  def setUniform3x3f(uniform: java.lang.String, value: phaserLib.spineNs.ArrayLike[scala.Double]): scala.Unit = js.native
  def setUniform4f(
    uniform: java.lang.String,
    value: scala.Double,
    value2: scala.Double,
    value3: scala.Double,
    value4: scala.Double
  ): scala.Unit = js.native
  def setUniform4x4f(uniform: java.lang.String, value: phaserLib.spineNs.ArrayLike[scala.Double]): scala.Unit = js.native
  def setUniformf(uniform: java.lang.String, value: scala.Double): scala.Unit = js.native
  def setUniformi(uniform: java.lang.String, value: scala.Double): scala.Unit = js.native
  def unbind(): scala.Unit = js.native
}

/* static members */
@JSGlobal("spine.webgl.Shader")
@js.native
object Shader extends js.Object {
  var COLOR: java.lang.String = js.native
  var COLOR2: java.lang.String = js.native
  var MVP_MATRIX: java.lang.String = js.native
  var POSITION: java.lang.String = js.native
  var SAMPLER: java.lang.String = js.native
  var TEXCOORDS: java.lang.String = js.native
  def newColored(context: phaserLib.spineNs.webglNs.ManagedWebGLRenderingContext): phaserLib.spineNs.webglNs.Shader = js.native
  def newColored(context: stdLib.WebGLRenderingContext): phaserLib.spineNs.webglNs.Shader = js.native
  def newColoredTextured(context: phaserLib.spineNs.webglNs.ManagedWebGLRenderingContext): phaserLib.spineNs.webglNs.Shader = js.native
  def newColoredTextured(context: stdLib.WebGLRenderingContext): phaserLib.spineNs.webglNs.Shader = js.native
  def newTwoColoredTextured(context: phaserLib.spineNs.webglNs.ManagedWebGLRenderingContext): phaserLib.spineNs.webglNs.Shader = js.native
  def newTwoColoredTextured(context: stdLib.WebGLRenderingContext): phaserLib.spineNs.webglNs.Shader = js.native
}

