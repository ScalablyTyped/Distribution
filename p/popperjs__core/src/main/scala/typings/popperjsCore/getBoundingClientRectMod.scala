package typings.popperjsCore

import typings.popperjsCore.typesMod.ClientRectObject
import typings.popperjsCore.typesMod.VirtualElement
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@popperjs/core/lib/dom-utils/getBoundingClientRect", JSImport.Namespace)
@js.native
object getBoundingClientRectMod extends js.Object {
  
  def default(element: VirtualElement): ClientRectObject = js.native
  def default(element: Element): ClientRectObject = js.native
}
