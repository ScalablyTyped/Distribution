package typings.nextReactDevOverlay

import typings.std.MouseEvent
import typings.std.Node
import typings.std.TouchEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useOnClickOutsideMod {
  
  @JSImport("@next/react-dev-overlay/lib/internal/hooks/use-on-click-outside", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useOnClickOutside(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useOnClickOutside")().asInstanceOf[Unit]
  inline def useOnClickOutside(el: Null, handler: js.Function1[/* e */ MouseEvent | TouchEvent, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useOnClickOutside")(el.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useOnClickOutside(el: Node): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useOnClickOutside")(el.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def useOnClickOutside(el: Node, handler: js.Function1[/* e */ MouseEvent | TouchEvent, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useOnClickOutside")(el.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
