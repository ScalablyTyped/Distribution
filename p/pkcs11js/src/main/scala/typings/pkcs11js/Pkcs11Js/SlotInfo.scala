package typings.pkcs11js.Pkcs11Js

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SlotInfo extends js.Object {
  var firmwareVersion: Version
  var flags: Double
  var hardwareVersion: Version
  var manufacturerID: String
  var slotDescription: String
}

object SlotInfo {
  @scala.inline
  def apply(
    firmwareVersion: Version,
    flags: Double,
    hardwareVersion: Version,
    manufacturerID: String,
    slotDescription: String
  ): SlotInfo = {
    val __obj = js.Dynamic.literal(firmwareVersion = firmwareVersion.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], hardwareVersion = hardwareVersion.asInstanceOf[js.Any], manufacturerID = manufacturerID.asInstanceOf[js.Any], slotDescription = slotDescription.asInstanceOf[js.Any])
    __obj.asInstanceOf[SlotInfo]
  }
}

