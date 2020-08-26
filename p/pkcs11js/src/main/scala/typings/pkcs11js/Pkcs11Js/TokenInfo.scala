package typings.pkcs11js.Pkcs11Js

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TokenInfo extends js.Object {
  var firmwareVersion: Version = js.native
  var flags: Double = js.native
  var freePrivateMemory: Double = js.native
  var freePublicMemory: Double = js.native
  var hardwareVersion: Version = js.native
  var label: String = js.native
  var manufacturerID: String = js.native
  var maxPinLen: Double = js.native
  var maxRwSessionCount: Double = js.native
  var maxSessionCount: Double = js.native
  var minPinLen: Double = js.native
  var model: String = js.native
  var rwSessionCount: Double = js.native
  var serialNumber: String = js.native
  var sessionCount: Double = js.native
  var totalPrivateMemory: Double = js.native
  var totalPublicMemory: Double = js.native
  var utcTime: String = js.native
}

object TokenInfo {
  @scala.inline
  def apply(
    firmwareVersion: Version,
    flags: Double,
    freePrivateMemory: Double,
    freePublicMemory: Double,
    hardwareVersion: Version,
    label: String,
    manufacturerID: String,
    maxPinLen: Double,
    maxRwSessionCount: Double,
    maxSessionCount: Double,
    minPinLen: Double,
    model: String,
    rwSessionCount: Double,
    serialNumber: String,
    sessionCount: Double,
    totalPrivateMemory: Double,
    totalPublicMemory: Double,
    utcTime: String
  ): TokenInfo = {
    val __obj = js.Dynamic.literal(firmwareVersion = firmwareVersion.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], freePrivateMemory = freePrivateMemory.asInstanceOf[js.Any], freePublicMemory = freePublicMemory.asInstanceOf[js.Any], hardwareVersion = hardwareVersion.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], manufacturerID = manufacturerID.asInstanceOf[js.Any], maxPinLen = maxPinLen.asInstanceOf[js.Any], maxRwSessionCount = maxRwSessionCount.asInstanceOf[js.Any], maxSessionCount = maxSessionCount.asInstanceOf[js.Any], minPinLen = minPinLen.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any], rwSessionCount = rwSessionCount.asInstanceOf[js.Any], serialNumber = serialNumber.asInstanceOf[js.Any], sessionCount = sessionCount.asInstanceOf[js.Any], totalPrivateMemory = totalPrivateMemory.asInstanceOf[js.Any], totalPublicMemory = totalPublicMemory.asInstanceOf[js.Any], utcTime = utcTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[TokenInfo]
  }
  @scala.inline
  implicit class TokenInfoOps[Self <: TokenInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFirmwareVersion(value: Version): Self = this.set("firmwareVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def setFlags(value: Double): Self = this.set("flags", value.asInstanceOf[js.Any])
    @scala.inline
    def setFreePrivateMemory(value: Double): Self = this.set("freePrivateMemory", value.asInstanceOf[js.Any])
    @scala.inline
    def setFreePublicMemory(value: Double): Self = this.set("freePublicMemory", value.asInstanceOf[js.Any])
    @scala.inline
    def setHardwareVersion(value: Version): Self = this.set("hardwareVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def setManufacturerID(value: String): Self = this.set("manufacturerID", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxPinLen(value: Double): Self = this.set("maxPinLen", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxRwSessionCount(value: Double): Self = this.set("maxRwSessionCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxSessionCount(value: Double): Self = this.set("maxSessionCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setMinPinLen(value: Double): Self = this.set("minPinLen", value.asInstanceOf[js.Any])
    @scala.inline
    def setModel(value: String): Self = this.set("model", value.asInstanceOf[js.Any])
    @scala.inline
    def setRwSessionCount(value: Double): Self = this.set("rwSessionCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setSerialNumber(value: String): Self = this.set("serialNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def setSessionCount(value: Double): Self = this.set("sessionCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setTotalPrivateMemory(value: Double): Self = this.set("totalPrivateMemory", value.asInstanceOf[js.Any])
    @scala.inline
    def setTotalPublicMemory(value: Double): Self = this.set("totalPublicMemory", value.asInstanceOf[js.Any])
    @scala.inline
    def setUtcTime(value: String): Self = this.set("utcTime", value.asInstanceOf[js.Any])
  }
  
}

