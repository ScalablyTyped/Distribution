package typings.pixiCore

import typings.std.WebGLRenderingContextBase
import typings.std.WebGLShader
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libShaderUtilsCompileShaderMod {
  
  @JSImport("@pixi/core/lib/shader/utils/compileShader", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def compileShader(gl: WebGLRenderingContextBase, `type`: Double, src: String): WebGLShader = (^.asInstanceOf[js.Dynamic].applyDynamic("compileShader")(gl.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], src.asInstanceOf[js.Any])).asInstanceOf[WebGLShader]
}
