package typings.postcssNesting

import typings.postcss.mod.AtRule_
import typings.postcss.mod.Rule_
import typings.postcssNesting.distLibOptionsMod.options
import typings.postcssNesting.distLibWalkFuncMod.walkFunc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibAtruleWithinRuleMod {
  
  @JSImport("postcss-nesting/dist/lib/atrule-within-rule", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(node: AtRule_, parent: Rule_, walk: walkFunc, opts: options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], walk.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def isAtruleWithinRule(node: AtRule_): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAtruleWithinRule")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
