package typings.nextReactDevOverlay

import typings.std.MouseEvent
import typings.std.Node
import typings.std.TouchEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@next/react-dev-overlay/lib/internal/hooks/use-on-click-outside", JSImport.Namespace)
@js.native
object useOnClickOutsideMod extends js.Object {
  
  def useOnClickOutside(): Unit = js.native
  def useOnClickOutside(el: Null, handler: js.Function1[/* e */ MouseEvent | TouchEvent, Unit]): Unit = js.native
  def useOnClickOutside(el: Node): Unit = js.native
  def useOnClickOutside(el: Node, handler: js.Function1[/* e */ MouseEvent | TouchEvent, Unit]): Unit = js.native
}
