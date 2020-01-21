package typings.nodeHid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object nodeHidStrings {
  @js.native
  sealed trait hidraw extends js.Object
  
  @js.native
  sealed trait libusb extends js.Object
  
  @scala.inline
  def hidraw: hidraw = "hidraw".asInstanceOf[hidraw]
  @scala.inline
  def libusb: libusb = "libusb".asInstanceOf[libusb]
}

