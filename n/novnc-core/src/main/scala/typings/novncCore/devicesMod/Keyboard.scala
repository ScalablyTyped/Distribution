package typings.novncCore.devicesMod

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("novnc-core/lib/input/devices", "Keyboard")
@js.native
class Keyboard () extends js.Object {
  def this(defaults: NvKeyboardDefaults) = this()
  
  def get_focused(): Boolean = js.native
  
  def get_onKeyPress(): js.Function3[/* keysym */ String, /* code */ Double, /* down */ Boolean, Unit] = js.native
  
  def get_target(): Element = js.native
  
  def grab(): Unit = js.native
  
  def set_focused(focused: Boolean): Unit = js.native
  
  def set_onKeyPress(handler: js.Function3[/* keysym */ String, /* code */ Double, /* down */ Boolean, Unit]): Unit = js.native
  
  def set_target(target: Element): Unit = js.native
  
  def ungrab(): Unit = js.native
}
