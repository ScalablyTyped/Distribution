package typings.popperjsCore

import typings.popperjsCore.typesMod.Rect
import typings.popperjsCore.typesMod.VirtualElement
import typings.popperjsCore.typesMod.Window
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getCompositeRectMod {
  
  @JSImport("@popperjs/core/lib/dom-utils/getCompositeRect", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(elementOrVirtualElement: VirtualElement, offsetParent: Window): Rect = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(elementOrVirtualElement.asInstanceOf[js.Any], offsetParent.asInstanceOf[js.Any])).asInstanceOf[Rect]
  inline def default(elementOrVirtualElement: VirtualElement, offsetParent: Window, isFixed: Boolean): Rect = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(elementOrVirtualElement.asInstanceOf[js.Any], offsetParent.asInstanceOf[js.Any], isFixed.asInstanceOf[js.Any])).asInstanceOf[Rect]
  inline def default(elementOrVirtualElement: VirtualElement, offsetParent: Element): Rect = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(elementOrVirtualElement.asInstanceOf[js.Any], offsetParent.asInstanceOf[js.Any])).asInstanceOf[Rect]
  inline def default(elementOrVirtualElement: VirtualElement, offsetParent: Element, isFixed: Boolean): Rect = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(elementOrVirtualElement.asInstanceOf[js.Any], offsetParent.asInstanceOf[js.Any], isFixed.asInstanceOf[js.Any])).asInstanceOf[Rect]
  inline def default(elementOrVirtualElement: Element, offsetParent: Window): Rect = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(elementOrVirtualElement.asInstanceOf[js.Any], offsetParent.asInstanceOf[js.Any])).asInstanceOf[Rect]
  inline def default(elementOrVirtualElement: Element, offsetParent: Window, isFixed: Boolean): Rect = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(elementOrVirtualElement.asInstanceOf[js.Any], offsetParent.asInstanceOf[js.Any], isFixed.asInstanceOf[js.Any])).asInstanceOf[Rect]
  inline def default(elementOrVirtualElement: Element, offsetParent: Element): Rect = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(elementOrVirtualElement.asInstanceOf[js.Any], offsetParent.asInstanceOf[js.Any])).asInstanceOf[Rect]
  inline def default(elementOrVirtualElement: Element, offsetParent: Element, isFixed: Boolean): Rect = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(elementOrVirtualElement.asInstanceOf[js.Any], offsetParent.asInstanceOf[js.Any], isFixed.asInstanceOf[js.Any])).asInstanceOf[Rect]
}
