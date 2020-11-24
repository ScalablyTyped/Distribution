package typings.popperjsCore

import typings.popperjsCore.anon.ScrollTop
import typings.popperjsCore.typesMod.Window
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@popperjs/core/lib/dom-utils/getWindowScroll", JSImport.Namespace)
@js.native
object getWindowScrollMod extends js.Object {
  
  def default(node: Window): ScrollTop = js.native
  def default(node: Node): ScrollTop = js.native
}
