package typings.popperjsCore

import typings.popperjsCore.typesMod.Window
import typings.std.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getDocumentElementMod {
  
  @JSImport("@popperjs/core/lib/dom-utils/getDocumentElement", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(element: Window): HTMLElement = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(element.asInstanceOf[js.Any]).asInstanceOf[HTMLElement]
  inline def default(element: Element): HTMLElement = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(element.asInstanceOf[js.Any]).asInstanceOf[HTMLElement]
}
