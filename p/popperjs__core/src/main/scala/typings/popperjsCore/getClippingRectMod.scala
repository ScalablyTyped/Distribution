package typings.popperjsCore

import typings.popperjsCore.enumsMod.Boundary
import typings.popperjsCore.enumsMod.RootBoundary
import typings.popperjsCore.typesMod.ClientRectObject
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getClippingRectMod {
  
  @JSImport("@popperjs/core/lib/dom-utils/getClippingRect", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(element: Element, boundary: Boundary, rootBoundary: RootBoundary): ClientRectObject = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(element.asInstanceOf[js.Any], boundary.asInstanceOf[js.Any], rootBoundary.asInstanceOf[js.Any])).asInstanceOf[ClientRectObject]
}
