package typings.playable

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toggleElementClassMod {
  
  @JSImport("playable/dist/src/modules/ui/core/toggleElementClass", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(element: HTMLElement, className: String, shouldAdd: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(element.asInstanceOf[js.Any], className.asInstanceOf[js.Any], shouldAdd.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
