package typings
package pkcs11jsLib.Pkcs11JsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TokenInfo extends js.Object {
  var firmwareVersion: Version
  var flags: scala.Double
  var freePrivateMemory: scala.Double
  var freePublicMemory: scala.Double
  var hardwareVersion: Version
  var label: java.lang.String
  var manufacturerID: java.lang.String
  var maxPinLen: scala.Double
  var maxRwSessionCount: scala.Double
  var maxSessionCount: scala.Double
  var minPinLen: scala.Double
  var model: java.lang.String
  var rwSessionCount: scala.Double
  var serialNumber: java.lang.String
  var sessionCount: scala.Double
  var totalPrivateMemory: scala.Double
  var totalPublicMemory: scala.Double
  var utcTime: java.lang.String
}

object TokenInfo {
  @scala.inline
  def apply(
    firmwareVersion: Version,
    flags: scala.Double,
    freePrivateMemory: scala.Double,
    freePublicMemory: scala.Double,
    hardwareVersion: Version,
    label: java.lang.String,
    manufacturerID: java.lang.String,
    maxPinLen: scala.Double,
    maxRwSessionCount: scala.Double,
    maxSessionCount: scala.Double,
    minPinLen: scala.Double,
    model: java.lang.String,
    rwSessionCount: scala.Double,
    serialNumber: java.lang.String,
    sessionCount: scala.Double,
    totalPrivateMemory: scala.Double,
    totalPublicMemory: scala.Double,
    utcTime: java.lang.String
  ): TokenInfo = {
    val __obj = js.Dynamic.literal(firmwareVersion = firmwareVersion, flags = flags, freePrivateMemory = freePrivateMemory, freePublicMemory = freePublicMemory, hardwareVersion = hardwareVersion, label = label, manufacturerID = manufacturerID, maxPinLen = maxPinLen, maxRwSessionCount = maxRwSessionCount, maxSessionCount = maxSessionCount, minPinLen = minPinLen, model = model, rwSessionCount = rwSessionCount, serialNumber = serialNumber, sessionCount = sessionCount, totalPrivateMemory = totalPrivateMemory, totalPublicMemory = totalPublicMemory, utcTime = utcTime)
  
    __obj.asInstanceOf[TokenInfo]
  }
}

