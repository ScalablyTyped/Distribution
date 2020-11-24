package typings.popperjsCore

import typings.popperjsCore.typesMod.VisualViewport
import typings.popperjsCore.typesMod.Window
import typings.std.Element
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@popperjs/core/lib/dom-utils/listScrollParents", JSImport.Namespace)
@js.native
object listScrollParentsMod extends js.Object {
  
  def default(element: Node): js.Array[Element | Window | VisualViewport] = js.native
  def default(element: Node, list: js.Array[Element | Window]): js.Array[Element | Window | VisualViewport] = js.native
}
