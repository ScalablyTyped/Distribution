package typings.postcssNesting

import typings.postcss.mod.Container
import typings.postcss.mod.Result
import typings.postcssNesting.distLibOptionsMod.options
import typings.std.ChildNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibWalkMod {
  
  @JSImport("postcss-nesting/dist/lib/walk", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(node: Container[ChildNode], result: Result, opts: options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], result.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
