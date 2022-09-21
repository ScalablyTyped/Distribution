package typings.mdastUtilToHast

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wrapMod {
  
  @JSImport("mdast-util-to-hast/lib/wrap", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def wrap(nodes: js.Array[Content]): js.Array[Content] = ^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(nodes.asInstanceOf[js.Any]).asInstanceOf[js.Array[Content]]
  inline def wrap(nodes: js.Array[Content], loose: Boolean): js.Array[Content] = (^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(nodes.asInstanceOf[js.Any], loose.asInstanceOf[js.Any])).asInstanceOf[js.Array[Content]]
  
  type Content = typings.mdastUtilToHast.libMod.Content
}
