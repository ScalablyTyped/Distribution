package typings
package novncDashCoreLib.libInputDevicesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("novnc-core/lib/input/devices", "Mouse")
@js.native
class Mouse () extends js.Object {
  def this(defaults: NvMouseDefaults) = this()
  def get_focused(): scala.Boolean = js.native
  def get_onMouseButton(): js.Function4[
    /* x */ scala.Double, 
    /* y */ scala.Double, 
    /* down */ scala.Boolean, 
    /* bmask */ scala.Double, 
    scala.Unit
  ] = js.native
  def get_onMouseMove(): js.Function2[/* x */ scala.Double, /* y */ scala.Double, scala.Unit] = js.native
  def get_target(): stdLib.Element = js.native
  def get_touchButton(): scala.Double = js.native
  def grab(): scala.Unit = js.native
  def set_focused(focused: scala.Boolean): scala.Unit = js.native
  def set_onMouseButton(
    handler: js.Function4[
      /* x */ scala.Double, 
      /* y */ scala.Double, 
      /* down */ scala.Boolean, 
      /* bmask */ scala.Double, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def set_onMouseMove(handler: js.Function2[/* x */ scala.Double, /* y */ scala.Double, scala.Unit]): scala.Unit = js.native
  def set_target(target: stdLib.Element): scala.Unit = js.native
  def set_touchButton(touchButton: scala.Double): scala.Unit = js.native
  def ungrab(): scala.Unit = js.native
}

