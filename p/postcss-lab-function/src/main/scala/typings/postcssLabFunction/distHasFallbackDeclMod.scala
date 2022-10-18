package typings.postcssLabFunction

import typings.postcss.mod.Declaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distHasFallbackDeclMod {
  
  @JSImport("postcss-lab-function/dist/has-fallback-decl", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def hasFallback(node: Declaration): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasFallback")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
