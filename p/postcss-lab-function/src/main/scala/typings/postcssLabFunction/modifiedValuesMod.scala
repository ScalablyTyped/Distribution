package typings.postcssLabFunction

import typings.postcss.mod.Declaration
import typings.postcss.mod.Result
import typings.postcssLabFunction.anon.Rgb
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modifiedValuesMod {
  
  @JSImport("postcss-lab-function/dist/modified-values", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def modifiedValues(originalValue: String, decl: Declaration, result: Result, preserve: Boolean): js.UndefOr[Rgb] = (^.asInstanceOf[js.Dynamic].applyDynamic("modifiedValues")(originalValue.asInstanceOf[js.Any], decl.asInstanceOf[js.Any], result.asInstanceOf[js.Any], preserve.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Rgb]]
}
