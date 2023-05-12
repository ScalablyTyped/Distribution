package typings.postcssPseudoClassAnyLink

import typings.postcss.mod.Result
import typings.postcss.mod.Rule_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distReplaceAnyLinkMod {
  
  @JSImport("postcss-pseudo-class-any-link/dist/replace-any-link", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def replaceAnyLink(rule: Rule_, result: Result, preserve: Boolean, areaHrefNeedsFixing: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceAnyLink")(rule.asInstanceOf[js.Any], result.asInstanceOf[js.Any], preserve.asInstanceOf[js.Any], areaHrefNeedsFixing.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
