package typings.popperjsCore

import typings.std.Node
import typings.std.ShadowRoot
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getParentNodeMod {
  
  @JSImport("@popperjs/core/lib/dom-utils/getParentNode", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(element: Node): Node = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(element.asInstanceOf[js.Any]).asInstanceOf[Node]
  inline def default(element: ShadowRoot): Node = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(element.asInstanceOf[js.Any]).asInstanceOf[Node]
}
