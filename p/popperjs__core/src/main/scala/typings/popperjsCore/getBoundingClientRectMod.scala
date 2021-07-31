package typings.popperjsCore

import typings.popperjsCore.typesMod.ClientRectObject
import typings.popperjsCore.typesMod.VirtualElement
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getBoundingClientRectMod {
  
  @JSImport("@popperjs/core/lib/dom-utils/getBoundingClientRect", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(element: VirtualElement): ClientRectObject = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(element.asInstanceOf[js.Any]).asInstanceOf[ClientRectObject]
  @scala.inline
  def default(element: Element): ClientRectObject = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(element.asInstanceOf[js.Any]).asInstanceOf[ClientRectObject]
}
