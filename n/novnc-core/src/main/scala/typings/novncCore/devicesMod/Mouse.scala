package typings.novncCore.devicesMod

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("novnc-core/lib/input/devices", "Mouse")
@js.native
class Mouse () extends js.Object {
  def this(defaults: NvMouseDefaults) = this()
  def get_focused(): Boolean = js.native
  def get_onMouseButton(): js.Function4[/* x */ Double, /* y */ Double, /* down */ Boolean, /* bmask */ Double, Unit] = js.native
  def get_onMouseMove(): js.Function2[/* x */ Double, /* y */ Double, Unit] = js.native
  def get_target(): Element = js.native
  def get_touchButton(): Double = js.native
  def grab(): Unit = js.native
  def set_focused(focused: Boolean): Unit = js.native
  def set_onMouseButton(
    handler: js.Function4[/* x */ Double, /* y */ Double, /* down */ Boolean, /* bmask */ Double, Unit]
  ): Unit = js.native
  def set_onMouseMove(handler: js.Function2[/* x */ Double, /* y */ Double, Unit]): Unit = js.native
  def set_target(target: Element): Unit = js.native
  def set_touchButton(touchButton: Double): Unit = js.native
  def ungrab(): Unit = js.native
}

