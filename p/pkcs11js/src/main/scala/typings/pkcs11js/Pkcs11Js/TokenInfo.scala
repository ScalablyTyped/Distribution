package typings.pkcs11js.Pkcs11Js

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TokenInfo extends js.Object {
  var firmwareVersion: Version
  var flags: Double
  var freePrivateMemory: Double
  var freePublicMemory: Double
  var hardwareVersion: Version
  var label: String
  var manufacturerID: String
  var maxPinLen: Double
  var maxRwSessionCount: Double
  var maxSessionCount: Double
  var minPinLen: Double
  var model: String
  var rwSessionCount: Double
  var serialNumber: String
  var sessionCount: Double
  var totalPrivateMemory: Double
  var totalPublicMemory: Double
  var utcTime: String
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
    val __obj = js.Dynamic.literal(firmwareVersion = firmwareVersion, flags = flags, freePrivateMemory = freePrivateMemory, freePublicMemory = freePublicMemory, hardwareVersion = hardwareVersion, label = label, manufacturerID = manufacturerID, maxPinLen = maxPinLen, maxRwSessionCount = maxRwSessionCount, maxSessionCount = maxSessionCount, minPinLen = minPinLen, model = model, rwSessionCount = rwSessionCount, serialNumber = serialNumber, sessionCount = sessionCount, totalPrivateMemory = totalPrivateMemory, totalPublicMemory = totalPublicMemory, utcTime = utcTime)
  
    __obj.asInstanceOf[TokenInfo]
  }
}

