package typings.pixiCore

import typings.pixiConstants.mod.PRECISION
import typings.pixiCore.libIrendererMod.IRenderingContext
import typings.pixiCore.libShaderUniformGroupMod.UniformGroup
import typings.pixiCore.libShaderUtilsGenerateUniformsSyncMod.UniformsSyncCallback
import typings.pixiCore.libShaderUtilsUniformParsersMod.IUniformParser
import typings.pixiUtils.libTypesMod.Dict
import typings.std.WebGL2RenderingContext
import typings.std.WebGLProgram
import typings.std.WebGLRenderingContext
import typings.std.WebGLRenderingContextBase
import typings.std.WebGLShader
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libShaderUtilsMod {
  
  @JSImport("@pixi/core/lib/shader/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def checkMaxIfStatementsInShader(maxIfs: Double, gl: IRenderingContext): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("checkMaxIfStatementsInShader")(maxIfs.asInstanceOf[js.Any], gl.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def compileShader(gl: WebGLRenderingContextBase, `type`: Double, src: String): WebGLShader = (^.asInstanceOf[js.Dynamic].applyDynamic("compileShader")(gl.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], src.asInstanceOf[js.Any])).asInstanceOf[WebGLShader]
  
  inline def defaultValue(`type`: String, size: Double): Double | js.typedarray.Float32Array | js.typedarray.Int32Array | js.typedarray.Uint32Array | Boolean | js.Array[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("defaultValue")(`type`.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[Double | js.typedarray.Float32Array | js.typedarray.Int32Array | js.typedarray.Uint32Array | Boolean | js.Array[Boolean]]
  
  inline def generateUniformsSync(group: UniformGroup[Dict[Any]], uniformData: Dict[Any]): UniformsSyncCallback = (^.asInstanceOf[js.Dynamic].applyDynamic("generateUniformsSync")(group.asInstanceOf[js.Any], uniformData.asInstanceOf[js.Any])).asInstanceOf[UniformsSyncCallback]
  
  inline def getMaxFragmentPrecision(): PRECISION = ^.asInstanceOf[js.Dynamic].applyDynamic("getMaxFragmentPrecision")().asInstanceOf[PRECISION]
  
  inline def getTestContext(): WebGLRenderingContext | WebGL2RenderingContext = ^.asInstanceOf[js.Dynamic].applyDynamic("getTestContext")().asInstanceOf[WebGLRenderingContext | WebGL2RenderingContext]
  
  inline def logProgramError(
    gl: WebGLRenderingContext,
    program: WebGLProgram,
    vertexShader: WebGLShader,
    fragmentShader: WebGLShader
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logProgramError")(gl.asInstanceOf[js.Any], program.asInstanceOf[js.Any], vertexShader.asInstanceOf[js.Any], fragmentShader.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def mapSize(`type`: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("mapSize")(`type`.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def mapType(gl: Any, `type`: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("mapType")(gl.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def setPrecision(src: String, requestedPrecision: PRECISION, maxSupportedPrecision: PRECISION): String = (^.asInstanceOf[js.Dynamic].applyDynamic("setPrecision")(src.asInstanceOf[js.Any], requestedPrecision.asInstanceOf[js.Any], maxSupportedPrecision.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("@pixi/core/lib/shader/utils", "uniformParsers")
  @js.native
  val uniformParsers: js.Array[IUniformParser] = js.native
  
  inline def unsafeEvalSupported(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("unsafeEvalSupported")().asInstanceOf[Boolean]
}
