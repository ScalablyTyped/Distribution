package typings.phaser.spine.webgl

import typings.phaser.spine.ArrayLike
import typings.phaser.spine.Disposable
import typings.phaser.spine.Restorable
import typings.std.WebGLProgram
import typings.std.WebGLUniformLocation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Shader
  extends StObject
     with Disposable
     with Restorable {
  
  def bind(): Unit
  
  /* private */ var compile: js.Any
  
  /* private */ var compileProgram: js.Any
  
  /* private */ var compileShader: js.Any
  
  /* private */ var context: js.Any
  
  /* private */ var fragmentShader: js.Any
  
  /* private */ var fs: js.Any
  
  /* private */ var fsSource: js.Any
  
  def getAttributeLocation(attribute: String): Double
  
  def getFragmentShader(): String
  
  def getFragmentSource(): String
  
  def getProgram(): WebGLProgram
  
  def getUniformLocation(uniform: String): WebGLUniformLocation
  
  def getVertexShader(): String
  
  def getVertexShaderSource(): String
  
  /* private */ var program: js.Any
  
  def setUniform2f(uniform: String, value: Double, value2: Double): Unit
  
  def setUniform2x2f(uniform: String, value: ArrayLike[Double]): Unit
  
  def setUniform3f(uniform: String, value: Double, value2: Double, value3: Double): Unit
  
  def setUniform3x3f(uniform: String, value: ArrayLike[Double]): Unit
  
  def setUniform4f(uniform: String, value: Double, value2: Double, value3: Double, value4: Double): Unit
  
  def setUniform4x4f(uniform: String, value: ArrayLike[Double]): Unit
  
  def setUniformf(uniform: String, value: Double): Unit
  
  def setUniformi(uniform: String, value: Double): Unit
  
  /* private */ var tmp2x2: js.Any
  
  /* private */ var tmp3x3: js.Any
  
  /* private */ var tmp4x4: js.Any
  
  def unbind(): Unit
  
  /* private */ var vertexShader: js.Any
  
  /* private */ var vs: js.Any
  
  /* private */ var vsSource: js.Any
}
object Shader {
  
  inline def apply(
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
  
  extension [Self <: Shader](x: Self) {
    
    inline def setBind(value: () => Unit): Self = StObject.set(x, "bind", js.Any.fromFunction0(value))
    
    inline def setCompile(value: js.Any): Self = StObject.set(x, "compile", value.asInstanceOf[js.Any])
    
    inline def setCompileProgram(value: js.Any): Self = StObject.set(x, "compileProgram", value.asInstanceOf[js.Any])
    
    inline def setCompileShader(value: js.Any): Self = StObject.set(x, "compileShader", value.asInstanceOf[js.Any])
    
    inline def setContext(value: js.Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setFragmentShader(value: js.Any): Self = StObject.set(x, "fragmentShader", value.asInstanceOf[js.Any])
    
    inline def setFs(value: js.Any): Self = StObject.set(x, "fs", value.asInstanceOf[js.Any])
    
    inline def setFsSource(value: js.Any): Self = StObject.set(x, "fsSource", value.asInstanceOf[js.Any])
    
    inline def setGetAttributeLocation(value: String => Double): Self = StObject.set(x, "getAttributeLocation", js.Any.fromFunction1(value))
    
    inline def setGetFragmentShader(value: () => String): Self = StObject.set(x, "getFragmentShader", js.Any.fromFunction0(value))
    
    inline def setGetFragmentSource(value: () => String): Self = StObject.set(x, "getFragmentSource", js.Any.fromFunction0(value))
    
    inline def setGetProgram(value: () => WebGLProgram): Self = StObject.set(x, "getProgram", js.Any.fromFunction0(value))
    
    inline def setGetUniformLocation(value: String => WebGLUniformLocation): Self = StObject.set(x, "getUniformLocation", js.Any.fromFunction1(value))
    
    inline def setGetVertexShader(value: () => String): Self = StObject.set(x, "getVertexShader", js.Any.fromFunction0(value))
    
    inline def setGetVertexShaderSource(value: () => String): Self = StObject.set(x, "getVertexShaderSource", js.Any.fromFunction0(value))
    
    inline def setProgram(value: js.Any): Self = StObject.set(x, "program", value.asInstanceOf[js.Any])
    
    inline def setSetUniform2f(value: (String, Double, Double) => Unit): Self = StObject.set(x, "setUniform2f", js.Any.fromFunction3(value))
    
    inline def setSetUniform2x2f(value: (String, ArrayLike[Double]) => Unit): Self = StObject.set(x, "setUniform2x2f", js.Any.fromFunction2(value))
    
    inline def setSetUniform3f(value: (String, Double, Double, Double) => Unit): Self = StObject.set(x, "setUniform3f", js.Any.fromFunction4(value))
    
    inline def setSetUniform3x3f(value: (String, ArrayLike[Double]) => Unit): Self = StObject.set(x, "setUniform3x3f", js.Any.fromFunction2(value))
    
    inline def setSetUniform4f(value: (String, Double, Double, Double, Double) => Unit): Self = StObject.set(x, "setUniform4f", js.Any.fromFunction5(value))
    
    inline def setSetUniform4x4f(value: (String, ArrayLike[Double]) => Unit): Self = StObject.set(x, "setUniform4x4f", js.Any.fromFunction2(value))
    
    inline def setSetUniformf(value: (String, Double) => Unit): Self = StObject.set(x, "setUniformf", js.Any.fromFunction2(value))
    
    inline def setSetUniformi(value: (String, Double) => Unit): Self = StObject.set(x, "setUniformi", js.Any.fromFunction2(value))
    
    inline def setTmp2x2(value: js.Any): Self = StObject.set(x, "tmp2x2", value.asInstanceOf[js.Any])
    
    inline def setTmp3x3(value: js.Any): Self = StObject.set(x, "tmp3x3", value.asInstanceOf[js.Any])
    
    inline def setTmp4x4(value: js.Any): Self = StObject.set(x, "tmp4x4", value.asInstanceOf[js.Any])
    
    inline def setUnbind(value: () => Unit): Self = StObject.set(x, "unbind", js.Any.fromFunction0(value))
    
    inline def setVertexShader(value: js.Any): Self = StObject.set(x, "vertexShader", value.asInstanceOf[js.Any])
    
    inline def setVs(value: js.Any): Self = StObject.set(x, "vs", value.asInstanceOf[js.Any])
    
    inline def setVsSource(value: js.Any): Self = StObject.set(x, "vsSource", value.asInstanceOf[js.Any])
  }
}
