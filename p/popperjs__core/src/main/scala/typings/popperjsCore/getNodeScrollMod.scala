package typings.popperjsCore

import typings.popperjsCore.typesMod.Window
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getNodeScrollMod {
  
  @JSImport("@popperjs/core/lib/dom-utils/getNodeScroll", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(node: Window): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  @scala.inline
  def default(node: Node): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any]).asInstanceOf[js.Any]
}
