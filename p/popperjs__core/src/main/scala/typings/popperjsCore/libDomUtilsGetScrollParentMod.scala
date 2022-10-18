package typings.popperjsCore

import typings.std.HTMLElement
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDomUtilsGetScrollParentMod {
  
  @JSImport("@popperjs/core/lib/dom-utils/getScrollParent", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(node: Node): HTMLElement = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any]).asInstanceOf[HTMLElement]
}
