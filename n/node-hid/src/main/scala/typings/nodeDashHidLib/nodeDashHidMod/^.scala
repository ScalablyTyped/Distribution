package typings
package nodeDashHidLib.nodeDashHidMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-hid", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def devices(): js.Array[Device] = js.native
  @JSName("setDriverType")
  def setDriverType_hidraw(`type`: nodeDashHidLib.nodeDashHidLibStrings.hidraw): scala.Unit = js.native
  @JSName("setDriverType")
  def setDriverType_libusb(`type`: nodeDashHidLib.nodeDashHidLibStrings.libusb): scala.Unit = js.native
}

