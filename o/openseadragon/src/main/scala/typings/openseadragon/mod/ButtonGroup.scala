package typings.openseadragon.mod

import typings.openseadragon.anon.Buttons
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("openseadragon", "ButtonGroup")
@js.native
open class ButtonGroup protected () extends StObject {
  def this(options: Buttons) = this()
  
  var buttons: js.Array[Button] = js.native
  
  def destroy(): Unit = js.native
  
  var element: Element = js.native
  
  var tracker: MouseTracker = js.native
}
