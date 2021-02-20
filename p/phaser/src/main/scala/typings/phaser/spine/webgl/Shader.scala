package typings.phaser.spine.webgl

import typings.phaser.spine.ArrayLike
import typings.phaser.spine.Disposable
import typings.phaser.spine.Restorable
import typings.std.WebGLProgram
import typings.std.WebGLUniformLocation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Shader
  extends Disposable
     with Restorable {
  
  def bind(): Unit = js.native
  
  var compile: js.Any = js.native
  
  var compileProgram: js.Any = js.native
  
  var compileShader: js.Any = js.native
  
  var context: js.Any = js.native
  
  var fragmentShader: js.Any = js.native
  
  var fs: js.Any = js.native
  
  var fsSource: js.Any = js.native
  
  def getAttributeLocation(attribute: String): Double = js.native
  
  def getFragmentShader(): String = js.native
  
  def getFragmentSource(): String = js.native
  
  def getProgram(): WebGLProgram = js.native
  
  def getUniformLocation(uniform: String): WebGLUniformLocation = js.native
  
  def getVertexShader(): String = js.native
  
  def getVertexShaderSource(): String = js.native
  
  var program: js.Any = js.native
  
  def setUniform2f(uniform: String, value: Double, value2: Double): Unit = js.native
  
  def setUniform2x2f(uniform: String, value: ArrayLike[Double]): Unit = js.native
  
  def setUniform3f(uniform: String, value: Double, value2: Double, value3: Double): Unit = js.native
  
  def setUniform3x3f(uniform: String, value: ArrayLike[Double]): Unit = js.native
  
  def setUniform4f(uniform: String, value: Double, value2: Double, value3: Double, value4: Double): Unit = js.native
  
  def setUniform4x4f(uniform: String, value: ArrayLike[Double]): Unit = js.native
  
  def setUniformf(uniform: String, value: Double): Unit = js.native
  
  def setUniformi(uniform: String, value: Double): Unit = js.native
  
  var tmp2x2: js.Any = js.native
  
  var tmp3x3: js.Any = js.native
  
  var tmp4x4: js.Any = js.native
  
  def unbind(): Unit = js.native
  
  var vertexShader: js.Any = js.native
  
  var vs: js.Any = js.native
  
  var vsSource: js.Any = js.native
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
  
  @scala.inline
  implicit class ShaderMutableBuilder[Self <: Shader] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBind(value: () => Unit): Self = StObject.set(x, "bind", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCompile(value: js.Any): Self = StObject.set(x, "compile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompileProgram(value: js.Any): Self = StObject.set(x, "compileProgram", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompileShader(value: js.Any): Self = StObject.set(x, "compileShader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContext(value: js.Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFragmentShader(value: js.Any): Self = StObject.set(x, "fragmentShader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFs(value: js.Any): Self = StObject.set(x, "fs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFsSource(value: js.Any): Self = StObject.set(x, "fsSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetAttributeLocation(value: String => Double): Self = StObject.set(x, "getAttributeLocation", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetFragmentShader(value: () => String): Self = StObject.set(x, "getFragmentShader", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetFragmentSource(value: () => String): Self = StObject.set(x, "getFragmentSource", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetProgram(value: () => WebGLProgram): Self = StObject.set(x, "getProgram", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetUniformLocation(value: String => WebGLUniformLocation): Self = StObject.set(x, "getUniformLocation", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetVertexShader(value: () => String): Self = StObject.set(x, "getVertexShader", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetVertexShaderSource(value: () => String): Self = StObject.set(x, "getVertexShaderSource", js.Any.fromFunction0(value))
    
    @scala.inline
    def setProgram(value: js.Any): Self = StObject.set(x, "program", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetUniform2f(value: (String, Double, Double) => Unit): Self = StObject.set(x, "setUniform2f", js.Any.fromFunction3(value))
    
    @scala.inline
    def setSetUniform2x2f(value: (String, ArrayLike[Double]) => Unit): Self = StObject.set(x, "setUniform2x2f", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetUniform3f(value: (String, Double, Double, Double) => Unit): Self = StObject.set(x, "setUniform3f", js.Any.fromFunction4(value))
    
    @scala.inline
    def setSetUniform3x3f(value: (String, ArrayLike[Double]) => Unit): Self = StObject.set(x, "setUniform3x3f", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetUniform4f(value: (String, Double, Double, Double, Double) => Unit): Self = StObject.set(x, "setUniform4f", js.Any.fromFunction5(value))
    
    @scala.inline
    def setSetUniform4x4f(value: (String, ArrayLike[Double]) => Unit): Self = StObject.set(x, "setUniform4x4f", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetUniformf(value: (String, Double) => Unit): Self = StObject.set(x, "setUniformf", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetUniformi(value: (String, Double) => Unit): Self = StObject.set(x, "setUniformi", js.Any.fromFunction2(value))
    
    @scala.inline
    def setTmp2x2(value: js.Any): Self = StObject.set(x, "tmp2x2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTmp3x3(value: js.Any): Self = StObject.set(x, "tmp3x3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTmp4x4(value: js.Any): Self = StObject.set(x, "tmp4x4", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnbind(value: () => Unit): Self = StObject.set(x, "unbind", js.Any.fromFunction0(value))
    
    @scala.inline
    def setVertexShader(value: js.Any): Self = StObject.set(x, "vertexShader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVs(value: js.Any): Self = StObject.set(x, "vs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVsSource(value: js.Any): Self = StObject.set(x, "vsSource", value.asInstanceOf[js.Any])
  }
}
