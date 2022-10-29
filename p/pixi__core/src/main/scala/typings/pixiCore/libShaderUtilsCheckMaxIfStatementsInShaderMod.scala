package typings.pixiCore

import typings.pixiCore.libIrendererMod.IRenderingContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libShaderUtilsCheckMaxIfStatementsInShaderMod {
  
  @JSImport("@pixi/core/lib/shader/utils/checkMaxIfStatementsInShader", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def checkMaxIfStatementsInShader(maxIfs: Double, gl: IRenderingContext): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("checkMaxIfStatementsInShader")(maxIfs.asInstanceOf[js.Any], gl.asInstanceOf[js.Any])).asInstanceOf[Double]
}
