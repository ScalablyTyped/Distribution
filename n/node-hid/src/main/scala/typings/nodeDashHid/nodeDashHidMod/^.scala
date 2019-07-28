package typings.nodeDashHid.nodeDashHidMod

import typings.nodeDashHid.nodeDashHidStrings.hidraw
import typings.nodeDashHid.nodeDashHidStrings.libusb
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-hid", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def devices(): js.Array[Device] = js.native
  @JSName("setDriverType")
  def setDriverType_hidraw(`type`: hidraw): Unit = js.native
  @JSName("setDriverType")
  def setDriverType_libusb(`type`: libusb): Unit = js.native
}

