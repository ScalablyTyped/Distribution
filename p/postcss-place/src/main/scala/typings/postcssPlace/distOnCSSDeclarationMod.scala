package typings.postcssPlace

import typings.postcss.mod.Declaration
import typings.postcss.mod.Result
import typings.postcssPlace.anon.Preserve
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distOnCSSDeclarationMod {
  
  @JSImport("postcss-place/dist/onCSSDeclaration", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def onCSSDeclaration(decl: Declaration, result: Result, options: Preserve): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onCSSDeclaration")(decl.asInstanceOf[js.Any], result.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("postcss-place/dist/onCSSDeclaration", "placeMatch")
  @js.native
  val placeMatch: js.RegExp = js.native
}
