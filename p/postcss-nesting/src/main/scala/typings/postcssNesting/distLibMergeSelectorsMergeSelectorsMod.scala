package typings.postcssNesting

import typings.postcss.mod.Node
import typings.postcss.mod.Result
import typings.postcssNesting.distLibOptionsMod.options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibMergeSelectorsMergeSelectorsMod {
  
  @JSImport("postcss-nesting/dist/lib/merge-selectors/merge-selectors", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(
    node: Node,
    postcssResult: Result,
    fromSelectors: js.Array[String],
    toSelectors: js.Array[String],
    opts: options
  ): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], postcssResult.asInstanceOf[js.Any], fromSelectors.asInstanceOf[js.Any], toSelectors.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  inline def default(
    node: Node,
    postcssResult: Result,
    fromSelectors: js.Array[String],
    toSelectors: js.Array[String],
    opts: options,
    fromAtNest: Boolean
  ): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], postcssResult.asInstanceOf[js.Any], fromSelectors.asInstanceOf[js.Any], toSelectors.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], fromAtNest.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
}
