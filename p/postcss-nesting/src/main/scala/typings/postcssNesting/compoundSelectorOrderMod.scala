package typings.postcssNesting

import typings.postcssSelectorParser.mod.Container
import typings.postcssSelectorParser.mod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object compoundSelectorOrderMod {
  
  @JSImport("postcss-nesting/dist/lib/merge-selectors/compound-selector-order", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def sortCompoundSelectorsInsideComplexSelector(node: Container[String, Node]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("sortCompoundSelectorsInsideComplexSelector")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
