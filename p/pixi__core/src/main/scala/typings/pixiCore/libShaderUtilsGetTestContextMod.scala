package typings.pixiCore

import typings.std.WebGL2RenderingContext
import typings.std.WebGLRenderingContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libShaderUtilsGetTestContextMod {
  
  @JSImport("@pixi/core/lib/shader/utils/getTestContext", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getTestContext(): WebGLRenderingContext | WebGL2RenderingContext = ^.asInstanceOf[js.Dynamic].applyDynamic("getTestContext")().asInstanceOf[WebGLRenderingContext | WebGL2RenderingContext]
}
