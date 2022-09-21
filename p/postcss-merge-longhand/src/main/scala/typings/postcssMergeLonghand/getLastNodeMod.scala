package typings.postcssMergeLonghand

import typings.postcss.mod.Declaration
import typings.postcss.nodeMod.AnyNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getLastNodeMod {
  
  inline def apply(rule: js.Array[AnyNode], prop: String): Declaration = (^.asInstanceOf[js.Dynamic].apply(rule.asInstanceOf[js.Any], prop.asInstanceOf[js.Any])).asInstanceOf[Declaration]
  
  @JSImport("postcss-merge-longhand/types/lib/getLastNode", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
