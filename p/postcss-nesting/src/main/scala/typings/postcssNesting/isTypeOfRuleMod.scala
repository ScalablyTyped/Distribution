package typings.postcssNesting

import typings.postcss.mod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isTypeOfRuleMod {
  
  @JSImport("postcss-nesting/dist/lib/is-type-of-rule", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isAtRule(): /* is postcss.postcss.AtRule */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAtRule")().asInstanceOf[/* is postcss.postcss.AtRule */ Boolean]
  inline def isAtRule(node: Node): /* is postcss.postcss.AtRule */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAtRule")(node.asInstanceOf[js.Any]).asInstanceOf[/* is postcss.postcss.AtRule */ Boolean]
  
  inline def isNestRule(): /* is postcss.postcss.AtRule */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNestRule")().asInstanceOf[/* is postcss.postcss.AtRule */ Boolean]
  inline def isNestRule(node: Node): /* is postcss.postcss.AtRule */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNestRule")(node.asInstanceOf[js.Any]).asInstanceOf[/* is postcss.postcss.AtRule */ Boolean]
  
  inline def isRule(): /* is postcss.postcss.Rule */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRule")().asInstanceOf[/* is postcss.postcss.Rule */ Boolean]
  inline def isRule(node: Node): /* is postcss.postcss.Rule */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRule")(node.asInstanceOf[js.Any]).asInstanceOf[/* is postcss.postcss.Rule */ Boolean]
}
