package typings.popperjsCore

import typings.popperjsCore.enumsMod.Boundary
import typings.popperjsCore.enumsMod.RootBoundary
import typings.popperjsCore.typesMod.ClientRectObject
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@popperjs/core/lib/dom-utils/getClippingRect", JSImport.Namespace)
@js.native
object getClippingRectMod extends js.Object {
  
  def default(element: Element, boundary: Boundary, rootBoundary: RootBoundary): ClientRectObject = js.native
}
