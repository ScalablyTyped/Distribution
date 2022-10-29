package typings.pixiCore

import org.scalablytyped.runtime.StringDictionary
import typings.pixiCore.libShaderProgramMod.IAttributeData
import typings.std.WebGLProgram
import typings.std.WebGLRenderingContextBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libShaderUtilsGetAttributeDataMod {
  
  @JSImport("@pixi/core/lib/shader/utils/getAttributeData", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getAttributeData(program: WebGLProgram, gl: WebGLRenderingContextBase): StringDictionary[IAttributeData] = (^.asInstanceOf[js.Dynamic].applyDynamic("getAttributeData")(program.asInstanceOf[js.Any], gl.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[IAttributeData]]
}
