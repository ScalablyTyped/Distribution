package typings
package pkcs11jsLib.Pkcs11JsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SlotInfo extends js.Object {
  var firmwareVersion: Version
  var flags: scala.Double
  var hardwareVersion: Version
  var manufacturerID: java.lang.String
  var slotDescription: java.lang.String
}

object SlotInfo {
  @scala.inline
  def apply(
    firmwareVersion: Version,
    flags: scala.Double,
    hardwareVersion: Version,
    manufacturerID: java.lang.String,
    slotDescription: java.lang.String
  ): SlotInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("firmwareVersion")(firmwareVersion)
    __obj.updateDynamic("flags")(flags)
    __obj.updateDynamic("hardwareVersion")(hardwareVersion)
    __obj.updateDynamic("manufacturerID")(manufacturerID)
    __obj.updateDynamic("slotDescription")(slotDescription)
    __obj.asInstanceOf[SlotInfo]
  }
}

