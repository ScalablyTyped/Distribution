package typings.popperjsCore

import typings.popperjsCore.typesMod.Rect
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getDocumentRectMod {
  
  @JSImport("@popperjs/core/lib/dom-utils/getDocumentRect", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(element: HTMLElement): Rect = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(element.asInstanceOf[js.Any]).asInstanceOf[Rect]
}
