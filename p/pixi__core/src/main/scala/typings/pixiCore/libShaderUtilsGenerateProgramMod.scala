package typings.pixiCore

import typings.pixiCore.libIrendererMod.IRenderingContext
import typings.pixiCore.libShaderGlprogramMod.GLProgram
import typings.pixiCore.libShaderProgramMod.Program
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libShaderUtilsGenerateProgramMod {
  
  @JSImport("@pixi/core/lib/shader/utils/generateProgram", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def generateProgram(gl: IRenderingContext, program: Program): GLProgram = (^.asInstanceOf[js.Dynamic].applyDynamic("generateProgram")(gl.asInstanceOf[js.Any], program.asInstanceOf[js.Any])).asInstanceOf[GLProgram]
}
