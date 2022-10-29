package typings.pixiCore

import typings.std.WebGLProgram
import typings.std.WebGLRenderingContext
import typings.std.WebGLShader
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libShaderUtilsLogProgramErrorMod {
  
  @JSImport("@pixi/core/lib/shader/utils/logProgramError", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def logProgramError(
    gl: WebGLRenderingContext,
    program: WebGLProgram,
    vertexShader: WebGLShader,
    fragmentShader: WebGLShader
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logProgramError")(gl.asInstanceOf[js.Any], program.asInstanceOf[js.Any], vertexShader.asInstanceOf[js.Any], fragmentShader.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
