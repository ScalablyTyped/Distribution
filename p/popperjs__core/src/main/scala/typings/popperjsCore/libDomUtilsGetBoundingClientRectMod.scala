package typings.popperjsCore

import typings.popperjsCore.libTypesMod.ClientRectObject
import typings.popperjsCore.libTypesMod.VirtualElement
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDomUtilsGetBoundingClientRectMod {
  
  @JSImport("@popperjs/core/lib/dom-utils/getBoundingClientRect", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(element: VirtualElement): ClientRectObject = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(element.asInstanceOf[js.Any]).asInstanceOf[ClientRectObject]
  inline def default(element: VirtualElement, includeScale: Boolean): ClientRectObject = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(element.asInstanceOf[js.Any], includeScale.asInstanceOf[js.Any])).asInstanceOf[ClientRectObject]
  inline def default(element: VirtualElement, includeScale: Boolean, isFixedStrategy: Boolean): ClientRectObject = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(element.asInstanceOf[js.Any], includeScale.asInstanceOf[js.Any], isFixedStrategy.asInstanceOf[js.Any])).asInstanceOf[ClientRectObject]
  inline def default(element: VirtualElement, includeScale: Unit, isFixedStrategy: Boolean): ClientRectObject = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(element.asInstanceOf[js.Any], includeScale.asInstanceOf[js.Any], isFixedStrategy.asInstanceOf[js.Any])).asInstanceOf[ClientRectObject]
  inline def default(element: Element): ClientRectObject = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(element.asInstanceOf[js.Any]).asInstanceOf[ClientRectObject]
  inline def default(element: Element, includeScale: Boolean): ClientRectObject = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(element.asInstanceOf[js.Any], includeScale.asInstanceOf[js.Any])).asInstanceOf[ClientRectObject]
  inline def default(element: Element, includeScale: Boolean, isFixedStrategy: Boolean): ClientRectObject = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(element.asInstanceOf[js.Any], includeScale.asInstanceOf[js.Any], isFixedStrategy.asInstanceOf[js.Any])).asInstanceOf[ClientRectObject]
  inline def default(element: Element, includeScale: Unit, isFixedStrategy: Boolean): ClientRectObject = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(element.asInstanceOf[js.Any], includeScale.asInstanceOf[js.Any], isFixedStrategy.asInstanceOf[js.Any])).asInstanceOf[ClientRectObject]
}
