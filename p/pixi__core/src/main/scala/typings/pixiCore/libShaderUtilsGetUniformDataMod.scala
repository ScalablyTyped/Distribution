package typings.pixiCore

import org.scalablytyped.runtime.StringDictionary
import typings.pixiCore.libShaderProgramMod.IUniformData
import typings.std.WebGLProgram
import typings.std.WebGLRenderingContextBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libShaderUtilsGetUniformDataMod {
  
  @JSImport("@pixi/core/lib/shader/utils/getUniformData", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getUniformData(program: WebGLProgram, gl: WebGLRenderingContextBase): StringDictionary[IUniformData] = (^.asInstanceOf[js.Dynamic].applyDynamic("getUniformData")(program.asInstanceOf[js.Any], gl.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[IUniformData]]
}
