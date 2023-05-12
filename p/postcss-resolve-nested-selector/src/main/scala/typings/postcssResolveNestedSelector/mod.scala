package typings.postcssResolveNestedSelector

import typings.postcss.mod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Returns an array of selectors resolved from `selector`.
    */
  inline def apply(selector: String, node: Node): js.Array[String] = (^.asInstanceOf[js.Dynamic].apply(selector.asInstanceOf[js.Any], node.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  @JSImport("postcss-resolve-nested-selector", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
