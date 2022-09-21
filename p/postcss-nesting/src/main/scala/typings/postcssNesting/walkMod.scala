package typings.postcssNesting

import typings.postcss.mod.Container
import typings.postcss.nodeMod.ChildNode
import typings.postcssNesting.optionsMod.options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object walkMod {
  
  @JSImport("postcss-nesting/dist/lib/walk", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(node: Container[ChildNode], opts: options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
