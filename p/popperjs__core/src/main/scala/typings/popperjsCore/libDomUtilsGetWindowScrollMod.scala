package typings.popperjsCore

import typings.popperjsCore.anon.ScrollTop
import typings.popperjsCore.libTypesMod.Window
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDomUtilsGetWindowScrollMod {
  
  @JSImport("@popperjs/core/lib/dom-utils/getWindowScroll", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(node: Window): ScrollTop = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any]).asInstanceOf[ScrollTop]
  inline def default(node: Node): ScrollTop = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any]).asInstanceOf[ScrollTop]
}
