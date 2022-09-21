package typings.postcssNesting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object specificityMod {
  
  @JSImport("postcss-nesting/dist/lib/merge-selectors/specificity", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def nodesAreEquallySpecific(nodes: js.Array[String]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("nodesAreEquallySpecific")(nodes.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
