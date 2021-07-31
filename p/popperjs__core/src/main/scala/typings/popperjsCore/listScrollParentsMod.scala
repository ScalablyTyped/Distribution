package typings.popperjsCore

import typings.popperjsCore.typesMod.VisualViewport
import typings.popperjsCore.typesMod.Window
import typings.std.Element
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listScrollParentsMod {
  
  @JSImport("@popperjs/core/lib/dom-utils/listScrollParents", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(element: Node): js.Array[Element | Window | VisualViewport] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(element.asInstanceOf[js.Any]).asInstanceOf[js.Array[Element | Window | VisualViewport]]
  @scala.inline
  def default(element: Node, list: js.Array[Element | Window]): js.Array[Element | Window | VisualViewport] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(element.asInstanceOf[js.Any], list.asInstanceOf[js.Any])).asInstanceOf[js.Array[Element | Window | VisualViewport]]
}
