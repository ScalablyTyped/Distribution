package typings.popperjsCore

import typings.popperjsCore.typesMod.Rect
import typings.popperjsCore.typesMod.VirtualElement
import typings.popperjsCore.typesMod.Window
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@popperjs/core/lib/dom-utils/getCompositeRect", JSImport.Namespace)
@js.native
object getCompositeRectMod extends js.Object {
  
  def default(elementOrVirtualElement: VirtualElement, offsetParent: Window): Rect = js.native
  def default(elementOrVirtualElement: VirtualElement, offsetParent: Window, isFixed: Boolean): Rect = js.native
  def default(elementOrVirtualElement: VirtualElement, offsetParent: Element): Rect = js.native
  def default(elementOrVirtualElement: VirtualElement, offsetParent: Element, isFixed: Boolean): Rect = js.native
  def default(elementOrVirtualElement: Element, offsetParent: Window): Rect = js.native
  def default(elementOrVirtualElement: Element, offsetParent: Window, isFixed: Boolean): Rect = js.native
  def default(elementOrVirtualElement: Element, offsetParent: Element): Rect = js.native
  def default(elementOrVirtualElement: Element, offsetParent: Element, isFixed: Boolean): Rect = js.native
}
