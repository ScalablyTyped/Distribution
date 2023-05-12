package typings.postcssCustomProperties

import typings.std.Map
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distToposortMod {
  
  @JSImport("postcss-custom-properties/dist/toposort", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def removeCyclicReferences(nodes: Map[String, Any], edges: js.Array[js.Array[String]]): Set[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("removeCyclicReferences")(nodes.asInstanceOf[js.Any], edges.asInstanceOf[js.Any])).asInstanceOf[Set[String]]
}
