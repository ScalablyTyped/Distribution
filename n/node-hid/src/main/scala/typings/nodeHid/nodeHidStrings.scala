package typings.nodeHid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeHidStrings {
  
  @scala.inline
  def hidraw: hidraw = "hidraw".asInstanceOf[hidraw]
  
  @scala.inline
  def libusb: libusb = "libusb".asInstanceOf[libusb]
  
  @js.native
  sealed trait hidraw extends js.Object
  
  @js.native
  sealed trait libusb extends js.Object
}
