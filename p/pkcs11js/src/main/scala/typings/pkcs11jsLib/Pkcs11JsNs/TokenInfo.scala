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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("firmwareVersion")(firmwareVersion)
    __obj.updateDynamic("flags")(flags)
    __obj.updateDynamic("freePrivateMemory")(freePrivateMemory)
    __obj.updateDynamic("freePublicMemory")(freePublicMemory)
    __obj.updateDynamic("hardwareVersion")(hardwareVersion)
    __obj.updateDynamic("label")(label)
    __obj.updateDynamic("manufacturerID")(manufacturerID)
    __obj.updateDynamic("maxPinLen")(maxPinLen)
    __obj.updateDynamic("maxRwSessionCount")(maxRwSessionCount)
    __obj.updateDynamic("maxSessionCount")(maxSessionCount)
    __obj.updateDynamic("minPinLen")(minPinLen)
    __obj.updateDynamic("model")(model)
    __obj.updateDynamic("rwSessionCount")(rwSessionCount)
    __obj.updateDynamic("serialNumber")(serialNumber)
    __obj.updateDynamic("sessionCount")(sessionCount)
    __obj.updateDynamic("totalPrivateMemory")(totalPrivateMemory)
    __obj.updateDynamic("totalPublicMemory")(totalPublicMemory)
    __obj.updateDynamic("utcTime")(utcTime)
    __obj.asInstanceOf[TokenInfo]
  }
}

