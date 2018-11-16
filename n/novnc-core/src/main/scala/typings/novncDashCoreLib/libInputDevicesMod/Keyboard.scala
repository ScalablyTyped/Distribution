package typings
package novncDashCoreLib.libInputDevicesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("novnc-core/lib/input/devices", "Keyboard")
@js.native
class Keyboard () extends js.Object {
  def this(defaults: NvKeyboardDefaults) = this()
  def get_focused(): scala.Boolean = js.native
  def get_onKeyPress(): js.Function3[
    /* keysym */ java.lang.String, 
    /* code */ scala.Double, 
    /* down */ scala.Boolean, 
    scala.Unit
  ] = js.native
  def get_target(): stdLib.Element = js.native
  def grab(): scala.Unit = js.native
  def set_focused(focused: scala.Boolean): scala.Unit = js.native
  def set_onKeyPress(
    handler: js.Function3[
      /* keysym */ java.lang.String, 
      /* code */ scala.Double, 
      /* down */ scala.Boolean, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def set_target(target: stdLib.Element): scala.Unit = js.native
  def ungrab(): scala.Unit = js.native
}

